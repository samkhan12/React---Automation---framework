package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ReactGigWizardPermanent extends BasePage{

    //*********Constructor*********
    public ReactGigWizardPermanent(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Web Elements*********
    String usenamexpath = "//input[@data-auto='signInEmail']";
    String pwdxpath = "//input[@data-auto='signInPassword']";
    String Loginxpath = "//input[@data-auto='signInButton']";


  //React Gig Wizard 
    String permanentbutton = "//*[@id=\"site-content\"]/div/div/div/div/div/div/form/div/div/div[1]";
    String gigtitleid = "txtTitle";
    String giglocationxpath = "//*[@id=\"site-content\"]/div/div/div[2]/div/div/form/div[2]/div/div[1]/input";
    String workauthxpath = "//*[@id=\"site-content\"]/div/div/div[2]/div/div/form/div[3]/div[1]/div/div";
    String workselectxpath = "//*[@id=\"7\"]";
    String minbudgetid = "txtPermanentSalaryMin";
    String maxbudgetid = "txtPermanentSalaryMax";
    String nextbutton = "//*[@id=\"site-content\"]/div/div/div[2]/div/div/form/div[4]/button";
    
    String emptyfielderror = "//*[@id=\"gigCreateError\"]/div/ul/li";
    String numericerror = "//*[@id=\"gigCreateError\"]/div/ul/li";
    String minmaxerror = "//*[@id=\"gigCreateError\"]/div/ul/li";
    String addReqskillxpath = "//*[@id=\"site-content\"]/div/div/div[2]/div/div[2]/form/div[1]/div/div/div[1]/div[1]";
  
    String addDesiredskillxpath = "//*[@id=\"react-select-3-input\"]";
    String gigDescxpath = "//*[@id=\"site-content\"]/div/div/div[2]/div/div[2]/form/div[3]/div/div/div[2]/div/div";
    
    String desiredExpxpath = "//*[@id=\"site-content\"]/div/div/div[2]/div/div[2]/form/div[4]/div/div";
    String nextButtonxpath = "//*[@id=\"site-content\"]/div/div/div[2]/div/div[2]/form/div[5]/button[2]";
    
    String giglocationplace = "//*[@id=\"site-content\"]/div/div/div[2]/div/div/form/div[2]/div/div[2]/div/div";
    String workauthCityid = "7";
    String titlexpath = "//*[@id=\"site-content\"]/div/div/div[2]/div/div[2]/h3/div/div";
    String reqclick = "//*[@id=\"react-select-2-input\"]";
    String secondpage = "//*[@id=\"site-content\"]/div/div/div[1]/div/div/div/div/a[2]";
    String addDessskillxpath  = "//*[@id=\"site-content\"]/div/div/div[2]/div/div[2]/form/div[2]/div/div/div[1]/div[1]";
    String Desiredyears = "//*[@id=\"2\"]/span";
    String Succeslogin = "//*[@id=\"site-content\"]/div/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]";
    
    //******React Gig Wizard Page Methods*******
    
    public void goToPermanent () throws InterruptedException{
        
        click(By.xpath(permanentbutton));
    }
    public void gigtitle (String gigtitle) throws InterruptedException{
        
        writeText(By.id(gigtitleid),gigtitle);
    }
    
    public void giglocation (String gigloc) throws InterruptedException{
            
    	    Thread.sleep(2000);
            writeText(By.xpath(giglocationxpath),gigloc);
            Thread.sleep(2000);
            click(By.xpath(giglocationplace));

    	
    }
    
    public void workauth() throws InterruptedException{

    
	    Thread.sleep(2000);
        click(By.xpath(workauthxpath));
        click(By.id(workauthCityid));
        
    }
    
    public void budgetrange (String minbudgetrange, String maxbudgetrange) throws InterruptedException{
        
        writeText(By.id(minbudgetid),minbudgetrange);
        writeText(By.id(maxbudgetid),maxbudgetrange);

    }
    
    public void nextbutton () throws InterruptedException{
        
    	Thread.sleep(2000);
        click(By.xpath(nextbutton));
    }
    
    public void reqskills (String req) throws InterruptedException{
    
        
    	Thread.sleep(2000);
    	click(By.xpath(addReqskillxpath));
        Thread.sleep(2000);
        writeText(By.xpath(reqclick),req);
        Thread.sleep(2000);
        click(By.xpath(reqclick));
        driver.findElement(By.xpath(reqclick)).sendKeys(Keys.ENTER);

        
      }
    
    public void desskills (String desired) throws InterruptedException{
          
    	Thread.sleep(2000);
    	click(By.xpath(addDessskillxpath));
        Thread.sleep(2000);
        writeText(By.xpath(addDesiredskillxpath),desired);      
        Thread.sleep(2000);
        click(By.xpath(addDesiredskillxpath));
        driver.findElement(By.xpath(addDesiredskillxpath)).sendKeys(Keys.ENTER);
     
    }
    
    public void gigDesc (String gigdesc) throws InterruptedException{
        
        writeText(By.xpath(gigDescxpath),gigdesc);
    }
    
    public void DesExperience() throws InterruptedException{
    	
    	  Thread.sleep(2000);
          click(By.xpath(desiredExpxpath));
          Thread.sleep(2000);
          click(By.xpath(Desiredyears));

        }
    
    
    public void Nextbutton () throws InterruptedException{
        
        click(By.xpath(nextButtonxpath));
    }
    
  public void secondpage () throws InterruptedException{
        
        click(By.xpath(secondpage));
    }
    //****React Forgot Password Verification Method******

    public void verifyEmptyField (String expectedText) {
        Assert.assertEquals(readText(By.xpath(emptyfielderror)), expectedText);
    }
    
    public void verifyNumericError (String expectedText) {
        Assert.assertEquals(readText(By.xpath(numericerror)), expectedText);
    }
    
    public void verifyMinMaxError (String expectedText) {
        Assert.assertEquals(readText(By.xpath(minmaxerror)), expectedText);
    }
    
    public void verifyNextPage (String expectedText) {
        Assert.assertEquals(readText(By.xpath(titlexpath)), expectedText);
    }
    
    public void verifySucceslogin (String expectedText) {
    
        Assert.assertEquals(readText(By.xpath(Succeslogin)), expectedText);
    }
    
    
   
}  
    
    
   