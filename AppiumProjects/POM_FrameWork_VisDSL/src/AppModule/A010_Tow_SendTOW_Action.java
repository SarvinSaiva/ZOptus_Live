package AppModule;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import PageObject.P010_Tow_SendTOW_Page;
import Utility.ExcelUtils;

public class A010_Tow_SendTOW_Action {

    public static void Execute(WebDriver driver) throws Exception {

	P010_Tow_SendTOW_Page.BTN_ST_SendTOW(driver).click();
	P010_Tow_SendTOW_Page.waitFor();
	P010_Tow_SendTOW_Page.PTOW_iframeSendEmail(driver);
	String From = ExcelUtils.getCellData(1, 9);
	P010_Tow_SendTOW_Page.TXT_ST_From(driver).clear();
	P010_Tow_SendTOW_Page.waitFor();
	P010_Tow_SendTOW_Page.BTN_ST_Send(driver).click();
	P010_Tow_SendTOW_Page.waitFor();
	A010_Tow_SendTOW_Action.SendMailFromAlertmsgVerfication(driver);
	P010_Tow_SendTOW_Page.waitFor();
	P010_Tow_SendTOW_Page.TXT_ST_From(driver).sendKeys(From);
	String TO = ExcelUtils.getCellData(1, 10);
	P010_Tow_SendTOW_Page.TXT_ST_To(driver).clear();
	P010_Tow_SendTOW_Page.waitFor();
	P010_Tow_SendTOW_Page.BTN_ST_Send(driver).click();
	P010_Tow_SendTOW_Page.waitFor();
	A010_Tow_SendTOW_Action.SendMailToAlertmsgVerfication(driver);
	P010_Tow_SendTOW_Page.waitFor();
	P010_Tow_SendTOW_Page.TXT_ST_To(driver).sendKeys(TO);
	String CC = ExcelUtils.getCellData(1, 11);
	P010_Tow_SendTOW_Page.TXT_ST_CC(driver).clear();
	P010_Tow_SendTOW_Page.TXT_ST_CC(driver).sendKeys(CC);
	P010_Tow_SendTOW_Page.BTN_ST_Send(driver).click();
	P010_Tow_SendTOW_Page.waitFor();
	Alert alert = driver.switchTo().alert();
	alert.accept();
	P010_Tow_SendTOW_Page.waitFor();
	A010_Tow_SendTOW_Action.MailValidation(driver);
	P010_Tow_SendTOW_Page.waitFor();
	String From1 = ExcelUtils.getCellData(1, 1);
	P010_Tow_SendTOW_Page.TXT_ST_From(driver).clear();
	P010_Tow_SendTOW_Page.TXT_ST_From(driver).sendKeys(From1);
	String TO1 = ExcelUtils.getCellData(1, 2);
	P010_Tow_SendTOW_Page.TXT_ST_To(driver).clear();
	P010_Tow_SendTOW_Page.TXT_ST_To(driver).sendKeys(TO1);
	String CC1 = ExcelUtils.getCellData(1, 3);
	P010_Tow_SendTOW_Page.TXT_ST_CC(driver).clear();
	P010_Tow_SendTOW_Page.TXT_ST_CC(driver).sendKeys(CC1);
	String FileAttach = ExcelUtils.getCellData(1, 4);
	P010_Tow_SendTOW_Page.TXT_ST_Attachfile(driver).sendKeys(FileAttach);
	P010_Tow_SendTOW_Page.waitFor();
	P010_Tow_SendTOW_Page.BTN_ST_Send(driver).click();
	P010_Tow_SendTOW_Page.waitFor();
    }

    public static void MailValidation(WebDriver driver) throws Exception {
	String message1 = P010_Tow_SendTOW_Page.PTOW_SendM_FrmVal(driver)
		.getText();
	String message2 = P010_Tow_SendTOW_Page.PTOW_SendM_ToVal(driver)
		.getText();
	String message3 = P010_Tow_SendTOW_Page.PTOW_SendM_CCVal(driver)
		.getText();
	String Validation1 = ExcelUtils.getCellData(1, 6);
	String Validation2 = ExcelUtils.getCellData(1, 7);
	String Validation3 = ExcelUtils.getCellData(1, 8);
	if (Validation1.equals(message1)) {
	    Reporter.log("TC010_TOW_SendTOW_Page : "
		    + "Label Message - Invalid From Address - PASSED", true);
	    System.out.println(Validation1);
	} else {
	    Reporter.log("TC010_TOW_SendTOW_Page : "
		    + "Label Message - Invalid From Address - FAILED", true);
	    System.out.println(message1);
	}
	if (Validation2.equals(message2)) {
	    Reporter.log("TC010_TOW_SendTOW_Page : "
		    + "Label Message - Invalid To Address - PASSED", true);
	    System.out.println(Validation2);
	} else {
	    Reporter.log("TC010_TOW_SendTOW_Page : "
		    + "Label Message - Invalid To Address - FAILED", true);
	    System.out.println(message2);
	}
	if (Validation3.equals(message3)) {
	    Reporter.log("TC010_TOW_SendTOW_Page : "
		    + "Label Message - Invalid CC Address - PASSED", true);
	    System.out.println(Validation3);
	} else {
	    Reporter.log("TC010_TOW_SendTOW_Page : "
		    + "Label Message - Invalid CC Address - FAILED", true);
	    System.out.println(message3);
	}
    }

    public static void SendMailFromAlertmsgVerfication(WebDriver driver)
	    throws Exception {
	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 12);
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
	String Validation = ExcelUtils.getCellData(1, 13);
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
