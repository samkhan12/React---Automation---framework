package tests;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.HomePageGigWizard;
import pages.ReactGigWizardPermanent;
import utils.ExtentReports.ExtentTestManager;


public class ReactGigWizardTest extends BaseTest {
	
	

    // Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class.
	
	@Test (priority = 0, description="Verify that error message is displayed when Gig Title field is left blank for Permanent Gig")
	public void TC_Negative_Verify_theError_messageDisplayed_whenGig_Titlefield_IsBlank () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that error message is displayed when Gig Title field is left blank for Permanent Gig");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageGigWizard homePage = new HomePageGigWizard(driver,wait);
        
        ReactGigWizardPermanent gigWizard = new ReactGigWizardPermanent(driver,wait);
 
        //*************PAGE METHODS********************
        driver.get("http://100.26.56.195/SignIn");
        
        //Thread to wait 
        Thread.sleep(3000);
        driver.findElement(By.id("signInEmail")).sendKeys("sbisht-admin@skillgigs.com");
        driver.findElement(By.id("signInPassword")).sendKeys("pass@321");
        driver.findElement(By.xpath("//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div/button")).click();
        
        Thread.sleep(10000);
        
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Fill the Information page
        gigWizard.goToPermanent();
        gigWizard.gigtitle("");
        gigWizard.giglocation("Houston, AK");
        gigWizard.workauth();
        gigWizard.budgetrange("2000", "5000");
        
