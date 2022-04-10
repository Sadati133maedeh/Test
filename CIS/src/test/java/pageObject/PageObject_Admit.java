package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cispackage.element_Highlight;

public class PageObject_Admit {
	
	  element_Highlight eh= new element_Highlight();
	  
	  
	  String positionServic;

      WebDriver driver;

	   @FindBy(name="NationalCode")
	   WebElement NationalCode;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/app-admit-patient-search/div[1]/form/div[2]/div[2]/div/div[1]/div[1]/div/div[1]/kendo-combobox/span/kendo-searchbar/input")
	   WebElement Meliat;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/app-admit-patient-search/div[1]/form/div[2]/div[2]/div/div[1]/div[1]/div/div[1]/kendo-combobox/span/span[1]")
	   WebElement ClearMeliat;
	   
	   @FindBy(name="ElectronicNumber")
	   WebElement ElectronicNumber;

	   @FindBy(name="Name")
	   WebElement Name;

	   @FindBy(name="FamilyName")
	   WebElement FamilyName;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[1]/app-admit-form/form/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div/div/kendo-combobox/span/kendo-searchbar/input")
	   WebElement Trapist;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[1]/app-admit-form/form/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/kendo-combobox/span/kendo-searchbar/input")
	   WebElement Clinic;

	   @FindBy(id="filterAfterEdit")
	   WebElement FilterAfterEdit;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[1]/app-admit-form/form/div/div[1]/div/div[3]/kendo-combobox/span/kendo-searchbar/input")
	   WebElement Assistant;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[1]/app-admit-form/form/div/div[1]/div/div[4]/div[1]/div/kendo-combobox/span/kendo-searchbar/input")
	   WebElement Shift;
	   
	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[1]/app-admit-form/form/div/div[1]/div/div[4]/div[1]/div/kendo-combobox/span/span[1]")
	   WebElement ClearShift;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[1]/app-admit-form/form/div/div[2]/div/div[1]/kendo-combobox/span/kendo-searchbar/input")
	   WebElement Model;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[2]/app-admit-service-search/div/div/div/div[1]/div[1]/div[1]/div/kendo-combobox/span/kendo-searchbar/input")
	   WebElement ServicesCombo;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[2]/app-admit-service-search/div/div/div/div[1]/div[1]/div[1]/div/kendo-combobox/span/span[1]")
	   WebElement ClearServicesCombo;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[2]/app-admit-service-search/div/div/div/div[1]/div[1]/div[5]/div/div[1]/a/img")
	   WebElement SearchServices;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[1]/button[3]")
	   WebElement Sabt_Admit;
	   
	   //AddPatient
	   @FindBy(name="name")
	   WebElement NAME;

	   @FindBy(name="familyName")
	   WebElement FAMILY;

	   @FindBy(name="fatherName")
	   WebElement FATHER;

	   @FindBy(name="NationalCode")
	   WebElement MELICODE;

	   @FindBy(id="PatientCode")
	   WebElement Passport;

	   @FindBy(xpath="//*[@id=\\\"file\\\"]\"")
	   WebElement Avatar;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/kendo-combobox/span/kendo-searchbar/input")
	   WebElement sex;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[1]/div[1]/div/div[2]/div[2]/div[4]/mat-form-field/div/div[1]/div[1]/input")
	   WebElement birthdate;

	   @FindBy(name="BirthPlaceOut")
	   WebElement birthPlace;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[1]/div[1]/div/div[2]/div[2]/div[7]/kendo-combobox/span/kendo-searchbar/input")
	   WebElement mahaltavalod;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[1]/div[1]/div/div[2]/div[2]/div[3]/kendo-combobox/span/kendo-searchbar/input")
	   WebElement tahol;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[1]/div[2]/div/div[2]/div[1]/div/div[3]/kendo-combobox/span/kendo-searchbar/input")
	   WebElement city;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[1]/div[2]/div/div[3]/kendo-textbox-container/textarea")
	   WebElement adress;

	   @FindBy(name="telNo")
	   WebElement PHONE;

	   @FindBy(name="EAddress")
	   WebElement eMAIL;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[2]/div/div[2]/div[1]/div[1]/kendo-combobox/span/kendo-searchbar/input")
	   WebElement bime;
	   
	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[2]/div/div[2]/div[1]/div[2]/kendo-combobox/span/kendo-searchbar/input")
	   WebElement sandogh;
	   
