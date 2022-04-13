package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cispackage.element_Highlight;

public class PageObject_MainMenu {
	
	  element_Highlight eh= new element_Highlight();


	   @FindBy(className="menu-btn")
	   WebElement main_menu;
	   
	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-menu/nav/ul/li[1]/a/span")
	   WebElement Admit;
	   
	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-menu/nav/ul/li[4]/a/span")
	   WebElement add_patient;
	   
	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-menu/nav/ul/li[5]/a/span")
	   WebElement list_patient;
	   
	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-menu/nav/ul/li[2]/a/span")
	   WebElement Admit_list;
	   
	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-menu/nav/ul/li[8]/a/span")
	   WebElement system_config;
	   

	    public void admit ( WebDriver driver) throws InterruptedException {
	 	   
	    eh.highlightElement(driver,main_menu);
	    main_menu.click();
	    Thread.sleep(1000);
	    eh.highlightElement(driver,Admit);
	    Admit.click();
	    Thread.sleep(500);
	   }



	    public void add_patient_menu ( WebDriver driver) throws InterruptedException {
	   
	    eh.highlightElement(driver,main_menu);
	    main_menu.click();
	    Thread.sleep(1000);
	    eh.highlightElement(driver,add_patient);
	    add_patient.click();
	    Thread.sleep(500);
	   }
	   
	    public void list_patient_menu (WebDriver driver) throws Throwable   {
	    eh.highlightElement(driver,main_menu);
	    main_menu.click();
	    Thread.sleep(1000);
	    eh.highlightElement(driver,list_patient);
	    list_patient.click();
	    Thread.sleep(500);   
}	   
	    public void Admit_List_menu (WebDriver driver) throws Throwable   {
	    eh.highlightElement(driver,main_menu);
	    main_menu.click();
	    Thread.sleep(1000);
	    eh.highlightElement(driver,Admit_list);
	    Admit_list.click();
	    Thread.sleep(500);   
}	   
	   
	    public void system_variable_menu (WebDriver driver) throws Throwable   {
	    eh.highlightElement(driver,main_menu);
	    main_menu.click();
	    Thread.sleep(1000);
	    eh.highlightElement(driver,system_config);
	    system_config.click();
	    Thread.sleep(1000); 
	    WebElement system_variable =driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-menu/nav/ul/li[8]/ul/li[4]/a"));
	    eh.highlightElement(driver,system_variable);
	    system_variable.click();
	    Thread.sleep(2000);  
}	   
	    public void system_variable_add_trapist_clinic (WebDriver driver) throws Throwable   {
	    WebElement addtrapisttoclinic =driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-menu/nav/ul/li[8]/ul/li[4]/ul/li[1]/a/span"));
	    eh.highlightElement(driver,addtrapisttoclinic);
	    addtrapisttoclinic.click();
	    Thread.sleep(2000);  
	    }  
	    public void system_variable_add_clinic_trapist (WebDriver driver) throws Throwable   {
	    WebElement addclinictotrapist =driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-menu/nav/ul/li[8]/ul/li[4]/ul/li[2]/a/span"));
	    eh.highlightElement(driver,addclinictotrapist);
	    addclinictotrapist.click();
	    Thread.sleep(2000);  
	    }   
	    public void system_variable_add_clinic_Service (WebDriver driver) throws Throwable   {
	    WebElement addclinicService =driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-menu/nav/ul/li[8]/ul/li[4]/ul/li[3]/a/span"));
	    eh.highlightElement(driver,addclinicService);
	    addclinicService.click();
	    Thread.sleep(2000);  
	    }   
	    public void system_variable_add_terapist_Service (WebDriver driver) throws Throwable   {
	    WebElement addterapistService =driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-menu/nav/ul/li[8]/ul/li[4]/ul/li[4]/a/span"));
	    eh.highlightElement(driver,addterapistService);
	    addterapistService.click();
	    Thread.sleep(2000);  
	    }   
	    public void system_variable_add_terapist_Assistant (WebDriver driver) throws Throwable   {
	    WebElement addterapistAssistant =driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-menu/nav/ul/li[8]/ul/li[4]/ul/li[5]/a/span"));
	    eh.highlightElement(driver,addterapistAssistant);
	    addterapistAssistant.click();
	    Thread.sleep(2000);  
	    }   



}

   
   
   