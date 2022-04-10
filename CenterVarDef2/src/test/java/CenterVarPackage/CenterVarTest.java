package CenterVarPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class CenterVarTest {
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
	  //click on  VariablesManagement sub menu
	  driver.findElement(By.xpath("//*[@id=\"sidebar\"]/a[3]/span")).click();
	  Thread.sleep(3000);
	//click on CenterGroup Button
  driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/app-add-variable/div/div/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[3]/td[1]/a")).click();
	 Thread.sleep(5000);
	//click on AddCenterGroup Button
	  driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/app-add-variable/div/div/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[4]/td[2]/div/app-variable-sub-grid/kendo-grid/kendo-grid-toolbar/a")).click();
		 Thread.sleep(5000);	 
	 //fill AddCenterGroup Form
		 driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/app-add-variable/div/div/div/form/div[2]/div[2]/div/div[2]/input")).
		  sendKeys("دانشگاه تهران");
		 driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/app-add-variable/div/div/div/form/div[2]/div[2]/div/div[3]/input")).
		  sendKeys("Tehran University");
		 driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/app-add-variable/div/div/div/form/div[1]/div/button[1]/img")).click(); 
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
