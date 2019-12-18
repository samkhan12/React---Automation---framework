package pages;


import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ReactPlaceBid extends BasePage{

    //*********Constructor*********
    public ReactPlaceBid(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Web Elements*********
    String usenamexpath = "//input[@data-auto='signInEmail']";
    String pwdxpath = "//input[@data-auto='signInPassword']";
    String Loginxpath = "//input[@data-auto='signInButton']";


  //React Place Bid 

    String employerxp = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div[1]/div/div/div[1]/input";
    String empgigxp = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div[2]/div/div/input";
    String gigselectxp = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div[2]";
    String initialbidxp = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div[3]/div/div/input";
    String sellgigxp = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div[5]/div/div[2]/div/div";
    String initialdatexp = "//*[@id=\"rangestart\"]";
    String desiredexp = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div[6]/div[2]/div/div";
    String selectmonthxp = "//*[@id=\"2\"]";

    String cancelxp = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div[7]/div[1]/div/a";
    String bidbtnxp = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div[7]/div[2]/div/button";
    String updatexp = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div[7]/div[2]/div/button";
    String retractxp = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div[7]/div[3]/div/button";
    String errorxp = "//*[@id=\"myPlaceBidError\"]/div/ul/li";
    String clickcancel = "//*[@id=\"site-content\"]/div[2]/div/div[4]/div[4]/div/div/p/a";
    String selectemp = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div[1]/div/div/div[2]/div[5]/div[2]/div";
    String selectgigs = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div[2]/div/div/div[2]/div";
    String placedbid = "//*[@id=\"site-content\"]/div[2]/div/div[4]/div[4]/div/div/p/a";
    String clickonpage = "/html/body/div[2]/div/div[2]/div/div/div/div/div/div/form/div[6]/div[1]/label";
    
  //******React Place Bid Page Methods*******
    
    
    public void selectEmployer (String emp) throws InterruptedException{
     


         Thread.sleep(1000);
         writeText(By.xpath(employerxp),emp);
        
         Thread.sleep(2000);
         click(By.xpath(selectemp));
    }
    
    
    public void selectgig (String gig) throws InterruptedException{
    
    	
    	
 
    	
   	    Thread.sleep(2000);
        click(By.xpath(empgigxp));

    	Thread.sleep(2000);
    	writeText(By.xpath(empgigxp),gig);
    	
    	Thread.sleep(5000);
        click(By.xpath(selectgigs)); 
    }
    
    public void addIntialbid (String initialbid) throws InterruptedException{

    	writeText(By.xpath(initialbidxp),initialbid);
    }
    
    public void addIdealdate () throws InterruptedException{

       Thread.sleep(5000);
       click(By.xpath(initialdatexp));
        
        Thread.sleep(10000);
        driver.findElement(By.xpath(initialdatexp)).sendKeys("04102018");        
        Thread.sleep(2000);
        click(By.xpath(clickonpage));

        
        System.out.println("pass");
    	
    	
    	
    /*	Actions actionObject = new Actions(driver);
    	actionObject = actionObject.sendKeys(Keys.ARROW_DOWN); 
    	actionObject.perform(); 
    	actionObject = actionObject.sendKeys(Keys.ENTER); 
    	actionObject.perform(); */
    	
   
    }
    

    
    public void addsellGig () throws InterruptedException{
    	
    	Thread.sleep(5000);
    	String inputText = "Rozmeen";
    	WebElement myElement = driver.findElement(By.xpath(sellgigxp));
    	String js = "arguments[0].setAttribute('value','"+inputText+"')";
    	((JavascriptExecutor) driver).executeScript(js, myElement);
        myElement.sendKeys("Required");
    	
    //	Thread.sleep(5000);
   // 	click(By.xpath(sellgigxp));

    //	Thread.sleep(2000);
    //	writeText(By.xpath(sellgigxp),sellgig);
    }
    
    
    public void desiredContract () throws InterruptedException{

    	Thread.sleep(2000);
    	click(By.xpath(desiredexp));
    	Thread.sleep(2000);
        click(By.xpath(selectmonthxp));
    }
    
    public void clickBid() throws InterruptedException{

        click(By.xpath(bidbtnxp));
    }
    
    public void clickUpdate() throws InterruptedException{

        click(By.xpath(updatexp));
    }
    
    public void clickRetract() throws InterruptedException{

        click(By.xpath(retractxp));
    }
    
    public void clickCancel() throws InterruptedException{

        click(By.xpath(cancelxp));
    }
    
    
    //****React Forgot Password Verification Method******

   public void verifyEmptyField (String expectedText) {
       Assert.assertEquals(readText(By.xpath(errorxp)), expectedText);
   }


   public void verifyCancel (String expectedText) {
       Assert.assertEquals(readText(By.xpath(clickcancel)), expectedText);
   }
   
   public void verifyPlacedBid (String expectedText) {
       Assert.assertEquals(readText(By.xpath(placedbid)), expectedText);
   }
   
 }
    

    
    
   

    
    
