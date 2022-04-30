package GV.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import GV.Package.element_Highlight;


public class PageObject_center_services {

  element_Highlight eh= new element_Highlight();
  
  String AddedCode; 
  String InsuranceName;
  String searchInsurance;

  @FindBy(xpath="//mat-select[@name='sectionId']")
  WebElement MainGroupServices;

  @FindBy(xpath="//mat-select[@name='subgroup']")
  WebElement UnderGroupServices;

@FindBy(xpath="//mat-select[@name='group']")
  WebElement Group;

     @FindBy(xpath="//button[@type='submit']")
  WebElement SearchButton;
  
  @FindBy(xpath="//img[@alt='refresh']")
  WebElement  Refresh;

  @FindBy(xpath="//input[@formcontrolname='ServiceName']")
  WebElement  SearchServiceName;

  @FindBy(xpath="//input[@formcontrolname='ServiceCode']")
  WebElement  SearchServicecode;

  @FindBy(xpath="//input[@name='rvuCode']")
  WebElement  SearchRVUcode;
  
  
  @FindBy(xpath="(//mat-select[@role='combobox'])[4]")
  WebElement NumberPerPage;

  @FindBy(xpath="//button[@mattooltip='ذخیره']")
  WebElement Save;

  @FindBy(xpath="//mat-select[@name='beginCenterGroup']")
  WebElement BeginCenterGroup;
  
  @FindBy(xpath="//mat-select[@name='beginCentreName']")
  WebElement BeginCentreName;
  
  @FindBy(xpath="//mat-select[@name='destinationCenterGroup']")
  WebElement DestinationCenterGroup;
  
  @FindBy(xpath="//mat-select[@name='DestinationCentreName']")
  WebElement DestinationCentreName;
  
  @FindBy(xpath="//button[@type='submit']")
  WebElement Copy;



  


 

  
  

  public void clippingServiceName ( WebDriver driver , String maingroup ,String newservicename, String maingroup2 ,String newservicename2) throws InterruptedException {
	   Actions action = new Actions(driver);
	   //درج نام اختصاری 1
	   action
	   .click(MainGroupServices)
	   .perform();
	   Thread.sleep(500);
	   action
	   .sendKeys(maingroup).perform();
	   Thread.sleep(500);
	   action
	   .sendKeys(Keys.ENTER)
	   .perform();
	   Thread.sleep(3000);
	       driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);  
	   WebElement clippingServiceName= driver.findElement(By.xpath("//mat-table[@role='grid']/mat-row[2]/mat-cell[4]/descendant::input"));
	   action
	   .click(clippingServiceName)
	   .sendKeys(newservicename)
	   .click(Save)
	   .perform();
	   WebElement a= driver.findElement(By.xpath("//div[@role='alertdialog']"));
	   eh.highlightElement(driver,a);
	   Thread.sleep(2000);
	   action.click(Refresh).perform();
		  driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);  
	   //درج نام اختصاری 2
	   action
	   .click(MainGroupServices)
	   .perform();
	   Thread.sleep(500);
	   action
	   .sendKeys(maingroup2).perform();
	   Thread.sleep(500);
	   action
	   .sendKeys(Keys.ENTER)
	   .perform();
	   Thread.sleep(3000);
		  driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);  
	   WebElement clippingServiceName2= driver.findElement(By.xpath("//mat-table[@role='grid']/mat-row[2]/mat-cell[4]/descendant::input"));
	   action
	   .click(clippingServiceName2)
	   .sendKeys(newservicename2)
	   .click(Save)
	   .perform();
	   WebElement b= driver.findElement(By.xpath("//div[@role='alertdialog']"));
	   eh.highlightElement(driver,b);

     }
  public void CopyCenterServices ( WebDriver driver , String beginCenterGroup ,String beginCentreName, String destinationCenterGroup ,String destinationCentreName) throws InterruptedException {
	   Actions action = new Actions(driver);
	   action
	     .click(BeginCenterGroup).perform();
	   Thread.sleep(500);

	   action
	     .sendKeys(beginCenterGroup).perform();
	   Thread.sleep(500);

	   action
	     .sendKeys(Keys.ENTER).perform();
	   Thread.sleep(500);

		  driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);  
		 action
		   .click(BeginCentreName).perform();
		   Thread.sleep(500);

		 action
		   .sendKeys(beginCentreName).perform();
		   Thread.sleep(500);

		 action
		   .sendKeys(Keys.ENTER).perform();
		   Thread.sleep(500);

			  driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
		 action
		    .click(DestinationCenterGroup).perform();
		   Thread.sleep(500);

		 action
			.sendKeys(destinationCenterGroup).perform();
		   Thread.sleep(500);

		 action
			.sendKeys(Keys.ENTER).perform();
		   Thread.sleep(500);

			   driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);  
		 action
			 .click(DestinationCentreName).perform();
		   Thread.sleep(500);

		 action
			 .sendKeys(destinationCentreName).perform();
		   Thread.sleep(500);

		 action
			 .sendKeys(Keys.ENTER).perform();
		   Thread.sleep(500);

				 driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);  
		action.click(Copy).perform();


	   
  }
  
  public void Check_CopyCenterServices ( WebDriver driver , String maingroup ,String newservicename, String maingroup2 ,String newservicename2, String RVU, String RVU2) throws InterruptedException {
	   Actions action = new Actions(driver);
	   //چک درج نام اختصاری 1
	   action
	   .click(MainGroupServices)
	   .perform();
	   Thread.sleep(500);
	   action
	   .sendKeys(maingroup).perform();
	   Thread.sleep(500);
	   action
	   .sendKeys(Keys.ENTER)
	   .perform();
	   Thread.sleep(3000);
	   action
	   .click(SearchRVUcode)
	   .sendKeys(RVU)
	   .sendKeys(Keys.ENTER)
	   .perform();
	   Thread.sleep(1000);

	       driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);  
	   WebElement clippingServiceName= driver.findElement(By.xpath("//mat-table[@role='grid']/mat-row[1]/mat-cell[4]/descendant::input"));
	   
	 String  newNameAdded=clippingServiceName.getAttribute("value");
	 System.out.println("wwwww" + newNameAdded);
	 Assert.assertEquals(newNameAdded, newservicename);
	   eh.highlightElement(driver,clippingServiceName);
	   action
	   .click(Refresh).perform();

	   //چک درج نام اختصاری 2
	   action
	   .click(MainGroupServices)
	   .perform();
	   Thread.sleep(500);
	   action
	   .sendKeys(maingroup2).perform();
	   Thread.sleep(500);
	   action
	   .sendKeys(Keys.ENTER)
	   .perform();
	   Thread.sleep(3000);
	   action
	   .click(SearchRVUcode)
	   .sendKeys(RVU2)
	   .sendKeys(Keys.ENTER)
	   .perform();
	   Thread.sleep(1000);

		  driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);  
	   WebElement clippingServiceName2= driver.findElement(By.xpath("//mat-table[@role='grid']/mat-row[1]/mat-cell[4]/descendant::input"));
		 String  newNameAdded2=clippingServiceName2.getAttribute("value");
		 Assert.assertEquals(newNameAdded2, newservicename2);
		   eh.highlightElement(driver,clippingServiceName2);
		   Thread.sleep(3000);



	   
 }

  
}