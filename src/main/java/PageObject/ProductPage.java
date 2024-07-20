package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ProductPage  {
	public static WebDriver driver;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	public WebElement SauceLabsBackpack;
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	public WebElement SauceLabsBikeLight;
	
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	public WebElement SauceLabsBoltTShirt;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	public WebElement shopping_cart_link;
	
	
	 public ProductPage() {
		 PageFactory.initElements(driver, this);
	 }

}
