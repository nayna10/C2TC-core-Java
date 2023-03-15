package com.tnsif.interfaceapplication;

public class BankDemo {

	public static void main(String[] args) {

		SavingAccount sa=new SavingAccount("Yash","Mumbai",1234,15778.66f);
		
		System.out.println(sa);
		
		sa.deposit(4550);
		System.out.println(sa);
		
		sa.withdraw(2000);
		System.out.println(sa);

	}

}
