package businessCalculationService;

import java.util.Arrays;

public class BusinessCalculationService {
	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
}
