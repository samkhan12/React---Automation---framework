package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePageManageGigs extends BasePage {

    
    //*********Constructor*********
    public HomePageManageGigs(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		
		// TODO Auto-generated constructor stub
	}


    //*********Page Variables*********

    String baseURL = "http://ec2-100-26-56-195.compute-1.amazonaws.com/Administration/Employer/Manage/Gigs/22";
	

    //*********Page Methods*********

    //Go to Homepage
        public void goToSkillGigs() {
        driver.get(baseURL);
   
    }

    }

