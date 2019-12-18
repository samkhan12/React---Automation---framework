package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.T3DResumePage;
import utils.ExtentReports.ExtentTestManager;


public class Edit3DResume extends BaseTest {
	
	

    // Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    //    Homepage homepage = new HomePage(driver,wait);
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class.
	

    @Test (priority = 0, description="TC_Negative Verify the user with Invalid Username and Invalid Password.")
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
       // homePage.goToLoginPage();

        //Login to SkillGigs
        loginPage.loginToSkillGigs("khansamuel67@gmail.com", "1234567");

        //*************ASSERTIONS***********************
        Thread.sleep(500);
        loginPage.verifyLoginUserNameAndPassword(("Account does not exist"));
    }

    @Test (priority = 1, description="TC_Negative Verify the user with Empty Username and Empty Password.")
    public void TC_Negative_Verify_EmptyUser_EmptyPassword () throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("TC_Negative Verify the user with Empty Username and Empty Password.");

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
        LoginPage loginPage = new LoginPage(driver,wait);

        //*************PAGE METHODS********************
        homePage.goToSkillGigs();
     //   homePage.goToLoginPage();
        loginPage.loginToSkillGigs("","");

        //*************ASSERTIONS***********************
        Thread.sleep(500);
      //  loginPage.verifyLoginUserName("Incorrect username/password.");
      //  loginPage.verifyLoginPassword("Incorrect username/password.");
        loginPage.verifyEmptyUsername("Please enter in your credentials");
        loginPage.verifyEmptyPassword("Please enter in your credentials");

    }
    
    @Test (priority = 2, description="TC_Negative Verify the user with Empty Username and Password.")
    public void TC_Negative_Verify_EmptyUserName_Password () throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("TC_Negative Verify the user with Empty Username and Password.");

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
        LoginPage loginPage = new LoginPage(driver,wait);

        //*************PAGE METHODS********************
        homePage.goToSkillGigs();
      //  homePage.goToLoginPage();
        loginPage.loginToSkillGigs("","1234568");

        //*************ASSERTIONS***********************
        Thread.sleep(500);
      //  loginPage.verifyLoginUserName("Incorrect username/password.");
      //  loginPage.verifyLoginPassword("Incorrect username/password.");
        loginPage.verifyEmptyUsername("Please enter in your credentials");
        loginPage.verifyEmptyPassword("Please enter in your credentials");

    }

    @Test (priority = 3, description="TC_Negative Verify the user with Username and Empty password.")
    public void TC_Negative_Verify_UserName_EmptyPassword () throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("TC_Negative Verify the user with Username and Empty password.");

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
        LoginPage loginPage = new LoginPage(driver,wait);

        //*************PAGE METHODS********************
        homePage.goToSkillGigs();
     //   homePage.goToLoginPage();
        loginPage.loginToSkillGigs("khansamuel678@gmail.com","");

        //*************ASSERTIONS***********************
        Thread.sleep(500);
      //  loginPage.verifyLoginUserName("Incorrect username/password.");
      //  loginPage.verifyLoginPassword("Incorrect username/password.");
        loginPage.verifyEmptyUsername("Please enter in your credentials");
        loginPage.verifyEmptyPassword("Please enter in your credentials");

    }
    
    @Test (priority = 4, description="TC_Positive Verify the user with Valid Username and Valid Password.")
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
    //    homePage.goToLoginPage();

        //Login to SkillGigs
        loginPage.loginToSkillGigs("khansamuel678@gmail.com", "12345678");
        loginPage.logoutToSkillGigs();
        //*************ASSERTIONS***********************
        Thread.sleep(500);
        loginPage.verifyLoginUserNameAndPassword("SkillGigs - Gig Search");
    }
    
    @Test (priority = 5, description="TC_Positive Verify the user able to click on Start button and reach to 3DResume edit page")
    public void TC_Positive_Verify_theUserableto_ClickOn_Startbutton_reachto_3DresumePage () throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("TC_Positive Verify the user able to click on Start button and reach to 3DResume edit page");

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
        LoginPage loginPage = new LoginPage(driver,wait);
        T3DResumePage ResumePage = new T3DResumePage(driver,wait);

        //*************PAGE METHODS********************
        homePage.goToSkillGigs();
     //   homePage.goToLoginPage();
        loginPage.loginToSkillGigs("khansamuel678@gmail.com", "12345678");
        //*************ASSERTIONS***********************
        
        ResumePage.NavigateToResume();
        //*************ASSERTIONS***********************
    
        ResumePage.ResumeStart();
        driver.navigate().back();
        driver.navigate().back();
         
        loginPage.logoutToSkillGigs();

        Thread.sleep(500);
        ResumePage.verifyEditResumePage("SkillGigs - Talent - Resume");

        
    }
    


