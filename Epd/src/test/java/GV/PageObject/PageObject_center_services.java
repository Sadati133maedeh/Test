package GV.PageObject;

import java.util.concurrent.TimeUnit;

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

 

  
  

  public void z( WebDriver driver ) throws InterruptedException {
	   Actions action = new Actions(driver);

}
}