        gigWizard.nextbutton();
        
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        gigWizard.verifyEmptyField("Required field cannot be empty");
	    }
	
	@Test (priority = 1, description="Verify that error message is displayed when Gig Location field is left blank for Permanent Gig")
	public void TC_Negative_Verify_theError_messageDisplayed_whenGig_Locationfield_IsBlank  () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that error message is displayed when Gig Location field is left blank for Permanent Gig");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageGigWizard homePage = new HomePageGigWizard(driver,wait);
        
        ReactGigWizardPermanent gigWizard = new ReactGigWizardPermanent(driver,wait);
 
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Fill the Information page
        gigWizard.goToPermanent();
        gigWizard.gigtitle("DevOps Engineer");
        gigWizard.workauth();
        gigWizard.budgetrange("2000", "5000");
        
        gigWizard.nextbutton();
        
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        gigWizard.verifyEmptyField("Required field cannot be empty");
	    }
	
	@Test (priority = 2, description="Verify that error message is displayed when Work Authorization field is left blank for Permanent Gig")
	public void TC_Negative_Verify_theError_messageDisplayed_whenWork_Authorizationfield_IsBlank  () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that error message is displayed when Work Authorization field is left blank for Permanent Gig");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageGigWizard homePage = new HomePageGigWizard(driver,wait);
        
        ReactGigWizardPermanent gigWizard = new ReactGigWizardPermanent(driver,wait);
 
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Fill the Information page
        gigWizard.goToPermanent();
        gigWizard.gigtitle("DevOps Engineer");
        gigWizard.giglocation("Houston, AK");
        gigWizard.budgetrange("2000", "5000");
        
        gigWizard.nextbutton();
        
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        gigWizard.verifyEmptyField("Required field cannot be empty");
	    }
	
	@Test (priority = 3, description="Verify that error message is displayed when Budget range holds alphabetical value for Permanent Gig")
	public void TC_Negative_Verify_theError_messageDisplayed_whenWork_budgetRange_HoldAlphabeticalValue  () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that error message is displayed when Budget range holds alphabetical value for Permanent Gig");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageGigWizard homePage = new HomePageGigWizard(driver,wait);
        
        ReactGigWizardPermanent gigWizard = new ReactGigWizardPermanent(driver,wait);
 
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Fill the Information page
        gigWizard.goToPermanent();
        gigWizard.gigtitle("DevOps Engineer");
        gigWizard.giglocation("Houston, AK");
        gigWizard.workauth();
        gigWizard.budgetrange("abc", "def");
        
        gigWizard.nextbutton();
        
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        gigWizard.verifyNumericError("Only numeric values are allowed");
	    }
	
	@Test (priority = 4, description="Verify that error message is displayed when Budget range  min is greater than the max value for Permanent Gig")
	public void TC_Negative_Verify_theError_messageDisplayed_whenWork_budgetRange_Isgreaterthan_maxValue  () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that error message is displayed when Budget range  min is greater than the max value for Permanent Gig");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageGigWizard homePage = new HomePageGigWizard(driver,wait);
        
        ReactGigWizardPermanent gigWizard = new ReactGigWizardPermanent(driver,wait);
 
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Fill the Information page
        gigWizard.goToPermanent();
        gigWizard.gigtitle("DevOps Engineer");
        gigWizard.giglocation("Houston, AK");
        gigWizard.workauth();
        gigWizard.budgetrange("5000", "2000");
        
        gigWizard.nextbutton();
        
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        gigWizard.verifyNumericError("Minimum should be less than maximum");
	    }
	
	@Test (priority = 5, description="Verify that user able to create information form of Permanent Gig successfully")
	public void TC_Negative_Verify_thatUser_AbleTocreate_informationform_ofPermanentGig () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that user able to create information form of Permanent Gig successfully");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageGigWizard homePage = new HomePageGigWizard(driver,wait);
        
        ReactGigWizardPermanent gigWizard = new ReactGigWizardPermanent(driver,wait);
 
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Fill the Information page
        gigWizard.goToPermanent();
        gigWizard.gigtitle("DevOps Engineer");
        gigWizard.giglocation("Houston, AK");
        gigWizard.workauth();
        gigWizard.budgetrange("2000", "5000");
        
        gigWizard.nextbutton();
        
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        gigWizard.verifyNextPage("SkillGigs' AI uses the skills you list to find talent that is a good match. Be thorough when listing skills!");
        
	    }
	
	@Test (priority = 6, description="Verify that error message is displayed when Add required Skill field is empty for Permanent Gig")
	public void TC_Negative_Verify_thaterror_message_isDisplayed_whenAddrequiredSkill_IsEmpty () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that error message is displayed when Add required Skill field is empty for Permanent Gig");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageGigWizard homePage = new HomePageGigWizard(driver,wait);
        
        ReactGigWizardPermanent gigWizard = new ReactGigWizardPermanent(driver,wait);
 
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(1000);
        
        //Fill the Information page
        gigWizard.goToPermanent();
        gigWizard.gigtitle("DevOps Engineer");
        gigWizard.giglocation("Houston, AK");
        gigWizard.workauth();
        gigWizard.budgetrange("2000", "5000");
        gigWizard.nextbutton();

        Thread.sleep(3000);
        gigWizard.desskills("Selenium/TestNG");
        gigWizard.gigDesc("Selenium webdriver with TestNG framework and CI/CD tools");
        gigWizard.DesExperience();
        
        gigWizard.Nextbutton();
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        gigWizard.verifyEmptyField("Required field cannot be empty");
        
	    }
	
	
	
	@Test (priority = 7, description="Verify that error message is displayed when Gig Description field is empty for Permanent Gig  ")
	public void TC_Negative_Verify_thatError_message_isDisplayed_WhenGigDescription_field_IsEmpty () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that error message is displayed when Gig Description field is empty for Permanent Gig  ");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageGigWizard homePage = new HomePageGigWizard(driver,wait);
        
        ReactGigWizardPermanent gigWizard = new ReactGigWizardPermanent(driver,wait);
 
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(1000);
        
        //Fill the Information page
        gigWizard.goToPermanent();
        gigWizard.gigtitle("DevOps Engineer");
        gigWizard.giglocation("Houston, AK");
        gigWizard.workauth();
        gigWizard.budgetrange("2000", "5000");
        gigWizard.nextbutton();

        Thread.sleep(3000);
        gigWizard.reqskills("Javaexperts");
        gigWizard.desskills("Selenium/TestNG");
        gigWizard.gigDesc("");
        gigWizard.DesExperience();
        
        gigWizard.Nextbutton();
        
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        gigWizard.verifyEmptyField("Required field cannot be empty");
        
	    }
	@Test (priority = 8, description="Verify that error message is displayed when Desired Experience is empty")
	public void TC_Negative_Verify_thatError_message_isDisplayed_whenDesiredExperience_field_IsEmpty () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that error message is displayed when Desired Experience is empty");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageGigWizard homePage = new HomePageGigWizard(driver,wait);
        
        ReactGigWizardPermanent gigWizard = new ReactGigWizardPermanent(driver,wait);
 
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(1000);
        
        //Fill the Information page
        gigWizard.goToPermanent();
        gigWizard.gigtitle("DevOps Engineer");
        gigWizard.giglocation("Houston, AK");
        gigWizard.workauth();
        gigWizard.budgetrange("2000", "5000");
        gigWizard.nextbutton();

        Thread.sleep(3000);
        gigWizard.reqskills("Javaexperts");
        gigWizard.desskills("Selenium/TestNG");
        gigWizard.gigDesc("Selenium webdriver with TestNG framework and CI/CD tools");
        
        gigWizard.Nextbutton();
        
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        gigWizard.verifyEmptyField("Required field cannot be empty");
        
	    }
	
	@Test (priority = 9, description="Verify that error message is displayed when all the fields are empty")
	public void TC_Negative_Verify_thatError_message_isDisplayed_whenAll_fields_areEmpty () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that error message is displayed when all the fields are empty");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageGigWizard homePage = new HomePageGigWizard(driver,wait);
        
        ReactGigWizardPermanent gigWizard = new ReactGigWizardPermanent(driver,wait);
 
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(1000);
        
        //Fill the Information page
        gigWizard.goToPermanent();
        gigWizard.gigtitle("DevOps Engineer");
        gigWizard.giglocation("Houston, AK");
        gigWizard.workauth();
        gigWizard.budgetrange("2000", "5000");
        gigWizard.nextbutton();

        Thread.sleep(3000);
    
        
        gigWizard.Nextbutton();
        
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        gigWizard.verifyEmptyField("Required field cannot be empty");
        
	    }
	
	@Test (priority = 10, description="Verify that user able to create Permanent Gig successfully")
	public void TC_Positive_Verify_that_userAble_toCreate_PermanentGig_Successfully () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that user able to create Permanent Gig successfully");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageGigWizard homePage = new HomePageGigWizard(driver,wait);
        
        ReactGigWizardPermanent gigWizard = new ReactGigWizardPermanent(driver,wait);
 
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(1000);
        
        //Fill the Information page
        gigWizard.goToPermanent();
        gigWizard.gigtitle("DevOps Engineer");
        gigWizard.giglocation("Houston, AK");
        gigWizard.workauth();
        gigWizard.budgetrange("2000", "5000");
        gigWizard.nextbutton();

        Thread.sleep(3000);
        gigWizard.reqskills("Javaexperts");
        gigWizard.desskills("Selenium/TestNG");
        gigWizard.gigDesc("Selenium webdriver with TestNG framework and CI/CD tools");
        gigWizard.DesExperience();

        gigWizard.Nextbutton();
        
                //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        gigWizard.verifySucceslogin("Filter Options");
        
	    }
	
}