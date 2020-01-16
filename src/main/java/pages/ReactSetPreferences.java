package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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


    //*********Page Methods*********
    
    public void clickRecruiterLink (){
    	
        click(By.xpath(loginPopUpXP));	
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
} 	
  
    
    
    
   
        

