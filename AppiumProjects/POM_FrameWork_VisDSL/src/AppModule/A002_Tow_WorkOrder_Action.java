package AppModule;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import PageObject.P002_Tow_WorkOrder_Page;
import Utility.ExcelUtils;

public class A002_Tow_WorkOrder_Action {

    /**
     * @param args
     */
    public static void Execute(WebDriver driver) throws Exception {

	P002_Tow_WorkOrder_Page.waitFor();
	P002_Tow_WorkOrder_Page.btn_WO_Save(driver).click();
	A002_Tow_WorkOrder_Action.MandatoryValidation(driver);
	String jobtype = ExcelUtils.getCellData(1, 1);
	Select oSelection1 = new Select(
		P002_Tow_WorkOrder_Page.DDN_Jobtype(driver));
	oSelection1.selectByVisibleText(jobtype);
	P002_Tow_WorkOrder_Page.waitFor();
	String Ref = ExcelUtils.getCellData(1, 3);
	P002_Tow_WorkOrder_Page.txt_Ref(driver).sendKeys(Ref);
	String Ref2 = ExcelUtils.getCellData(1, 4);
	P002_Tow_WorkOrder_Page.txt_Ref2(driver).sendKeys(Ref2);
	String FFN = ExcelUtils.getCellData(1, 5);
	P002_Tow_WorkOrder_Page.txt_FNN(driver).sendKeys(FFN);
	String Contractor = ExcelUtils.getCellData(1, 18);
	Select oSelection2 = new Select(
		P002_Tow_WorkOrder_Page.DDN_contractor(driver));
	oSelection2.selectByVisibleText(Contractor);
	P002_Tow_WorkOrder_Page.waitFor();
	String State = ExcelUtils.getCellData(1, 31);
	Select oSelection3 = new Select(
		P002_Tow_WorkOrder_Page.DDN_State(driver));
	oSelection3.selectByVisibleText(State);
	P002_Tow_WorkOrder_Page.waitFor();
	String Exchange = ExcelUtils.getCellData(1, 33);
	Select oSelection4 = new Select(
		P002_Tow_WorkOrder_Page.DDN_Exchange(driver));
	oSelection4.selectByVisibleText(Exchange);
	P002_Tow_WorkOrder_Page.waitFor();
	P002_Tow_WorkOrder_Page.btn_WO_Save(driver).click();
	P002_Tow_WorkOrder_Page.waitFor();
	A002_Tow_WorkOrder_Action.SaveValidation(driver);
	P002_Tow_WorkOrder_Page.IMG_WO_cutover(driver).click();
	P002_Tow_WorkOrder_Page.waitFor();

	if (!P002_Tow_WorkOrder_Page.WO_iframeCutOverDate(driver).equals(null)) {

	    P002_Tow_WorkOrder_Page.BTN_WO_cutsave(driver).click();
	    P002_Tow_WorkOrder_Page.waitFor();
	    A002_Tow_WorkOrder_Action.CutoverAlertmsgVerfication(driver);
	    P002_Tow_WorkOrder_Page.waitFor();
	    String CutOverDate = ExcelUtils.getCellData(1, 64);
	    P002_Tow_WorkOrder_Page.DATE_WO_cutdate(driver).sendKeys(
		    CutOverDate);
	    P002_Tow_WorkOrder_Page.BTN_WO_cutsave(driver).click();
	}
	P002_Tow_WorkOrder_Page.waitFor();

	P002_Tow_WorkOrder_Page.IMG_WO_sheduletime(driver).click(); //
	// driver.switchTo().frame("EditScheduledDate");
	if (!P002_Tow_WorkOrder_Page.WO_iframeScheduledDate(driver)
		.equals(null)) {
	    String reviseddate = ExcelUtils.getCellData(1, 68);
	    P002_Tow_WorkOrder_Page.TXTBX_WO_reviseddate(driver).sendKeys(
		    reviseddate);
	    P002_Tow_WorkOrder_Page.TXTBX_WO_reviseddate(driver).sendKeys(
		    Keys.TAB);
	    P002_Tow_WorkOrder_Page.waitFor();
	    String sheduletime = ExcelUtils.getCellData(1, 69);
	    P002_Tow_WorkOrder_Page.waitFor();
	    P002_Tow_WorkOrder_Page.TXTBX_WO_revisedtime(driver).clear();
	    P002_Tow_WorkOrder_Page.TXTBX_WO_revisedtime(driver).click();
	    P002_Tow_WorkOrder_Page.TXTBX_WO_revisedtime(driver).sendKeys(
		    sheduletime);
	    P002_Tow_WorkOrder_Page.waitFor();
	    P002_Tow_WorkOrder_Page.BTN_WO_schedulesave(driver).click();
	    P002_Tow_WorkOrder_Page.waitFor();
	}
	if (!P002_Tow_WorkOrder_Page.WO_iframeSISendEmail(driver).equals(null)) {
	    P002_Tow_WorkOrder_Page.BTN_WO_scheduleSMCancel(driver).click();
	    P002_Tow_WorkOrder_Page.waitFor();
	}
	driver.switchTo().defaultContent();
	P002_Tow_WorkOrder_Page.WO_iframeScheduledDate(driver);
	driver.findElement(By.xpath(".//*[@id='btnCancel']")).click();

	// String ChangeCaused = ExcelUtils.getCellData(1, 170);
	// Select oSelection5 = new
	// Select(Tow_WorkOrder_Page.DDN_WO_ChangeCausedBy(driver));
	// oSelection5.selectByVisibleText(ChangeCaused);
	// Tow_WorkOrder_Page.waitFor();
	// String DTOWReason = ExcelUtils.getCellData(1, 71);
	// Select oSelection6 = new
	// Select(Tow_WorkOrder_Page.DDN_WO_DTOWReason(driver));
	// oSelection6.selectByVisibleText(DTOWReason);
	// Tow_WorkOrder_Page.waitFor();

	P002_Tow_WorkOrder_Page.waitFor();
	P002_Tow_WorkOrder_Page.BTN_WO_Additem(driver).click();
	if (!P002_Tow_WorkOrder_Page.WO_iframeEditItem(driver).equals(null)) {
	    P002_Tow_WorkOrder_Page.waitFor();
	    P002_Tow_WorkOrder_Page.BTN_WO_AIsave(driver).click();
	    P002_Tow_WorkOrder_Page.waitFor();
	    A002_Tow_WorkOrder_Action.ItemsAlertmsgVerfication(driver);
	    P002_Tow_WorkOrder_Page.waitFor();
	    String AIitem = ExcelUtils.getCellData(1, 83);
	    Select oSelection7 = new Select(
		    P002_Tow_WorkOrder_Page.DDN_WO_AIitem(driver));
	    oSelection7.selectByVisibleText(AIitem);
	    P002_Tow_WorkOrder_Page.waitFor();
	    P002_Tow_WorkOrder_Page.TXTBX_WO_AIquantity(driver).clear();
	    String AIquantity = ExcelUtils.getCellData(1, 84);
	    P002_Tow_WorkOrder_Page.TXTBX_WO_AIquantity(driver).sendKeys(
		    AIquantity);
	    P002_Tow_WorkOrder_Page.waitFor();
	    String AIcontractor = ExcelUtils.getCellData(1, 85);
	    Select oSelection8 = new Select(
		    P002_Tow_WorkOrder_Page.DDN_WO_AIcontractor(driver));
	    oSelection8.selectByVisibleText(AIcontractor);
	    String AIcomdate = ExcelUtils.getCellData(1, 86);
	    P002_Tow_WorkOrder_Page.DATE_WO_AIcomdate(driver).sendKeys(
		    AIcomdate);
	    P002_Tow_WorkOrder_Page.BTN_WO_AIsave(driver).click();
	    P002_Tow_WorkOrder_Page.waitFor();
	    A002_Tow_WorkOrder_Action.SaveItemValidation(driver);
	    P002_Tow_WorkOrder_Page.waitFor();
	    P002_Tow_WorkOrder_Page.BNT_WO_Aicancel(driver).click();
	}

	P002_Tow_WorkOrder_Page.waitFor();
	P002_Tow_WorkOrder_Page.BNT_WO_AddDTOW(driver).click();
	// driver.switchTo().frame("DTOWWindow");

	if (!P002_Tow_WorkOrder_Page.WO_iframeDTOWWindow(driver).equals(null)) {
	    P002_Tow_WorkOrder_Page.waitFor();
	    P002_Tow_WorkOrder_Page.BTN_WO_DWsave(driver).click();
	    P002_Tow_WorkOrder_Page.waitFor();
	    A002_Tow_WorkOrder_Action.DTOWAlertmsgVerfication(driver);
	    P002_Tow_WorkOrder_Page.waitFor();
	    String Dwcategory = ExcelUtils.getCellData(1, 124);
	    Select oSelection9 = new Select(
		    P002_Tow_WorkOrder_Page.DDN_WO_Dwcategory(driver));
	    oSelection9.selectByVisibleText(Dwcategory);
	    String DWdate = ExcelUtils.getCellData(1, 125);
	    P002_Tow_WorkOrder_Page.DATE_WO_DWdate(driver).sendKeys(DWdate);
	    String DWreason = ExcelUtils.getCellData(1, 127);
	    Select oSelection10 = new Select(
		    P002_Tow_WorkOrder_Page.DDN_WO_DWreason(driver));
	    oSelection10.selectByVisibleText(DWreason);
	    P002_Tow_WorkOrder_Page.waitFor();
	    P002_Tow_WorkOrder_Page.BTN_WO_DWsave(driver).click();
	    P002_Tow_WorkOrder_Page.waitFor();
	}

	if (!P002_Tow_WorkOrder_Page.WO_iframeDOWSendEmail(driver).equals(null)) {
	    P002_Tow_WorkOrder_Page.BTN_WO_DWmailCancel(driver).click();
	    P002_Tow_WorkOrder_Page.waitFor();
	}
	driver.switchTo().defaultContent();
	P002_Tow_WorkOrder_Page.WO_iframeDTOWWindow(driver);
	P002_Tow_WorkOrder_Page.BTN_WO_DWClose(driver).click();
	P002_Tow_WorkOrder_Page.waitFor();
	driver.switchTo().defaultContent();
	String fault = ExcelUtils.getCellData(1, 150);
	P002_Tow_WorkOrder_Page.TXTBX_WO_fault(driver).sendKeys(fault);
	P002_Tow_WorkOrder_Page.BTN_WO_sendemail(driver).click();
	P002_Tow_WorkOrder_Page.waitFor();
	// driver.switchTo().frame("SendEmail");
	if (!P002_Tow_WorkOrder_Page.WO_iframeSendEmail(driver).equals(null)) {

	    String From = ExcelUtils.getCellData(1, 192);
	    P002_Tow_WorkOrder_Page.TXT_WO_SM_From(driver).clear();
	    P002_Tow_WorkOrder_Page.waitFor();
	    P002_Tow_WorkOrder_Page.BTN_WO_SM_Send(driver).click();
	    P002_Tow_WorkOrder_Page.waitFor();
	    A002_Tow_WorkOrder_Action.SendMailFromAlertmsgVerfication(driver);
	    P002_Tow_WorkOrder_Page.waitFor();
	    P002_Tow_WorkOrder_Page.TXT_WO_SM_From(driver).sendKeys(From);

	    String To = ExcelUtils.getCellData(1, 193);
	    P002_Tow_WorkOrder_Page.TXT_WO_SM_To(driver).clear();
	    P002_Tow_WorkOrder_Page.waitFor();
	    P002_Tow_WorkOrder_Page.BTN_WO_SM_Send(driver).click();
	    P002_Tow_WorkOrder_Page.waitFor();
	    A002_Tow_WorkOrder_Action.SendMailToAlertmsgVerfication(driver);
	    P002_Tow_WorkOrder_Page.waitFor();
	    P002_Tow_WorkOrder_Page.TXT_WO_SM_To(driver).sendKeys(To);

	    String CC = ExcelUtils.getCellData(1, 194);
	    P002_Tow_WorkOrder_Page.TXT_WO_SM_CC(driver).clear();
	    P002_Tow_WorkOrder_Page.TXT_WO_SM_CC(driver).sendKeys(CC);
	    P002_Tow_WorkOrder_Page.waitFor();
	    P002_Tow_WorkOrder_Page.BTN_WO_SM_Send(driver).click();
	    A002_Tow_WorkOrder_Action.MailValidation(driver);
	    P002_Tow_WorkOrder_Page.waitFor();

	    String From1 = ExcelUtils.getCellData(1, 159);
	    P002_Tow_WorkOrder_Page.TXT_WO_SM_From(driver).clear();
	    P002_Tow_WorkOrder_Page.TXT_WO_SM_From(driver).sendKeys(From1);
	    String To1 = ExcelUtils.getCellData(1, 160);
	    P002_Tow_WorkOrder_Page.TXT_WO_SM_To(driver).clear();
	    P002_Tow_WorkOrder_Page.TXT_WO_SM_To(driver).sendKeys(To1);
	    String CC1 = ExcelUtils.getCellData(1, 161);
	    P002_Tow_WorkOrder_Page.TXT_WO_SM_CC(driver).clear();
	    P002_Tow_WorkOrder_Page.TXT_WO_SM_CC(driver).sendKeys(CC1);
	    P002_Tow_WorkOrder_Page.waitFor();
	    P002_Tow_WorkOrder_Page.BTN_WO_SM_Send(driver).click();
	    P002_Tow_WorkOrder_Page.waitFor();
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	    P002_Tow_WorkOrder_Page.waitFor();
	    // driver.switchTo().defaultContent();
	}
	driver.switchTo().defaultContent();
	P002_Tow_WorkOrder_Page.waitFor();

	P002_Tow_WorkOrder_Page.btn_WO_Save(driver).click();
	P002_Tow_WorkOrder_Page.waitFor();
	A002_Tow_WorkOrder_Action.UpdateValidation(driver);
	P002_Tow_WorkOrder_Page.waitFor();
	String searchref = ExcelUtils.getCellData(1, 167);
	P002_Tow_WorkOrder_Page.waitFor();
	P002_Tow_WorkOrder_Page.TXTBX_WO_searchref(driver).sendKeys(searchref);
	P002_Tow_WorkOrder_Page.waitFor();
	P002_Tow_WorkOrder_Page.BTN_WO_search(driver).click();
	P002_Tow_WorkOrder_Page.waitFor();
    }

