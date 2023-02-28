package bai08;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Account {
      private long accountNumber;
      private String name;
      private double balance;
      private final double RATE = 0.035;
	public Account() {
		accountNumber = 999999;
		name = "chưa xác định";
		balance = 50000;
	}
	public Account(long accountNumber, String name, double balance) {
		setAccountNumber(accountNumber);
		setName(name);
		setBalance(balance);
	}
	public Account(long accountNumber, String name) {
		
		setAccountNumber(accountNumber);
		setName(name);
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		if(accountNumber > 0)
		{
			this.accountNumber = accountNumber;	
		}
		else
		{
			this.accountNumber = 999999;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(!name.equals(""))
		{
			this.name = name;
		}
		else
		{
			this.name = "chưa xác định";
		}
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance >= 50000)
		{
			this.balance = balance;
		}
		else
		{
			this.balance = balance;
		}
	}
	public double getRATE() {
		return RATE;
	}
	
	public boolean deposit(double amount)
	{
		if(amount > 0)
		{
			balance+= amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean withdraw(double amount , double fee)
	{
		if(amount > 0 && (amount + fee) <= balance)
		{
			balance -= (amount + fee);
			return true;
		}
		else
		{
			return false;
		}
	}
	public void addInterest()
	{
	  balance = balance + balance * RATE;
	  
	}
	public boolean transfer( Account acc2 , double amount)
	{
		if(acc2.balance >= 50000 && amount  > 0)
		{
			balance -= amount;
			acc2.balance +=amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public String getTieuDe() {
		return String.format("%-15s%-15s%-15s","accountNumber","name","balance");
	}
	
	public String toString() {
		Locale local = new Locale("vi", "vn");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
        String balances = formatter.format(balance);
        return String.format("%-15d%-15s%-15s",accountNumber,name,balances);
		
	}
	
	

	
      
      
      
}
