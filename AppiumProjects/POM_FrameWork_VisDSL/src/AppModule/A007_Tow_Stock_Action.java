package AppModule;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import PageObject.P007_Tow_Stock_Page;
import PageObject.P002_Tow_WorkOrder_Page;
import Utility.ExcelUtils;

public class A007_Tow_Stock_Action {

    public static void Execute(WebDriver driver) throws Exception {

	P007_Tow_Stock_Page.LNK_Stock_lnkStock(driver).click();
	P007_Tow_Stock_Page.waitFor();
	String CPEStatus = ExcelUtils.getCellData(1, 1);
	P007_Tow_Stock_Page.TXT_Stock_CPEStatus(driver).sendKeys(CPEStatus);
	P007_Tow_Stock_Page.waitFor();
	String CPEManagement = ExcelUtils.getCellData(1, 2);
	P007_Tow_Stock_Page.TXT_Stock_CPEManagementType(driver).sendKeys(
		CPEManagement);
	String NTUInstalled = ExcelUtils.getCellData(1, 3);
	Select oSelection1 = new Select(
		P007_Tow_Stock_Page.DDN_Stock_ddlNTUInstalled(driver));
	oSelection1.selectByVisibleText(NTUInstalled);
	String NTUType = ExcelUtils.getCellData(1, 4);
	Select oSelection2 = new Select(
		P007_Tow_Stock_Page.DDN_Stock_NTUType(driver));
	oSelection2.selectByVisibleText(NTUType);
	P007_Tow_Stock_Page.waitFor();
	P007_Tow_Stock_Page.BTN_Stock_Save(driver).click();
	P007_Tow_Stock_Page.waitFor();
	A007_Tow_Stock_Action.UpdateValidation(driver);
	P007_Tow_Stock_Page.waitFor();
	P007_Tow_Stock_Page.BTN_Stock_SendInventoryUpdate(driver).click();
	P007_Tow_Stock_Page.waitFor();
	// driver.switchTo().frame("UserListDialog");
	P007_Tow_Stock_Page.Stock_iframeSendEmail(driver);

	String From = ExcelUtils.getCellData(1, 47);
	P007_Tow_Stock_Page.TXT_Stock_MAILPopup_From(driver).clear();
	P007_Tow_Stock_Page.waitFor();
	P007_Tow_Stock_Page.BTN_Stock_MAILPoupup_Send(driver).click();
	P007_Tow_Stock_Page.waitFor();
	A007_Tow_Stock_Action.SendMailFromAlertmsgVerfication(driver);
	P007_Tow_Stock_Page.waitFor();
	P007_Tow_Stock_Page.TXT_Stock_MAILPopup_From(driver).sendKeys(From);
	String TO = ExcelUtils.getCellData(1, 48);
	P007_Tow_Stock_Page.TXT_Stock_MAILPopup_TO(driver).clear();
	P007_Tow_Stock_Page.waitFor();
	P007_Tow_Stock_Page.BTN_Stock_MAILPoupup_Send(driver).click();
	P007_Tow_Stock_Page.waitFor();
	A007_Tow_Stock_Action.SendMailToAlertmsgVerfication(driver);
	P002_Tow_WorkOrder_Page.waitFor();
	P007_Tow_Stock_Page.TXT_Stock_MAILPopup_TO(driver).sendKeys(TO);
	String CC = ExcelUtils.getCellData(1, 49);
	P007_Tow_Stock_Page.TXT_Stock_MAILPopup_CC(driver).clear();
	P007_Tow_Stock_Page.TXT_Stock_MAILPopup_CC(driver).sendKeys(CC);
	P007_Tow_Stock_Page.BTN_Stock_MAILPoupup_Send(driver).click();
	A007_Tow_Stock_Action.MailValidation(driver);
	String From1 = ExcelUtils.getCellData(1, 38);
	P007_Tow_Stock_Page.TXT_Stock_MAILPopup_From(driver).clear();
	P007_Tow_Stock_Page.TXT_Stock_MAILPopup_From(driver).sendKeys(From1);
	String TO1 = ExcelUtils.getCellData(1, 39);
	P007_Tow_Stock_Page.TXT_Stock_MAILPopup_TO(driver).clear();
	P007_Tow_Stock_Page.TXT_Stock_MAILPopup_TO(driver).sendKeys(TO1);
	String CC1 = ExcelUtils.getCellData(1, 40);
	P007_Tow_Stock_Page.TXT_Stock_MAILPopup_CC(driver).clear();
	P007_Tow_Stock_Page.TXT_Stock_MAILPopup_CC(driver).sendKeys(CC1);
	String Fileupload = ExcelUtils.getCellData(1, 41);
	P007_Tow_Stock_Page.TXT_Stock_MAILPopup_Attachment(driver).sendKeys(
		Fileupload);
	// driver.findElement(By.xpath(".//*[@id='fpuAttachment']")).sendKeys("//CIS20/UploadFiles/TestData.txt");
	P007_Tow_Stock_Page.waitFor();
	P007_Tow_Stock_Page.BTN_Stock_MAILPoupup_Send(driver).click();
	P007_Tow_Stock_Page.waitFor();
	Alert alert = driver.switchTo().alert(); // *Accept Popup
	alert.accept();
	P007_Tow_Stock_Page.waitFor();

    }