@Test (priority = 6, description="TC_Positive Verify the user able to click on Edit button and reach to 3DResume edit page")
public void TC_Positive_Verify_theUserableto_ClickOnEdit_buttonreachto_3DresumePage () throws InterruptedException {
    //ExtentReports Description
    ExtentTestManager.getTest().setDescription("TC_Positive Verify the user able to click on Edit button and reach to 3DResume edit page");

    //*************PAGE INSTANTIATIONS*************
    HomePage homePage = new HomePage(driver,wait);
    LoginPage loginPage = new LoginPage(driver,wait);
    T3DResumePage ResumePage = new T3DResumePage(driver,wait);

    //*************PAGE METHODS********************
  //*************PAGE METHODS********************
    homePage.goToSkillGigs();
 //   homePage.goToLoginPage();
    loginPage.loginToSkillGigs("khansamuel678@gmail.com", "12345678");
    //*************ASSERTIONS***********************
    
    ResumePage.NavigateToResume();
    //*************ASSERTIONS***********************
    Thread.sleep(500);
    ResumePage.ResumeStart();
    ResumePage.Editbtnclick();
    driver.navigate().back();
    driver.navigate().back();
    driver.navigate().back();
    loginPage.logoutToSkillGigs();
    
    Thread.sleep(500);
    ResumePage.verify3DEditResumePage("SkillGigs - Talent - Resume - About Me");
    

  
}

@Test (priority = 7, description="TC_Positive Verify the user able to input text in alphatical value in Preferred Name and TagLine")
public void TC_Positive_Verify_theUserableto_inputText_inalphabeticalValue_inPreferredName_andTagLine () throws InterruptedException {
    //ExtentReports Description
    ExtentTestManager.getTest().setDescription("TC_Positive Verify the user able to input text in alphatical value in Preferred Name and TagLine");

    //*************PAGE INSTANTIATIONS*************
    HomePage homePage = new HomePage(driver,wait);
    LoginPage loginPage = new LoginPage(driver,wait);
    T3DResumePage ResumePage = new T3DResumePage(driver,wait);

    //*************PAGE METHODS********************
  //*************PAGE METHODS********************
    homePage.goToSkillGigs();
//    homePage.goToLoginPage();
    loginPage.loginToSkillGigs("khansamuel678@gmail.com", "12345678");
    //*************ASSERTIONS***********************
    
    ResumePage.NavigateToResume();
    //*************ASSERTIONS***********************
    Thread.sleep(500);
    ResumePage.ResumeStart();
    ResumePage.Editbtnclick();
    
    driver.findElement(By.id("preferredName")).clear();
    ResumePage.Preferredname("Mohd Salman");
    driver.findElement(By.id("preferredName")).clear();
    ResumePage.Tagline("I am QA-Test Engineer");
    ResumePage.SaveBtnClick();

  driver.navigate().back();
  driver.navigate().back();
  driver.navigate().back();
  loginPage.logoutToSkillGigs();
    
    Thread.sleep(500);
    ResumePage.verify3DEditResumePage("SkillGigs - Talent - Resume - About Me");

}


