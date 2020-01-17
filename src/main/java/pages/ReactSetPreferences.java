package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class ReactSetPreferences extends BasePage{

    //*********Constructor*********
    public ReactSetPreferences(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Web Elements*********
    String setPrefTitleXP = "//*[@id=\"guest-pereferenceForm\"]/div[1]/div/h2";
    String loginPopUpXP = "//*[@id=\"main-block\"]/div[1]/div/div/div/header/div/div/a";
    String loginTitleXP = "//*[@id=\"login-form\"]/h1";
    String gigTypeTitleXP = "//*[@id=\"guest-pereferenceForm\"]/div[2]/div[1]/label";
    String stlocationTitleXP = "//*[@id=\"autoSuggestLocationContainer\"]/label";
    String disciplineTitleXP = "//*[@id=\"guest-pereferenceForm\"]/div[2]/div[3]/label";
    String permanentgigXP = "//*[@id=\"guest-pereferenceForm\"]/div[2]/div[1]/div/label[2]/span";
    String verifypermanentGigXP = "//*[@id=\"autoSuggestLocationContainer\"]/label";
    String cancelAHScreenXP = "//*[@id=\"main-block\"]/div[4]/div[2]/button[1]/span[1]";
    String addAHScreenXP = "//*[@id=\"main-block\"]/div[4]/div[2]/button[2]/span[1]";
    String deselectXP = "//*[@id=\"autoSuggestLocationContainer\"]/label";
    String deselectPerXP = "//*[@id=\"guest-pereferenceForm\"]/div[2]/div[1]/div/label[2]/span";
    String deselectConXP = "//*[@id=\"guest-pereferenceForm\"]/div[2]/div[1]/div/label[1]/span";
    String locationID = "location";
    String locationEditID = "//*[@id=\"react-autowhatever-1\"]/ul";
    String verifylocationXP = "//*[@id=\"locationConatainer\"]/div";
    String crossXP = "//*[@id=\"main-block\"]/div[1]/div[2]/div[1]/button/span[1]";
    String removeLocationXP = "//*[@id=\"autoSuggestLocationContainer\"]/button[1]/span[1]";
    String autodetectXP = "//*[@id=\"autoSuggestLocationContainer\"]/button[2]";
    String verifydetectXP = "//*[@id=\"location\"]";
    String selectdiscipline = "//*[@id=\"discipline-select-outer\"]/div/div[1]/div";
    String verifydiscipline = "//*[@id=\"discipline-select-outer\"]/div/div[1]/div";
    //*********Page Methods*********
    
    public void clickRecruiterLink (){
    	
        click(By.xpath(loginPopUpXP));	
    }
    
    public void clickPermanentGig () throws InterruptedException{
    	
        click(By.xpath(permanentgigXP));	
    }
 
    public void clickCancel () throws InterruptedException{
    	
    	Thread.sleep(5000);
        click(By.xpath(cancelAHScreenXP));	
    }
       
    public void clickAdd () throws InterruptedException{
    	
    	Thread.sleep(5000);
        click(By.xpath(addAHScreenXP));    
    }
       
    public void deselectGig () throws InterruptedException{
    	
        click(By.xpath(deselectPerXP));	
        click(By.xpath(deselectConXP));	

    }
    
   public void enterLocation (String location) throws InterruptedException{
	   
    	
        click(By.xpath(removeLocationXP));
        writeText(By.id(locationID),location);	

    }
    
   public void detectLocation () throws InterruptedException{
	   
   	
        click(By.xpath(autodetectXP));

   }
   
   public void selectDiscipline () throws InterruptedException{
	    
	  driver.findElement(By.xpath("//*[@id=\"discipline-select-outer\"]/div/div[1]/div")).click();
	  WebElement disc = driver.findElement(By.xpath(selectdiscipline));  
	  disc.click();
	   	

  }
  
   
   public void clickCross (){
   	
        click(By.xpath(crossXP));
   }
    //*********Verifications*********

    public void verifyPageTitle (String expectedText) {
	    Assert.assertEquals(readText(By.xpath(setPrefTitleXP)), expectedText);
	    
     }
    
    public void verifyLoginPopUp (String expectedText) {
	    Assert.assertEquals(readText(By.xpath(loginTitleXP)), expectedText);
	    
     }
    
    public void verifyTitles (String expectedText1,String expectedText2, String expectedText3) {
	    Assert.assertEquals(readText(By.xpath(gigTypeTitleXP)), expectedText1);
	    Assert.assertEquals(readText(By.xpath(stlocationTitleXP)), expectedText2);
	    Assert.assertEquals(readText(By.xpath(disciplineTitleXP)), expectedText3);
    } 
    
    public void verifyPermanentGig (String expectedText) {
		    Assert.assertEquals(readText(By.xpath(verifypermanentGigXP)), expectedText);
		    
	     }
	    
    public void verifyDeselectGig (String expectedText) {
	    Assert.assertEquals(readText(By.xpath(deselectXP)), expectedText);
	    
     }
    
    public void verifylocation (String expectedText) {
	    Assert.assertEquals(readText(By.xpath(verifylocationXP)), expectedText);
	    
     }
    public void verifylocationDetect (String expectedText) {
	    Assert.assertEquals(readText(By.xpath(verifylocationXP)), expectedText);
	    
     }
    
    public void verifyDiscipline (String expectedText) {
	    Assert.assertEquals(readText(By.xpath(verifydiscipline)), expectedText);
	    
     }
    
     }
 	
  
    
    
    
   
        

