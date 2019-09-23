package pages;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Pagination 
		
{
public static void main(String[] args) throws Exception {
	
	WebDriver driver=new FirefoxDriver();
    JavascriptExecutor js = (JavascriptExecutor) driver;


	driver.get("http://100.26.56.195/Administration/Employer/Manage/Gigs/22");
	driver.manage().window().maximize();

	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]")).click();
	
	Thread.sleep(3000);
    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[1]/div/div[1]/div/div[1]/div/div[2]/div[1]/span")).click();


	Thread.sleep(2000);
    js.executeScript("window.scrollBy(0,1000)");

	
    Thread.sleep(10000);
    
	

    	 List<WebElement> pagination =driver.findElements(By.xpath("//div[@class='ui pagination menu']//a")); 
    	 WebElement pagedisable = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/div/a[8]"));

    	if(pagination.size()>0){ 
    	System.out.println("pagination exists"); 


    	for(int i=0; i<pagination.size(); i++){ 
    		
    
    		Thread.sleep(5000);
    	pagination.get(i).click(); 
    	} 
    	} else { 
    		System.out.println("pagination not exists"); 
    	} 
    	
    	
  /*   	 driver.getPageSource();
     	 WebElement body = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[1]/div/div[2]"));
     	 String bodyText = body.getText();

     	

     	    while (bodyText.contains("DRAFT")){

     	    count++;

     	    bodyText = bodyText.substring(bodyText.indexOf("DRAFT") + "DRAFT".length());
     	}
     	System.out.println(count=count++);

     	}

         Thread.sleep(10000);  
        } */
}}