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


public class PageObject_riali_K_tariff {

	  element_Highlight eh= new element_Highlight();
	  

	  @FindBy(xpath="(//mat-select[@role='combobox'])[1]")
	   WebElement TarrifeType;

	  
//	  @FindBy(xpath="//tr[4]/td[10]/div[2]")
//	   WebElement deletDakheli;
//
//	   @FindBy(xpath="//button[text()='افزودن']")
//	   WebElement AddButton;
//
//	   @FindBy(xpath="//mat-select[@name='active']")
//	   WebElement Activ_DeActiv;
//	   
//	   @FindBy(xpath="//button[@type='submit']")
//	   WebElement SearchButton;
//	   
//	   @FindBy(xpath="(//input[@name='title'])[2]")
//	   WebElement SearchTariff;
//	   
//	   @FindBy(xpath="//input[@type='checkbox']")
//	   WebElement Standardization;
//
//	   @FindBy(xpath="(//img[@alt='refresh'])[1]")
//	   WebElement  Refresh;
//
//	   @FindBy(xpath="(//img[@alt='refresh'])[2]")
//	   WebElement  RefreshSearch;
//	  
//	   @FindBy(xpath="(//mat-select[@role='combobox'])[3]")
//	   WebElement NumberPerPage;
//	   
//	   @FindBy(xpath="//button[@mattooltip='ذخیره']")
//	   WebElement Save;

	  

	   
	   

	   public void Add_k_Dakheli( WebDriver driver ,String tariff,String contract,String k_herfeyi_Dakheli,String k_fani_Dakheli,String k_bihooshi_Dakheli,String h_herfeyi_Dakheli,String h_fani_Dakheli,String k_herfeyi_Dakheli_al,String k_fani_Dakheli_al,String k_bihooshi_Dakheli_al,String h_herfeyi_Dakheli_al,String h_fani_Dakheli_al) throws InterruptedException {
		   Actions action = new Actions(driver);   
		   action
		   .click(TarrifeType).perform();
		   Thread.sleep(1000);
		   action
		  // .sendKeys(tariff)
		   .sendKeys(Keys.ENTER).perform();
		   Thread.sleep(1000);
		   
		   WebElement EditDakheli= driver.findElement(By.xpath("//tr[4]/td[10]/div[1]"));

		   action
		   .click(EditDakheli).perform();
		   Thread.sleep(1000);
		   
		   WebElement K_herfeyi_Dakheli= driver.findElement(By.xpath("//tr[4]/td[3]/descendant::input"));
		   WebElement K_fani_Dakheli= driver.findElement(By.xpath("//tr[4]/td[4]/descendant::input"));
		   WebElement K_bihooshi_Dakheli= driver.findElement(By.xpath("//tr[4]/td[5]/descendant::input"));
		   WebElement H_herfeyi_Dakheli= driver.findElement(By.xpath("//tr[4]/td[6]/descendant::input"));
		   WebElement H_fani_Dakheli= driver.findElement(By.xpath("//tr[4]/td[7]/descendant::input"));

		   action
		   .click(K_herfeyi_Dakheli)
		   .sendKeys(k_herfeyi_Dakheli)
		   .click(K_fani_Dakheli)
		   .sendKeys(k_fani_Dakheli)
		   .click(K_bihooshi_Dakheli)
		   .sendKeys(k_bihooshi_Dakheli)
		   .click(H_herfeyi_Dakheli)
		   .sendKeys(h_herfeyi_Dakheli)
		   .click(H_fani_Dakheli)
		   .sendKeys(h_fani_Dakheli)
		   .perform();
		   
		   WebElement SaveDakheli= driver.findElement(By.xpath("//tr[4]/td[10]/div[1]"));
		   action
		   .click(SaveDakheli).perform();
		   Thread.sleep(1000);
		   
		   // چک ثبت
		   driver.navigate().refresh();
			  driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS); 
			   Thread.sleep(2000);
			   action
			   .click(TarrifeType).perform();
			   Thread.sleep(1000);
			   action
			  // .sendKeys(tariff)
			   .sendKeys(Keys.ENTER).perform();
			   Thread.sleep(1000);
			   WebElement K_herfeyi_Dakheli_td= driver.findElement(By.xpath("//tr[4]/td[3]"));

			   String AddedK_herfeyi = K_herfeyi_Dakheli_td.getText();
			   Assert.assertEquals(AddedK_herfeyi, k_herfeyi_Dakheli);
			   eh.highlightElement(driver,K_herfeyi_Dakheli_td); 
			   
			   //k زیرگروه خدمت
			   WebElement expand1_dakheli= driver.findElement(By.xpath("//tr[4]/td[2]/descendant::i"));
			   action
			   .click(expand1_dakheli).perform();
			   
