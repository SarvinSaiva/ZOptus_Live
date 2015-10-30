package AppModule;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import PageObject.P019_Invoices_Client_Page;
import Utility.ExcelUtils;

public class A019_Invoices_Client_Action {

    @Test
    public void UnApproved_Client_Invoices(WebDriver driver) throws Exception {

	P019_Invoices_Client_Page.waitFor();
	Actions action = new Actions(driver);
	WebElement element1 = P019_Invoices_Client_Page.IMG_HDR_invoice(driver);
	action.moveToElement(element1)
		.moveToElement(
			P019_Invoices_Client_Page.IMG_HDR_clientinvoice(driver))
		.click().build().perform();
	P019_Invoices_Client_Page.waitFor();
	P019_Invoices_Client_Page.BTN_CLIN_createinvoice1(driver).click();
	P019_Invoices_Client_Page.waitFor();
	A019_Invoices_Client_Action.AlertMessageverify(driver);
	P019_Invoices_Client_Page.waitFor();
	String crejobtype = ExcelUtils.getCellData(1, 4);
	Select oSelection1 = new Select(
		P019_Invoices_Client_Page.DDN_CLIN_crejobtype(driver));
	oSelection1.selectByVisibleText(crejobtype);
	P019_Invoices_Client_Page.waitFor();
	String creinvoice = ExcelUtils.getCellData(1, 5);
	P019_Invoices_Client_Page.TXTBX_CLIN_creinvoice(driver).sendKeys(
		creinvoice);
	String creend = ExcelUtils.getCellData(1, 6);
	P019_Invoices_Client_Page.DATE_CLIN_creend(driver).sendKeys(creend);
	P019_Invoices_Client_Page.waitFor();
	P019_Invoices_Client_Page.BTN_CLIN_createinvoice1(driver).click();
	P019_Invoices_Client_Page.waitFor();
	P019_Invoices_Client_Page.BTN_CLIN_InvoiceOK(driver).click();
	P019_Invoices_Client_Page.waitFor();
	String CLjob = ExcelUtils.getCellData(1, 1);
	Select oSelection2 = new Select(
		P019_Invoices_Client_Page.DDN_CLIN_CLjob(driver));
	oSelection2.selectByVisibleText(CLjob);
	P019_Invoices_Client_Page.waitFor();
	P019_Invoices_Client_Page.BTN_CLIN_CLsearch(driver).click();
	P019_Invoices_Client_Page.waitFor();
	P019_Invoices_Client_Page.BTN_CLIN_clientexport(driver).click();
	P019_Invoices_Client_Page.waitFor();
	// Invoices_Client_Page.BTN_CLIN_cledit(driver).click();
	// Invoices_Client_Page.waitFor();
	// String invstatus = ExcelUtils.getCellData(1, 9);
	// Select oSelection3 = new
	// Select(Invoices_Client_Page.DDN_CLIN_invstatus(driver));
	// oSelection3.selectByVisibleText(invstatus);
	// Invoices_Client_Page.waitFor();
	// Invoices_Client_Page.BTN_CLIN_clupdate(driver).click();
	// Invoices_Client_Page.waitFor();
    }

    @Test
    public void Approved_Client_Invoices(WebDriver driver) throws Exception {

	P019_Invoices_Client_Page.waitFor();
	P019_Invoices_Client_Page.IMG_CAPP_Approved(driver).click();
	P019_Invoices_Client_Page.waitFor();
	String CLjob = ExcelUtils.getCellData(1, 11);
	Select oSelection1 = new Select(
		P019_Invoices_Client_Page.DDN_CAPP_jobtype(driver));
	oSelection1.selectByVisibleText(CLjob);
	P019_Invoices_Client_Page.waitFor();
	P019_Invoices_Client_Page.BTN_CAPP_Search(driver).click();
	P019_Invoices_Client_Page.waitFor();
	P019_Invoices_Client_Page.BTN_CAPP_ExportToExcel(driver).click();
	P019_Invoices_Client_Page.waitFor();
	P019_Invoices_Client_Page.BTN_CAPP_Edit(driver).click();
	P019_Invoices_Client_Page.waitFor();
	P019_Invoices_Client_Page.TXT_CAPP_EditComments(driver).clear();
	String AppRef1 = ExcelUtils.getCellData(1, 17);
	P019_Invoices_Client_Page.TXT_CAPP_EditComments(driver).sendKeys(
		AppRef1);
	P019_Invoices_Client_Page.waitFor();
	P019_Invoices_Client_Page.BTN_CAPP_Update(driver).click();
	P019_Invoices_Client_Page.waitFor();
	A019_Invoices_Client_Action.UpdateValidation(driver);
	P019_Invoices_Client_Page.waitFor();
	P019_Invoices_Client_Page.BTN_CAPP_ViewIcon(driver).click();
	P019_Invoices_Client_Page.waitFor();
	P019_Invoices_Client_Page.BTN_CAPP_Back(driver).click();
	P019_Invoices_Client_Page.waitFor();
    }

    public static void UpdateValidation(WebDriver driver) throws Exception {
	String message = P019_Invoices_Client_Page.AppClient_Val_Updatemsg(
		driver).getText();
	String Validation = ExcelUtils.getCellData(1, 20);
	if (Validation.equals(message)) {
	    Reporter.log("TC019_Invoices_Client_Page : "
		    + "Label Message - Save Message Verification - PASSED",
		    true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC019_Invoices_Client_Page : "
		    + "Label Message - Save Message Verification - FAILED",
		    true);
	    System.out.println(message);
	}
    }

    public static void AlertMessageverify(WebDriver driver) throws Exception {

	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 21);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC019_Invoices_Client_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC019_Invoices_Client_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	    System.out.println(Alertmsg);
	}
	alert.accept();
    }
}
