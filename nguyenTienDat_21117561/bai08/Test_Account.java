package nguyenTienDat.bai08;

import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Locale;

public class Test_Account {
	public static void main(String[] args) {
		Account acc1= new Account(72354,"Ted Murphy",10000);
		Account acc2= new Account(69713,"Jane Smith",100000);
		Account acc3= new Account(93757,"Edward Demsey",100000);
		acc1.deposit(250000);
		acc2.deposit(500000);
		acc2.withdraw(430000, 2000);
		acc3.addInterest();
		System.out.println(Account.layTieuDe());
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
		System.out.println("Sau khi chuyen tien tu acc2 sang acc1: ");
		acc2.transfer(acc1, 100000);
		System.out.println(acc1);
		System.out.println(acc2);
	}
}
