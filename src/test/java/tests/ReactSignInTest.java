package tests;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ReactSignIn;
import utils.ExtentReports.ExtentTestManager;


public class ReactSignInTest extends BaseTest {
	
	

    // Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class.
	
	@Test (priority = 0, description="Verify the error message displayed when user enter invalid  username and invalid password")
	public void TC_Negative_Verify_InvalidUserName_InvalidPassword () throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify the error message displayed when user enter invalid  username and invalid password");
        
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
 
        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
       
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[7]/div")).click();
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/ul/li[2]/label")).click();
        
        //Login to skillgigs
        SignInPage.loginToSkillGigs("tc@@domain.web", "qwerty");
     
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        SignInPage.verifyInvalidUsenameInvalidpwd("You must enter valid email");
        
	 }
	
	
		@Test (priority = 1, description="Verify the error message displayed when user enter invalid  username and valid password")
	    public void TC_Negative_Verify_InvalidUserName_validPassword () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the error message displayed when user enter invalid  username and valid password");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************
	   
	       // homePage.goToSkillGigs();
	        Thread.sleep(2000);

	        SignInPage.loginToRefresh();
	        SignInPage.loginToSkillGigs("email@@domain.web", "test");
	     
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);

	        SignInPage.verifyInvalidUsenameValidpwd("You must enter valid email");
	    }
		
		
		@Test (priority = 2, description="Verify the error message displayed when user enter valid  username and invalid password")
	    public void TC_Negative_Verify_validUserName_InvalidPassword () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the error message displayed when user enter valid  username and invalid password");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************
	        Thread.sleep(2000);


	        
	        //Login to SkillGigs
	        SignInPage.loginToRefresh();

	        SignInPage.loginToSkillGigs("sroye@iqtechpros.com", "qwerty");
	     
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);

	        SignInPage.verifyValidUsenameInvalidpwd("Either username does not exist or password is wrong");
    }
		
		@Test (priority = 3, description="Verify the error message displayed when user enter incorrect  username and incorrect password")
	    public void TC_Negative_Verify_IncorrectUserName_IncorrectPassword () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the error message displayed when user enter incorrect  username and incorrect password");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************
	        Thread.sleep(2000);

	       // homePage.goToSkillGigs();
	        
	        //Login to SkillGigs
	        SignInPage.loginToRefresh();

	        SignInPage.loginToSkillGigs("sroye@iqtechpro.com", "qwerty");
	  
	        //*************ASSERTIONS***********************
	        Thread.sleep(4000);
	        //SignInPage.verifyloginerror("There was some error with your submission");

	        SignInPage.verifyIncorrectUsenameIncorrectpwd("Either username does not exist or password is wrong");
    }
		
		@Test (priority = 4, description="Verify the error message displayed by incorrect username and correct password")
	    public void TC_Negative_Verify_IncorrectUserName_correctPassword () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the error message displayed by incorrect username and correct password");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************
	        Thread.sleep(2000);

	       // homePage.goToSkillGigs();
	        
	        //Login to SkillGigs
	        SignInPage.loginToRefresh();

	        SignInPage.loginToSkillGigs("sroye@iqtechpro.com", "test");
	     
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);
	        //SignInPage.verifyloginerror("There was some error with your submission");

	        SignInPage.verifyIncorrectUsenameCorrectpwd("Either username does not exist or password is wrong");
	        
    }
		
		
		@Test (priority = 5, description="Verify the error message displayed by correct username and incorrect password")
	    public void TC_Negative_Verify_correctUserName_IncorrectPassword () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the error message displayed by correct username and incorrect password");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************
	        Thread.sleep(2000);

	       // homePage.goToSkillGigs();
	        
	        //Login to SkillGigs
	        SignInPage.loginToRefresh();

	        SignInPage.loginToSkillGigs("sroye@iqtechpros.com", "qwerty");
	     
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);
	        //SignInPage.verifyloginerror("There was some error with your submission");

	        SignInPage.verifyCorrectUsenameIncorrectpwd("Either username does not exist or password is wrong");
    }
		
		
		@Test (priority = 6, description="Verify the error message displayed by empty username and empty password")
	    public void TC_Negative_Verify_EmptyUserName_EmpltyPassword () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the error message displayed by empty username and empty password");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************

	       // homePage.goToSkillGigs();
	        
	        //Login to SkillGigs

	        Thread.sleep(2000);
	        SignInPage.loginToRefresh();

	        SignInPage.loginToSkillGigs("", "");
	     
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);
	        //SignInPage.verifyloginerror("There was some error with your submission");

	        SignInPage.verifyEmptyUsername("Email cannot be empty");
	        SignInPage.verifyEmptyPwd("Password cannot be empty");

    }
		
		@Test (priority = 7, description="Verify the error message displayed by empty username and valid password")
	    public void TC_Negative_Verify_EmptyUserName_ValidPassword () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the error message displayed by empty username and valid password");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************

	       // homePage.goToSkillGigs();
	        	        //Login to SkillGigs
	 
	        Thread.sleep(2000);
	        SignInPage.loginToRefresh();

	        SignInPage.loginToSkillGigs("", "test");
	     
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);
	        //SignInPage.verifyloginerror("There was some error with your submission");

	        SignInPage.verifyEmptyUsername("Email cannot be empty");
	     

    }
		
		@Test (priority = 8, description="Verify the error message displayed by valid username and empty password")
	    public void TC_Negative_Verify_UserName_ValidPassword () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the error message displayed by valid username and empty password");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************

	       // homePage.goToSkillGigs();
	        
	        //Login to SkillGigs
	 
	        Thread.sleep(2000);
	        SignInPage.loginToRefresh();

	        SignInPage.loginToSkillGigs("sroye@iqtechpros.com", "");
	     
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);
	        //SignInPage.verifyloginerror("There was some error with your submission");

	        SignInPage.verifyEmptyPwd("Password cannot be empty");

    }
		
		@Test (priority = 9, description="Verify the error message displayed by enter only 2 characters in password")
	    public void TC_Negative_Verify_theErrorDisplayed_byEnter_0nly_TwoCharacters_Inpassword () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the error message displayed by enter only 2 characters in password");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************
	        
	        //Login to SkillGigs
	 
	        Thread.sleep(2000);
	        SignInPage.loginToRefresh();

	        SignInPage.loginToSkillGigs("sroye@iqtechpros.com", "qw");
	     
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);
	        //SignInPage.verifyloginerror("There was some error with your submission");

	        SignInPage.verify3characterPwd("Please enter at least 3 characters.");
	

    }
		@Test (priority = 10, description="Verify the forgot password page should be displayed onclick forgot password link")
	    public void TC_Positive_Verify_theForgotPassword_pageShouldDisplayed_onclickLink () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the forgot password page should be displayed onclick forgot password link");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************
	        
	        //Login to SkillGigs
	 
	        Thread.sleep(2000);

            SignInPage.fogotpwdclick();	    
            
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);

	        SignInPage.forgotPwd("Forgot Your Password?");
	

    }
		
		@Test (priority = 11, description="Verify the resend email verification page should be displayed onclick resend email verification ")
	    public void TC_Positive_Verify_theEmailVerificationPage_ShouldDisplayed_OnclickLink () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the resend email verification page should be displayed onclick resend email verification ");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************
	        
	        //Login to SkillGigs
	 
	        Thread.sleep(2000);
	        homePage.goToSkillGigs();

            SignInPage.resendemailclick();  
            
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);

	        SignInPage.resend("Resend Your Confirmation Email?");
	

    }
		
		
		@Test (priority = 12, description="Verify the sign up for skillgigs page should be displayed onclick sign up for skillgigs link")
	    public void TC_Positive_Verify_theSignUpPage_ShouldDisplayed_OnclickLink () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the sign up for skillgigs page should be displayed onclick sign up for skillgigs link");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************
	        
	        //Login to SkillGigs
	 
	        Thread.sleep(2000);
	        homePage.goToSkillGigs();
            
	        Thread.sleep(1000);
            SignInPage.signuplinkclick();   
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);

	        SignInPage.signUp("Sign Up");
	

    }
		
		
		
		
		
		
		@Test (priority = 13, description="Verify the new user by valid  username and valid password")
	    public void TC_Positive_Verify_ValidUserName_ValidPassword () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the new user by valid  username and valid password");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        ReactSignIn SignInPage = new ReactSignIn(driver,wait);
	        //*************PAGE METHODS********************

	      
	        
	        //Login to SkillGigs
	 
	        Thread.sleep(2000);
	        //SignInPage.loginToRefresh();
	        
	        homePage.goToSkillGigs();
            SignInPage.loginToSkillGigs("sroye@iqtechpros.com", "test");
	        
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);

	        SignInPage.verifyValidusernameValidpwd("Advanced Search Gigs - Talent - SkillGigs");
	      	        
	        Thread.sleep(5000);


    }


	 /*   @Test (priority =11, description="Verify the new user login by facebook")
	    public void TC_Positive_Verify_the_NewUser_login_ByFacebook () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the new user login by facebook");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        SignIn SignInPage = new SignIn(driver,wait);
	        //*************PAGE METHODS********************

	       // homePage.goToSkillGigs();
	        
	        //Login to SkillGigs
	 
	        Thread.sleep(2000);
	        
            SignInPage.fblogin();
	     
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);

	        SignInPage.verifyFbLogin("Log in to Facebook | Facebook");
	      

    }
		@Test (priority =12, description="Verify the new user login by LinkedIn")
	    public void TC_Positive_Verify_the_NewUser_login_ByLinkedIn () throws InterruptedException {
		    BasicConfigurator.configure();
	        //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify the new user login by LinkedIn");
	        
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver,wait);
	 
	        SignIn SignInPage = new SignIn(driver,wait);
	        //*************PAGE METHODS********************

	       // homePage.goToSkillGigs();
	        
	        //Login to SkillGigs
	 
	        Thread.sleep(2000);
	        
	        driver.navigate().back();

            SignInPage.linkedInlogin();
	     
	        //*************ASSERTIONS***********************
	        Thread.sleep(2000);
	        //SignInPage.verifyloginerror("There was some error with your submission");

	        SignInPage.verifyLinkedIn("LinkedIn Login, LinkedIn Sign in | LinkedIn"); */
	      

    
}