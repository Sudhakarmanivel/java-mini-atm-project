package codingchallenge;
import java.util.Scanner;

class Bank{
	
	private double balance;
	
	//Constructor with minimum balance
	Bank(double initialBalance){
		if(initialBalance>=1000) 
		{
			balance=initialBalance;
		}
		else {
			System.out.println("Minimum balance is 1000");
			balance=1000;
		}
	}
	
	public void deposit(double amount) 
	{
		if(amount>0) 
		{
			balance += amount;
			System.out.println("Deposit: " +amount);
		}
		else
		{
			System.out.println("invalid deposit amount");
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount>0 && (balance - amount) >= 1000)
		{
			balance -= amount;
			System.out.println("Withdraw: " +amount);
		}
		else
		{
			System.out.println("Minimum balance 1000 must be maintained.");
		}
	}
	public void checkBalance()
	{
		System.out.println("Current balance: " +balance);
	}
	
}

public class Project
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter intialBalance: ");
		double initial = sc.nextDouble();
		
		Bank ac=new Bank(initial);
		
		int choise;
		
		do 
		{
		System.out.println("\n======== ATM MENU =========");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check Balance");
		System.out.println("4. Exit");
		System.out.println("Enter your choise: ");
		
		choise=sc.nextInt();
		
		switch(choise) {
		
		case 1:
			System.out.println("Enter deposit amount: ");
			double dep=sc.nextDouble();
			ac.deposit(dep);
			break;
			
		case 2:
			System.out.println("Enter your withdrawl amount: ");
			double wit=sc.nextDouble();
			ac.withdraw(wit);
			break;
			
		case 3:
			ac.checkBalance();
			break;
			
		case 4:
			System.out.println("Thank you for using ATM.");
			break;
			
		default:
			System.out.println("Invalid choise");
			}
		}while(choise !=4);
		sc.close();
	}
  
}