	   @FindBy(name="InsuranceNo")
	   WebElement BIMECODE;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[2]/div/div[2]/div[2]/div[1]/mat-form-field/div/div[1]/div[1]/input")
	   WebElement bimedate;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[2]/div/div[2]/div[2]/div[2]/kendo-combobox/span/kendo-searchbar/input")
	   WebElement nesbat;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[2]/div/div[3]/div/button[1]")
	   WebElement Sabt;
	   
	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[1]/div[1]/div/div[2]/div[1]/div[5]/kendo-combobox/span/kendo-searchbar/input")
	   WebElement meliat;
	   
	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[1]/div[1]/div/div[2]/div[1]/div[5]/kendo-combobox/span/span[1]")
	   WebElement clearmeliat;
	   
	   @FindBy(name="oldId")
	   WebElement oldId;



        public void Admit_Exisingt_Patient_ElectronicNumber (WebDriver driver, String electronicNumber ) throws InterruptedException {
        	
			 Actions action = new Actions(driver);
		     eh.highlightElement(driver, ElectronicNumber);
		     action.click(ElectronicNumber).perform();
		     action.sendKeys(electronicNumber).perform();
			 Thread.sleep(500);
			 action.sendKeys(Keys.ENTER).perform();
			 eh.unhighlightLastB(driver, ElectronicNumber);
			
        }
	   
