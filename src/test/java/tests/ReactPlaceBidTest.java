package tests;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.HomePagePlaceBid;
import pages.ReactPlaceBid;
import utils.ExtentReports.ExtentTestManager;


public class ReactPlaceBidTest extends BaseTest {
	
	

    // Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class.
	
	@Test (priority = 0, description="Verify that error message should be displayed when all fields are empty")
	public void TC_Negative_Verify_theError_messageDisplayed_all_field_AreEmpty () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that error message should be displayed when all fields are empty");
        
        //*************PAGE INSTANTIATIONS*************
        
        HomePagePlaceBid homePage = new HomePagePlaceBid(driver,wait);
        
        ReactPlaceBid placeBid = new ReactPlaceBid(driver,wait);
 
        //*************PAGE METHODS********************
        driver.get("http://54.87.253.209/SignIn");
        
        //Thread to wait 
        Thread.sleep(2000);
        driver.findElement(By.id("signInEmail")).sendKeys("sbisht-admin@skillgigs.com");
        driver.findElement(By.id("signInPassword")).sendKeys("pass@321");
        driver.findElement(By.xpath("//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div/button")).click();
        
        Thread.sleep(2000);
        
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Fill the Information page
     
        placeBid.clickBid();

      
        //*************ASSERTIONS***********************
          
        Thread.sleep(2000);
        
        placeBid.verifyEmptyField("Required Fields cannot be empty");
        
	    }
	
	@Test (priority = 1, description="Verify that user should be able to cancel ")
	public void TC_Negative_Verify_that_UserShould_be_AbleTo_cancel () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that user should be able to cancel ");
        
        //*************PAGE INSTANTIATIONS*************
        
        HomePagePlaceBid homePage = new HomePagePlaceBid(driver,wait);
        
        ReactPlaceBid placeBid = new ReactPlaceBid(driver,wait);
 
        //*************PAGE METHODS*******************
        
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Fill the Information page

        placeBid.clickCancel();

      
        //*************ASSERTIONS***********************
          
        Thread.sleep(2000);
        
        placeBid.verifyCancel("Bid To Get Started");
   
        
	    }
	
	@Test (priority = 2, description="Verify that user should be able to place bid with all mandatory fields")
	public void TC_Negative_Verify_that_UserShould_beAble_toPlacedBid_withAll_MandatoryFields () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that user should be able to place bid with all mandatory fields");
        
        //*************PAGE INSTANTIATIONS*************
        
        HomePagePlaceBid homePage = new HomePagePlaceBid(driver,wait);
        
        ReactPlaceBid placeBid = new ReactPlaceBid(driver,wait);
 
        //*************PAGE METHODS*******************
        
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Fill the Information page
        
        placeBid.selectEmployer("InsightRX");
        placeBid.selectgig("QA");
        placeBid.addIntialbid("123");
        placeBid.addsellGig();
        placeBid.addIdealdate();
        placeBid.desiredContract();
        placeBid.clickBid();
      
        //*************ASSERTIONS***********************
          
        Thread.sleep(2000);
        
        placeBid.verifyPlacedBid("Edit Your Bid");
   
        
	    }
}