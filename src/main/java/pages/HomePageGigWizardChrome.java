package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePageGigWizardChrome extends BasePage {

    
    //*********Constructor*********
    public HomePageGigWizardChrome(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}


    //*********Page Variables*********

    String baseURL = "http://100.26.56.195/Administration/Employer/Gig/Wizard/22";
	

    //*********Page Methods*********

    //Go to Homepage
        public void goToSkillGigs() {
        driver.get(baseURL);
   
    }

    }

