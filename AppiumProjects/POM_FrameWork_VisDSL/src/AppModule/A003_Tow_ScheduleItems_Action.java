package AppModule;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import PageObject.P003_Tow_ScheduleItems_Page;
import Utility.ExcelUtils;

public class A003_Tow_ScheduleItems_Action {

    public static void Execute(WebDriver driver) throws Exception {
	// TODO Auto-generated method stub

	P003_Tow_ScheduleItems_Page.waitFor();
	P003_Tow_ScheduleItems_Page.LNK_SI_lnkSchedulEItems(driver).click();
	P003_Tow_ScheduleItems_Page.waitFor();
	P003_Tow_ScheduleItems_Page.IMG_SI_Addnewitems(driver).click();
	P003_Tow_ScheduleItems_Page.waitFor();
	P003_Tow_ScheduleItems_Page.SI_iframeAddNew(driver);
	P003_Tow_ScheduleItems_Page.waitFor();
	P003_Tow_ScheduleItems_Page.Btn_SI_PopupSave(driver).click();
	P003_Tow_ScheduleItems_Page.waitFor();
	A003_Tow_ScheduleItems_Action.ItemsAlertmsgVerfication(driver);
	P003_Tow_ScheduleItems_Page.waitFor();
	// driver.switchTo().frame("UserListDialog");
	String Item = ExcelUtils.getCellData(1, 1);
	Select oSelection1 = new Select(
		P003_Tow_ScheduleItems_Page.DDN_SI_Item(driver));
	oSelection1.selectByVisibleText(Item);
	P003_Tow_ScheduleItems_Page.TXT_SI_quantity(driver).clear();
	String quantity = ExcelUtils.getCellData(1, 2);
	P003_Tow_ScheduleItems_Page.TXT_SI_quantity(driver).sendKeys(quantity);
	String Contractor = ExcelUtils.getCellData(1, 3);
	Select oSelection2 = new Select(
		P003_Tow_ScheduleItems_Page.DDN_SI_Contractor(driver));
	oSelection2.selectByVisibleText(Contractor);
	String CompletedDate = ExcelUtils.getCellData(1, 4);
	P003_Tow_ScheduleItems_Page.Date_SI_CompletedDate(driver).sendKeys(
		CompletedDate);
	P003_Tow_ScheduleItems_Page.Btn_SI_PopupSave(driver).click();
	P003_Tow_ScheduleItems_Page.waitFor();
	A003_Tow_ScheduleItems_Action.PopupSaveValidation(driver);
	P003_Tow_ScheduleItems_Page.waitFor();
	P003_Tow_ScheduleItems_Page.Btn_SI_PopuoClose(driver).click();
	P003_Tow_ScheduleItems_Page.waitFor();
	P003_Tow_ScheduleItems_Page.IMG_SI_EditItems(driver).click();
	P003_Tow_ScheduleItems_Page.waitFor();
	P003_Tow_ScheduleItems_Page.SI_iframeAddNew(driver);
	// driver.switchTo().frame("UserListDialog");
	String Comments = ExcelUtils.getCellData(1, 5);
	P003_Tow_ScheduleItems_Page.TXT_SI_Comments(driver).sendKeys(Comments);
	P003_Tow_ScheduleItems_Page.waitFor();
	P003_Tow_ScheduleItems_Page.Btn_SI_PopupSave(driver).click();
	P003_Tow_ScheduleItems_Page.waitFor();
	A003_Tow_ScheduleItems_Action.PopupUpdateValidation(driver);
	P003_Tow_ScheduleItems_Page.waitFor();
	P003_Tow_ScheduleItems_Page.Btn_SI_PopuoClose(driver).click();
	P003_Tow_ScheduleItems_Page.waitFor();
	P003_Tow_ScheduleItems_Page.BTN_SI_ExportExcel(driver).click();
	P003_Tow_ScheduleItems_Page.waitFor();
    }

    public static void PopupSaveValidation(WebDriver driver) throws Exception {
	String message = P003_Tow_ScheduleItems_Page
		.SItems_Validation_PSavemsg(driver).getText();
	String Validation = ExcelUtils.getCellData(1, 10);
	if (Validation.equals(message)) {
	    Reporter.log("TC003_TOW_ScheduleItems_Page : "
		    + "Label Message - Save Message Verification - PASSED",
		    true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC003_TOW_ScheduleItems_Page : "
		    + "Label Message - Save Message Verification - FAILED",
		    true);
	    System.out.println(message);
	}
    }

    public static void PopupUpdateValidation(WebDriver driver) throws Exception {
	String message = P003_Tow_ScheduleItems_Page
		.SItems_Validation_PUpdatemsg(driver).getText();
	String Validation = ExcelUtils.getCellData(1, 11);
	if (Validation.equals(message)) {
	    Reporter.log("TC003_TOW_ScheduleItems_Page : "
		    + "Label Message - Update Message Verification - PASSED",
		    true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC003_TOW_ScheduleItems_Page : "
		    + "Label Message - Update Message Verification - FAILED",
		    true);
	    System.out.println(message);
	}
    }

    public static void UpdateValidation(WebDriver driver) throws Exception {
	String message = P003_Tow_ScheduleItems_Page
		.Schedule_Validation_Updatemsg(driver).getText();
	String Validation = ExcelUtils.getCellData(1, 12);
	if (Validation.equals(message)) {
	    Reporter.log("TC003_TOW_ScheduleItems_Page : "
		    + "Label Message - Update Message Verification - PASSED",
		    true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC003_TOW_ScheduleItems_Page : "
		    + "Label Message - Update Message Verification - FAILED",
		    true);
	    System.out.println(message);
	}
    }

    public static void ItemsAlertmsgVerfication(WebDriver driver)
	    throws Exception {
	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 14);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC003_TOW_ScheduleItems_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC003_TOW_ScheduleItems_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	}
	alert.accept();
    }

}
