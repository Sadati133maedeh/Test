package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import cispackage.element_Highlight;

public class PageObject_ListPatient {
	
	element_Highlight eh= new element_Highlight();

     WebDriver driver;


	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-patient-list/div/app-patient-search/div[1]/form/div[2]/div[2]/div/div/div/div/kendo-textbox-container[1]/input")
	   WebElement SEARCHMELICOD;
	   
	  
	   
	   public void Search_Patient_melicode (WebDriver driver, String elment) throws Throwable {
		   
			 Actions action = new Actions(driver);

		      eh.highlightElement(driver, SEARCHMELICOD);
		      Thread.sleep(500);
		      SEARCHMELICOD.click();
		      SEARCHMELICOD.sendKeys(elment);
		      SEARCHMELICOD.sendKeys(Keys.ENTER);
		      Thread.sleep(3000);
	   }
	   
	  
	   
}
