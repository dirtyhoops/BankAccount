package com.codingdojo.bankaccount;

public class BankAccount {
	
	private static int accountCount = 0;
	private static double totalMoney = 0;
	private String accountNumber;
	private double checkingBalance, savingsBalance;
	
	public BankAccount() {
		accountNumber = this.generateAccountNumber();
		accountCount++;
		System.out.println("Total Accounts opened: " + accountCount);
	}
	
	//generates 10 random number and makes it an account number
	public String generateAccountNumber() {
		String accountNumber = "";
		for(int i=0; i<10; i++) {
			int rand = (int)(Math.random()*10);
			accountNumber += rand;
		}
		return accountNumber;
	}
	
	//gets the saving's balance
	private double getSavingsBalance() {
		return this.savingsBalance;
	}
	
	//gets the checking balance
	private double getCheckingBalance() {
		return this.checkingBalance;
	}
	
	//prints out the balance for both type of accounts
	public void checkBalance() {
		System.out.println("Balance for account: " + this.accountNumber);
		System.out.println("Savings account balance: " + getSavingsBalance());
		System.out.println("Checking account balance: " + getCheckingBalance());
		System.out.println("Total balance: " + totalMoney);
	}
	
	//deposits money
	public void depositMoney(String accountType, double amountToDeposit) {
		if(accountType == "savings") {
			System.out.println("Successfully deposit $ " + amountToDeposit + " to your savings account");
			savingsBalance += amountToDeposit;
			totalMoney += amountToDeposit;
		} else if(accountType =="checking") {
			System.out.println("Successfully deposit $ " + amountToDeposit + " to your checking account");
			checkingBalance += amountToDeposit;
			totalMoney += amountToDeposit;
		} else {
			System.out.println("Deposit failed, have to choose between savings or cheking account to deposit to");
		}
	}
	
	
	//widthraw money
	public void withdrawMoney(String accountType, double amountToWithdraw) {
		if(accountType == "savings") {
			if(amountToWithdraw > savingsBalance) {
				System.out.println("Sorry, you have insufficient funds");
			} else {
				System.out.println("Successfully withdrew $" +  amountToWithdraw + " from savings account");
				savingsBalance -= amountToWithdraw;	
				totalMoney -= amountToWithdraw;
			}
		} else if (accountType == "checking" ) {
			if(amountToWithdraw > checkingBalance) {
				System.out.println("Sorry, you have insufficient funds");
			} else {
				System.out.println("Successfully withdrew $" +  amountToWithdraw + " from checking account");
				checkingBalance -= amountToWithdraw;
				totalMoney -= amountToWithdraw;
			} 
		} else {
			System.out.println("Sorry, choose a right account type: Savings or Checking");
		}
	}
	
	
	
}
