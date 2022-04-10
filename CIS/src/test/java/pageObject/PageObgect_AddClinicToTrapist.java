package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import cispackage.element_Highlight;

public class PageObgect_AddClinicToTrapist{
	

	element_Highlight eh= new element_Highlight();
	
	String  ClinicName1;
	String  ClinicNameAdded1;
	String  ClinicName2;
	String  ClinicNameAdded2;
	String  TrapistName;
	String  TrapistNameAdded;
	String  TrapistFirstName;
	String  TrapistLastName;
	String  TrapistCode;
	String  TrapistCodeWithTitle;



    @FindBy(xpath="")
	WebElement clinicNameSearch;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-clinic/div/div/div[3]/app-clinics/div/div[2]/div[2]/div/div/div[1]/div/mat-checkbox/label/div")
	WebElement clinicCheckbox1;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-clinic/div/div/div[3]/app-clinics/div/div[2]/div[2]/div/div/div[2]/div/mat-checkbox/label/div")
	WebElement clinicCheckbox2;

    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-clinic/div/div/div[3]/app-clinics/div/div[2]/div[2]/div/div/div[1]/div/mat-checkbox/label/span")
	WebElement clinicName1;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-clinic/div/div/div[3]/app-clinics/div/div[2]/div[2]/div/div/div[2]/div/mat-checkbox/label/span")
	WebElement clinicName2;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-clinic/div/div/div[2]/app-therapist-single/div[2]/div[2]/div/div[3]/div/div[1]/mat-checkbox/label/span")
	WebElement trapistName;

    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-clinic/div/div/div[2]/app-therapist-single/div[1]/div[1]/div/div[1]")
	WebElement trapistSearchButtom;

    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-clinic/div/div/div[2]/app-therapist-single/div[1]/div[2]/div/div[1]/kendo-textbox-container/input")
	WebElement trapistNameSearch;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-clinic/div/div/div[2]/app-therapist-single/div[1]/div[2]/div/div[2]/kendo-textbox-container/input")
	WebElement trapistFamilySearch;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-clinic/div/div/div[2]/app-therapist-single/div[1]/div[2]/div/div[3]/kendo-textbox-container/input")
	WebElement trapistCodeSearch;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-clinic/div/div/div[2]/app-therapist-single/div[2]/div[2]/div/div[1]/div/div[2]/div")
	WebElement trapistCode;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-clinic/div/div/div[2]/app-therapist-single/div[2]/div[2]/div/div[3]/div/div[1]/mat-checkbox/label/div")
	WebElement trapistCheckbox;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-clinic/div/div/div[1]/button")
	WebElement sabtBtton;
        
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-clinic/div/div/div[2]/app-therapist-single/div[1]/div[1]/div/div[2]")
	WebElement refreshTrapist;

    


    
    public void AddClinicToTrapist ( WebDriver driver ) throws InterruptedException {
    	
		Actions action = new Actions(driver);
    	element_Highlight eh= new element_Highlight();
    	
    	
	    //choose trapist
		eh.highlightElement(driver, trapistSearchButtom);
		action.click(trapistSearchButtom).perform();
		eh.unhighlightLast(driver, trapistSearchButtom);
    	eh.highlightElement(driver, trapistCheckbox);
    	action.click(trapistCheckbox).perform();
		eh.unhighlightLast(driver, trapistCheckbox);
		Thread.sleep(1000);
		//choose clinic
    	eh.highlightElement(driver, clinicName1);
		Thread.sleep(1000);
		ClinicName1= clinicName1.getText();
		eh.unhighlightLast(driver, clinicName1);
    	eh.highlightElement(driver, clinicCheckbox1);
    	action.click(clinicCheckbox1).perform();
		eh.unhighlightLast(driver, clinicCheckbox1);
		Thread.sleep(1000);
    	eh.highlightElement(driver, clinicName2);
		Thread.sleep(1000);
		ClinicName2= clinicName2.getText();
		eh.unhighlightLast(driver, clinicName1);
    	eh.highlightElement(driver, clinicCheckbox2);
    	action.click(clinicCheckbox2).perform();
		eh.unhighlightLast(driver, clinicCheckbox2);
		Thread.sleep(1000);

		//sabt
    	eh.highlightElement(driver, sabtBtton);
    	sabtBtton.click();
	    eh.unhighlightLast(driver, sabtBtton);
	    //SuccecfulAddMessage
	    WebElement POPUP= driver.findElement(By.xpath("/html/body/div[2]/div/div/snack-bar-container/simple-snack-bar"));
	    eh.highlightElement(driver, POPUP);
	    Thread.sleep(1000);
	    String c= POPUP.getText();
	    System.out.print("resulte:"+c);
	    Assert.assertEquals(c,"ثبت با موفقیت انجام شد\n"
	    		+ "x");
	    eh.unhighlightLast(driver, POPUP);

	    
	    //check sabt
		action.click(trapistSearchButtom).perform();
		Thread.sleep(1000);
    	action.click(trapistCheckbox).perform();
		Thread.sleep(1000);
        WebElement addedClinic1=driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-therapist-clinic/div/div/div[2]/app-therapist-single/div[2]/div[2]/div/div[3]/div[2]/div/div[1]/span"));
        WebElement addedClinic2=driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-therapist-clinic/div/div/div[2]/app-therapist-single/div[2]/div[2]/div/div[3]/div[2]/div/div[2]/span"));
	    eh.highlightElement(driver, addedClinic1);
		Thread.sleep(1000);
        ClinicNameAdded1=addedClinic1.getText();
        Assert.assertTrue(ClinicNameAdded1.contains(ClinicName1));
	    eh.unhighlightLast(driver, addedClinic1);
		Thread.sleep(1000);
	    eh.highlightElement(driver, addedClinic2);
		Thread.sleep(1000);
        ClinicNameAdded2=addedClinic2.getText();
        Assert.assertTrue(ClinicNameAdded2.contains(ClinicName2));
	    eh.unhighlightLast(driver, addedClinic2);


        
	}
    
