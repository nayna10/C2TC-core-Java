package com.tnsif.interfaceapplication;

public class SavingAccount extends Customer implements Bank

{
	private int accNo;
	private float balance;
	
	
	
  //constructor
	public SavingAccount(String name, String city, int accNo, float balance) {
		super(name, city);
		this.accNo = accNo;
		this.balance = balance;
	}
	
	//getters and setters

	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public float getBalance() {
		return balance;
	}


	public void setBalance(float balance) {
		this.balance = balance;
	}


	@Override
	public void deposit(float amount) 
	{
		if (amount>DEPOSIT_LIMIT)
		{
			System.out.println("Daily Limit excceds....");
		}
		else
		{
			balance+=amount;
			System.out.println("Rs."+amount+"is deposited successfully");
		}
		
	}

	@Override
	public void withdraw(float amount) 
	{
		if (amount<=balance-MINBAL)
		{
			balance-=amount;
			System.out.println("Rs."+amount+"is withdrawn successfully");
		}else
		{
			System.out.println("Insufficient Balance...Cant'Withadraw"+amount);
		}
			
		
		
	}

	@Override
	public String toString() {
		return "SavingAccount [accNo=" + accNo + ", balance=" + balance + ", getAccNo()=" + getAccNo()
				+ ", getBalance()=" + getBalance() + ", getName()=" + getName() + ", getCity()=" + getCity() + "]";
	}

	
}
