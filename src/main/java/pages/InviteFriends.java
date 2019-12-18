package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class InviteFriends extends BasePage{

    //*********Constructor*********
    public InviteFriends(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Web Elements*********
    String usenameId = "email";
    String passwordId = "pwd";
    String loginButtonId = "btnSubmit";
    String logoutButtonxpath = "/html/body/div[1]/div/div[1]/div[3]/div/div/div/div/a[4]";
    String logoutDrpdnid = "accountDesktop";
    String errorMessageUsernameXpath = "//*[@id=\"signinForm\"]/div/div/div/div/div[1]/span";
    String errorMessagePasswordXpath = "//*[@id=\"signinForm\"]/div/div/div/div/div[1]/span";
    String errorMessageEmptyUsernameXpath = "//*[@id=\"signinForm\"]/div/div/div/div/div[1]/span";
    String errorMessageEmptyPasswordXpath = "//*[@id=\"signinForm\"]/div/div/div/div/div[1]/span";
    String title = "SkillGigs - Gig Search";
    String inviteclick = "//*[@id=\"accountDesktop\"]/div/a[3]";
    String friendsnameId = "name";
    String friendsemailId = "email";
    String invitemessagexpath = "message";
    String invitesubmitxpath = "//*[@id=\"btnSubmit\"]";
    String errorfriendsnamexpath = "//*[@id=\"inviteForm\"]/div/div/div/div/form/div[1]/small/span/span";
    String errorfriendsemailxpath = "//*[@id=\"inviteForm\"]/div/div/div/div/form/div[2]/small/span/span";
    String errorfriendsmessagexpath = "//*[@id=\"inviteForm\"]/div/div/div/div/form/div[3]/small/span/span";
    String errorfriendsinvalidemail = "//*[@id=\"inviteForm\"]/div/div/div/div/form/div[2]/small/span/span";
    String errorfriendsnameless3 = "//*[@id=\"inviteForm\"]/div/div/div/div/form/div[1]/small/span/span";
    String invitesentmessagexpath = "/html/body/div[2]/div[1]/div/h1/strong";
    String talentid = "u665";
    //*********Page Methods*********

    public void loginToSkillGigs (String username, String password){
        //Enter Username
        writeText(By.name(usenameId),username);
        //Enter Password
        writeText(By.name(passwordId), password);
        //Click Login Button
        click(By.id(loginButtonId));
    }
    
public void NavigateToInviteFriends () throws InterruptedException {
        
        //Click Logout Button
    	Thread.sleep(5000);
        click(By.id(logoutDrpdnid));
        click(By.xpath(inviteclick));

    }

    
    public void logoutToSkillGigs () throws InterruptedException {
     
        //Click Logout Button
    	Thread.sleep(5000);
        click(By.id(logoutDrpdnid));
        click(By.xpath(logoutButtonxpath));
    }
    public void enterfriendsname (String fname) throws InterruptedException {
        writeText(By.id(friendsnameId),fname);


    }
    
    public void enterfriendsemail (String femail) throws InterruptedException {
        writeText(By.id(friendsemailId),femail);

    }
    public void enterfriendsmsg (String message) throws InterruptedException {
    	Thread.sleep(1000);
        writeText(By.id(invitemessagexpath),message);
      //  By hiddenObj = By.xpath("//*[@id='message' and @type='hidden']");


    }
    
    public void invitefriendbtn () throws InterruptedException {
    	Thread.sleep(2000);
    	
        click(By.xpath(invitesubmitxpath));


    }
    
    public void talentbtn () throws InterruptedException {
    	Thread.sleep(2000);
    	
        click(By.xpath(talentid));

    }
    //Verify Username and Password Condition
    public void verifyLoginUserNameAndPassword (String expectedText) {
    	AssertJUnit.assertEquals(title, "SkillGigs - Gig Search");
    }
    //Verify Username Condition
    public void verifyLoginUserName (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorMessageUsernameXpath)), expectedText);
    }

    //Verify Password Condition
    public void verifyLoginPassword (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorMessagePasswordXpath)), expectedText);
    }
    //Verify Empty Username Condition
    public void verifyEmptyUsername (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorMessageEmptyUsernameXpath)), expectedText);
    }   
   //Verify Empty Password Condition
    public void verifyEmptyPassword (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorMessageEmptyPasswordXpath)), expectedText);
}
    
  //Verify Empty Password Condition
    public void verifyEmptyfriendsname (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorfriendsnamexpath)), expectedText);
        
    }
  //Verify Empty Password Condition
    public void verifyEmptyfriendsemail (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorfriendsemailxpath)), expectedText);
    }
    
  //Verify Empty Password Condition
    public void verifyEmptyfriendsmessage (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorfriendsmessagexpath)), expectedText);
    }  
    //Verify Empty Password Condition
    public void verifyinviteinvalidemail (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorfriendsinvalidemail)), expectedText);
        
    }
    //Verify Empty Password Condition
    public void verifyfriendsnameless3 (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorfriendsnameless3)), expectedText);
    }
    //Verify Empty Password Condition
    public void verifyInviteSent (String expectedText) {
        Assert.assertEquals(readText(By.xpath(invitesentmessagexpath)), expectedText);
         
}
}