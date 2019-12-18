package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class ReactSignIn extends BasePage{

    //*********Constructor*********
    public ReactSignIn(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Web Elements*********
    String usenameid = "signInEmail";
    String pwdid = "signInPassword";
    String Loginxpath = "//*[@id=\"signUpTalentButton\"]/span[1]";
    String fblogin = "//*[@id=\"site-content\"]/div/div/div/div[1]/form/p[1]/button[1]";
    String linkedlogin = "//*[@id=\"site-content\"]/div/div/div/div[1]/form/p[1]/button[2]/span[1]";
    String emailempty = "//*[@id=\"site-content\"]/div/div/div/div[1]/form/div[2]/span";
    String pwdempty = "//*[@id=\"site-content\"]/div/div/div/div[1]/form/div[3]/span";
    String accountnotexisterror = "//*[@id=\"site-content\"]/div/div/div/div[1]/form/div[2]/span";
    String incorrecterror = "//*[@id=\"site-content\"]/div/div/div/div[1]/form/div[2]/span";
    String pwd3charError = "//*[@id=\"site-content\"]/div/div/div/div[1]/form/div[3]/span";
    String title = "Advanced Search Gigs - Talent - SkillGigs";
    String title1 = "Log in to Facebook | Facebook";
    String title2 = "LinkedIn Login, LinkedIn Sign in | LinkedIn";
    String logout = "/html/body/div[2]/div/div[1]/header/div/div[1]/div[3]/div/div/div/div/a[4]";
    String forgotpwd = "//*[@id=\"site-content\"]/div/div/div/div[1]/form/p[2]/a[1]/span";
    String resendemail = "//*[@id=\"site-content\"]/div/div/div/div[1]/form/p[2]/a[2]/span";
    String signuplink = "//*[@id=\"site-content\"]/div/div/div/div[1]/form/p[2]/a[3]";
    String forgotpassword = "//*[@id=\"site-content\"]/div/div/div/div/h1";
    String resendemailver = "//*[@id=\"site-content\"]/div/div/div/div/h1";
    String signup = "//*[@id=\"site-content\"]/div/div/div/div[1]/div/div/div/div/form/h1";
    String invalidemail = "//*[@id=\"site-content\"]/div/div/div/div[1]/form/div[2]/span";



    //*********Page Methods*********
    
    public void loginToSkillGigs (String username, String password){
    	
    	
        //Enter Username
        writeText(By.id(usenameid),username);
        //Enter Password
        writeText(By.id(pwdid), password);
        //Click Login Button
        click(By.xpath(Loginxpath));
    }
    
    
    public void loginToRefresh (){
        
        driver.findElement(By.id(usenameid)).clear();
        driver.findElement(By.id(pwdid)).clear();
    }
    
    
    public void logout(){
        
       click(By.xpath(logout));

	   
    }
   
   
    public void fblogin () throws InterruptedException {
     
    	click(By.xpath(fblogin));
      
    }
    
    public void linkedInlogin () throws InterruptedException {
        
    	click(By.xpath(linkedlogin));
      
    }
    
    public void fogotpwdclick () throws InterruptedException {
        
    	click(By.xpath(forgotpwd));
      
    }
    
    public void resendemailclick () throws InterruptedException {
        
    	click(By.xpath(resendemail));
      
    }
    
     
    public void signuplinkclick () throws InterruptedException {
        
    	click(By.xpath(signuplink));
      
    }
    

    //*********Verifications*********

    public void verifyInvalidUsenameInvalidpwd (String expectedText) {
	    Assert.assertEquals(readText(By.xpath(invalidemail)), expectedText);
	    
}

	 
 public void verifyInvalidUsenameValidpwd (String expectedText) {
	    Assert.assertEquals(readText(By.xpath(invalidemail)), expectedText);
	    
}

 public void verifyValidUsenameInvalidpwd (String expectedText) {
	    Assert.assertEquals(readText(By.xpath(incorrecterror)), expectedText);
	    
}
 
 public void verifyIncorrectUsenameIncorrectpwd (String expectedText) {
	    Assert.assertEquals(readText(By.xpath(accountnotexisterror)), expectedText);
	    
}
 
 public void verifyIncorrectUsenameCorrectpwd (String expectedText) {
	    Assert.assertEquals(readText(By.xpath(accountnotexisterror)), expectedText);
	    
}
 
 public void verifyCorrectUsenameIncorrectpwd (String expectedText) {
	    Assert.assertEquals(readText(By.xpath(incorrecterror)), expectedText);
	    
}
 
 public void verifyEmptyUsername(String expectedText) {
	    Assert.assertEquals(readText(By.xpath(emailempty)), expectedText);
	    
}
 
 public void verifyEmptyPwd(String expectedText) {
	    Assert.assertEquals(readText(By.xpath(pwdempty)), expectedText);
	    
}
 
 
 public void verify3characterPwd(String expectedText) {
	    Assert.assertEquals(readText(By.xpath(pwd3charError)), expectedText);
	    
}
    public void verifyValidusernameValidpwd(String expectedText) {
    	AssertJUnit.assertEquals(title, "Advanced Search Gigs - Talent - SkillGigs");
    	
}
    	  public void verifyFbLogin(String expectedText) {
    	    	AssertJUnit.assertEquals(title1, "Log in to Facebook | Facebook");
    	    	
    	    	
   
    	  }   	
    	  
    	  public void verifyLinkedIn(String expectedText) {
  	    	AssertJUnit.assertEquals(title2, "LinkedIn Login, LinkedIn Sign in | LinkedIn");
    	  }
    	  
  	    	
  	      public void forgotPwd (String expectedText) {
  	   	    Assert.assertEquals(readText(By.xpath(forgotpassword)), expectedText);
  	   	    
  	    }
  	      public void resend (String expectedText) {
  	   	    Assert.assertEquals(readText(By.xpath(resendemailver)), expectedText);
  	   	    
  	    }
  	      
  	      public void signUp (String expectedText) {
  	   	    Assert.assertEquals(readText(By.xpath(signup)), expectedText);
  	   	    
  	    }
  	  }   	
  
    
    
    
   
        

