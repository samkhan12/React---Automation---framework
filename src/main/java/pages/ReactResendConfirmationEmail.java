package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ReactResendConfirmationEmail extends BasePage{

    //*********Constructor*********
    public ReactResendConfirmationEmail(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********React Forgot Password Page Web Elements*********
   
    String emailid = "resendEmailInput";
    String emptyemailerror = "//*[@id=\"site-content\"]/div/div/div/div/form/div/span";
    String invalidemailerror = "//*[@id=\"site-content\"]/div/div/div/div/form/div/span";
    String successmessage = "//*[@id=\"site-content\"]/div/div/div/div/form/div/span";	
    String resetbtn = "//*[@id=\"site-content\"]/div/div/div/div/form/button/span[1]";

      

    //******React Forgot Password Page Methods*******
      
    public void emaildata (String email) throws InterruptedException{
      
        writeText(By.id(emailid),email);
    
    }
    
    public void emaildataRefresh() throws InterruptedException{

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
        Assert.assertEquals(readText(By.xpath(successmessage)), expectedText);
    }
    
    /*public void verifyEmptEmail(String expectedText) {
    	AssertJUnit.assertEquals(title, "Verify Your Email");
    }*/
    

}    
        

