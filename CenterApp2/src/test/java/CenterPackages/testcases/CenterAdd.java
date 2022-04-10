package CenterPackages.testcases;

import org.testng.annotations.Test;

import CenterPackages.pageobjects.login;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class CenterAdd {
	WebDriver driver;

  @Test
  public void f() throws InterruptedException {
	  login lo=PageFactory.initElements(driver, login.class);
	  lo.loginepd("2181331197", "Tb8p0TV4");
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","E:\\Automation Test\\Selenium WebDriver\\Tools\\chromedriver.exe");
		 driver=new ChromeDriver();
		  //SHOW LOGIN PAGE
		  driver.get("http://79.175.176.91:8013");
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
  }

  @AfterMethod
  public void afterMethod() {
  }

}
