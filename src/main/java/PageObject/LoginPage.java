package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.CommonMethod;


public class LoginPage extends CommonMethod {
	//WebDriver driver = new ChromeDriver();
	
	@FindBy(id="user-name")
	public WebElement Username;
	
	@FindBy(id="password")
	public WebElement Password;
	
	@FindBy(id="login-button")
	public WebElement login;
	
	
	 public LoginPage() {
		 PageFactory.initElements(driver, this);
	 }
}
