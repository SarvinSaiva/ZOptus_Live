package appmodule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import PageObject.Mobility_Login_Page;
import Utility.ExcelUtils;

public class Mobility_SignIn_Action {
    public static void Execute(WebDriver driver) throws Exception {

	String sUserName = ExcelUtils.getCellData(1, 1);
	String sPassword = ExcelUtils.getCellData(1, 2);
	Mobility_Login_Page.waitForLoad(driver);
	Mobility_Login_Page.waitForLoad(driver);
	driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	Mobility_Login_Page.txtbx_UserName(driver).sendKeys(sUserName);
	Reporter.log("Entered Username : " + sUserName);
	Mobility_Login_Page.waitForLoad(driver);
	Mobility_Login_Page.txtbx_Password(driver).sendKeys(sPassword);
	Reporter.log("Entered Username : " + sPassword);
	Mobility_Login_Page.waitForLoad(driver);
	Mobility_Login_Page.btn_LogIn(driver).click();
	Mobility_Login_Page.waitForLoad(driver);
	Reporter.log("Click on Login button");
	Mobility_Login_Page.waitForLoad(driver);
	Mobility_Login_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
    }

}
