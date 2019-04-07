package logicTesting;

import configuration.config;

public class Testing2 
{
	String className = this.getClass().getSimpleName();
	public static void main(String[] args) 
	{	
		String str="D:\\10022019\\DataDrivenFramework"+"\\BrowserDrivers\\chromedriver.exe";
		String str2=System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe";
		
		System.out.println(str);
		System.out.println(str2);
		Testing2 obj= new Testing2();
		System.out.println(obj.className);
		
		
	}

}
