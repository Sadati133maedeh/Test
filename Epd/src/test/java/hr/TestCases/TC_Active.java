package hr.TestCases;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import hr.pageObjects.ActiveUser;
//import hr.pageObjects.ActiveUser;
import hr.pageObjects.Login;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class TC_Active {
	WebDriver driver ;
	@DataProvider(name = "Active")
	public Iterator<Object[]> Provider() throws IOException{
		CSVReader Reader = new CSVReader( new FileReader("./src/test/resources/data/CSVFiles_HR/activeuser.csv"),',','\'',1);
		List<Object[]> MyEntries = new ArrayList<Object[]>();
		String[] nextline;
		while((nextline = Reader.readNext())!= null ){
			MyEntries.add(nextline);
		}
		Reader.close();
		return MyEntries.iterator();
	}
	
  @Test(dataProvider = "Active")
  public void f(String user, String pass, String Coding) throws InterruptedException {
	  
	  Login lo = PageFactory.initElements(driver, Login.class);
	  lo.loginepd(driver, user, pass);                           //loginueثفق landing
	  
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//span[text() = 'مدیریت منابع انسانی']")).click();   //click on hr
	  
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  
	  
	 for(String window : driver.getWindowHandles()) {
		 driver.switchTo().window(window);          //switch to hr url
	 }
	 
	 
	 
	 ActiveUser AU = PageFactory.initElements(driver, ActiveUser.class);
	 AU.active(driver,Coding);
	 
	 
}
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
	  driver =  new ChromeDriver();
	  driver.get("http://79.175.176.91:8010");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
