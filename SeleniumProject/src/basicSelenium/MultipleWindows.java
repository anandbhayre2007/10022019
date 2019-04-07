package basicSelenium;

import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.naukri.com/");
		HashMap<String, String> windowns= new HashMap<>();
		String mainWin=dr.getWindowHandle();		
		System.out.println(mainWin);
		Set<String> set=dr.getWindowHandles();		
		for(String s: set)
		{			
			dr.switchTo().window(s);
			windowns.put(dr.getTitle(), s);
		}		
		
		dr.switchTo().window(windowns.get("HCL"));
		
		dr.manage().window().maximize();
		//dr.switchTo().window(mainWin);		
		dr.findElement(By.xpath("//img[@alt='HCL']")).click();
		
	}

}
