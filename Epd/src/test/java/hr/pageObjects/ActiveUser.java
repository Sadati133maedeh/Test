package hr.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveUser {
	

	

@FindBy(xpath = "//input[@aria-haspopup= 'listbox'][1]")
WebElement status;   //vaziyat karbar


@FindBy(xpath = "//button[@type = 'submit']")
WebElement search;

@FindBy(xpath = "//a[@title = 'Expand Details']")
WebElement expand;

@FindBy(xpath = "//button[@id= 'deactivBtn']")
WebElement active;   //active button

@FindBy(xpath = "//span[text()= 'بله']")
WebElement confirm;     //bale button


public void active(WebDriver driver,String Coding) throws InterruptedException {
	
	status.sendKeys(Keys.DOWN);
	status.sendKeys(Keys.DOWN);
	
	search.click();
	
	Thread.sleep(2000);
	SerchUser su = PageFactory.initElements(driver, SerchUser.class);
	su.Searchuser2(Coding);
	
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	expand.click();
	
	active.click();
	
	confirm.click();
}



	
}

	

