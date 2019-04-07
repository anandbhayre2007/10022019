package oops.abstraction;

public class BankUser {

	public static void main(String[] args) 
	{
		RBI obj;
		
		obj= new HDFC();
		
		obj.moneyTransfer();
		obj.loan();
		obj.internetBanking();
		
		obj= new ICICI();		
		obj.moneyTransfer();
		obj.loan();
		obj.internetBanking();		
		
		obj= new PNB();		
		obj.moneyTransfer();
		obj.loan();
		obj.internetBanking();
		
		int a;
		
		a=10;
		a=20;
		

	}

}
