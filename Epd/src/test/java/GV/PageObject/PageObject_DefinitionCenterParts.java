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


public class PageObject_DefinitionCenterParts {

  element_Highlight eh= new element_Highlight();
  
  String PartName;
  String PartCode;
  String AddedNewPartName;
  String AddedNewPartCode;
  String InsuranceName;
  String AddedStandard;
  String AddedStandardCheck;


   @FindBy(xpath="//mat-select[@name='active']")
   WebElement Active_Diactive;

   @FindBy(xpath="//button[@type='submit' and  @mattooltip='جستجو']")
   WebElement SearchButtom;

   @FindBy(xpath="(//input[@name='title'])[2]")
   WebElement SearchName;

   @FindBy(xpath="//input[@name='unitCode']")
   WebElement SearchCode;
   
   @FindBy(xpath="(//mat-select[@name='activity'])[2]")
   WebElement SearchActivity;
   
   @FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/mat-option[1]/span")
   WebElement ActivityDarmani;
   
   @FindBy(xpath="(//mat-select[@name='group'])[2]")
   WebElement SearchGroup;
   
   @FindBy(xpath="//button[text()='افزودن']")
   WebElement AddButton;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[2]/div/form/div/div[6]/button[2]")
   WebElement RefreshSearch;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[1]/form/div/div[5]/button[2]")
   WebElement RefreshAdd;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[1]/form/div/div[1]/mat-form-field/div/div[1]/div/mat-select/div/div[1]")
   WebElement Activity;
   
   @FindBy(xpath="(//mat-select[@name='group'])[1]")
   WebElement Group;
   
   @FindBy(xpath="//div[@role='listbox']/child::mat-option[6]")
   WebElement Group_Clinic;
   
   @FindBy(xpath="//div[@role='listbox']/child::mat-option[2]")
   WebElement Group_Emergency;

   @FindBy(xpath="(//input[@name='title'])[1]")
   WebElement Name;
   
   @FindBy(xpath="//input[@name='code']")
   WebElement Code;
   
   @FindBy(xpath="//input[@type='checkbox']")
   WebElement Standardization;
   
   @FindBy(xpath="//tbody/tr[1]/td[5]/descendant::mat-select[@role='combobox']")
   WebElement StandardizationCombo;
   
   @FindBy(xpath="//tbody/tr[1]/td[2]")
   WebElement FirstNametd;
   
   @FindBy(xpath="//tbody/tr[2]/td[2]")
   WebElement SecondNametd;

   @FindBy(xpath="//tbody/tr[1]/td[4]")
   WebElement FirstCodetd;
   