    public static void MandatoryValidation(WebDriver driver) throws Exception {
	String message = P002_Tow_WorkOrder_Page.WO_Validation_Save(driver)
		.getText();
	String Validation = ExcelUtils.getCellData(1, 189);
	if (Validation.equals(message)) {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Label Message - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Label Message - Mandatory Verification - FAILED", true);
	    System.out.println(message);
	}
    }

    public static void SaveValidation(WebDriver driver) throws Exception {
	String message = P002_Tow_WorkOrder_Page.WO_Validation_Savemsg(driver)
		.getText();
	String Validation = ExcelUtils.getCellData(1, 190);
	if (Validation.equals(message)) {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Label Message - Save Message Verification - PASSED",
		    true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Label Message - Save Message Verification - FAILED",
		    true);
	    System.out.println(message);
	}
    }

    public static void SaveItemValidation(WebDriver driver) throws Exception {
	String message = P002_Tow_WorkOrder_Page.WO_AddItemVal_Savemsg(driver)
		.getText();
	String Validation = ExcelUtils.getCellData(1, 191);
	if (Validation.equals(message)) {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Label Message - Save Message Verification - PASSED",
		    true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Label Message - Save Message Verification - FAILED",
		    true);
	    System.out.println(message);
	}
    }

    public static void MailValidation(WebDriver driver) throws Exception {
	String message1 = P002_Tow_WorkOrder_Page.WO_SendM_FrmVal(driver)
		.getText();
	String message2 = P002_Tow_WorkOrder_Page.WO_SendM_ToVal(driver)
		.getText();
	String message3 = P002_Tow_WorkOrder_Page.WO_SendM_CCVal(driver)
		.getText();
	String Validation1 = ExcelUtils.getCellData(1, 195);
	String Validation2 = ExcelUtils.getCellData(1, 196);
	String Validation3 = ExcelUtils.getCellData(1, 197);
	if (Validation1.equals(message1)) {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Label Message - Invalid From Address - PASSED", true);
	    System.out.println(Validation1);
	} else {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Label Message - Invalid From Address - FAILED", true);
	    System.out.println(message1);
	}
	if (Validation2.equals(message2)) {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Label Message - Invalid To Address - PASSED", true);
	    System.out.println(Validation2);
	} else {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Label Message - Invalid To Address - FAILED", true);
	    System.out.println(message2);
	}
	if (Validation3.equals(message3)) {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Label Message - Invalid CC Address - PASSED", true);
	    System.out.println(Validation3);
	} else {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Label Message - Invalid CC Address - FAILED", true);
	    System.out.println(message3);
	}
    }

    public static void UpdateValidation(WebDriver driver) throws Exception {
	String message = P002_Tow_WorkOrder_Page
		.WO_Validation_Updatemsg(driver).getText();
	String Validation = ExcelUtils.getCellData(1, 198);
	if (Validation.equals(message)) {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Label Message - Update Message Verification - PASSED",
		    true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Label Message - Update Message Verification - FAILED",
		    true);
	    System.out.println(message);
	}
    }

    public static void CutoverAlertmsgVerfication(WebDriver driver)
	    throws Exception {
	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 199);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	}
	alert.accept();
    }

    public static void DTOWAlertmsgVerfication(WebDriver driver)
	    throws Exception {
	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 200);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	}
	alert.accept();
    }

    public static void ItemsAlertmsgVerfication(WebDriver driver)
	    throws Exception {
	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 201);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	}
	alert.accept();
    }

    public static void SendMailFromAlertmsgVerfication(WebDriver driver)
	    throws Exception {
	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 202);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	}
	alert.accept();
    }

    public static void SendMailToAlertmsgVerfication(WebDriver driver)
	    throws Exception {
	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 203);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC002_TOW_WorkOrder_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	}
	alert.accept();
    }

}
