package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePageSkillDensity extends BasePage {


    //*********Constructor*********
    public HomePageSkillDensity (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Page Variables*********

    String baseURL = "http://ec2-100-26-56-195.compute-1.amazonaws.com/Administration/Gig/SkillDensity/1012?profileId=22";
	

    //*********Page Methods*********

    //Go to Homepage
        public void goToSkillGigs() {
        driver.get(baseURL);
    }

    }

