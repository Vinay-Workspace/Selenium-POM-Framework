package testBase;


import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import PageObject.InfoPage;
import PageObject.CheckoutPage;
import PageObject.CheckoutOverview;
import PageObject.InfoPage;
import PageObject.LoginPage;
import PageObject.ProductPage;
import testBase.CommonMethod;


public class ObjectRepo{
	
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ProductPage ProdPage ;
	public static InfoPage InfPage;
	public static CheckoutPage ChkOut;
	public static CheckoutOverview CheckOverview;
	//public LoginPage LoginP = new LoginPage();
	
	

}