@Test (priority = 8, description="TC_Negative Verify that error is displayed when Preferred Name and TagLine field have Numeric Value")
public void TC_Negative_Verify_theError_isDisplayed_WhenPreferredName_andTagLine_isNumeric () throws InterruptedException {
    //ExtentReports Description
    ExtentTestManager.getTest().setDescription("TC_Negative Verify that error is displayed when Preferred Name and TagLine field have Numeric Value");

    //*************PAGE INSTANTIATIONS*************
    HomePage homePage = new HomePage(driver,wait);
    LoginPage loginPage = new LoginPage(driver,wait);
    T3DResumePage ResumePage = new T3DResumePage(driver,wait);

  //*************PAGE METHODS********************
    homePage.goToSkillGigs();
//    homePage.goToLoginPage();
    loginPage.loginToSkillGigs("khansamuel678@gmail.com", "12345678");
    //*************ASSERTIONS***********************
    
    ResumePage.NavigateToResume();
    //*************ASSERTIONS***********************
    Thread.sleep(500);
    ResumePage.ResumeStart();
    ResumePage.Editbtnclick();

    driver.findElement(By.id("preferredName")).clear();
    ResumePage.Preferredname("12345678");
    
    driver.findElement(By.id("tagLine")).clear();
    ResumePage.Tagline("1111111");
    
    ResumePage.SaveBtnClick();


    ResumePage.VerifyErroronNumeric("Please use letters and the following characters: . @ , - _ & ( ) /");
  //  ResumePage.VerifyValidationSavebtnError("Please fill out the form correctly");
    driver.navigate().back();
    driver.navigate().back();
    driver.navigate().back();
    loginPage.logoutToSkillGigs();

    
}
@Test (priority = 9, description="TC_Negative Verify that error is displayed when Preferred Name and TagLine field is left blank.")
public void TC_Negative_Verify_theError_isDisplayed_WhenPreferredName_andTagLine_isEmpty () throws InterruptedException {
    //ExtentReports Description
    ExtentTestManager.getTest().setDescription("TC_Negative Verify that error is displayed when Preferred Name and TagLine field is left blank.");

    //*************PAGE INSTANTIATIONS*************
    HomePage homePage = new HomePage(driver,wait);
    LoginPage loginPage = new LoginPage(driver,wait);
    T3DResumePage ResumePage = new T3DResumePage(driver,wait);

  //*************PAGE METHODS********************
    homePage.goToSkillGigs();
  //  homePage.goToLoginPage();
    loginPage.loginToSkillGigs("khansamuel678@gmail.com", "12345678");
    //*************ASSERTIONS***********************
    
    ResumePage.NavigateToResume();
    //*************ASSERTIONS***********************
    Thread.sleep(500);
    ResumePage.ResumeStart();
    ResumePage.Editbtnclick();

    driver.findElement(By.id("preferredName")).clear();
    ResumePage.Preferredname("");
    driver.findElement(By.id("tagLine")).clear();
    ResumePage.Tagline("");
    ResumePage.SaveBtnClick();

    Thread.sleep(500);
    ResumePage.VerifyErrorOnFieldEmpty("This field is required.");

    driver.navigate().back();
    driver.navigate().back();
    driver.navigate().back();
    loginPage.logoutToSkillGigs();


    
}

