package functions;

public class FunctionsOverloading {


	
	
	
	public int sum(String a, int b)
	{
		return b;
	}
	
	public int sum(int a, int b, int c)
	{
		return a+b;
	}
	
	
	public static void main(String[] args) 
	{
		FunctionsOverloading obj= new FunctionsOverloading();		
		//System.out.println(obj.sum(10, 20));
		System.out.println(obj.sum(10, 20, 30));

	}
	
	
}
