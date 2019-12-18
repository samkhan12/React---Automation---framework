package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.InviteFriends;
import pages.LoginPage;
import utils.ExtentReports.ExtentTestManager;


public class InviteFriendsTest extends BaseTest {
	
	

    // Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    // 3) super()method in page class transfer the driver and wait variables values to the BasePage class.

    @Test (priority = 0, description="TC_Negative Verify that user is shown an error message when Name is not entered.")
    public void TC_Negative_Verify_thatUser_isShownErrorMessage_WhenName_isNotEntered () throws InterruptedException {
    	
        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("TC_Negative Verify that user is shown an error message when Name is not entered.");

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
        LoginPage loginPage = new LoginPage(driver,wait);
        InviteFriends invitePage = new InviteFriends(driver,wait);

        //*************PAGE METHODS********************
        //Open SkillGigs HomePage
        homePage.goToSkillGigs();
     //   homePage.goToLoginPage();
      
        //Login to SkillGigs
        loginPage.loginToSkillGigs("test@sgindia.com", "12345678");
        invitePage.NavigateToInviteFriends();
       // invitePage.NavigateToInviteFriends();
        invitePage.enterfriendsname("");
        invitePage.enterfriendsemail("sroye@iqtechpros.com");
        invitePage.enterfriendsmsg("Hi");
        invitePage.invitefriendbtn();
        driver.navigate().back();
        invitePage.logoutToSkillGigs();
        //*************ASSERTIONS***********************
        Thread.sleep(500);
        invitePage.verifyEmptyfriendsname(("This field is required."));
    }

    @Test (priority = 1, description="TC_Negative Verify that user is shown an error message when Email is not entered.")
    public void TC_Negative_thatUser_isShownanErrorMessage_whenEmailisNot_Entered() throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("TC_Negative Verify that user is shown an error message when Email is not entered.");

        //*************PAGE INSTANTIATIONS*************
        InviteFriends invitePage = new InviteFriends(driver,wait);
        HomePage homePage = new HomePage(driver,wait);
        LoginPage loginPage = new LoginPage(driver,wait);

        homePage.goToSkillGigs();
     //   homePage.goToLoginPage();

        
        //Login to SkillGigs
        loginPage.loginToSkillGigs("test@sgindia.com", "12345678");
        invitePage.NavigateToInviteFriends();

 
        invitePage.enterfriendsname("Mohd Salman");
        invitePage.enterfriendsemail("");
        invitePage.enterfriendsmsg("Hi");

        invitePage.invitefriendbtn();
        driver.navigate().back();
        invitePage.logoutToSkillGigs();
        //*************ASSERTIONS***********************
        Thread.sleep(500);
        invitePage.verifyEmptyfriendsemail("This field is required.");

    }
    
    @Test (priority = 2, description="TC_Negative Verify that user is shown an error message when Message is not entered.")
    public void TC_Negative_Verify_thatuserIs_ShownanError_whenMessageis_notEntered () throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("TC_Negative Verify that user is shown an error message when Message is not entered.");

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver,wait);
        InviteFriends invitePage = new InviteFriends(driver,wait);

        homePage.goToSkillGigs();


        invitePage.enterfriendsname("Mohd Salman");
        invitePage.enterfriendsemail("sroye@iqtechpros.com");
        invitePage.enterfriendsmsg("");
        invitePage.invitefriendbtn();

        //*************ASSERTIONS***********************
        Thread.sleep(500);
        invitePage.verifyEmptyfriendsmessage("This field is required.");

    }

    @Test (priority = 3, description="TC_Negative Verify that an error message is displayed when user enters invalid Email format.")
    public void TC_Negative_Verify_that_anErrorMessage_isDisplayedWhen_userEnterInvalid_Emailformat () throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("TC_Negative Verify that an error message is displayed when user enters invalid Email format.");

        //*************PAGE INSTANTIATIONS*************
      
        HomePage homePage = new HomePage(driver,wait);
        InviteFriends invitePage = new InviteFriends(driver,wait);

        homePage.goToSkillGigs();

        //*************PAGE METHODS********************
      
        invitePage.enterfriendsname("Mohd Salman");
        invitePage.enterfriendsemail("foo@baz..com");
        invitePage.enterfriendsmsg("Hi");
        invitePage.invitefriendbtn();
        //*************ASSERTIONS***********************
        Thread.sleep(500);
        invitePage.verifyinviteinvalidemail("Please enter a proper email address.");


    }
    @Test (priority = 4, description="TC_Negative Verify that an error is shown when user enters less than 3 characters in Name field.")
    public void TC_Negatie_thatanError_IsShownWhen_userEnter_lessThan3Character_inNameField () throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("TC_Negative Verify that an error is shown when user enters less than 3 characters in Name field.");

        //*************PAGE INSTANTIATIONS*************
    
        HomePage homePage = new HomePage(driver,wait);
        InviteFriends invitePage = new InviteFriends(driver,wait);

        homePage.goToSkillGigs();

        //*************PAGE METHODS********************


       // invitePage.NavigateToInviteFriends();
        invitePage.enterfriendsname("Mo");
        invitePage.enterfriendsemail("foo@baz..com");
        invitePage.enterfriendsmsg("Hi");
        invitePage.invitefriendbtn();

        //*************ASSERTIONS***********************
        Thread.sleep(500);
      invitePage.verifyfriendsnameless3("Please use letters and the following characters: . @ , - _ & ( ) /");
     

    }
    @Test (priority = 5, description="TC_Negative Verify that an error is shown when user enters numerals in Name field.")
    public void TC_Negate_Verify_thatanError_isShownWhen_userEntersNumerals_inNameField () throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("TC_Negative Verify that an error is shown when user enters numerals in Name field.");

        //*************PAGE INSTANTIATIONS*************
   
        HomePage homePage = new HomePage(driver,wait);
        InviteFriends invitePage = new InviteFriends(driver,wait);

        homePage.goToSkillGigs();

        //*************PAGE METHODS********************


       // invitePage.NavigateToInviteFriends();
        invitePage.enterfriendsname("12345678");
        invitePage.enterfriendsemail("foo@baz..com");
        invitePage.enterfriendsmsg("Hi");
        invitePage.invitefriendbtn();

        //*************ASSERTIONS***********************
        Thread.sleep(500);
   
        invitePage.verifyfriendsnameless3("Please use letters and the following characters: . @ , - _ & ( ) /");


    }
    
	@Test (priority = 6, description="TC_Positive Verify that user is able to send an invite to valid Email address.")
    public void TC_Positive_Verify_thatUser_AbletoSend_InviteEmail () throws InterruptedException {
	
        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("TC_Positive Verify that user is able to send an invite to valid Email address.");

        //*************PAGE INSTANTIATIONS*************
   
        HomePage homePage = new HomePage(driver,wait);
        InviteFriends invitePage = new InviteFriends(driver,wait);

        homePage.goToSkillGigs();
        //*************PAGE METHODS********************
   

       // invitePage.NavigateToInviteFriends();
        invitePage.enterfriendsname("Mohd Salman");
        invitePage.enterfriendsemail("samueledrisi007@gmail.com");
        invitePage.enterfriendsmsg("Hi");
        invitePage.invitefriendbtn();

        //*************ASSERTIONS***********************
        Thread.sleep(500);
        invitePage.verifyInviteSent("Invite Sent");
    }


}

