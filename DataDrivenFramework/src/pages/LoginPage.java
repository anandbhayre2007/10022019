package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver dr=null;
	By username= By.name("userName");
	By password=By.name("password");
	By login   =By.name("login");
	By registration=By.linkText("REGISTER");
	
	public LoginPage(WebDriver dr)
	{
		this.dr=dr;
	}
	
	public String login(String username, String password)
	{
		dr.findElement(this.username).sendKeys(username);
		dr.findElement(this.password).sendKeys(password);
		dr.findElement(login).click();		
		return dr.getTitle();
	}
	

}
