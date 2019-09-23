package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePageGigWizard extends BasePage {


    //*********Constructor*********
    public HomePageGigWizard (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Page Variables*********

    String baseURL = "http://100.26.56.195/Administration/Employer/Gig/Wizard/22";
	

    //*********Page Methods*********

    //Go to Homepage
        public void goToSkillGigs() {
        driver.get(baseURL);
   
    }

    }

