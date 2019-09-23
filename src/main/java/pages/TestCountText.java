package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCountText {
		
	
public static void main(String[] args) throws Exception {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://100.26.56.195/Administration/Employer/Manage/Gigs/22");

	Thread.sleep(5000);
	
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


}