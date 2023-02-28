package bai08;

public class TestAccount {
   public static void main(String[] args){
	  Account cc1 = new Account(72354, "Ted Murphy", 100000);
	  Account cc2 = new Account(69713, "Jane Smith", 40000);
	  Account cc3 = new Account(93757, "Edward Demsey", 700000);
	  
	  System.out.println(cc1.getTieuDe());
	  
	  System.out.println(cc1.deposit(250000));
	  System.out.println(cc2.deposit(500000));
	  
	  System.out.println(cc2.withdraw(430000, 2000));
	  
	  cc3.addInterest();
	  
	  System.out.println(cc1);
	  System.out.println(cc2);
	  System.out.println(cc3);
	  
	  System.out.println(cc2.transfer(cc1, 100000));
	  
	  System.out.println(cc1);
	  System.out.println(cc2);
}
}
