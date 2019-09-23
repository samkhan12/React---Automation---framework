package tests;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;
import pages.HomePageSignUp;
import pages.ReactSignUp;
import utils.ExtentReports.ExtentTestManager;


public class ReactSignUpTest extends BaseTest {
	
	

    // Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class.
	
	@Test (priority = 0, description="TVerify the error message displayed when user enter invalid email address")
	public void TC_Negative_Talent_Verify_ErrorDisplayed_whenuser_enter_invalid_emailid() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify the error message displayed when user enter invalid email address");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageSignUp homePage = new HomePageSignUp(driver,wait);
 
        ReactSignUp SignUpPage = new ReactSignUp(driver,wait);
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        SignUpPage.selectVariant();
        SignUpPage.moveToTalent();
        
        Thread.sleep(2000);
        //Login to SkillGigs
        SignUpPage.SignupData("Sam khan", "email@@domain.web", "qwerty");
     
        //*************ASSERTIONS***********************
        
        Thread.sleep(2000);
        SignUpPage.verifyInvalidEmail("You must enter valid email");
 
	    }
	
	@Test (priority = 1, description="Verify the error message displayed by empty fullname, empty email and empty password")
	public void TC_Negative_Talent_Verify_ErrorDisplayed_ByEmpty_FullNameEmail_AndEmptyPassword() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify the error message displayed by empty fullname, empty email and empty password");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageSignUp homePage = new HomePageSignUp(driver,wait);
 
        ReactSignUp SignUpPage = new ReactSignUp(driver,wait);
        //*************PAGE METHODS********************
        
        Thread.sleep(2000);
        SignUpPage.SignupRefresh();
        SignUpPage.SignupData("", "", "");
     
        //*************ASSERTIONS***********************
        
        Thread.sleep(2000);
        SignUpPage.verifyEmptyFullname("FullName cannot be empty");
        SignUpPage.verifyEmptyEmail("Email cannot be empty");
        SignUpPage.verifyEmptyPwd("Password cannot be empty");
 
	    }
	
	@Test (priority = 2, description="Verify the error message displayed by empty fullname")
	public void TC_Negative_Talent_Verify_ErrorDisplayed_ByEmpty_FullNameEmail() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify the error message displayed by empty fullname");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageSignUp homePage = new HomePageSignUp(driver,wait);
 
        ReactSignUp SignUpPage = new ReactSignUp(driver,wait);
        //*************PAGE METHODS********************
        
        Thread.sleep(2000);
        SignUpPage.SignupRefresh();
        SignUpPage.SignupData("", "email@talent.com", "qwerty");
     
        //*************ASSERTIONS***********************
        
        Thread.sleep(2000);
        SignUpPage.verifyEmptyFullname("FullName cannot be empty");
 
	    }
	
	@Test (priority = 3, description="Verify the error message displayed by empty email")
	public void TC_Negative_Talent_Verify_ErrorDisplayed_ByEmpty_Email() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify the error message displayed by empty email");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageSignUp homePage = new HomePageSignUp(driver,wait);
 
        ReactSignUp SignUpPage = new ReactSignUp(driver,wait);
        //*************PAGE METHODS********************
        
        Thread.sleep(2000);
        SignUpPage.SignupRefresh();
        SignUpPage.SignupData("Sam Khan", "", "qwerty");
     
        //*************ASSERTIONS***********************
        
        Thread.sleep(2000);
        SignUpPage.verifyEmptyEmail("Email cannot be empty");
 
	    }
	
	@Test (priority = 4, description="Verify the error message displayed by empty password")
	public void TC_Negative_Talent_Verify_ErrorDisplayed_ByEmpty_Password() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify the error message displayed by empty password");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageSignUp homePage = new HomePageSignUp(driver,wait);
 
        ReactSignUp SignUpPage = new ReactSignUp(driver,wait);
        //*************PAGE METHODS********************
        
        Thread.sleep(2000);
        SignUpPage.SignupRefresh();
        SignUpPage.SignupData("Sam Khan", "email@talent.com", "");
     
        //*************ASSERTIONS***********************
        
        Thread.sleep(2000);
        SignUpPage.verifyEmptyPwd("Password cannot be empty");
 
	    }
	
	@Test (priority = 5, description="Verify that user is shown error message when user uses existing email id for SignUp")
	public void TC_Negative_Talent_Verify_ErrorDisplayed_WhenUserUses_ExistingEmail() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that user is shown error message when user uses existing email id for SignUp");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageSignUp homePage = new HomePageSignUp(driver,wait);
 
        ReactSignUp SignUpPage = new ReactSignUp(driver,wait);
        //*************PAGE METHODS********************
        
        Thread.sleep(2000);
        SignUpPage.SignupRefresh();
        SignUpPage.SignupData("Sam Khan", "sroye@iqtechpros.com", "qwerty");
     
        //*************ASSERTIONS***********************
        
        Thread.sleep(2000);
        SignUpPage.verifyEmailexist("Account already exist");
 
	    }
	
	@Test (priority = 6, description="Verify the error message displayed by enter only 2 characters in password")
	public void TC_Negative_Talent_Verify_ErrorDisplayed_ByEnterOnly2Characters_InPassword() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify the error message displayed by enter only 2 characters in password");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageSignUp homePage = new HomePageSignUp(driver,wait);
 
        ReactSignUp SignUpPage = new ReactSignUp(driver,wait);
        //*************PAGE METHODS********************
        
        Thread.sleep(2000);
        SignUpPage.SignupRefresh();
        SignUpPage.SignupData("Sam Khan", "email@talent.com", "qw");
     
        //*************ASSERTIONS***********************
        
        Thread.sleep(2000);
        SignUpPage.verify2characterPwd("Please enter at least 3 characters for your password");
 
	    }
	
	@Test (priority = 7, description="Verify the error message displayed by enter only firstname in fullname")
	public void TC_Negative_Talent_Verify_ErrorDisplayed_ByEnterOnyFirstName_InFullName() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify the error message displayed by enter only firstname in fullname");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageSignUp homePage = new HomePageSignUp(driver,wait);
 
        ReactSignUp SignUpPage = new ReactSignUp(driver,wait);
        //*************PAGE METHODS********************
        
        Thread.sleep(2000);
        SignUpPage.SignupRefresh();
        SignUpPage.SignupData("Sam", "email@talent.com", "qwerty");
     
        //*************ASSERTIONS***********************
        
        Thread.sleep(2000);
        SignUpPage.verifyEmptyFullname("You must enter your first name (not just your initial) and last name separated by a space");
 
	    }
	
	@Test (priority = 8, description="Verify the resend email verfication page should be displayed onclick resend email link ")
	public void TC_Negative_Talent_Verify_theResendEmailVerification_ShouldBeDisplayed_OnlcikResendEmailLink() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify the resend email verfication page should be displayed onclick resend email link ");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageSignUp homePage = new HomePageSignUp(driver,wait);
 
        ReactSignUp SignUpPage = new ReactSignUp(driver,wait);
        //*************PAGE METHODS********************
        
        Thread.sleep(2000);
        SignUpPage.clickResendEmailVerification();
     
        //*************ASSERTIONS***********************
        
        Thread.sleep(2000);
        SignUpPage.verifyResendEmail("Resend Your Confirmation Email?");
 
	    }
	
	@Test (priority = 9, description="Verify the forgot password page should be displayed onclick forgot password link ")
	public void TC_Negative_Talent_Verify_theForgotPassword_ShouldBeDisplayed_OnlcikForgotPasswordLink() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify the forgot password page should be displayed onclick forgot password link ");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageSignUp homePage = new HomePageSignUp(driver,wait);
 
        ReactSignUp SignUpPage = new ReactSignUp(driver,wait);
        //*************PAGE METHODS********************
        
        Thread.sleep(2000);
        driver.get("http://app.beta.skillgigs.com/SignUp");
        SignUpPage.selectVariant();
        SignUpPage.moveToTalent();
        SignUpPage.clickForgotPwd();
     
        //*************ASSERTIONS***********************
        
        Thread.sleep(2000);
        SignUpPage.verifyForgotPwd("Forgot Your Password?");
 
	    }
	
	@Test (priority = 10, description="Verify that new user is able to SignUp properly with valid data")
	public void TC_Positive_Talent_Verify_theNewUser_IsAbleTo_SignUpProperly_withValidData() throws InterruptedException {
		
		
		BasicConfigurator.configure();
	    

        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that new user is able to SignUp properly with valid data");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageSignUp homePage = new HomePageSignUp(driver,wait);
 
        ReactSignUp SignUpPage = new ReactSignUp(driver,wait);
        //*************PAGE METHODS********************
        
        Thread.sleep(2000);
        driver.get("http://app.beta.skillgigs.com/SignUp");
        SignUpPage.selectVariant();
        SignUpPage.moveToTalent();
        SignUpPage.SignupData("Sam khan", "email@talent.com", "qwerty");

     
        //*************ASSERTIONS***********************
        
        Thread.sleep(2000);
 
	    }
	
	
	
	
}