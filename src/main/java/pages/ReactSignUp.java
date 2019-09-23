package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class ReactSignUp extends BasePage{

    //*********Constructor*********
    public ReactSignUp(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********React Talent Web Elements*********
   
      String movetalent = "//*[@id=\"site-content\"]/div/div/div/div[1]/header/div/div/div/div/button[1]/span[1]";
      String changevariant = "/html/body/div[13]/div/div[2]/ul/li[1]/label";
      String fnId = "signUpTalentName";
      String emailId = "signUpTalentEmail";
      String pwdId = "signUpTalentPassword";
      String signbtnId = "signUpTalentButton";
      String forgotpwd = "//*[@id=\"site-content\"]/div/div/div/div[1]/div/div/form/p[2]/a[1]/span";
      String resendemail = "//*[@id=\"site-content\"]/div/div/div/div[1]/div/div/form/p[2]/a[2]/span";
      String signup = "//*[@id=\"site-content\"]/div/div/div/div[1]/div/div/form/p[2]/a[3]/span";
      String fnemptyerror = "//*[@id=\"site-content\"]/div/div/div/div[1]/div/div/form/div[1]/span";
      String emailemptyerror = "//*[@id=\"site-content\"]/div/div/div/div[1]/div/div/form/div[2]/span";
      String pwdemptyerror = "//*[@id=\"site-content\"]/div/div/div/div[1]/div/div/form/div[3]/span";
      String invalidemail = "//*[@id=\"site-content\"]/div/div/div/div[1]/div/div/form/div[2]/span";
      String accountexist = "//*[@id=\"site-content\"]/div/div/div/div[1]/div/div/form/div[2]/span";
      String title = "Verify Your Email";
      String titleFP = "//*[@id=\"site-content\"]/div/div/div/div/h1";
      String titleREV = "//*[@id=\"site-content\"]/div/div/div/div/h1";
      String titleSU = "//*[@id=\"site-content\"]/div/div/div/div[1]/div/div/form/h1";
      String clickvariant = "/html/body/div[13]/div";
      String twocharacterpwd = "//*[@id=\"site-content\"]/div/div/div/div[1]/div/div/form/div[3]/span";
      

    //******React Talent Page Methods*******
      
    public void SignupData (String fullname, String email, String password ) throws InterruptedException{
      
        writeText(By.id(fnId),fullname);
      
        writeText(By.id(emailId), email);
  
        writeText(By.id(pwdId), password);
       
        Thread.sleep(1000);
        click(By.id(signbtnId));
    }
    
    public void SignupRefresh() throws InterruptedException{

      driver.findElement(By.id(fnId)).clear();
      driver.findElement(By.id(emailId)).clear();  
      driver.findElement(By.id(pwdId)).clear();  

    }
    
    public void clickForgotPwd() {
        
        click(By.xpath(forgotpwd));

 	   
     }
     
    public void clickResendEmailVerification() {
         
         click(By.xpath(resendemail));

  	   
      }
     
    public void clickSignUp() {
         
         click(By.xpath(signup));
   
      }
    
    public void selectVariant() throws InterruptedException {
    	
    	Thread.sleep(5000);
        click(By.xpath(clickvariant));
    	Thread.sleep(3000);
        click(By.xpath(changevariant));
        
     }
    
    public void moveToTalent() {
        
        click(By.xpath(movetalent));
  
     }
    
    
    
    //****React Talent Verification Method******
    
    
    public void verifyInvalidEmail (String expectedText) {
        Assert.assertEquals(readText(By.xpath(invalidemail)), expectedText);
    }
    
    public void verifyEmptyFullname (String expectedText) {
        Assert.assertEquals(readText(By.xpath(fnemptyerror)), expectedText);
    }
    
    public void verifyEmptyEmail (String expectedText) {
        Assert.assertEquals(readText(By.xpath(emailemptyerror)), expectedText);
    }
    
    public void verifyEmptyPwd (String expectedText) {
        Assert.assertEquals(readText(By.xpath(pwdemptyerror)), expectedText);
    }
    
  
    public void verifyEmailexist(String expectedText) {
        Assert.assertEquals(readText(By.xpath(accountexist)), expectedText);
    }
    
    public void verify2characterPwd(String expectedText) {
        Assert.assertEquals(readText(By.xpath(twocharacterpwd)), expectedText);
    }
    
    public void verifyForgotPwd(String expectedText) {
        Assert.assertEquals(readText(By.xpath(titleFP)), expectedText);
    }
    
    public void verifySignUp(String expectedText) {
        Assert.assertEquals(readText(By.xpath(titleSU)), expectedText);
    }
    
    
    public void verifyResendEmail(String expectedText) {
        Assert.assertEquals(readText(By.xpath(titleREV)), expectedText);
    }
    
    public void verifyValidSignUp(String expectedText) {
    	AssertJUnit.assertEquals(title, "Verify Your Email");
    }
    

}    
        

