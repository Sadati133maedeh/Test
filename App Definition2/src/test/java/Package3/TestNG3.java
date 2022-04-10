package Package3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNG3 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  // Login on Portal
	  driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div/div/div[3]/form/div[1]/div/input")).
	  sendKeys("2181331197");
	  driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div/div/div[3]/form/div[2]/div/input[2]")).
	  sendKeys("Tb8p0TV4");
	  driver.findElement(By.xpath("//*[@id=\"login-schedule-btn\"]")).click();
	  Thread.sleep(7000);
	  //Enter to Center app
	  driver.findElement(By.xpath("/html/body/app-root/div/app-layout/div/div/his-home/div[1]/div/div[1]/nav/ul/li[1]/a")).click();
	  Thread.sleep(2000);
	  System.out.println(driver.getCurrentUrl());
	  for (String window :driver.getWindowHandles())
	  {
		  driver.switchTo().window(window);
	  }
	  System.out.println(driver.getCurrentUrl());
	  Thread.sleep(3000);
	  //click on  App definition sub menu
	  driver.findElement(By.xpath("//*[@id=\"sidebar\"]/a[2]/span")).click();
	  Thread.sleep(3000);
	//click on Add App Tab
	  driver.findElement(By.xpath("//*[@id=\"addSubProjectTab\"]")).click();
	 Thread.sleep(5000);
	 //fill App Definition Form
	  driver.findElement(By.xpath("/html/body/app-root/app-center-layout/div[1]/div/div/div/app-add-application/div[1]/div[2]"
	  		+ "/div/form/div/div[1]/div/div[1]/kendo-combobox/span/span")).click();
		 Thread.sleep(5000);
		
		 driver.findElement(By.xpath("//li[contains(.,'HIS Cloud')]")).click(); 
		 Thread.sleep(7000);
		 driver.findElement(By.xpath("//*[@id=\"applicationName\"]")).sendKeys("RIS");
		 driver.findElement(By.xpath("//*[@id=\"applicationEName\"]")).sendKeys("RIS");
		 driver.findElement(By.xpath("/html/body/app-root/app-center-layout/div[1]/div/div/div/"
		 		+ "app-add-application/div[1]/div[2]/div/form/div/div[1]/div[1]/div[4]/kendo-combobox/span/span/span")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//kendo-list/div/ul/li[2]")).click(); 
		 driver.findElement(By.xpath("//*[@id=\"code\"]")).sendKeys("40");
		 driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("http://79.175.176.91:9020");
		 driver.findElement(By.xpath("//*[@id=\"shortKey\"]")).sendKeys("ctrl+Q");
		 driver.findElement(By.id("fileUploader")).sendKeys("E:\\Automation Test\\Selenium WebDriver\\Tools\\download.PNG");
		 driver.findElement(By.xpath("//*[@id=\"addSubProject\"]/form/div/div[2]/button/img")).click();
		 
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","E:\\Automation Test\\Selenium WebDriver\\Tools\\chromedriver.exe");
	  driver=new ChromeDriver();
	  //Show login page
	  driver.get("http://79.175.176.91:8013");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	 
	  }

  @AfterMethod
  public void afterMethod() {
  }

}
