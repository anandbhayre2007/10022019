package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LearnException {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException 
	{
		int a=10;
		int b=20;		
		System.out.println(10/0);
		
		FileInputStream file= new FileInputStream("D:\\TestData.xls");
		
		Thread.sleep(2000);
		
		

	}

}
