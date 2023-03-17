package businessCalculationService;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessCalculationService{
	DataService dataService;
	MongoDbDataService mongoDbDataService;
	MySQLDataService mySqlDataService;
	
	public BusinessCalculationService(DataService dataService, MongoDbDataService mongoDbDataService, MySQLDataService mySqlDataService) {
		this.dataService = dataService;
		this.mongoDbDataService = mongoDbDataService;
		this.mySqlDataService = mySqlDataService;
	}
	
	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
}

@Configuration
@ComponentScan("businessCalculationService")
public class MainCalculationService {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(MainCalculationService.class)){
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
	}
}
