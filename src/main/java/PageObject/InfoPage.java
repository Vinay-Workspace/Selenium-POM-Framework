package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class InfoPage{
	public static WebDriver driver;
	
	@FindBy(id="first-name")
	public WebElement firstName;
	
	@FindBy(id="last-name")
	public WebElement LastName;
	
	@FindBy(id="postal-code")
	public WebElement postalCode;
	
	
	@FindBy(id="continue")
	public WebElement Cont;
	
	
	 public InfoPage() {
		 PageFactory.initElements(driver, this);
	 }

}
