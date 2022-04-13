package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import cispackage.element_Highlight;

public class PageObject_AdmitList {
	
	element_Highlight eh= new element_Highlight();

    WebDriver driver;

	
	@FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit-list/div/div[2]/form/div[2]/div/div[2]/div[4]/div/input")
	WebElement SearchElectronicNumber;
	@FindBy(name="patientLastName")
	WebElement patientLastName;
	@FindBy(id="inputNationalCode")
	WebElement NationalCode;

	
	public void Search_Admit_ElectronicNumber (WebDriver driver, String electronicNumber) throws Throwable {
		   
		 Actions action = new Actions(driver);

	      eh.highlightElement(driver, SearchElectronicNumber);
	      Thread.sleep(500);
	      action.click(SearchElectronicNumber).perform();
	      action.sendKeys(electronicNumber).perform();
	      Thread.sleep(500);
	      action.sendKeys(Keys.ENTER).perform();
	      Thread.sleep(3000);
}
	public void Search_Admit_FamilyName (WebDriver driver, String familyName) throws Throwable {
		   
		 Actions action = new Actions(driver);

	      eh.highlightElement(driver, patientLastName);
	      Thread.sleep(500);
	      action.click(patientLastName).perform();
	      action.sendKeys(familyName).perform();
	      Thread.sleep(500);
	      action.sendKeys(Keys.ENTER).perform();
	      Thread.sleep(3000);
}
	
	public void Search_Admit_NationalCode (WebDriver driver, String nationalCode) throws Throwable {
		   
		 Actions action = new Actions(driver);

	      eh.highlightElement(driver, NationalCode);
	      Thread.sleep(500);
	      action.click(NationalCode).perform();
	      action.sendKeys(nationalCode).perform();
	      Thread.sleep(500);
	      action.sendKeys(Keys.ENTER).perform();
	      Thread.sleep(3000);
}


}

