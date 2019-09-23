package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.ExtentReports.ExtentTestManager;


public class LoginTests extends BaseTest {
	
	

    // Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    //    Homepage homepage = new HomePage(driver,wait);
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class.
	
	@Test (priority = 0, description="TC_Positive Verify the user with Valid Username and Valid Password.")
    public void TC_Positive_Verify_ValidUserName_ValidPassword () throws InterruptedException {
	
        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("TC_Positive Verify the user with Valid Username and Valid Password.");

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
        LoginPage loginPage = new LoginPage(driver,wait);

        //*************PAGE METHODS********************
        //Open SkillGigs HomePage
        homePage.goToSkillGigs();

        //Go to LoginPage
   //     homePage.goToLoginPage();

        //Login to SkillGigs
        loginPage.loginToSkillGigs("khansamuel678@gmail.com", "12345678");
        loginPage.logoutToSkillGigs();
        //*************ASSERTIONS***********************
        Thread.sleep(500);
        loginPage.verifyLoginUserNameAndPassword("SkillGigs - Gig Search");
    }

    @Test (priority = 1, description="TC_Negative Verify the user with Invalid Username and Invalid Password.")
    public void TC_Negative_Verify_InvalidUserName_InvalidPassword () throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("TC_Negative Verify the user with Invalid Username and Invalid Password.");

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
        LoginPage loginPage = new LoginPage(driver,wait);

        //*************PAGE METHODS********************
        //Open SkillGigs HomePage
        homePage.goToSkillGigs();

        //Go to LoginPage
   //     homePage.goToLoginPage();

        //Login to SkillGigs
        loginPage.loginToSkillGigs("khansamuel67@gmail.com", "1234567");

        //*************ASSERTIONS***********************
        Thread.sleep(500);
        loginPage.verifyLoginUserNameAndPassword(("Account does not exist"));
    }

    @Test (priority = 2, description="TC_Negative Verify the user with Empty Username and Empty Password.")
    public void TC_Negative_Verify_EmptyUser_EmptyPassword () throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("TC_Negative Verify the user with Empty Username and Empty Password.");

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
        LoginPage loginPage = new LoginPage(driver,wait);

        //*************PAGE METHODS********************
        homePage.goToSkillGigs();
  //      homePage.goToLoginPage();
        loginPage.loginToSkillGigs("","");

        //*************ASSERTIONS***********************
        Thread.sleep(500);
      //  loginPage.verifyLoginUserName("Incorrect username/password.");
      //  loginPage.verifyLoginPassword("Incorrect username/password.");
        loginPage.verifyEmptyUsername("Please enter in your credentials");
        loginPage.verifyEmptyPassword("Please enter in your credentials");

    }
    
    @Test (priority = 3, description="TC_Negative Verify the user with Empty Username and Password.")
    public void TC_Negative_Verify_EmptyUserName_Password () throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("TC_Negative Verify the user with Empty Username and Password.");

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
        LoginPage loginPage = new LoginPage(driver,wait);

        //*************PAGE METHODS********************
        homePage.goToSkillGigs();
   //     homePage.goToLoginPage();
        loginPage.loginToSkillGigs("","1234568");

        //*************ASSERTIONS***********************
        Thread.sleep(500);
      //  loginPage.verifyLoginUserName("Incorrect username/password.");
      //  loginPage.verifyLoginPassword("Incorrect username/password.");
        loginPage.verifyEmptyUsername("Please enter in your credentials");
        loginPage.verifyEmptyPassword("Please enter in your credentials");

    }

    @Test (priority = 4, description="TC_Negative Verify the user with Username and Empty password.")
    public void TC_Negative_Verify_UserName_EmptyPassword () throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("TC_Negative Verify the user with Username and Empty password.");

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
        LoginPage loginPage = new LoginPage(driver,wait);

        //*************PAGE METHODS********************
        homePage.goToSkillGigs();
    //    homePage.goToLoginPage();
        loginPage.loginToSkillGigs("khansamuel678@gmail.com","");

        //*************ASSERTIONS***********************
        Thread.sleep(500);
      //  loginPage.verifyLoginUserName("Incorrect username/password.");
      //  loginPage.verifyLoginPassword("Incorrect username/password.");
        loginPage.verifyEmptyUsername("Please enter in your credentials");
        loginPage.verifyEmptyPassword("Please enter in your credentials");

    }


}
