package appmodule;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObject.Desktop_UserProfile_Page;

public class Desktop_UserProfile_Action {

    @Test
    public void UserProfile_EditProfile(WebDriver driver) throws Exception {
	Desktop_UserProfile_Page.tab_UserImage(driver).click();
	Desktop_UserProfile_Page.waitForLoad(driver);
	Desktop_UserProfile_Page.tab_EditProfile(driver).click();
	Reporter.log("Click on UserProfile - EditProfile Menu");
	Desktop_UserProfile_Page.waitForLoad(driver);
	String winHandleBefore = driver.getWindowHandle();
	for (String winHandle : driver.getWindowHandles()) {
	    driver.switchTo().window(winHandle);
	    Verification_Action.Execute(driver);
	}
	driver.close();
	driver.switchTo().window(winHandleBefore);
    }

    @Test
    public void UserProfile_TimeSheet(WebDriver driver) throws Exception {

	Desktop_UserProfile_Page.tab_UserImage(driver).click();
	Desktop_UserProfile_Page.waitForLoad(driver);
	Desktop_UserProfile_Page.tab_timesheet(driver).click();
	Desktop_UserProfile_Page.waitForLoad(driver);
	Reporter.log("Click on UserProfile - Timesheet Menu");
	Verification_Action.Execute(driver);
	Desktop_UserProfile_Page.waitForLoad(driver);
	Desktop_UserProfile_Page.tab_timesheetnewentries(driver).click();
	Desktop_UserProfile_Page.waitForLoad(driver);
	Desktop_UserProfile_Page.tab_timesheetpastentries(driver).click();
	Desktop_UserProfile_Page.waitForLoad(driver);
    }

    @Test
    public void userProfile_SwitchLogged(WebDriver driver) throws Exception {
	Desktop_UserProfile_Page.tab_UserImage(driver).click();
	Desktop_UserProfile_Page.waitForLoad(driver);
	Desktop_UserProfile_Page.tab_switchlogged(driver).click();
	Reporter.log("Click on UserProfile - SwitchLogged Menu");
	Desktop_UserProfile_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Desktop_UserProfile_Page.waitForLoad(driver);
	Desktop_UserProfile_Page.tab_switchloggedclose(driver).click();
	Desktop_UserProfile_Page.waitForLoad(driver);
    }

    @Test
    public void UserProfile_Logout(WebDriver driver)
	    throws InterruptedException {
	Desktop_UserProfile_Page.tab_UserImage(driver).click();
	Desktop_UserProfile_Page.waitForLoad(driver);
	Desktop_UserProfile_Page.tab_logout(driver).click();
	Reporter.log("Click on UserProfile - Logout Menu");
    }
}
