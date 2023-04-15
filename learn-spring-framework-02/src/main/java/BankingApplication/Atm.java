package BankingApplication;

import java.util.Scanner;

public class Atm {
	
	private String userName;
	private String[] options = {"Deposit", "Withdraw", "Check Balance", "Exit"};
	private enum MenuOptions {
		DEPOSIT,
		WITHDRAW,
		CHECK_BALANCE,
		EXIT
	}
	private MenuOptions menuOption;
	
	public Atm() {
		this.userName = askUserName();
		//System.out.println(this.userName);
		System.out.println("Please select an option:\n");
		do {
			for (String option : options) {
				System.out.println(option);
			}
		}while(menuOption != MenuOptions.EXIT);
	}
	
	private String askUserName() {
		
		//System.out.println("What is your name");
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String tempName = scanner.nextLine();
		scanner.close();
		
		return tempName;
	}
}