    public static void MailValidation(WebDriver driver) throws Exception {
	String message1 = P007_Tow_Stock_Page.Stock_SendM_FrmVal(driver)
		.getText();
	String message2 = P007_Tow_Stock_Page.Stock_SendM_ToVal(driver)
		.getText();
	String message3 = P007_Tow_Stock_Page.Stock_SendM_CCVal(driver)
		.getText();
	String Validation1 = ExcelUtils.getCellData(1, 43);
	String Validation2 = ExcelUtils.getCellData(1, 44);
	String Validation3 = ExcelUtils.getCellData(1, 45);
	if (Validation1.equals(message1)) {
	    Reporter.log("TC007_TOW_Stock_Page : "
		    + "Label Message - Invalid From Address - PASSED", true);
	    System.out.println(Validation1);
	} else {
	    Reporter.log("TC007_TOW_Stock_Page : "
		    + "Label Message - Invalid From Address - FAILED", true);
	    System.out.println(message1);
	}
	if (Validation2.equals(message2)) {
	    Reporter.log("TC007_TOW_Stock_Page : "
		    + "Label Message - Invalid To Address - PASSED", true);
	    System.out.println(Validation2);
	} else {
	    Reporter.log("TC007_TOW_Stock_Page : "
		    + "Label Message - Invalid To Address - FAILED", true);
	    System.out.println(message2);
	}
	if (Validation3.equals(message3)) {
	    Reporter.log("TC007_TOW_Stock_Page : "
		    + "Label Message - Invalid CC Address - PASSED", true);
	    System.out.println(Validation3);
	} else {
	    Reporter.log("TC007_TOW_Stock_Page : "
		    + "Label Message - Invalid CC Address - FAILED", true);
	    System.out.println(message3);
	}
    }

    public static void UpdateValidation(WebDriver driver) throws Exception {
	String message = P007_Tow_Stock_Page.Stock_Validation_Updatemsg(driver)
		.getText();
	String Validation = ExcelUtils.getCellData(1, 46);
	if (Validation.equals(message)) {
	    Reporter.log("TC007_TOW_Stock_Page : "
		    + "Update Message Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC007_TOW_Stock_Page : "
		    + "Update Message Verification - FAILED", true);
	    System.out.println(message);
	}
    }

    public static void SendMailFromAlertmsgVerfication(WebDriver driver)
	    throws Exception {
	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 50);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC007_TOW_Stock_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC007_TOW_Stock_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	}
	alert.accept();
    }

    public static void SendMailToAlertmsgVerfication(WebDriver driver)
	    throws Exception {
	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 51);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC007_TOW_Stock_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC007_TOW_Stock_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	}
	alert.accept();
    }
}
