package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class LoginPage extends BasePage{

    //*********Constructor*********
    public LoginPage(WebDriver driver, WebDriverWait wait) {
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
    
    //*********Page Methods*********

    public void loginToSkillGigs (String username, String password){
        //Enter Username
        writeText(By.name(usenameId),username);
        //Enter Password
        writeText(By.name(passwordId), password);
        //Click Login Button
        click(By.id(loginButtonId));
    }
    
    public void logoutToSkillGigs () throws InterruptedException {
     
        //Click Logout Button
    	Thread.sleep(5000);
        click(By.id(logoutDrpdnid));
        click(By.xpath(logoutButtonxpath));
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
}