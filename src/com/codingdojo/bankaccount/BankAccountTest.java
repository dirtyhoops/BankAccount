package com.codingdojo.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1 = new BankAccount();
		
		account1.checkBalance();
		account1.depositMoney("savings", 400);
		account1.depositMoney("checking", 1000);
		account1.checkBalance();
		account1.withdrawMoney("savings", 250);
		account1.withdrawMoney("checking", 300);
		account1.checkBalance();
	}

}
