package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import PageObject.CheckoutOverview;
import PageObject.CheckoutPage;
import PageObject.InfoPage;
import PageObject.ProductPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import resuableComponent.PropertiesOperation;
import testBase.ObjectRepo;



public class CommonMethod extends ObjectRepo{
	
	public static WebDriver driver;
	public void LaunchBrowserAndLogin () throws Exception {
     String Browser = PropertiesOperation.getPropertiesValueByKey("browser");
     String Url = PropertiesOperation.getPropertiesValueByKey("Url"); 
     String UserName = PropertiesOperation.getPropertiesValueByKey("UserName"); 
     String Password = PropertiesOperation.getPropertiesValueByKey("Password"); // reading a from config

			if (Browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			} else if (Browser.equalsIgnoreCase("ie")) {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				
			} else if (Browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			
			driver.get("Url");
			
		}
	
	@BeforeMethod
	public void setupMethod() throws Exception {
		LaunchBrowserAndLogin();	
		ProdPage = new ProductPage();
		InfPage = new InfoPage();
		ChkOut = new CheckoutPage();
		CheckOverview = new CheckoutOverview();
	}	
	
	@AfterMethod
	public void cleanUp(){
		driver.quit();	
	}	
	}


