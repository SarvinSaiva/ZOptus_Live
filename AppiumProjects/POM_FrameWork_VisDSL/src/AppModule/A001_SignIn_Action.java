package AppModule;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import PageObject.P001_SignIn_Page;
import Utility.ExcelUtils;

public class A001_SignIn_Action {

    public static void Execute(WebDriver driver) throws Exception {
	P001_SignIn_Page.waitFor();
	P001_SignIn_Page.btn_LogIn(driver).click();
	P001_SignIn_Page.waitFor();
	A001_SignIn_Action.Alertverify(driver);
	P001_SignIn_Page.waitFor();
	P001_SignIn_Page.txtbx_UserName(driver).sendKeys("athangar");
	P001_SignIn_Page.txtbx_Password(driver).sendKeys("psswd");
	P001_SignIn_Page.btn_LogIn(driver).click();
	P001_SignIn_Page.waitFor();
	A001_SignIn_Action.verify(driver);
	P001_SignIn_Page.waitFor();
	P001_SignIn_Page.txtbx_UserName(driver).clear();
	String sUserName = ExcelUtils.getCellData(1, 1);
	String sPassword = ExcelUtils.getCellData(1, 2);
	P001_SignIn_Page.txtbx_UserName(driver).sendKeys(sUserName);
	P001_SignIn_Page.txtbx_Password(driver).sendKeys(sPassword);
	P001_SignIn_Page.btn_LogIn(driver).click();
	P001_SignIn_Page.waitFor();

    }

    public static void verify(WebDriver driver) throws Exception {
	String message = P001_SignIn_Page.Login_Validation(driver).getText();
	// WebElement TxtBoxContent = driver.findElement(By.id(WebelementID));
	// / String Content = TxtBoxContent.getAttribute("value");
	String Validation = ExcelUtils.getCellData(1, 6);
	// Assert.assertEquals(message,Validation);
	if (Validation.equals(message)) {
	    Reporter.log("TC001_SignIn_Page : "
		    + "Label Message - Invalid Data Verification - PASSED",
		    true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC001_SignIn_Page : "
		    + "Label Message - Invalid Data Verification - FAILED",
		    true);
	}
    }

    public static void Alertverify(WebDriver driver) throws Exception {

	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 7);
	P001_SignIn_Page.waitFor();
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC001_SignIn_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC001_SignIn_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	}
	P001_SignIn_Page.waitFor();
	alert.accept();
    }
}
