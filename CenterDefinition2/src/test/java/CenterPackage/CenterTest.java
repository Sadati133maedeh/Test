package CenterPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class CenterTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	//LOGIN ON PORTAL
	  driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div/div/div[3]/form/div[1]/div/input")).
	  sendKeys("2181331197");
	  
	  driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div/div/div[3]/form/div[2]/div/input[2]")).
	  sendKeys("Tb8p0TV4");
	  		
	  driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div/div/div[3]/form/div[3]/button")).click();

	  Thread.sleep(5000);
	  
	  System.out.println(driver.getCurrentUrl());
	  
	 
	  //ENTER TO CENTER APP
	  driver.findElement(By.xpath("/html/body/app-root/div/app-layout/div/div/his-home/div[1]/div/div[1]/nav/ul/li[1]")).click();
	  Thread.sleep(5000);
	  for(String window:driver.getWindowHandles())
	  {
		  driver.switchTo().window(window);
	  }
	  System.out.println(driver.getCurrentUrl());
	  
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	//click on AddCenter Button
	   
	driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/app-center/div/div/div/div/kendo-grid/kendo-grid-toolbar/a")).click();

//	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	driver.findElement(By.xpath("(//kendo-combobox[@id='centerGroup']/span/span/span)[2]")).
//	  sendKeys("s");
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[1]/kendo-combobox/span/span")).click();
	driver.findElement(By.xpath("//li[contains(.,'سایر مراکز دانشگاهی')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[2]/kendo-combobox/span/span")).click();
	driver.findElement(By.xpath("//li[contains(.,'بیمارستان خصوصی')]")).click();
	driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("مهر");
	driver.findElement(By.xpath("//*[@id=\"enName\"]")).sendKeys("mehr");
	driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[5]/kendo-numerictextbox/span/input")).sendKeys("10");
	driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[6]/input")).sendKeys("421");
	driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[7]/input")).sendKeys("72");
	driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[8]/div/kendo-combobox/span/kendo-searchbar/input")).sendKeys("تهران");
	driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[8]/div/kendo-combobox/span/kendo-searchbar/input")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[8]/div/kendo-combobox/span/kendo-searchbar/input")).sendKeys(Keys.TAB);
	driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[9]/input")).sendKeys("http://79.175.176.91:3030");
	driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[10]/input")).sendKeys("1123456789");
	driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[1]/div[11]/textarea")).sendKeys("خیابان بهار");
	driver.findElement(By.id("fileUploader")).sendKeys("E:\\Automation Test\\Selenium WebDriver\\images.PNG");
	//Contact Information
	driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[2]/div[1]/kendo-grid/kendo-grid-toolbar/a/i")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div/div[4]/div/mat-dialog-container/app-add-telecom/div/div[2]/div/div/form/div/div[1]/kendo-combobox/span/span")).click();
	driver.findElement(By.xpath("//li[contains(.,'همراه')]")).click();
	driver.findElement(By.xpath("/html/body/div/div[4]/div/mat-dialog-container/app-add-telecom/div/div[2]/div/div/form/div/div[2]/mat-form-field/div/div[1]/div/input")).sendKeys("09128962218");
	driver.findElement(By.xpath("/html/body/div/div[4]/div/mat-dialog-container/app-add-telecom/div/div[2]/div/div/form/div/div[3]/textarea")).sendKeys("اطلاعات همراه");
	driver.findElement(By.xpath("/html/body/div/div[4]/div/mat-dialog-container/app-add-telecom/div/div[2]/div/div/form/div/div[4]/button")).click();
	//Media Information
	driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-add-center/div/div[2]/div/form/div[2]/div[2]/kendo-grid/kendo-grid-toolbar/a")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div/div[4]/div/mat-dialog-container/app-add-eaddress/div/div[2]/div/div/form/div/div[1]/label/kendo-combobox/span/span")).click();
	driver.findElement(By.xpath("//li[contains(.,'تلگرام')]")).click();
	driver.findElement(By.xpath("/html/body/div/div[4]/div/mat-dialog-container/app-add-eaddress/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("@t");
	driver.findElement(By.xpath("/html/body/div/div[4]/div/mat-dialog-container/app-add-eaddress/div/div[2]/div/div/form/div/div[3]/button/i")).click();
	//save center
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-add-center/div/div[2]/div/form/div[2]/div[3]/span/button")).click();
	
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


 