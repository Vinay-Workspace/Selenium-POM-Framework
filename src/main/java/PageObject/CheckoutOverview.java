package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CheckoutOverview{
	public static WebDriver driver;
	
	
	@FindBy(id="finish")
	public WebElement Finish;
	
	@FindBy(id="cancel")
	public WebElement cancel;
	
	@FindBy(id="back-to-products")
	public WebElement BacktoHome;
	
	 public CheckoutOverview() {
		 PageFactory.initElements(driver, this);
	 }

}
