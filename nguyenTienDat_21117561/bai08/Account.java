package nguyenTienDat.bai08;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private final double RATE = 0.035;

	public Account() {
		this.accountNumber = 999999;
		this.name = "Chưa xác định";
		this.balance = 50000;
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

	private void setAccountNumber(long accountNumber) {
		if (accountNumber > 0) {
			this.accountNumber = accountNumber;
		} else {
			this.accountNumber = 999999;
		}
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		if (!name.trim().equals("")) {
			this.name = name;
		} else {
			this.name = "Chưa xác định";
		}
	}

	public double getBalance() {
		return balance;
	}

	private void setBalance(double balance) {
		if (balance >= 50000) {
			this.balance = balance;
		} else {
			this.balance = 50000;
		}
	}

	public double getRATE() {
		return RATE;
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		} else {
			return false;
		}
	}

	public boolean withdraw(double amount, double fee) {
		if (amount > 0 && (amount + fee) <= balance) {
			balance = balance - (amount + fee);
			return true;
		} else {
			return false;
		}
	}

	public void addInterest() {	
		balance += balance*RATE;
	}

	public boolean transfer(Account acc2, double amount) {
		if (amount > 0 && amount <= this.balance) {
			acc2.withdraw(amount, 0);
			this.deposit(amount);
			return true;
		} else {
			return false;
		}
	}

	public static String layTieuDe() {
		return String.format("%-20s %-20s %-20s", "Name", "AccountNumber", "Balance");
	}

	@Override
	public String toString() {
		Locale local = new Locale("vi", "vn");
		NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
		String tiente = formatter.format(balance);
		return String.format("%-20s %-20d %-20s", name, accountNumber, tiente);
	}

}