   @FindBy(xpath="//tbody/tr[1]/td[3]")
   WebElement FirstGrouptd;






//نمایش لیست غیر فعال
   public void showDeActivesDefinitionCenterParts( WebDriver driver ) throws InterruptedException {
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
   public void AddCenterParts( WebDriver driver ,String CenterPartName ,String CenterPartCode, String CenterPartName2 ,String CenterPartCode2 ) throws InterruptedException {
	   
	   //اضافه کردن 1بخش
	   Actions action = new Actions(driver);
	   action
	   .click(Activity)
	   .sendKeys(Keys.ENTER)
	   .click(Group).perform();
	   Thread.sleep(1000);
       action
	   .click(Group_Clinic)
	   .click(Name)
	   .sendKeys(CenterPartName)
	   .click(Code)
	   .sendKeys(CenterPartCode)
	   .perform();
	   Thread.sleep(1000);
       action
	   .click(AddButton)
	   .perform();
	   Thread.sleep(500);
       //چک اضافه شدن
       AddedNewPartName=FirstNametd.getText();
	   Assert.assertEquals(AddedNewPartName, CenterPartName);
	   eh.highlightElement(driver,FirstNametd);
	   
	   //اضافه کردن 2بخش
	   action
	   .click(Activity)
	   .sendKeys(Keys.ENTER)
	   .click(Group).perform();
	   Thread.sleep(1000);
       action
	   .click(Group_Emergency)
	   .click(Name)
	   .sendKeys(CenterPartName2)
	   .click(Code)
	   .sendKeys(CenterPartCode2)
	   .perform();
	   Thread.sleep(1000);
       action
	   .click(AddButton)
	   .perform();
	   Thread.sleep(500);
       //چک اضافه شدن
       AddedNewPartName=SecondNametd.getText();
	   Assert.assertEquals(AddedNewPartName, CenterPartName2);
	   eh.highlightElement(driver,SecondNametd);


	  	   
   }
 //ویرلیش نام و کد بخش
   public void EditCenterPart ( WebDriver driver , String NewName, String NewCode) throws InterruptedException {
	   //Edit Name
	   Actions action = new Actions(driver);
	   WebElement PenButton =driver.findElement(By.xpath("//mat-icon[text()='edit' or role='img']"));
	   action
	   .click(PenButton)
	   .click(Name)
	   .perform();
	   Name.clear();
	   Thread.sleep(1000);
	   action
	   .click(Name)
	   .sendKeys(NewName)
	   .perform();
	   WebElement EditButton =driver.findElement(By.xpath("//button[text()='ویرایش']"));
	   EditButton.click();
//	   WebElement POPUP =driver.findElement(By.xpath("/div/div[1]"));
//	   Thread.sleep(500);
//	   String c=POPUP.getText();
//       Assert.assertTrue(c.contains("موفقیت"));
	   Thread.sleep(1000);
	   //چک ثبت ویرایش
	   AddedNewPartName=FirstNametd.getText();
	   Assert.assertEquals(AddedNewPartName, NewName);
	   eh.highlightElement(driver,FirstNametd);
	   Thread.sleep(1000);

	   
	   //Edit Code
	   WebElement PenButton1 =driver.findElement(By.xpath("//mat-icon[text()='edit' or role='img']"));
	   action
	   .click(PenButton1)
	   .click(Code)
	   .perform();
	   Code.clear();
	   Thread.sleep(1000);
	   action
	   .click(Code)
	   .sendKeys(NewCode)
	   .perform();
	   WebElement EditButton1 =driver.findElement(By.xpath("//button[text()='ویرایش']"));
	   EditButton1.click();
//	   String b=POPUP.getText();
//       Assert.assertTrue(b.contains("موفقیت"));
	   Thread.sleep(1000);
	   //چک ثبت ویرایش
	   AddedNewPartCode=FirstCodetd.getText();
	   Assert.assertEquals(AddedNewPartCode, NewCode);
	   eh.highlightElement(driver,FirstCodetd); 
	   

   }   
   //استانداردسازی  
   public void Standardization ( WebDriver driver  ) throws InterruptedException {
	   
	   Actions action = new Actions(driver);
	   action
	   .click(Standardization)
	   .click(StandardizationCombo)
	   .sendKeys(Keys.ENTER)
	   .perform();
	   Thread.sleep(1000);
	   AddedStandard=StandardizationCombo.getText();
	   driver.navigate().refresh();
	   Thread.sleep(7000);
	   AddedStandardCheck=StandardizationCombo.getText();
       Assert.assertEquals(AddedStandard, AddedStandardCheck);
	   eh.highlightElement(driver,StandardizationCombo); 
   
   }
   
   //جستجو  
   public void SearchCenterPart ( WebDriver driver , String CenterPartName2 ,String CenterPartCode2,String NewName ,String NewCode  ) throws InterruptedException {
	   Actions action = new Actions(driver);

	   //جستجو بر اساس گروه
	   //درمانگاه
	   SearchActivity.click();
	   ActivityDarmani.click();
	   SearchGroup.click();
	   Group_Clinic.click();
	   SearchButtom.click();
	   Thread.sleep(1000);
	   PartName=FirstNametd.getText();
	   Thread.sleep(1000);
       Assert.assertEquals(PartName, NewName);
	   eh.highlightElement(driver,FirstNametd); 
	   RefreshSearch.click();
	   Thread.sleep(1000);
	   //اورژانس
	   SearchActivity.click();
	   ActivityDarmani.click();
	   SearchGroup.click();
	   Boolean staleElement = true;
	   while(staleElement){

		   try{

			   WebElement Group_Emergency1 =driver.findElement(By.xpath("//div[@role='listbox']/child::mat-option[2]"));
			   Group_Emergency1.click();

		      staleElement = false;


		   } catch(StaleElementReferenceException Group_Emergency1){

		     staleElement = true;

		   }

		 }

	   WebElement Group_Emergency1 =driver.findElement(By.xpath("//div[@role='listbox']/child::mat-option[2]"));
	   Group_Emergency1.click();
	   
	   WebElement SearchButtom =driver.findElement(By.xpath("//button[@type='submit' and  @mattooltip='جستجو']"));
	   System.out.println("99999999999999");
	   Thread.sleep(1000);
	   action
	   .click(SearchButtom);
	   SearchButtom.click();
	   Thread.sleep(1000);
	   PartName=FirstNametd.getText();
	   Thread.sleep(1000);
       Assert.assertEquals(PartName, CenterPartName2);
	   eh.highlightElement(driver,FirstNametd); 
	   RefreshSearch.click();
	   Thread.sleep(1000);

	   //جستجو بر اساس نام
	   SearchName.click();
	   SearchName.sendKeys(NewName);
	   SearchButtom.click();
	   Thread.sleep(1000);
	   PartName=FirstNametd.getText();
	   Thread.sleep(1000);
       Assert.assertEquals(PartName, NewName);
	   eh.highlightElement(driver,FirstNametd); 
	   RefreshSearch.click();
	   Thread.sleep(1000);

	   //جستجو بر اساس کد
	   SearchCode.click();
	   SearchCode.sendKeys(NewCode);
	   SearchButtom.click();
	   Thread.sleep(1000);
	   PartCode=FirstCodetd.getText();
	   Thread.sleep(1000);
       Assert.assertEquals(PartCode, NewCode);
	   eh.highlightElement(driver,FirstCodetd); 
	   RefreshSearch.click();
	   Thread.sleep(500);

   }

 }

