package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageForgotPwd extends BasePage {



    //*********Constructor*********
    public HomePageForgotPwd (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Page Variables*********
    String baseURL = "https://app.beta.skillgigs.com/ForgotPwd";
    
    //*********Page Methods*********

    //Go to Homepage
        public void goToSkillGigs() {
        driver.get(baseURL);
   
    }

    }