@Test (priority = 10, description="TC_Positive Verify the user able to input text value in max-length is 42")
public void TC_Positive_Verify_theUserableto_TextValue_inMaxlength_42 () throws InterruptedException {
    //ExtentReports Description
    ExtentTestManager.getTest().setDescription("TC_Positive Verify the user able to input text value in max-length is 42");

    //*************PAGE INSTANTIATIONS*************
    HomePage homePage = new HomePage(driver,wait);
    LoginPage loginPage = new LoginPage(driver,wait);
    T3DResumePage ResumePage = new T3DResumePage(driver,wait);

  //*************PAGE METHODS********************
    homePage.goToSkillGigs();
//    homePage.goToLoginPage();
    loginPage.loginToSkillGigs("khansamuel678@gmail.com", "12345678");
    //*************ASSERTIONS***********************
    
    ResumePage.NavigateToResume();
    //*************ASSERTIONS***********************
    Thread.sleep(500);
    loginPage.verifyLoginUserNameAndPassword("SkillGigs - Gig Search");
    ResumePage.ResumeStart();
    ResumePage.Editbtnclick();
   
    driver.findElement(By.id("preferredName")).clear();
    ResumePage.Preferredname("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
 
    ResumePage.verifyAlphaLength("(0 characters remaining)");
    
    driver.navigate().back();
    driver.navigate().back();
    driver.navigate().back();
    loginPage.logoutToSkillGigs();

}

@Test (priority = 11, description="TC_Positive Verify the user able to input text in alphatical value and Numeric value in TagLine")
public void TC_Positive_Verify_theUserableto_TextValue_inAlphabetical_andNumericValue_inTagline () throws InterruptedException {
    //ExtentReports Description
    ExtentTestManager.getTest().setDescription("TC_Positive Verify the user able to input text in alphatical value and Numeric value in TagLine");

    //*************PAGE INSTANTIATIONS*************
    HomePage homePage = new HomePage(driver,wait);
    LoginPage loginPage = new LoginPage(driver,wait);
    T3DResumePage ResumePage = new T3DResumePage(driver,wait);

  //*************PAGE METHODS********************
    homePage.goToSkillGigs();
//    homePage.goToLoginPage();
    loginPage.loginToSkillGigs("khansamuel678@gmail.com", "12345678");
    //*************ASSERTIONS***********************
    
    ResumePage.NavigateToResume();
    

    //*************ASSERTIONS***********************
    Thread.sleep(500);
    ResumePage.ResumeStart();
    ResumePage.Editbtnclick();
   
    ResumePage.Preferredname("Mohd Salman");
    ResumePage.Tagline("I am QA-Test Engineer and have 3years of exp");
    ResumePage.SaveBtnClick();

    ResumePage.verify3DEditResumePage("SkillGigs - Talent - Resume - About Me");
    driver.navigate().back();
    driver.navigate().back();
    driver.navigate().back();
    driver.navigate().back();
    loginPage.logoutToSkillGigs();
    
}



@Test (priority = 12, description="TC_Positive Verify the user able to Save Preferred Name and TagLine onclick save button")
public void TC_Positive_Verify_theUserableto_Save_Preferred_andTagLine_onclickSaveButton () throws InterruptedException {
    //ExtentReports Description
    ExtentTestManager.getTest().setDescription("TC_Positive Verify the user able to Save Preferred Name and TagLine onclick save button");

    //*************PAGE INSTANTIATIONS*************
    HomePage homePage = new HomePage(driver,wait);
    LoginPage loginPage = new LoginPage(driver,wait);
    T3DResumePage ResumePage = new T3DResumePage(driver,wait);

    //*************PAGE METHODS********************
    homePage.goToSkillGigs();
 //   homePage.goToLoginPage();
    loginPage.loginToSkillGigs("khansamuel678@gmail.com", "12345678");
    //*************ASSERTIONS***********************
 
    loginPage.logoutToSkillGigs();
    //*************ASSERTIONS***********************
    Thread.sleep(500);
    loginPage.verifyLoginUserNameAndPassword("SkillGigs - Gig Search");
    ResumePage.ResumeStart();
    ResumePage.Editbtnclick();

    ResumePage.Preferredname("Mohd Salman");
    ResumePage.Tagline("I am QA-Test Engineer");
    ResumePage.SaveBtnClick();
    
    Thread.sleep(500);
    ResumePage.verify3DEditResumePage("SkillGigs - Talent - Resume - About Me");


    
}
}