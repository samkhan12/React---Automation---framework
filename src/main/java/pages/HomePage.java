 package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BasePage {



    //*********Constructor*********
    public HomePage (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Page Variables*********
    String baseURL = "http://the-internet.herokuapp.com/";
    
    //*********Page Methods*********

    //Go to Homepage
        public void goToSkillGigs() throws InterruptedException {


            driver.get(baseURL);
        
    }


    }


