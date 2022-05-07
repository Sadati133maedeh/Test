package GV.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import GV.Package.element_Highlight;


public class PageObject_riali_fixed {

	  element_Highlight eh= new element_Highlight();
	  

	  @FindBy(xpath="(//button[@type='submit'])[1]")
	   WebElement addSearch;

	  @FindBy(xpath="(//button[@type='submit'])[2]")
	   WebElement showSearch;
	  
	  @FindBy(xpath="(//mat-select[@name='sectionId'])[1]")
	  WebElement addMainGroupServices;
	  
	  @FindBy(xpath="(//mat-select[@name='sectionId'])[2]")
	  WebElement showMainGroupServices;
	  
	  @FindBy(xpath="(//mat-select[@name='subgroup'])[1]")
	  WebElement addUnderGroupServices;
	  
	  @FindBy(xpath="(//mat-select[@name='subgroup'])[2]")
	  WebElement showUnderGroupServices;
	  
	  @FindBy(xpath="(//mat-select[@name='group'])[1]")
	  WebElement addFareGroupServices;

	  @FindBy(xpath="(//mat-select[@name='group'])[2]")
	  WebElement showFareGroupServices;
	  
	  @FindBy(xpath="(//input[@formcontrolname='ServiceName'])[1]")
	  WebElement  addSearchServiceName;
	  
	  @FindBy(xpath="(//input[@formcontrolname='ServiceName'])[2]")
	  WebElement  showSearchServiceName;
	  
	  @FindBy(xpath="(//input[@formcontrolname='RvuCode'])[1]")
	  WebElement  addSearchRUVcode;

	  @FindBy(xpath="//input[@name='rvuCode']")
	  WebElement  showSearchRUVcode;

	  @FindBy(xpath="//mat-select[@name='tariffId']")
	  WebElement  SearchTariff;

	  @FindBy(xpath="//mat-select[@name='contractId']")
	  WebElement  SearchContract;


	   

	   public void x( WebDriver driver ,String tariff,String tariff2,String tariff3) throws InterruptedException {
		   Actions action = new Actions(driver);

	}
	   public void y( WebDriver driver ,String Newtariff ,String tariff2) throws InterruptedException {
		   Actions action = new Actions(driver);

	}
	   public void z( WebDriver driver ,String Newtariff, String activ_deActiv, String activ_deActiv2) throws InterruptedException {
		   Actions action = new Actions(driver);

		      	   	   
	   }
	   public void v ( WebDriver driver ,String tariff, String StandardTariff ) throws InterruptedException {
		   
		   Actions action = new Actions(driver);
		   

	   }

}
