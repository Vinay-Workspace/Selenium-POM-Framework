package FlowCheck;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;
import testBase.CommonMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	
public class EndToEnd extends CommonMethod {	
	
	@Test (priority =1)
	public void launch () throws Exception {
		LaunchBrowserAndLogin();
		System.out.println(driver.getTitle());

	}
	@Test (priority =2)
	public void Selectitems (){
				
		ProdPage.SauceLabsBackpack.click();
		ProdPage.SauceLabsBikeLight.click();
		ProdPage.SauceLabsBoltTShirt.click();
		ProdPage.shopping_cart_link.click();
		
	}
	@Test (priority =3)
	public void Checkout () throws Exception {
		ChkOut.btn_checkout.click();		
	}
	@Test (priority =4)
	public void YourInfo () throws Exception{
		InfPage.firstName.sendKeys("Vidal Sebastine");
		InfPage.LastName.sendKeys("COlt");
		InfPage.postalCode.sendKeys("45356");
		InfPage.Cont.click();
	}
	@Test (priority =5)
	public void Overview () throws Exception{
		ChkOut.btn_checkout.click();
	}
	@Test (priority =6)
	public void Finish () throws Exception {
		CheckOverview.Finish.click();
		CheckOverview.BacktoHome.click();
	}
	
}
