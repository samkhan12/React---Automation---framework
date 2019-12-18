package tests;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.HomePageManageGigs;
import pages.ReactManageGigs;
import utils.ExtentReports.ExtentTestManager;


public class ReactManageGigsTest extends BaseTest {
	
	

    // Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class.
	
	@Test (priority = 0, description="Verify that user should be able to filter all the 'DRAFT' gigs ")
	public void TC_Positive_Verify_thatUser_shouldbe_ableTo_filter_alltheDraft_gigs () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that user should be able to filter all the 'DRAFT' gigs ");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageManageGigs homePage = new HomePageManageGigs(driver,wait);
        
        ReactManageGigs gigManage = new ReactManageGigs(driver,wait);
 
        //*************PAGE METHODS********************
        driver.get("http://100.26.56.195/SignIn");
        
        //Thread to wait 
        Thread.sleep(3000);
        driver.findElement(By.id("signInEmail")).sendKeys("sbisht-admin@skillgigs.com");
        driver.findElement(By.id("signInPassword")).sendKeys("pass@321");
        driver.findElement(By.xpath("//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div/button")).click();
        
        
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Click on Filters
        
        gigManage.clickTofilteroptions();
        gigManage.clickToDraft();
        
       
        
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        gigManage.verifyDraftGigs();
	    }
	
	@Test (priority = 1, description="Verify that user should be able to filter all the 'PUBLISHED' gigs ")
	public void TC_Positive_Verify_thatUser_shouldbe_ableTo_filter_allthePublished_gigs () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that user should be able to filter all the 'PUBLISHED' gigs ");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageManageGigs homePage = new HomePageManageGigs(driver,wait);
        
        ReactManageGigs gigManage = new ReactManageGigs(driver,wait);
 
        //*************PAGE METHODS********************
      
        
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Click on Filters
        
        gigManage.clickTofilteroptions();
        gigManage.clickToPublished();
        
       
        
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        gigManage.verifyPublishedGigs();
	    }
	
	@Test (priority = 2, description="Verify that user should be able to filter all the 'DELETED' gigs ")
	public void TC_Positive_Verify_thatUser_shouldbe_ableTo_filter_alltheDeleted_gigs () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that user should be able to filter all the 'DELETED' gigs ");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageManageGigs homePage = new HomePageManageGigs(driver,wait);
        
        ReactManageGigs gigManage = new ReactManageGigs(driver,wait);
 
        //*************PAGE METHODS********************
       
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Click on Filters
        
        gigManage.clickTofilteroptions();
        gigManage.clickToDeleted();
        
       
        
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        gigManage.verifyDeletedGigs();
	    }
	@Test (priority = 3, description="Verify that user should be able to filter all the 'EXPIRED' gigs ")
	public void TC_Positive_Verify_thatUser_shouldbe_ableTo_filter_alltheExpired_gigs () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that user should be able to filter all the 'EXPIRED' gigs ");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageManageGigs homePage = new HomePageManageGigs(driver,wait);
        
        ReactManageGigs gigManage = new ReactManageGigs(driver,wait);
 
        //*************PAGE METHODS********************
       
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Click on Filters
        
        gigManage.clickTofilteroptions();
        gigManage.clickToExpired();
        
       
        
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        gigManage.verifyExpiredGigs();
	    }
	
	@Test (priority = 4, description="Verify that user should be able to filter all the 'CLOSED' gigs ")
	public void TC_Positive_Verify_thatUser_shouldbe_ableTo_filter_alltheClosed_gigs () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that user should be able to filter all the 'CLOSED' gigs ");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageManageGigs homePage = new HomePageManageGigs(driver,wait);
        
        ReactManageGigs gigManage = new ReactManageGigs(driver,wait);
 
        //*************PAGE METHODS********************
       
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Click on Filters
        
        gigManage.clickTofilteroptions();
        gigManage.clickToClosed();
        
       
        
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        gigManage.verifyClosedGigs();
	    }
	
	@Test (priority = 5, description="Verify that user should be able to clear filter of all the gigs ")
	public void TC_Positive_Verify_thatUser_shouldbe_ableTo_Clear_allthe_gigs () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that user should be able to clear filter of all the gigs ");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageManageGigs homePage = new HomePageManageGigs(driver,wait);
        
        ReactManageGigs gigManage = new ReactManageGigs(driver,wait);
 
        //*************PAGE METHODS********************
       
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Click on Filters
        
        gigManage.clickTofilteroptions();
        gigManage.clickToClear();
        
       
        
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        gigManage.verifyClearGigs();
	    }
	
	@Test (priority = 6, description="Verify that 'DRAFT' gigs count should be similar the counts on title 'Our gigs'")
	public void TC_Positive_Verify_thatdraft_countShouldbe_similarthe_countsOn_title () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that 'DRAFT' gigs count should be similar the counts on title 'Our gigs'");
        
        //*************PAGE INSTANTIATIONS*************
        HomePageManageGigs homePage = new HomePageManageGigs(driver,wait);
        
        ReactManageGigs gigManage = new ReactManageGigs(driver,wait);
 
        //*************PAGE METHODS********************
       
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Click on Filters
        
        gigManage.clickTofilteroptions();
        gigManage.clickToClear();
        
       
        
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        gigManage.verifyClearGigs();
	    }
}