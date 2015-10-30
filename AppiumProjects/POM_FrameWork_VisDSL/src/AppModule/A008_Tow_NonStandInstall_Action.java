package AppModule;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import PageObject.P008_Tow_NonStandInstall_Page;
import Utility.ExcelUtils;

public class A008_Tow_NonStandInstall_Action {

    public static void Execute(WebDriver driver) throws Exception {

	P008_Tow_NonStandInstall_Page.LNK_NSI_lnkStock(driver).click();
	P008_Tow_NonStandInstall_Page.waitFor();
	String BillingAmount = ExcelUtils.getCellData(1, 1);
	P008_Tow_NonStandInstall_Page.TXT_NSI_BillingAmount(driver).sendKeys(
		BillingAmount);
	P008_Tow_NonStandInstall_Page.waitFor();
	String ApprovedBy = ExcelUtils.getCellData(1, 2);
	P008_Tow_NonStandInstall_Page.TXT_ApprovedBy(driver).sendKeys(
		ApprovedBy);
	P008_Tow_NonStandInstall_Page.waitFor();
	String NumberofHours = ExcelUtils.getCellData(1, 3);
	P008_Tow_NonStandInstall_Page.TXT_NSI_NumberofHours(driver).sendKeys(
		NumberofHours);
	String MaterialValues = ExcelUtils.getCellData(1, 4);
	P008_Tow_NonStandInstall_Page.TXT_NSI_MaterialValues(driver).sendKeys(
		MaterialValues);
	P008_Tow_NonStandInstall_Page.waitFor();
	P008_Tow_NonStandInstall_Page.TXT_NSI_Save(driver).click();
	P008_Tow_NonStandInstall_Page.waitFor();
	A008_Tow_NonStandInstall_Action.UpdateValidation(driver);
	P008_Tow_NonStandInstall_Page.waitFor();

    }

    public static void UpdateValidation(WebDriver driver) throws Exception {
	String message = P008_Tow_NonStandInstall_Page
		.NonStand_Validation_Updatemsg(driver).getText();
	String Validation = ExcelUtils.getCellData(1, 11);
	if (Validation.equals(message)) {
	    Reporter.log("TC008_TOW_NonStandInstall_Page : "
		    + "Label Message - Update Message Verification - PASSED",
		    true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC008_TOW_NonStandInstall_Page : "
		    + "Label Message - Update Message Verification - FAILED",
		    true);
	    System.out.println(message);
	}
    }
}
