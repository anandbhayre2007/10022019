package functions;

public class FunCalling {

	public static void main(String[] args) 
	{
		Functions.sum(10,30);
		Functions.multiply(10, 20);		
		Functions obj=new Functions();
		
		int a=obj.interestCalculator(10000, 8, 10);
		System.out.println(a);		
		int b=obj.mod(20, 10);
		System.out.println(b);
		
		
		AccessModifiers fun= new AccessModifiers();
		
		fun.publicfun();
		fun.noAccessModfun();
		fun.protectedfun();
		
		
		

	}

}
