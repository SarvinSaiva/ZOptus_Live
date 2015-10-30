package AppModule;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import PageObject.P014_NewWorkOrder_Page;
import Utility.ExcelUtils;

public class A014_NewWorkOrder_Action {
    public static void Execute(WebDriver driver) throws Exception {

	P014_NewWorkOrder_Page.IMG_HDR_newwrkordr(driver).click();
	P014_NewWorkOrder_Page.waitFor();
	P014_NewWorkOrder_Page.BTN_NWO_Nsave(driver).click();
	P014_NewWorkOrder_Page.waitFor();
	A014_NewWorkOrder_Action.AlertMessageverify(driver);
	P014_NewWorkOrder_Page.waitFor();
	String Nref = ExcelUtils.getCellData(1, 3);
	P014_NewWorkOrder_Page.TXTBX_NWO_Nref(driver).sendKeys(Nref);
	String Nref2 = ExcelUtils.getCellData(1, 4);
	P014_NewWorkOrder_Page.TXTBX_NWO_Nref2(driver).sendKeys(Nref2);
	P014_NewWorkOrder_Page.waitFor();
	P014_NewWorkOrder_Page.BTN_NWO_Nsave(driver).click();
	P014_NewWorkOrder_Page.waitFor();
	A014_NewWorkOrder_Action.JTAlertMessageverify(driver);
	P014_NewWorkOrder_Page.waitFor();
	String jobtype = ExcelUtils.getCellData(1, 1);
	Select oSelection1 = new Select(
		P014_NewWorkOrder_Page.DDN_NWO_Njobtype(driver));
	oSelection1.selectByVisibleText(jobtype);
	P014_NewWorkOrder_Page.waitFor();
	String Ninstall = ExcelUtils.getCellData(1, 2);
	Select oSelection2 = new Select(
		P014_NewWorkOrder_Page.DDN_NWO_Ninstall(driver));
	oSelection2.selectByVisibleText(Ninstall);
	P014_NewWorkOrder_Page.waitFor();
	/*
	 * String Nref = ExcelUtils.getCellData(1, 3);
	 * NewWorkOrder_Page.TXTBX_NWO_Nref(driver).sendKeys(Nref); String Nref2
	 * = ExcelUtils.getCellData(1, 4);
	 * NewWorkOrder_Page.TXTBX_NWO_Nref2(driver).sendKeys(Nref2);
	 */
	String Nfnn = ExcelUtils.getCellData(1, 5);
	P014_NewWorkOrder_Page.TXTBX_NWO_Nfnn(driver).sendKeys(Nfnn);
	P014_NewWorkOrder_Page.BTN_NWO_Nsave(driver).click();
	P014_NewWorkOrder_Page.waitFor();
    }

    public static void AlertMessageverify(WebDriver driver) throws Exception {

	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 20);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC014_NewWorkOrder_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC014_NewWorkOrder_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	    System.out.println(Alertmsg);
	}
	alert.accept();
    }

    public static void JTAlertMessageverify(WebDriver driver) throws Exception {

	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 19);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC014_NewWorkOrder_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC014_NewWorkOrder_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	    System.out.println(Alertmsg);
	}
	alert.accept();
    }
}
