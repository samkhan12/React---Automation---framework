package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ReactSkillDensity extends BasePage{

    //*********Constructor*********
    public ReactSkillDensity(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Web Elements*********
    String usenamexpath = "//input[@data-auto='signInEmail']";
    String pwdxpath = "//input[@data-auto='signInPassword']";
    String Loginxpath = "//input[@data-auto='signInButton']";


  //React Skill Density 

    String addbtnID = "lookingfor";
    String skilltextxpath = "//*[@id=\"site\"]/div[3]/div/div[2]/form/div/div[1]/div/div[1]/input";
    String percentxpath = "//*[@id=\"site\"]/div[3]/div/div[2]/form/div/div[2]/div/input";
    String okbtnxpath = "//*[@id=\"site\"]/div[3]/div/div[3]/div/button[2]";
    String cancelbtnxpath = "//*[@id=\"site\"]/div[3]/div/div[3]/div/button[1]";
    String closeiconxpath = "//*[@id=\"site\"]/div[3]/div/i";
    String addskilltitle = "//*[@id=\"site\"]/div[3]/div/div[1]";
    String fcancelbtnxpath = "//*[@id=\"site-content\"]/div/div/div/div[1]/div[2]/table[2]/tfoot/tr/th[2]/div/a";
    String fsavebtnxpath = "//*[@id=\"site-content\"]/div/div/div/div[1]/div[2]/table[2]/tfoot/tr/th[2]/div/button";
    String deletexpath = "//*[@id=\"site-content\"]/div/div/div/div[1]/div[2]/table[1]/tbody/tr[1]/td[3]/a/i";
    String emptyxpath = "//*[@id=\"newSkillError\"]/div/ul/li";
    String duperrorxpath = "//*[@id=\"newSkillError\"]/div/ul/li";
    String skillselectxpath = "//*[@id=\"site\"]/div[3]/div/div[2]/form/div/div[1]/div/div[2]/div[1]/div/div";
    String overpercentagexpath = "//*[@id=\"newSkillError\"]/div/ul/li";
    String canceltitlexpath = "//*[@id=\"site-content\"]/div/div/div/div[1]/div[1]/div/div/h2";
    String popuptitle = "//*[@id=\"site\"]/div[3]/div/div[1]";
    String addDisplay = "//*[@id=\"site-content\"]/div/div/div/div[1]/div[2]/table[1]/tbody/tr[1]/td[1]";
    String deletezero = "//*[@id=\"site-content\"]/div/div/div/div[1]/div[2]/table[1]/tbody/tr/td[2]/b";
    String skillmultiple = "//*[@id=\"site\"]/div[3]/div/div[2]/form/div/div[1]/div/div[2]/div[1]/div/div";
    String saveskills = "//*[@id=\"site-content\"]/div[2]/div/div[1]/div[3]/div/div/h2";
    
    
  //******React Skill Density Page Methods*******
    
    
    public void clickAddButton () throws InterruptedException{

        click(By.id(addbtnID));
    }
    
    
    public void addSkills (String add) throws InterruptedException{
      
        Thread.sleep(2000);
   	    writeText(By.xpath(skilltextxpath),add);
   	    
   	    Thread.sleep(1000);
        click(By.xpath(skillselectxpath));

        
    }
    
    public void multipleSkills (String add) throws InterruptedException{
        
        Thread.sleep(2000);
   	    writeText(By.xpath(skilltextxpath),add);
   	    
   	    Thread.sleep(1000);
        click(By.xpath(skillmultiple));

        
    }
    public void addPercentage (String percent) throws InterruptedException{
        
    	driver.findElement(By.xpath(percentxpath)).clear();
	    Thread.sleep(2000);
	    writeText(By.xpath(percentxpath),percent);
        
   }
    
    public void clickOkbutton () throws InterruptedException{
        
	    Thread.sleep(2000);
	    click(By.xpath(okbtnxpath));
        
   }
    
   public void clickCancelButton () throws InterruptedException{
        
	    Thread.sleep(2000);
	    click(By.xpath(cancelbtnxpath));
        
   }
    
   public void clickOnClosebutton () throws InterruptedException{
       
	    Thread.sleep(2000);
	    click(By.xpath(closeiconxpath));
       
   }
   
   
   public void deleteSkills () throws InterruptedException{
      
	   
	  List<WebElement> pagination =driver.findElements(By.xpath("//i[@class='trash alternate icon']")); 
	// checkif pagination link exists 

	int  flag=0;
	
			 int pbreak=pagination.size();
			  while (pbreak>0){

			      Thread.sleep(5000);
			      List<WebElement> pagination1 =driver.findElements(By.xpath("//i[@class='trash alternate icon']")); 
			      pagination1.get(0).click();
			      flag=flag+1;
			      pbreak=pbreak-1;
			      
			      
			      
                 System.out.println(pbreak);
			  }
	  
   }
   public void clickOnSave () throws InterruptedException{
	      
	    Thread.sleep(2000);
	    click(By.xpath(fsavebtnxpath));
     
  }
    
   public void clickOnCancel () throws InterruptedException{
	      
	    Thread.sleep(2000);
	    click(By.xpath(fcancelbtnxpath));
    
  }
    
    //****React Forgot Password Verification Method******

   public void verifyEmptyField (String expectedText) {
       Assert.assertEquals(readText(By.xpath(emptyxpath)), expectedText);
   }
   
   public void verifyDupError (String expectedText) {
       Assert.assertEquals(readText(By.xpath(duperrorxpath)), expectedText);
   }
   
   public void verifypercentageError (String expectedText) {
       Assert.assertEquals(readText(By.xpath(overpercentagexpath)), expectedText);
   }
   
   public void verifyCanceltitle (String expectedText) {
       Assert.assertEquals(readText(By.xpath(canceltitlexpath)), expectedText);
   }
   
   public void verifyPopuptitle (String expectedText) {
       Assert.assertEquals(readText(By.xpath(popuptitle)), expectedText);
   }
   
   public void verifyAddDisplay (String expectedText) {
       Assert.assertEquals(readText(By.xpath(addDisplay)), expectedText);
   }
   
   public void verifyDeleteSkills (String expectedText) {
       Assert.assertEquals(readText(By.xpath(deletezero)), expectedText);
   }
   
   
   public void verifySaveSkills (String expectedText) {
       Assert.assertEquals(readText(By.xpath(saveskills)), expectedText);
   }
   
 }
    

    
    
   

    
    
