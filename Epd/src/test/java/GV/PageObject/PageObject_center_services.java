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

  @FindBy(xpath="//mat-table[@role='grid']/mat-row[2]/mat-cell[4]/descendant::input")
  WebElement clippingServiceName;


  @FindBy(xpath="//mat-table[@role='grid']/mat-row[2]/mat-cell[5]/descendant::input")
  WebElement NewServiceCode;

 

  
  

  public void clippingServiceName ( WebDriver driver , String maingroup ,String newservicename) throws InterruptedException {
	   Actions action = new Actions(driver);
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
	   .click(clippingServiceName)
	   .sendKeys(newservicename)
	   .click(Save)
	   .perform();
	   WebElement a= driver.findElement(By.xpath("//div[@role='alertdialog']"));
	   eh.highlightElement(driver,a);

	   


}
}