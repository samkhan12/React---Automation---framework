package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ApplicationProperties {


	public static void main(String[] args) throws InterruptedException {

	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://google.com");

	    String CurrentURL= driver.getCurrentUrl();
	    System.out.println("Current URL is : " + CurrentURL);

	    Actions action = new Actions(driver);
	    action.sendKeys(Keys.F12);

	    System.out.println("successfuly pressed key F12");
	}}