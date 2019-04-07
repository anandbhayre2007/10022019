package scripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.ApplicationCache;

import configuration.config;
import libraries.ApplicationLib;
import libraries.Xls_Reader;
import pages.LoginPage;

public class TC_Login 
{
	WebDriver dr;
	@BeforeClass
	@Parameters({"browser"})
	public void preCondtion(String browsername)
	{
		ApplicationLib lib= new ApplicationLib();
		dr=lib.launchBrowser(browsername);
		dr.manage().window().maximize();
		dr.get(config.URL);
	}
	
	@AfterClass
	public void tearDown()
	{
		dr.close();	
	}
	
	@Test(dataProvider="getData")
	public void script(String username, String password, String title) throws InterruptedException
	{
		//Perform Login
		LoginPage obj_login=new LoginPage(dr);
		obj_login.login(username, password);	
		dr.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		Thread.sleep(2000);
		assertEquals(dr.getTitle(), title);
	}
	
	
	@DataProvider
	public String[][] getData() throws IOException
	{
		Xls_Reader xl= new Xls_Reader(config.testData);
		String sheetName = this.getClass().getSimpleName();
		
		int rows=xl.getrowcount(sheetName);
		int cols=xl.getColumncount(sheetName);
		
		String[][] data= new String[rows-1][cols];
		
		for(int r=2; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{
               data[r-2][c-1]= xl.getCellData(sheetName, r, c);
			}
		}
		
		return data;
		
	}

}
