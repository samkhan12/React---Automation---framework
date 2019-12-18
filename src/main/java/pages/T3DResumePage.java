package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class T3DResumePage extends BasePage{

    //*********Constructor*********
    public T3DResumePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Web Elements*********
    String usenameId = "email";
    String passwordId = "pwd";
    String loginButtonId = "btnSubmit";
    String logoutButtonxpath = "/html/body/div[1]/div/div[1]/div[3]/div/div/div/div/a[4]";
    String logoutDrpdnid = "accountDesktop";
    String errorMessageUsernameXpath = "//*[@id=\"signinForm\"]/div/div/div/div/div[1]/span";
    String errorMessagePasswordXpath = "//*[@id=\"signinForm\"]/div/div/div/div/div[1]/span";
    String errorMessageEmptyUsernameXpath = "//*[@id=\"signinForm\"]/div/div/div/div/div[1]/span";
    String errorMessageEmptyPasswordXpath = "//*[@id=\"signinForm\"]/div/div/div/div/div[1]/span";
    String title = "SkillGigs - Gig Search";
    String startbtxpath = "/html/body/div[2]/div/div[3]/div/div/p/a/strong";
    String Editbtxpath = "/html/body/div[2]/div/div[3]/div[1]/div[2]/p/a";
    String preferrednameId = "preferredName";
    String TagLineId = "tagLine";
    String SavebtnId = "btnSubmit";
    String title1 = "SkillGigs - Talent - Resume";
    String EditPgTitle = "SkillGigs - Talent - Resume - About Me";
    String Alphalength = "/html/body/div[2]/div/div[3]/form/div[2]/div[2]/small[2]/span/span";
    String Dresumeclick = "/html/body/div[1]/div/div[1]/div[3]/div/div/div/div/a[2]";
    String ValidationSavebtn = "//*[@id=\"aboutForm\"]/div[2]/div[2]/small[1]/span/span";
    String ValidationSavebtnError = "/html/body/div[2]/div/div[3]/form/div[1]/span";
    String ErrorOnFieldEmpty = "//*[@id=\"aboutForm\"]/div[2]/div[2]/small[1]/span/span";
    String MainLogout = "drop1";
    String ErroronNumeric = "/html/body/div[2]/div/div[3]/form/div[2]/div[2]/small[1]/span/span";
    //*********Page Methods*********
    
    public void loginToSkillGigs (String username, String password){
        //Enter Username
        writeText(By.name(usenameId),username);
        //Enter Password
        writeText(By.name(passwordId), password);
        //Click Login Button
        click(By.id(loginButtonId));
    }
    
    public void logoutToSkillGigs () throws InterruptedException {
     
        //Click Logout Button
    	Thread.sleep(5000);
        click(By.id(logoutDrpdnid));
        click(By.xpath(logoutButtonxpath));
    }
    public void NavigateToResume () throws InterruptedException {
        
        //Click Logout Button
    	Thread.sleep(5000);
        click(By.id(logoutDrpdnid));
        click(By.xpath(Dresumeclick));

    }

    public void ResumeStart () throws InterruptedException {
        
       
    	Thread.sleep(1000);
        click(By.xpath(startbtxpath));
    }
    
    public void Editbtnclick () throws InterruptedException {
        
        
    	Thread.sleep(1000);
        click(By.xpath(Editbtxpath));
    }
    
 public void Preferredname (String preferredname) throws InterruptedException {

	 writeText(By.id(preferrednameId),preferredname);
	 
    }
 

public void Tagline (String Tagline) throws InterruptedException {
	 writeText(By.id(TagLineId),Tagline);
	 
    }
 
 public void SaveBtnClick () throws InterruptedException {
     
     click(By.id(SavebtnId));
}
 
 public void MainLogt () throws InterruptedException {
     Thread.sleep(5000);
     click(By.id(MainLogout));
}

    //Verify Username and Password Condition
    public void verifyLoginUserNameAndPassword (String expectedText) {
    	AssertJUnit.assertEquals(title, "SkillGigs - Gig Search");
    }
    //Verify Username Condition
    public void verifyLoginUserName (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorMessageUsernameXpath)), expectedText);
    }

    //Verify Password Condition
    public void verifyLoginPassword (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorMessagePasswordXpath)), expectedText);
    }
    //Verify Empty Username Condition
    public void verifyEmptyUsername (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorMessageEmptyUsernameXpath)), expectedText);
    }   
   //Verify Empty Password Condition
    public void verifyEmptyPassword (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorMessageEmptyPasswordXpath)), expectedText);
        
    }
  //Verify Empty Password Condition
    public void verifyEditResumePage (String expectedText) {
    	AssertJUnit.assertEquals(title1, "SkillGigs - Talent - Resume");
		
	
		
    }
    public void verify3DEditResumePage (String expectedText) {
    	AssertJUnit.assertEquals(EditPgTitle, "SkillGigs - Talent - Resume - About Me");
    	
    }
    
    public void verifyPreferredAlpha (String expectedText) {
        Assert.assertEquals(readText(By.id(preferrednameId)), expectedText);
    }
    
    public void verifyPreferredNum (String expectedText) {
        Assert.assertEquals(readText(By.id(preferrednameId)), expectedText);
    }
    
    public void verifyAlphaLength (String expectedText) {
        Assert.assertEquals(readText(By.xpath(Alphalength)), expectedText);
    }  
    


public void verifySavebtnValidation (String expectedText) {
        Assert.assertEquals(readText(By.xpath(ValidationSavebtn)), expectedText);
}  

public void VerifyValidationSavebtnError (String expectedText) {
        Assert.assertEquals(readText(By.xpath(ValidationSavebtnError)), expectedText);
        
}
public void VerifyErrorOnFieldEmpty (String expectedText) {
    Assert.assertEquals(readText(By.xpath(ErrorOnFieldEmpty)), expectedText);
    
    
 
}
public void VerifyErroronNumeric (String expectedText) {
    Assert.assertEquals(readText(By.xpath(ErroronNumeric)), expectedText);  
}
}    
        

