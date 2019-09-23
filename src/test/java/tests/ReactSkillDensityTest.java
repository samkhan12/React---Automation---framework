package tests;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.HomePageSkillDensity;
import pages.ReactSkillDensity;
import utils.ExtentReports.ExtentTestManager;


public class ReactSkillDensityTest extends BaseTest {
	
	

    // Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class.
	
	@Test (priority = 0, description="Verify that error message should be displayed when add skills field is empty")
	public void TC_Negative_Verify_theError_messageDisplayed_addSkills_field_IsEmpty () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that error message should be displayed when add skills field is empty");
        
        //*************PAGE INSTANTIATIONS*************
        
        HomePageSkillDensity homePage = new HomePageSkillDensity(driver,wait);
        
        ReactSkillDensity skillDensity = new ReactSkillDensity(driver,wait);
 
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

        skillDensity.clickAddButton();
        skillDensity.clickOkbutton();
        
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        skillDensity.verifyEmptyField("Please select a skill name");
	    }
	
	@Test (priority = 1, description="Verify that error message should be displayed when user add duplicate skills")
	public void TC_Negative_Verify_theError_messageDisplayed_whenUser_addDuplicate_Skills  () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that error message should be displayed when user add duplicate skills");
        
        //*************PAGE INSTANTIATIONS*************
        
        HomePageSkillDensity homePage = new HomePageSkillDensity(driver,wait);
        
        ReactSkillDensity skillDensity = new ReactSkillDensity(driver,wait);
 
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Fill the Information page
        skillDensity.deleteSkills();

        skillDensity.clickAddButton();
        skillDensity.addSkills("Selenium/TestNG");
        skillDensity.clickOkbutton();

        skillDensity.clickAddButton();
        skillDensity.addSkills("Selenium/TestNG");
                
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        skillDensity.verifyDupError("Looks like you already have selected this skill");
        
	    } 
	
	

	@Test (priority = 2, description="Verify that error message should be displayed when user enter skill percentage more than 100%")
	public void TC_Negative_Verify_theError_messageDisplayed_whenUser_enterSkill_Percentage_moreThan_100 () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that error message should be displayed when user enter skill percentage more than 100%");
        
        //*************PAGE INSTANTIATIONS*************
        
        HomePageSkillDensity homePage = new HomePageSkillDensity(driver,wait);
        
        ReactSkillDensity skillDensity = new ReactSkillDensity(driver,wait);
 
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Fill the Information page
        skillDensity.deleteSkills();

        skillDensity.clickAddButton();
        skillDensity.addSkills("Selenium/TestNG");
        skillDensity.addPercentage("105");
        skillDensity.clickOkbutton();
                
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        skillDensity.verifypercentageError("Total percentage should be less than equal to 100");
        
	    } 
	
	
	@Test (priority = 3, description="Verify that user should be able to move on previous page onclick cancel button")
	public void TC_Negative_Verify_theUser_shouldbe_ableTo_moveOn_previouspage_Onclick_cancelButton () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that user should be able to move on previous page onclick cancel button");
        
        //*************PAGE INSTANTIATIONS*************
        
        HomePageSkillDensity homePage = new HomePageSkillDensity(driver,wait);
        
        ReactSkillDensity skillDensity = new ReactSkillDensity(driver,wait);
 
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Fill the Information page
        
        skillDensity.clickAddButton();
        skillDensity.clickCancelButton();
                
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        skillDensity.verifyCanceltitle("SQL DBA (Permanent)");
        
	    } 
	
	
	@Test (priority = 4, description="Verify that 'Add skill and Percent' pop-up should be appear onclick 'ADD' button")
	public void TC_Negative_Verify_thaAddSkill_andPercent_Popup_ShouldBeAppear_Onlclick_AddButton () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that 'Add skill and Percent' pop-up should be appear onclick 'ADD' button");
        
        //*************PAGE INSTANTIATIONS*************
        
        HomePageSkillDensity homePage = new HomePageSkillDensity(driver,wait);
        
        ReactSkillDensity skillDensity = new ReactSkillDensity(driver,wait);
 
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Fill the Information page
        
        skillDensity.clickAddButton();
                
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        skillDensity.verifyPopuptitle("Add skill and Percent");
        
	    } 
	
	@Test (priority = 5, description="Verify that user should be able to add/display the skill")
	public void TC_Positive_Verify_thatUser_ShouldBe_ableTo_AddDisplay_theSkill () throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that user should be able to add/display the skill");
        
        //*************PAGE INSTANTIATIONS*************
        
        HomePageSkillDensity homePage = new HomePageSkillDensity(driver,wait);
        
        ReactSkillDensity skillDensity = new ReactSkillDensity(driver,wait);
 
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Fill the Information page
        skillDensity.deleteSkills();

        skillDensity.clickAddButton();
        skillDensity.addSkills("Selenium/TestNG");
        skillDensity.addPercentage("20");
        skillDensity.clickOkbutton();
                
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        skillDensity.verifyAddDisplay("Selenium/TestNG");
        
        
	    } 
	
	@Test (priority = 6, description="Verify that user should be able to delete the skills")
	public void TC_Positive_Verify_thatUser_ShouldBe_ableTo_Delete_theSkills() throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that user should be able to delete the skills");
        
        //*************PAGE INSTANTIATIONS*************
        
        HomePageSkillDensity homePage = new HomePageSkillDensity(driver,wait);
        
        ReactSkillDensity skillDensity = new ReactSkillDensity(driver,wait);
 
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Fill the Information page
        skillDensity.deleteSkills();

        skillDensity.clickAddButton();
        skillDensity.addSkills("Selenium/TestNG");
        skillDensity.addPercentage("20");
        skillDensity.clickOkbutton();
        skillDensity.deleteSkills();
                
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        skillDensity.verifyDeleteSkills("Grand Total: 0%");
        
        
	    } 
	
	
	@Test (priority = 7, description="Verify that user should be able to add/display the multiple skills")
	public void TC_Positive_Verify_thatUser_ShouldBe_ableTo_addDisplay_the_multiple_Skills() throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that user should be able to add/display the multiple skills");
        
        //*************PAGE INSTANTIATIONS*************
        
        HomePageSkillDensity homePage = new HomePageSkillDensity(driver,wait);
        
        ReactSkillDensity skillDensity = new ReactSkillDensity(driver,wait);
 
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Fill the Information page
        skillDensity.deleteSkills();

        skillDensity.clickAddButton();
        skillDensity.addSkills("Selenium/TestNG");
        skillDensity.addPercentage("50");
        skillDensity.clickOkbutton();
        
        skillDensity.clickAddButton();
        skillDensity.multipleSkills("Javaexperts");
        skillDensity.addPercentage("50");
        skillDensity.clickOkbutton();

                
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        
        skillDensity.verifyAddDisplay("Selenium/TestNG");
        
        
	    } 
	
	
	@Test (priority = 8, description="Verify that user should be able to add and save the skills")
	public void TC_Positive_Verify_thatUser_ShouldBe_ableTo_AddandSave_Skills() throws InterruptedException {
	
		BasicConfigurator.configure();
	    
		//ExtentReports Description
        ExtentTestManager.getTest().setDescription("Verify that user should be able to add and save the skills");
        
        //*************PAGE INSTANTIATIONS*************
        
        HomePageSkillDensity homePage = new HomePageSkillDensity(driver,wait);
        
        ReactSkillDensity skillDensity = new ReactSkillDensity(driver,wait);
 
        //*************PAGE METHODS********************
   
        homePage.goToSkillGigs();
        Thread.sleep(2000);
        
        //Fill the Information page
        skillDensity.deleteSkills();

        skillDensity.clickAddButton();
        skillDensity.addSkills("Selenium/TestNG");
        skillDensity.addPercentage("50");
        skillDensity.clickOkbutton();
        skillDensity.clickOnSave();

                
        //*************ASSERTIONS***********************
        Thread.sleep(2000);
        
        skillDensity.verifySaveSkills("Actions");        
        
	    } 
	
}