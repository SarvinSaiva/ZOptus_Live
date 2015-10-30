package AppModule;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import PageObject.P009_Tow_Documentation_Page;
import Utility.ExcelUtils;

public class A009_Tow_Documentation_Action {

    public static void Execute(WebDriver driver) throws Exception {
	P009_Tow_Documentation_Page.waitFor();
	P009_Tow_Documentation_Page.LNK_DCM_lnkDocumentation(driver).click();
	P009_Tow_Documentation_Page.waitFor();
	P009_Tow_Documentation_Page.BTN_DCM_AddNewRecordButton(driver).click();
	P009_Tow_Documentation_Page.waitFor();
	P009_Tow_Documentation_Page.BTN_DCM_SaveUpload(driver).click();
	P009_Tow_Documentation_Page.waitFor();
	A009_Tow_Documentation_Action.MandatoryValidation(driver);
	P009_Tow_Documentation_Page.waitFor();
	String FileUpload = ExcelUtils.getCellData(1, 1);
	P009_Tow_Documentation_Page.FileUpload_DCM_Document(driver).sendKeys(
		FileUpload);
	// driver.findElement(By.xpath(".//*[@id='ctl00_cphMainContent_rgDocument_ctl00_ctl02_ctl03_FileUpload1']")).sendKeys("//CIS20/UploadFiles/TestData.txt");
	P009_Tow_Documentation_Page.waitFor();
	P009_Tow_Documentation_Page.BTN_DCM_SaveUpload(driver).click();
	P009_Tow_Documentation_Page.waitFor();
	A009_Tow_Documentation_Action.SaveValidation(driver);
	P009_Tow_Documentation_Page.waitFor();
	P009_Tow_Documentation_Page.BTN_DCM_SendEmail(driver).click();
	P009_Tow_Documentation_Page.DCM_iframeSendEmail(driver);
	P009_Tow_Documentation_Page.waitFor();
	// driver.switchTo().frame("SendEmail");
	String From = ExcelUtils.getCellData(1, 13);
	P009_Tow_Documentation_Page.TXT_DCM_MAILPopup_From(driver).clear();
	P009_Tow_Documentation_Page.waitFor();
	P009_Tow_Documentation_Page.BTN_DCM_MAILPoupup_Send(driver).click();
	P009_Tow_Documentation_Page.waitFor();
	A009_Tow_Documentation_Action.SendMailFromAlertmsgVerfication(driver);
	P009_Tow_Documentation_Page.waitFor();
	P009_Tow_Documentation_Page.TXT_DCM_MAILPopup_From(driver).sendKeys(
		From);
	String TO = ExcelUtils.getCellData(1, 14);
	P009_Tow_Documentation_Page.TXT_DCM_MAILPopup_TO(driver).clear();
	P009_Tow_Documentation_Page.waitFor();
	P009_Tow_Documentation_Page.BTN_DCM_MAILPoupup_Send(driver).click();
	P009_Tow_Documentation_Page.waitFor();
	A009_Tow_Documentation_Action.SendMailToAlertmsgVerfication(driver);
	P009_Tow_Documentation_Page.waitFor();
	P009_Tow_Documentation_Page.TXT_DCM_MAILPopup_TO(driver).sendKeys(TO);
	String CC = ExcelUtils.getCellData(1, 15);
	P009_Tow_Documentation_Page.TXT_DCM_MAILPopup_CC(driver).clear();
	P009_Tow_Documentation_Page.TXT_DCM_MAILPopup_CC(driver).sendKeys(CC);
	P009_Tow_Documentation_Page.waitFor();
	P009_Tow_Documentation_Page.BTN_DCM_MAILPoupup_Send(driver).click();
	P009_Tow_Documentation_Page.waitFor();
	A009_Tow_Documentation_Action
		.SendMailSubjectAlertmsgVerfication(driver);
	P009_Tow_Documentation_Page.waitFor();
	A009_Tow_Documentation_Action.MailValidation(driver);
	String From1 = ExcelUtils.getCellData(1, 3);
	P009_Tow_Documentation_Page.TXT_DCM_MAILPopup_From(driver).clear();
	P009_Tow_Documentation_Page.TXT_DCM_MAILPopup_From(driver).sendKeys(
		From1);
	String TO1 = ExcelUtils.getCellData(1, 4);
	P009_Tow_Documentation_Page.TXT_DCM_MAILPopup_TO(driver).clear();
	P009_Tow_Documentation_Page.TXT_DCM_MAILPopup_TO(driver).sendKeys(TO1);
	String CC1 = ExcelUtils.getCellData(1, 5);
	P009_Tow_Documentation_Page.TXT_DCM_MAILPopup_CC(driver).clear();
	P009_Tow_Documentation_Page.TXT_DCM_MAILPopup_CC(driver).sendKeys(CC1);
	String Subject = ExcelUtils.getCellData(1, 7);
	P009_Tow_Documentation_Page.TXT_DCM_MAILPopup_Subject(driver).sendKeys(
		Subject);
	P009_Tow_Documentation_Page.BTN_DCM_MAILPoupup_Send(driver).click();

    }

