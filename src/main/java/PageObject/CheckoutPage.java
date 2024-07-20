package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CheckoutPage{
	public static WebDriver driver;
	
	@FindBy(id="checkout")
	public WebElement btn_checkout;
	
	 public CheckoutPage() {
		 PageFactory.initElements(driver, this);
	 }

}
