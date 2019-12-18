package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageSignUp extends BasePage {



    //*********Constructor*********
    public HomePageSignUp (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Page Variables*********
    String baseURL = "https://app.beta.skillgigs.com/SignUp";
    
    //*********Page Methods*********

    //Go to Homepage
        public void goToSkillGigs (){
        driver.get(baseURL);
     

    }


    }


