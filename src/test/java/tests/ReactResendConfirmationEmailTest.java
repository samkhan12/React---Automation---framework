package tests;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;

import pages.HomePageResendEmail;
import pages.ReactResendConfirmationEmail;
import utils.ExtentReports.ExtentTestManager;


public class ReactResendConfirmationEmailTest extends BaseTest {
	
	

    // Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class.
	
	@Test (priority = 0, description="Verify the error message displayed when user enter invalid  email")
	public void TC_Negative_Verify_theError_messageDisplayed_whenUser_EnterInvalid_email () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify the error message displayed when user enter invalid  email");
        
        //*************PAGE INSTANTIATIONS*************
        
        HomePageResendEmail homePage = new HomePageResendEmail(driver,wait);
        
        ReactResendConfirmationEmail resend = new ReactResendConfirmationEmail(driver,wait);
 
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Login to SkillGigs
        resend.emaildata("email@!domain.web");
        resend.clickBtn();
        
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        resend.verifyInvalidEmail("You must enter valid email");
        
	    }
	
	@Test (priority = 1, description="Verify the error message displayed by empty email field ")
	public void TC_Negative_Verify_theError_messageDisplayed_whenEmail_IsEmpty () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify the error message displayed by empty email field ");
        
        //*************PAGE INSTANTIATIONS*************
        
        HomePageResendEmail homePage = new HomePageResendEmail(driver,wait);
        
        ReactResendConfirmationEmail resend = new ReactResendConfirmationEmail(driver,wait);
 
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Login to SkillGigs
        
        resend.emaildataRefresh();
        resend.emaildata("");
        resend.clickBtn();

        
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        resend.verifyEmptyEmail("Email cannot be empty");
 
	    }
	
	@Test (priority = 2, description="Verify the error message displayed when user enter unregistered email")
	public void TC_Negative_Verify_theError_messageDisplayed_whenUser_enterUnregistered_email () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify the error message displayed when user enter unregistered email");
        
        //*************PAGE INSTANTIATIONS*************
        
        HomePageResendEmail homePage = new HomePageResendEmail(driver,wait);
        
        ReactResendConfirmationEmail resend = new ReactResendConfirmationEmail(driver,wait);
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Login to SkillGigs
        
        resend.emaildataRefresh();
        resend.emaildata("email121@domain.web");
        resend.clickBtn();

        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        resend.verifySuccessEmail("Success: An email with password reset instructions has been sent to email@domain.com, if it exists on our system");
 
	    }
	
	@Test (priority = 3, description="Verify the error message displayed when user enter registered email ID and then click on 'send reset instruction' button")
	public void TC_Negative_Verify_theError_messageDisplayed_whenUser_enterregistered_emailand_ClickonButton () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify the error message displayed when user enter registered email ID and then click on 'send reset instruction' button");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageResendEmail homePage = new HomePageResendEmail(driver,wait);
        
        ReactResendConfirmationEmail resend = new ReactResendConfirmationEmail(driver,wait);
 
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Login to SkillGigs
        
        resend.emaildataRefresh();
        resend.emaildata("test@mailinator.com");
        resend.clickBtn();

        
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        resend.verifySuccessEmail("Success: An email with password reset instructions has been sent to test@mailinator.com, if it exists on our system");
 
	    }
	
	@Test (priority = 4, description="Verify the message and user should be able to able to send reset password link to registered emails")
	public void TC_Negative_Verify_theError_messageDisplayed_whenUser_shouldbe_ableToSend_PasswordLink () throws InterruptedException {
	 
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify the message and user should be able to able to send reset password link to registered emails");
        
        //*************PAGE INSTANTIATIONS*************
        
        HomePageResendEmail homePage = new HomePageResendEmail(driver,wait);
        
        ReactResendConfirmationEmail resend = new ReactResendConfirmationEmail(driver,wait);
 
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Login to SkillGigs
        
        resend.emaildataRefresh();
        resend.emaildata("test@mailinator.com");
        resend.clickBtn();

        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        resend.verifySuccessEmail("Success: An email with password reset instructions has been sent to test@mailinator.com, if it exists on our system");
 
	    }
}
	