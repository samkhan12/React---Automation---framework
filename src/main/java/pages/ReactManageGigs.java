package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class ReactManageGigs extends BasePage{

    //*********Constructor*********
    public ReactManageGigs(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Web Elements*********
    String usenamexpath = "//input[@data-auto='signInEmail']";
    String pwdxpath = "//input[@data-auto='signInPassword']";
    String Loginxpath = "//input[@data-auto='signInButton']";


  //React Manage Gigs
   
    String filteroptions = "//*[@id=\"site-content\"]/div/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]";
    String draftfilter = "//*[@id=\"1\"]/span";
    String publishedfilter = "//*[@id=\"2\"]/span";
    String deletedfilter = "//*[@id=\"3\"]/span";
    String expiredfilter = "//*[@id=\"4\"]";
    String closedfilter = "//*[@id=\"5\"]";
    String clearfilter = "//*[@id=\"site-content\"]/div/div/div/div[1]/div/div[1]/div/div[1]/div/div[2]/div[6]";
    String pagination = "/html/body/div[2]/div/div/div/div/div/div[2]/div/a[10]";
    String bodypagecount = "/html/body/div[2]/div/div/div/div/div/div[1]/div/div[2]";
    String draft = "DRAFT";
    String titledraft = "//*[@id=\"site-content\"]/div/div/div/div[1]/div/div[2]/div[1]/div[1]";
    String titlepublished = "//*[@id=\"site-content\"]/div/div/div/div[1]/div/div[2]/div[1]/div[1]";
    String titledeleted = "//*[@id=\"site-content\"]/div/div/div/div[1]/div/div[2]/div[1]/div[1]";
    String titleexpired = "//*[@id=\"site-content\"]/div/div/div/div[1]/div/div[2]/div[1]/div[1]";
    String titleclosed = "//*[@id=\"site-content\"]/div/div/div/div[1]/div/div[2]/div[1]/div[1]";
    String titleclear = "//*[@id=\"site-content\"]/div/div/div/div[1]/div/div[2]/div[1]/div[1]";
    String titleempty = "//*[@id=\"site-content\"]/div/div/div/div[1]/div/div[1]/div/div[2]/h2/span";
    String txtabsent = "Text is absent";
    
    //******React Gig Wizard Page Methods*******
    
    public void clickTofilteroptions() throws InterruptedException{
        
        click(By.xpath(filteroptions));
    
        }
    
    public void clickToDraft() throws InterruptedException{
        
        click(By.xpath(draftfilter));
        	
    	Thread.sleep(3000);

        /*	 driver.getPageSource();
        	 WebElement body = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[1]/div/div[2]"));
        	 String bodyText = body.getText();

        	 int count = 0;

        	 while (bodyText.contains("DRAFT")){

        	 count++;

             bodyText = bodyText.substring(bodyText.indexOf("DRAFT") + "DRAFT".length());
        	 }
        	    
        	 System.out.println(count); */
             }

       
            
    
    public void clickToPublished () throws InterruptedException{
        
        click(By.xpath(publishedfilter));
            	
    	Thread.sleep(3000);
   
          } 
    
    
    public void clickToDeleted () throws InterruptedException{
        
        click(By.xpath(deletedfilter));
            	
    	Thread.sleep(3000);

         }
    
    
    public void clickToExpired () throws InterruptedException{
            
        click(By.xpath(expiredfilter));
            	
    	Thread.sleep(3000);
             
        }
    
    	
    public void clickToClosed () throws InterruptedException{
        
        click(By.xpath(closedfilter));
            	
    	Thread.sleep(3000);

        }
    
    	
    
   public void clickToClear () throws InterruptedException{
        
        click(By.xpath(clearfilter));
      
        }
    
   
   public void countTodraft (String expectedText) throws InterruptedException{



	 driver.getPageSource();
	 
  	 WebElement body = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[1]/div/div[2]"));
  	 String bodyText = body.getText();

  	 int count = 0;

  	 while (bodyText.contains("DRAFT")){

  	 count++;

       bodyText = bodyText.substring(bodyText.indexOf("DRAFT") + "DRAFT".length());
  	 }
  	    
  	 System.out.println(count);
	   
        }
   


    //****React Forgot Password Verification Method******


   
   public void verifyDraftGigs() {
	   
  
	  Assert.assertTrue(driver.getPageSource().contains("DRAFT"));
	   
       }
   
   public void verifyPublishedGigs() {
	   
	  Assert.assertTrue(driver.getPageSource().contains("EXPIRES"));

       }
   
   public void verifyDeletedGigs() {

	   Assert.assertTrue(driver.getPageSource().contains("DELETED"));
	   
	   }
  
   public void verifyExpiredGigs() {
	   
	   Assert.assertTrue(driver.getPageSource().contains("EXPIRED"));

      }
   
   public void verifyClosedGigs() {
	   
	   Assert.assertTrue(driver.getPageSource().contains("CLOSED"));

     }
   
   public void verifyClearGigs() {
	   
	   Assert.assertTrue(driver.getPageSource().contains("DRAFT"));

	  /*  Assert.assertEquals(readText(By.xpath(titleclear)), expectedText);
	   if(driver.getPageSource().contains("DRAFT")){
		   System.out.println("Text is present");
		   }
	   
	   else 
		   System.out.println("Text is absent");
  		
	   } */
}  
}
    