        public void Admit_Exisingt_Patient_Name (WebDriver driver, String name ,String familyName) throws InterruptedException {
        	
			 Actions action = new Actions(driver);
		     eh.highlightElement(driver, Name);
		     action.click(Name).perform();
		     action.sendKeys(name).perform();
			 Thread.sleep(500);
			 eh.unhighlightLastB(driver, Name);
			 Thread.sleep(500);
		     eh.highlightElement(driver, FamilyName);
		     action.click(FamilyName).perform();
		     action.sendKeys(familyName).perform();
		     eh.highlightElement(driver, FamilyName);
			 action.sendKeys(Keys.ENTER).perform();

			
       }
        
      
        public void Admit_NationalCode (WebDriver driver, String nationalCode ) throws InterruptedException {
        	
			 Actions action = new Actions(driver);
		     eh.highlightElement(driver, NationalCode);
		     action.click(NationalCode).perform();
		     action.sendKeys(nationalCode).perform();
			 Thread.sleep(500);
			 eh.unhighlightLastB(driver, NationalCode);
			 action.sendKeys(Keys.ENTER).perform();
			
       }

        

	   
        public void Admit_Data (WebDriver driver, String clinic,String trapist, String assistant, String shift, String model) throws InterruptedException {
        	
			 Actions action = new Actions(driver);
			 //AddClinic
		     eh.highlightElement(driver, Clinic);
		     action.click(Clinic).perform();
		     action.sendKeys(clinic).perform();
		     System.out.println("sghhhhhhhhl");
		     action.sendKeys(Keys.DOWN).perform();
		     action.sendKeys(Keys.ENTER).perform();
		     eh.unhighlightLastB(driver, Clinic);
			 Thread.sleep(1000);
			 //AddTrapist
		     eh.highlightElement(driver, Trapist);
		     action.click(Trapist).perform();
		     action.sendKeys(trapist).perform();
		     action.sendKeys(Keys.DOWN).perform();
		     action.sendKeys(Keys.ENTER).perform();
			 eh.unhighlightLastB(driver, Trapist);
			 Thread.sleep(1000);
		     //AddAssistant
		     eh.highlightElement(driver, Assistant);
		     action.click(Assistant).perform();
		     action.sendKeys(assistant).perform();
		     eh.unhighlightLastB(driver, Assistant);
		     //AddShift
		     eh.highlightElement(driver, Shift);
		     action.click(ClearShift).perform();
			 Thread.sleep(500);
		     action.click(Shift).perform();
		     action.sendKeys(shift).perform();
		     eh.unhighlightLastB(driver, Shift);
		     Thread.sleep(1000);
		     //AddModel
		     eh.highlightElement(driver, Model);
		     action.click(Model).perform();
		     action.sendKeys(model).perform();
		     eh.unhighlightLastB(driver, Model);
		     Thread.sleep(1000);
		     //AddServicesList
		     eh.highlightElement(driver, SearchServices);
		     action.click(SearchServices).perform();
		     eh.unhighlightLastB(driver, SearchServices);
		     Thread.sleep(2000);
		     //AddServices
		     WebElement SelectServices1=driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[2]/app-admit-service-search/div/div/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]"));
		     eh.highlightElement(driver, SelectServices1);
		     action.click(SelectServices1).perform();
		     eh.unhighlightLastB(driver, SelectServices1);
		     Thread.sleep(1000);
		     //AddServices
		     WebElement SelectServices5= driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[2]/app-admit-service-search/div/div/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[5]"));
		     eh.highlightElement(driver, SelectServices5);
		     action.click(SelectServices5).perform();
		     eh.unhighlightLastB(driver, SelectServices5);
		     Thread.sleep(1000);
		     //SabtAdmit
		     eh.highlightElement(driver, Sabt_Admit);
		     action.click(Sabt).perform();
		     eh.unhighlightLastB(driver, Sabt_Admit);
		     //SuccesfulAdmit
		     WebElement POPUP= driver.findElement(By.xpath("/html/body/div[2]/div/div/snack-bar-container"));
		      eh.highlightElement(driver, POPUP);
		      Thread.sleep(1000);
		      String c= driver.findElement(By.xpath("/html/body/div[2]/div/div/snack-bar-container")).getText();
		      System.out.print("resulte:"+ c);
		      Assert.assertEquals(c, "Ù¾Ø°ÛŒØ±Ø´ Ø¨ÛŒÙ…Ø§Ø± Ø¨Ø§ Ù…ÙˆÙ�Ù‚ÛŒØª Ø«Ø¨Øª Ø´Ø¯.\n"
		      		+ "x");
		      Thread.sleep(1000);
	
       }

 	   public void AddPatient (WebDriver driver, String Name ,String Family ,String Father
				 ,String Avatar,String Sex ,String TAHOL ,String BIRTHDATE ,String Mahaltavalod 
				  ,String City ,String Adress ,String Email ,String BIME ,String SANDOGH ,String BIMEDATE ,String NESBAT,String Meliat,String OLDID) throws Throwable {
		   
			 Actions action = new Actions(driver);

		     //name
		     eh.highlightElement(driver, NAME);
		     action.click(NAME).perform();
		     action.sendKeys(Name).perform();
			 Thread.sleep(500);
			 eh.unhighlightLastB(driver, NAME);
			 
           //family
		     eh.highlightElement(driver, FAMILY);
		     action.click(FAMILY).perform();
			 action.sendKeys(Family).perform();
			 Thread.sleep(500);
			 eh.unhighlightLastB(driver, FAMILY);
			 
           //father name
		     eh.highlightElement(driver, FATHER);
		     action.click(FATHER).perform();
			 action.sendKeys(Father).perform();
		     Thread.sleep(2000);
			 eh.unhighlightLastB(driver, FATHER);
			 
			 //meliat
		     eh.highlightElement(driver, meliat);
		     action.click(meliat).perform();
		     action.click(clearmeliat).perform();
		     Thread.sleep(1000);
			 action.sendKeys(Meliat).perform();
		     Thread.sleep(2000);
			 eh.unhighlightLastB(driver, meliat);

			 

			  //Avatar
			  WebElement upload_file = driver.findElement(By.xpath("//*[@id=\"file\"]"));
			  upload_file.sendKeys(Avatar);
			  //upload_file.sendKeys("C:/Users/s.mollahasani/Desktop/CIS/mr2.png");
			  
            //sex
			  eh.highlightElement(driver, sex);
			  Thread.sleep(500);
			  action.click(sex).perform();
			  action.sendKeys(Sex).perform();
			  eh.unhighlightLast(driver, sex);
		      Thread.sleep(500);

			  
			//TAHOL
		      eh.highlightElement(driver, tahol);
		      Thread.sleep(500);
		      action.click(tahol).perform();
		      action.sendKeys(TAHOL).perform();
  		      eh.unhighlightLast(driver, tahol);


			  //tarikh tavalod
			  eh.highlightElement(driver, birthdate);
			  Thread.sleep(500);
			  birthdate.sendKeys(BIRTHDATE);
		      eh.unhighlightLast(driver, birthdate);
		      
		      //mahal tavalod
		      eh.highlightElement(driver, mahaltavalod);
		      Thread.sleep(500);
		      action.click(mahaltavalod).perform();
		      action.sendKeys(Mahaltavalod).perform();
		 	  eh.unhighlightLast(driver, mahaltavalod);
		 	  
		 	      		  
  		      //city
  		      eh.highlightElement(driver, city);
  		      Thread.sleep(500);
  		      action.click(city).perform();
  		      action.sendKeys(City).perform();
  	          eh.unhighlightLast(driver, city);
  	      
  	          //Adress
  	          eh.highlightElement(driver, adress);
  	          Thread.sleep(500);
  	          adress.sendKeys(Adress);
  	          eh.unhighlightLastB(driver, adress);
  	      
  	          //Phone
  	          int x= (int)(Math.random()*100000000);
  	          WebElement PHONE= driver.findElement(By.name("telNo"));
  	          eh.highlightElement(driver, PHONE);
  	          Thread.sleep(500);
  	          PHONE.sendKeys("0935"+x);
  	          eh.unhighlightLastB(driver, PHONE);
  	      
  	          //Email
  	         //WebElement EMAIL= driver.findElement(By.name("EAddress"));
  	         eh.highlightElement(driver, eMAIL);
  	         Thread.sleep(500);
  	         eMAIL.sendKeys(Email);
  	         eh.unhighlightLastB(driver, eMAIL);
  	      
  	      //Bime
  	      eh.highlightElement(driver, bime);
  	      Thread.sleep(500);
  	      action.click(bime).perform();
  	      action.sendKeys(BIME).perform();
  	      eh.unhighlightLast(driver, bime);
  	      
  	      //Sandogh
  	      Thread.sleep(1000);
  	      eh.highlightElement(driver, sandogh);
  	      Thread.sleep(500);
  	      action.click(sandogh).perform();
  	      action.sendKeys(SANDOGH).perform();
  	      eh.unhighlightLast(driver, sandogh);

  	      //BimeCode
  	      int y= (int)(Math.random()*10000000);
  	      WebElement BIMECODE=driver.findElement(By.name("InsuranceNo"));
  	      eh.highlightElement(driver, BIMECODE);
  	      Thread.sleep(500);
  	      BIMECODE.sendKeys("1"+y);
  	      eh.unhighlightLastB(driver, BIMECODE);

  	      //BimeDate
  	      eh.highlightElement(driver, bimedate);
  	      Thread.sleep(500);
  	      bimedate.sendKeys(BIMEDATE);
  	      eh.unhighlightLast(driver, bimedate);

  	      //Nesbat
  	     eh.highlightElement(driver, nesbat);
  	     Thread.sleep(500);
  	     action.click(nesbat).perform();
  	     action.sendKeys(NESBAT).perform();
  	     action.sendKeys(Keys.DOWN).perform();
  	     action.sendKeys(Keys.ENTER).perform();
  	      eh.unhighlightLast(driver, nesbat);
  	      Thread.sleep(500);
  	      
  	      //OldId
  	      eh.highlightElement(driver, oldId);
  	      Thread.sleep(500);
  	      eMAIL.sendKeys(OLDID);
  	      eh.unhighlightLastB(driver,oldId);


  	      //Sabt
  	      eh.highlightElement(driver, Sabt);
  	      Thread.sleep(500);
  	      eh.unhighlightLast(driver, Sabt);
  		  Thread.sleep(1000);
  		  Sabt.click();
  	      Thread.sleep(2000);
  	      
          //SuccecfulAddMessage
  	      WebElement POPUP= driver.findElement(By.xpath("/html/body/div[2]/div/div/snack-bar-container"));
  	      eh.highlightElement(driver, POPUP);
  	      Thread.sleep(1000);
  	      String c= POPUP.getText();
  	      System.out.print("resulte:"+ c);
  	      Assert.assertEquals(c, "Ù¾Ø±ÙˆÙ†Ø¯Ù‡ Ø¨ÛŒÙ…Ø§Ø± Ø¨Ø§ Ù…ÙˆÙ�Ù‚ÛŒØª Ø«Ø¨Øª Ø´Ø¯.\n"
  	      		+ "x");
        	    } 
        public void firstClinicService (WebDriver driver) throws InterruptedException {
       	
			 Actions action = new Actions(driver);
			 
			 action.click(Clinic).perform();
			 Thread.sleep(500);
			 action
			 .sendKeys(Keys.DOWN)
			 .sendKeys(Keys.ENTER)
			 .perform();
			 Thread.sleep(500);
			 action.click(Trapist).perform();
			 action
			 .sendKeys(Keys.DOWN)
			 .sendKeys(Keys.ENTER)
			 .perform();
			 Thread.sleep(2000);
			 WebElement position1 = driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[2]/app-admit-service-search/div/div/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[1]"));
			 positionServic=position1.getText(); 
			
	
        }
        
}

