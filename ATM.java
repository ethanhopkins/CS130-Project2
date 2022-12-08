package Project2;
import java.util.Scanner;

public class ATM {
	private static double balance = 1000;
	
	//constructor
	public ATM(double initialBalance) {
		this.balance = initialBalance;
	}
	
	//methods
	public static void deposit(double amount) {
		balance += amount;
	}
	
	public static void withdraw(double amount) {
		balance -= amount;
	}
	
	//main
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter username: ");
		String user = scan.nextLine();
		
		System.out.println("Enter password: ");
		String password = scan.nextLine();
		if (password.length() < 4) {
			System.out.println("Invalid! Password must be 4 characters long");
		}
		
		System.out.println("\n\nWelcome back, " + user + "!");
		System.out.println("What would you like to do?\n");
		System.out.println("1) Checking" + "\n2) Savings");
		
		int choice = scan.nextInt();
		
		switch(choice) {
			case 1: 
				System.out.println("\n\n-----Checking-----");
				break;
			
			case 2:
				System.out.println("\n\n-----Savings-----");
				break;
				
			default:
				System.out.println("Invalid choice!");
		}
		
		System.out.println("1) Deposit" + "\n2) Withdraw" + "\n3) View Balance");
		
		int finalChoice = scan.nextInt();
		
		switch(finalChoice) {
			case 1:
				System.out.println("How much would you like to deposit?");
				double dep = scan.nextDouble();
					if (dep > 0) {
						deposit(dep);
						System.out.println("Your new balance is $" + balance);
					}
					break;
			
			case 2:
				System.out.println("How much would you like to withdraw?");
				double with = scan.nextDouble();
					if (with <= balance) {
						withdraw(with);
						System.out.println("Your new balance is $" + balance);
					}
					break;
			
			case 3:
				System.out.println("Your current balance is $" + balance);
		}
	}
}
