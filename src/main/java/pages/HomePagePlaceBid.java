package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePagePlaceBid extends BasePage {


    //*********Constructor*********
    public HomePagePlaceBid (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Page Variables*********

    String baseURL = "https://app.beta.skillgigs.com/Administration/Employer/Bid/14747";
	

    //*********Page Methods*********

    //Go to Homepage
        public void goToSkillGigs() {
        driver.get(baseURL);
    }

    }