    public static void MandatoryValidation(WebDriver driver) throws Exception {
	String message = P009_Tow_Documentation_Page.Doc_Val_FileUpload(driver)
		.getText();
	String Validation = ExcelUtils.getCellData(1, 8);
	if (Validation.equals(message)) {
	    Reporter.log("TC009_TOW_Documentation_Page : "
		    + "Label Message - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC009_TOW_Documentation_Page : "
		    + "Label Message - Mandatory Verification - FAILED", true);
	    System.out.println(message);
	}
    }

    public static void MailValidation(WebDriver driver) throws Exception {
	String message1 = P009_Tow_Documentation_Page.Doc_SendM_FrmVal(driver)
		.getText();
	String message2 = P009_Tow_Documentation_Page.Doc_SendM_ToVal(driver)
		.getText();
	String message3 = P009_Tow_Documentation_Page.Doc_SendM_CCVal(driver)
		.getText();
	String Validation1 = ExcelUtils.getCellData(1, 9);
	String Validation2 = ExcelUtils.getCellData(1, 10);
	String Validation3 = ExcelUtils.getCellData(1, 11);
	if (Validation1.equals(message1)) {
	    Reporter.log("TC009_TOW_Documentation_Page : "
		    + "Label Message - Invalid From Address - PASSED", true);
	    System.out.println(Validation1);
	} else {
	    Reporter.log("TC009_TOW_Documentation_Page : "
		    + "Label Message - Invalid From Address - FAILED", true);
	    System.out.println(message1);
	}
	if (Validation2.equals(message2)) {
	    Reporter.log("TC009_TOW_Documentation_Page : "
		    + "Label Message - Invalid To Address - PASSED", true);
	    System.out.println(Validation2);
	} else {
	    Reporter.log("TC009_TOW_Documentation_Page : "
		    + "Label Message - Invalid To Address - FAILED", true);
	    System.out.println(message2);
	}
	if (Validation3.equals(message3)) {
	    Reporter.log("TC009_TOW_Documentation_Page : "
		    + "Label Message - Invalid CC Address - PASSED", true);
	    System.out.println(Validation3);
	} else {
	    Reporter.log("TC009_TOW_Documentation_Page : "
		    + "Label Message - Invalid CC Address - FAILED", true);
	    System.out.println(message3);
	}
    }

    public static void SaveValidation(WebDriver driver) throws Exception {
	String message = P009_Tow_Documentation_Page.Doc_Save_Val(driver)
		.getText();
	String Validation = ExcelUtils.getCellData(1, 12);
	if (Validation.equals(message)) {
	    Reporter.log("TC009_TOW_Documentation_Page : "
		    + "Label Message - Save Message Verification - PASSED",
		    true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC009_TOW_Documentation_Page : "
		    + "Label Message - Save Message Verification - FAILED",
		    true);
	    System.out.println(message);
	}
    }

    public static void SendMailFromAlertmsgVerfication(WebDriver driver)
	    throws Exception {
	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 16);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC009_TOW_Documentation_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC009_TOW_Documentation_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	}
	alert.accept();
    }

    public static void SendMailToAlertmsgVerfication(WebDriver driver)
	    throws Exception {
	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 17);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC009_TOW_Documentation_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC009_TOW_Documentation_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	}
	alert.accept();
    }

    public static void SendMailSubjectAlertmsgVerfication(WebDriver driver)
	    throws Exception {
	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 18);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC009_TOW_Documentation_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC009_TOW_Documentation_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	}
	alert.accept();
    }

}
