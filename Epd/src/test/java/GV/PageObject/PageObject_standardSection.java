package GV.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import GV.Package.element_Highlight;


public class PageObject_standardSection {

  element_Highlight eh= new element_Highlight();
  
  String AddedCode; 
  String SpecialityName;

   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-standard-sections/div/mat-card/mat-card-content/div[1]/div/form/div/div[1]/mat-form-field/div/div[1]/div/mat-select/div/div[1]")
   WebElement Active_Diactive;

   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-standard-sections/div/mat-card/mat-card-content/div[1]/div/form/div/div[6]/button[1]")
   WebElement SearchButtom;

   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-standard-sections/div/mat-card/mat-card-content/div[2]/db-angular-tree-grid/table/tbody/tr[1]/td[2]/db-tree-cell/div/div/span/i")
   WebElement OpenDarmani;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-standard-sections/div/mat-card/mat-card-content/div[1]/div/form/div/div[4]/mat-form-field/div/div[1]/div/input")
   WebElement SearchName;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-standard-sections/div/mat-card/mat-card-content/div[2]/db-angular-tree-grid/table/tbody/tr[2]/td[5]/mat-checkbox/label/span[1]")
   WebElement checkbox;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-standard-sections/div/mat-card/mat-card-header/div[2]/div/button[2]/span[1]/mat-icon")
   WebElement Save;
   
   @FindBy(xpath="")
   WebElement Refresh;
   
   @FindBy(xpath="")
   WebElement ;
   
   @FindBy(xpath="")
   WebElement ;
   
   @FindBy(xpath="")
   WebElement ;

   @FindBy(xpath="")
   WebElement FirstNametd;

   PageObject_standardSection DeActive =new PageObject_standardSection();


//نمایش لیست غیر فعال
   public void showDeActivesSection( WebDriver driver ) throws InterruptedException {
	   Actions action = new Actions(driver);
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Active_Diactive);
	   Thread.sleep(1000);
	   Active_Diactive.click();
	   eh.unhighlightLast(driver, Active_Diactive);
	   action
	   .sendKeys(Keys.UP)
	   .sendKeys(Keys.ENTER).perform();
	   Thread.sleep(1000);
	   action.click(SearchButtom).perform();
	   Thread.sleep(1000);

   }
   
//اضافه کردن بخش
   public void AddSection( WebDriver driver ,String sectionName ,String sectionName2 ,String sectionName3 ) throws InterruptedException {
	   
	   Actions action = new Actions(driver);
	   
//نمایش لیست غیر فعال
	   PageObject_standardSection DeActive =new PageObject_standardSection();
	   DeActive.showDeActivesSection(driver);
//انتخاب و ذخیره بخش اول
	   action
	   .click(SearchName)
	   .sendKeys(sectionName)
	   .click(SearchButtom)
	   .click(checkbox)
	   .click(Save)
	   .perform();
	   Thread.sleep(2000);
	   action.click(Refresh).perform();
//چک اضافه شدن تخصص
	   action
	   .click(SearchCode)
	   .sendKeys(specialitiyCode)
	   .click(SearchButtom)
	   .perform();
	   AddedCode=FirstCodetd.getText();
	   Assert.assertEquals(AddedCode, specialitiyCode);
//انتخاب و ذخیره تخصص دوم
	   action
	   .click(SearchCode)
	   .sendKeys(specialitiyCode2)
	   .click(SearchButtom)
	   .click(checkbox)
	   .click(Save)
	   .perform();
	   Thread.sleep(2000);
	   action.click(Refresh).perform();
//چک اضافه شدن تخصص دوم	   
	   action
	   .click(SearchCode)
	   .sendKeys(specialitiyCode2)
	   .click(SearchButtom)
	   .perform();
	   AddedCode=FirstCodetd.getText();
	   Assert.assertEquals(AddedCode, specialitiyCode);
 //انتخاب و ذخیره تخصص سوم
	   action
	   .click(SearchCode)
	   .sendKeys(specialitiyCode3)
	   .click(SearchButtom)
	   .click(checkbox)
	   .click(Save)
	   .perform();
	   Thread.sleep(2000);
	   action.click(Refresh).perform();
//چک اضافه شدن تخصص سوم	   
	   action
	   .click(SearchCode)
	   .sendKeys(specialitiyCode3)
	   .click(SearchButtom)
	   .perform();
	   AddedCode=FirstCodetd.getText();
	   Assert.assertEquals(AddedCode, specialitiyCode);   
	   
   }
 //سرچ نام تخصص
   public void SearchSpecialityName ( WebDriver driver ) throws InterruptedException {
	   
	   Actions action = new Actions(driver);
	 //نمایش لیست غیرفعال
	   DeActive.showDeActivesSpeciality(driver);
//سرچ مورد ششم لیست
	   SpecialityName=NameSpeciality6th.getText();
	   action
	   .click(SearchName)
	   .sendKeys(SpecialityName)
	   .click(SearchButtom)
	   .perform();
	   Assert.assertEquals(SpecialityName, FirstNametd);
	   action.click(Refresh).perform();
	 //نمایش لیست غیرفعال
	   DeActive.showDeActivesSpeciality(driver);
	 //سرچ مورد دوم لیست
	   SpecialityName=NameSpeciality2th.getText();
	   action
	   .click(SearchName)
	   .sendKeys(SpecialityName)
	   .click(SearchButtom)
	   .perform();
	   Assert.assertEquals(SpecialityName, FirstNametd);
	   action.click(Refresh).perform();
   
   
   }   
 }
