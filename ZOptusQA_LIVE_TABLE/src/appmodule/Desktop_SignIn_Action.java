package appmodule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import PageObject.Desktop_LogIn_Page;
import PageObject.Mobility_Login_Page;
import Utility.ExcelUtils;

public class Desktop_SignIn_Action {
    public static void Execute(WebDriver driver) throws Exception {
	try {
	    String sUserName = ExcelUtils.getCellData(1, 1);
	    String sPassword = ExcelUtils.getCellData(1, 2);
	    driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	    Mobility_Login_Page.waitForLoad(driver);
	    Desktop_LogIn_Page.txtbx_UserName(driver).sendKeys(sUserName);
	    Reporter.log("Entered Username : " + sUserName);
	    Desktop_LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);
	    Reporter.log("Entered Username : " + sPassword);
	    Desktop_LogIn_Page.btn_LogIn(driver).click();
	    Reporter.log("Click on Login button");
	    Desktop_LogIn_Page.waitForLoad(driver);
	    Desktop_LogIn_Page.waitForLoad(driver);
	    Verification_Action.Execute(driver);
	} catch (Exception Error) {
	    Reporter.log("Desktop Singin Action Fail Exception"
		    + Error.getMessage());
	}
    }
}
