package oops.inheritance;

public class User {

	public static void main(String[] args) 
	{
		Smartphone phone= new Smartphone();
		phone.internet();
		phone.texting();
		phone.calling();
		
		Telephone p= new Telephone();
		p.calling();

	}

}
