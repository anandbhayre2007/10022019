package functions;

public class Car 
{
	String name;
	String model;
	int wheels;
	String colour;
	
	
	public Car(String name, String model, int wheels, String colour)
	{
		this.name=name;
		this.model=model;
		this.wheels=wheels;
		this.colour=colour;
	}
	
	public Car()
	{
		
	}
	
	public static void drive()
	{
		//Car c= new Car();
		//System.out.println("The "+c.name+" car of model "+c.model+" have "+c.wheels+" wheels and in "+c.colour+" colour");
	}
	
	public void transport()
	{
		System.out.println("The "+name+" car transports passengers from Pune to Mumbai");		
	}
	
	
	public void specification()
	{
		System.out.println("The "+name+" car of model "+model+" have "+wheels+" wheels and in "+colour+" colour");
	}
	

}
