package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ReactForgotPassword extends BasePage{

    //*********Constructor*********
    public ReactForgotPassword(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********React Forgot Password Page Web Elements*********
   
    String emailid = "forgetPwdInput";
    String emptyemailerror = "//*[@id=\"site-content\"]/div/div/div/div/form/div/span";
    String invalidemailerror = "//*[@id=\"site-content\"]/div/div/div/div/form/div/span";
    String successmessageid = "forgetPwdSuccess";
    String resetbtn = "//*[@id=\"site-content\"]/div/div/div/div/form/button/span[1]";

      

    //******React Forgot Password Page Methods*******
      
    public void forgotPasswordData (String email) throws InterruptedException{
      
        writeText(By.id(emailid),email);
    
    }
    
    public void forgotPasswordRefresh() throws InterruptedException{

      driver.findElement(By.id(emailid)).clear();
   
    }
    
    public void clickBtn() {
        
        click(By.xpath(resetbtn));
        
    }
    
    //****React Forgot Password Page Verification Methods******
    
    
    public void verifyInvalidEmail (String expectedText) {
        Assert.assertEquals(readText(By.xpath(invalidemailerror)), expectedText);
    }
    
    public void verifyEmptyEmail (String expectedText) {
        Assert.assertEquals(readText(By.xpath(emptyemailerror)), expectedText);
    }
    
    public void verifySuccessEmail (String expectedText) {
        Assert.assertEquals(readText(By.id(successmessageid)), expectedText);
    }
    
    /*public void verifyEmptEmail(String expectedText) {
    	AssertJUnit.assertEquals(title, "Verify Your Email");
    }*/
    

}    
        