      public void Search_three_letter ( WebDriver driver ) throws InterruptedException {
  		Actions action = new Actions(driver);
    	element_Highlight eh= new element_Highlight();

    	 
    	//get name
  		eh.highlightElement(driver, trapistSearchButtom);
  		action.click(trapistSearchButtom).perform();
  		eh.unhighlightLast(driver, trapistSearchButtom);
    	eh.highlightElement(driver, trapistName);
		Thread.sleep(1000);
    	TrapistName= trapistName.getText();
		Thread.sleep(500);
		eh.unhighlightLast(driver, trapistName);
		action.click(refreshTrapist).perform();
		
		 //split trapist name
		String substrings[] = TrapistName.split(" "); 
		
		TrapistFirstName=substrings[0];
		TrapistLastName=substrings[1];
		
   	    //search name
		String threeN = TrapistFirstName.substring(0, 2);
		action.click(trapistNameSearch).perform();
		action.sendKeys(threeN).perform();

		eh.highlightElement(driver, trapistSearchButtom);
		action.click(trapistSearchButtom).perform();
		eh.unhighlightLast(driver, trapistSearchButtom);
		Thread.sleep(1000);
		Assert.assertTrue(TrapistName.contains(TrapistFirstName));
		trapistNameSearch.clear();
		action.click(refreshTrapist).perform();
		Thread.sleep(1000);

		
		//search Family
	    threeN = TrapistLastName.substring(0, 2);
		action.click(trapistFamilySearch).perform();
		action.sendKeys(threeN).perform();
		eh.highlightElement(driver, trapistSearchButtom);
		action.click(trapistSearchButtom).perform();
		eh.unhighlightLast(driver, trapistSearchButtom);
		Thread.sleep(1000);
		Assert.assertTrue(TrapistName.contains(TrapistLastName));
		action.click(refreshTrapist).perform();

     } 
      
      public void Search_trapist_code ( WebDriver driver ) throws InterruptedException {
  		Actions action = new Actions(driver);
    	element_Highlight eh= new element_Highlight();
    	
    	//get Code
  		eh.highlightElement(driver, trapistSearchButtom);
  		action.click(trapistSearchButtom).perform();
  		eh.unhighlightLast(driver, trapistSearchButtom);
    	eh.highlightElement(driver, trapistCode);
		Thread.sleep(1000);
    	TrapistCodeWithTitle= trapistCode.getText();
		eh.unhighlightLast(driver, trapistCode);
		action.click(refreshTrapist).perform();

		
	    //split trapist code
		String substrings[] = TrapistCodeWithTitle.split(" "); 
		TrapistCode=substrings[2];
		
   	    //search code
		eh.highlightElement(driver, trapistCodeSearch);
		action.click(trapistCodeSearch).perform();
		action.sendKeys(TrapistCode).perform();
		Thread.sleep(1000);
		eh.unhighlightLast(driver, trapistCodeSearch);
		eh.highlightElement(driver, trapistSearchButtom);
		action.click(trapistSearchButtom).perform();
		eh.unhighlightLastB(driver, trapistSearchButtom);
		Thread.sleep(1000);
		Assert.assertTrue(TrapistCodeWithTitle.contains(TrapistCode));
		trapistNameSearch.clear();
		  	
      }
}