			   WebElement ContractName= driver.findElement(By.xpath("(//mat-select[@role='combobox'])[2]"));
			   action
			   .click(ContractName).perform();
			   Thread.sleep(1000);
			   action
			   .sendKeys(contract).perform();
			   Thread.sleep(1000);
			   action
			   .sendKeys(Keys.ENTER).perform();
			   
			   WebElement EditDakheli_Alergi= driver.findElement(By.xpath("//tr[6]/td[10]/div[1]"));

			   action
			   .click(EditDakheli_Alergi).perform();
			   Thread.sleep(1000);
			   
			   WebElement K_herfeyi_Dakheli_AL= driver.findElement(By.xpath("//tr[6]/td[3]/descendant::input"));
			   WebElement K_fani_Dakheli_AL= driver.findElement(By.xpath("//tr[6]/td[4]/descendant::input"));
			   WebElement K_bihooshi_Dakheli_AL= driver.findElement(By.xpath("//tr[6]/td[5]/descendant::input"));
			   WebElement H_herfeyi_Dakheli_AL= driver.findElement(By.xpath("//tr[6]/td[6]/descendant::input"));
			   WebElement H_fani_Dakheli_AL= driver.findElement(By.xpath("//tr[6]/td[7]/descendant::input"));

			   action
			   .click(K_herfeyi_Dakheli_AL)
			   .sendKeys(k_herfeyi_Dakheli_al)
			   .click(K_fani_Dakheli_AL)
			   .sendKeys(k_fani_Dakheli_al)
			   .click(K_bihooshi_Dakheli_AL)
			   .sendKeys(k_bihooshi_Dakheli_al)
			   .click(H_herfeyi_Dakheli_AL)
			   .sendKeys(h_herfeyi_Dakheli_al)
			   .click(H_fani_Dakheli_AL)
			   .sendKeys(h_fani_Dakheli_al)
			   .perform();

			   WebElement SaveDakheli_Alergi= driver.findElement(By.xpath("//tr[6]/td[10]/div[1]"));
			   action
			   .click(SaveDakheli_Alergi).perform();
			   Thread.sleep(1000);

			   // چک ثبت
			   driver.navigate().refresh();
				  driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS); 
				   Thread.sleep(2000);
				   action
				   .click(TarrifeType).perform();
				   Thread.sleep(1000);
				   action
				  // .sendKeys(tariff)
				   .sendKeys(Keys.ENTER).perform();
				   Thread.sleep(1000);
				   
				   WebElement expand1_dakheli1= driver.findElement(By.xpath("//tr[4]/td[2]/descendant::i"));
				   action
				   .click(expand1_dakheli1).perform();
				   
				   WebElement ContractName1= driver.findElement(By.xpath("(//mat-select[@role='combobox'])[2]"));
				   action
				   .click(ContractName1).perform();
				   Thread.sleep(1000);
				   action
				   .sendKeys(contract).perform();
				   Thread.sleep(1000);
				   action
				   .sendKeys(Keys.ENTER).perform();

				   WebElement K_herfeyi_Dakheli_td_al= driver.findElement(By.xpath("//tr[6]/td[3]"));

				   String AddedK_herfeyi_al = K_herfeyi_Dakheli_td_al.getText();
				   Assert.assertEquals(AddedK_herfeyi_al, k_herfeyi_Dakheli_al);
				   eh.highlightElement(driver,K_herfeyi_Dakheli_td_al); 






	}
	   
	   public void Edit_Tariff( WebDriver driver ,String Newtariff ,String tariff2) throws InterruptedException {
		   Actions action = new Actions(driver);
//		   WebElement FirstTrTariff=driver.findElement(By.xpath("//tbody/tr/td[2]"));
//		   WebElement FirstPenTariff=driver.findElement(By.xpath("//mat-icon[text()='edit']"));
//		   WebElement EditButton1 =driver.findElement(By.xpath("//button[text()='ویرایش']"));
//		   action
//		   .click(SearchTariff)
//		   .sendKeys(tariff2)
//		   .click(SearchButton)
//		   .click(FirstPenTariff)
//		   .click(TarrifeName)
//		   .perform();
//		   TarrifeName.clear();
//		   Thread.sleep(1000);
//		   action
//		   .click(TarrifeName)
//		   .sendKeys(Newtariff)
//		   .click(EditButton1)
//		   .perform();
//		   Thread.sleep(1000);
//		   String EditedTarrif= FirstTrTariff.getText();
//		   Assert.assertEquals(EditedTarrif, Newtariff);

	}

}
