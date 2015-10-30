package AppModule;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import PageObject.P021_Security_Page;
import Utility.ExcelUtils;

public class A021_Security_Action {

    public static void Execute(WebDriver driver) throws Exception {

	P021_Security_Page.IMG_HDR_security(driver).click();
	P021_Security_Page.waitFor();
	P021_Security_Page.LNKBTN_STY_styaddnew(driver).click();
	P021_Security_Page.waitFor();
	P021_Security_Page.BTN_STY_updateuser(driver).click();
	P021_Security_Page.waitFor();
	A021_Security_Action.MandatoryValidation(driver);
	P021_Security_Page.waitFor();
	P021_Security_Page.CHKBX_STY_project(driver).click();
	P021_Security_Page.waitFor();
	P021_Security_Page.DDN_STY_company(driver).click();
	P021_Security_Page.waitFor();
	P021_Security_Page.DDN_STY_company(driver).sendKeys(Keys.ARROW_DOWN);
	P021_Security_Page.DDN_STY_company(driver).sendKeys(Keys.ENTER);
	/*
	 * String company = ExcelUtils.getCellData(1, 4); Select oSelection1 =
	 * new Select(Security_Page.DDN_STY_company(driver));
	 * oSelection1.selectByVisibleText(company);
	 */
	P021_Security_Page.waitFor();
	P021_Security_Page.DDN_STY_Technician(driver).click();
	P021_Security_Page.waitFor();
	P021_Security_Page.DDN_STY_Technician(driver).sendKeys(Keys.ARROW_DOWN);
	P021_Security_Page.DDN_STY_Technician(driver).sendKeys(Keys.ENTER);
	P021_Security_Page.waitFor();
	/*
	 * String Technician = ExcelUtils.getCellData(1, 5); Select oSelection2
	 * = new Select(Security_Page.DDN_STY_Technician(driver));
	 * oSelection2.selectByVisibleText(Technician);
	 */
	P021_Security_Page.waitFor();
	String addusername = ExcelUtils.getCellData(1, 6);
	P021_Security_Page.TXTBX_STY_addusername(driver).sendKeys(addusername);
	/*
	 * String addfirstname = ExcelUtils.getCellData(1, 7);
	 * Security_Page.TXTBX_STY_addfirstname(driver).sendKeys(addfirstname);
	 */
	/*
	 * String addlastname = ExcelUtils.getCellData(1, 8);
	 * Security_Page.TXTBX_STY_addlastname(driver).sendKeys(addlastname);
	 */
	P021_Security_Page.waitFor();
	P021_Security_Page.BTN_STY_updateuser(driver).click();
	P021_Security_Page.waitFor();
	P021_Security_Page.BTN_STY_Cancel(driver).click();
	P021_Security_Page.waitFor();
	P021_Security_Page.BTN_STY_stysearch(driver).click();
	P021_Security_Page.waitFor();
	A021_Security_Action.AlertSTSearchMessageverify(driver);
	P021_Security_Page.waitFor();
	String username = ExcelUtils.getCellData(1, 1);
	P021_Security_Page.TXTBX_STY_username(driver).sendKeys(username);
	P021_Security_Page.BTN_STY_stysearch(driver).click();
	P021_Security_Page.waitFor();
	P021_Security_Page.BTN_STY_styedit(driver).click();
	P021_Security_Page.waitFor();
	P021_Security_Page.TXTBX_STY_editemail(driver).clear();
	P021_Security_Page.waitFor();
	String editemail = ExcelUtils.getCellData(1, 15);
	P021_Security_Page.TXTBX_STY_editemail(driver).sendKeys(editemail);
	P021_Security_Page.waitFor();
	P021_Security_Page.BTN_STY_updateuser(driver).click();
	P021_Security_Page.waitFor();
	P021_Security_Page.BTN_STY_styclear(driver).click();
	P021_Security_Page.waitFor();
    }

    public static void MandatoryValidation(WebDriver driver) throws Exception {
	String message1 = P021_Security_Page.Sec_val_Projectlst(driver)
		.getText();
	String message2 = P021_Security_Page.Sec_Val_Company(driver).getText();
	String message3 = P021_Security_Page.Sec_Val_Acclevel(driver).getText();
	String message4 = P021_Security_Page.Sec_Val_Username(driver).getText();
	String message5 = P021_Security_Page.Sec_Val_FirstName(driver)
		.getText();
	String message6 = P021_Security_Page.Sec_Val_LastName(driver).getText();
	String Validation1 = ExcelUtils.getCellData(1, 17);
	String Validation2 = ExcelUtils.getCellData(1, 18);
	String Validation3 = ExcelUtils.getCellData(1, 19);
	String Validation4 = ExcelUtils.getCellData(1, 21);
	String Validation5 = ExcelUtils.getCellData(1, 22);
	String Validation6 = ExcelUtils.getCellData(1, 23);
	if (Validation1.equals(message1)) {
	    Reporter.log("TC021_Security_Page : "
		    + "Label Message - Mandatory Verfication - PASSED", true);
	    System.out.println(Validation1);
	} else {
	    Reporter.log("TC021_Security_Page : "
		    + "Label Message - Mandatory Verfication - FAILED", true);
	    System.out.println(message1);
	}
	if (Validation2.equals(message2)) {
	    Reporter.log("TC021_Security_Page : "
		    + "Label Message - Mandatory Verfication - PASSED", true);
	    System.out.println(Validation2);
	} else {
	    Reporter.log("TC021_Security_Page : "
		    + "Label Message - Mandatory Verfication - FAILED", true);
	    System.out.println(message2);
	}
	if (Validation3.equals(message3)) {
	    Reporter.log("TC021_Security_Page : "
		    + "Label Message - Mandatory Verfication - PASSED", true);
	    System.out.println(Validation3);
	} else {
	    Reporter.log("TC021_Security_Page : "
		    + "Label Message - Mandatory Verfication - FAILED", true);
	    System.out.println(message3);
	}
	if (Validation4.equals(message4)) {
	    Reporter.log("TC021_Security_Page : "
		    + "Label Message - Mandatory Verfication - PASSED", true);
	    System.out.println(Validation4);
	} else {
	    Reporter.log("TC021_Security_Page : "
		    + "Label Message - Mandatory Verfication - FAILED", true);
	    System.out.println(message4);
	}
	if (Validation5.equals(message5)) {
	    Reporter.log("TC021_Security_Page : "
		    + "Label Message - Mandatory Verfication - PASSED", true);
	    System.out.println(Validation5);
	} else {
	    Reporter.log("TC021_Security_Page : "
		    + "Label Message - Mandatory Verfication - FAILED", true);
	    System.out.println(message5);
	}
	if (Validation6.equals(message6)) {
	    Reporter.log("TC021_Security_Page : "
		    + "Label Message - Mandatory Verfication - PASSED", true);
	    System.out.println(Validation6);
	} else {
	    Reporter.log("TC021_Security_Page : "
		    + "Label Message - Mandatory Verfication - FAILED", true);
	    System.out.println(message6);
	}
    }

    public static void AlertSTSearchMessageverify(WebDriver driver)
	    throws Exception {

	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 25);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC021_Security_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC021_Security_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	}
	alert.accept();
    }
}
