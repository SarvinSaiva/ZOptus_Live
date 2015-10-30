package AppModule;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import PageObject.P006_Tow_AAPTTechnical_Page;
import Utility.ExcelUtils;

public class A006_Tow_AAPTTechnical_Action {

    public static void Execute(WebDriver driver) throws Exception {

	P006_Tow_AAPTTechnical_Page.waitFor();
	P006_Tow_AAPTTechnical_Page.LNK_APPTT_lnkAAPTTechnical(driver).click();
	P006_Tow_AAPTTechnical_Page.waitFor();
	String BoundaryPoint = ExcelUtils.getCellData(1, 1);
	P006_Tow_AAPTTechnical_Page.TXT_APPTT_NetworkBoundaryPointDetails(
		driver).sendKeys(BoundaryPoint);
	P006_Tow_AAPTTechnical_Page.waitFor();
	String IADNo = ExcelUtils.getCellData(1, 2);
	P006_Tow_AAPTTechnical_Page.TXT_APPTT_IADNo(driver).sendKeys(IADNo);
	String Range1Source = ExcelUtils.getCellData(1, 3);
	P006_Tow_AAPTTechnical_Page.TXT_APPTT_Range1Source(driver).sendKeys(
		Range1Source);
	P006_Tow_AAPTTechnical_Page.waitFor();
	String TerminalBox = ExcelUtils.getCellData(1, 4);
	P006_Tow_AAPTTechnical_Page.TXT_APPTT_TerminationTerminalBox(driver)
		.sendKeys(TerminalBox);
	P006_Tow_AAPTTechnical_Page.waitFor();
	String TotalIAD = ExcelUtils.getCellData(1, 5);
	P006_Tow_AAPTTechnical_Page.TXT_APPTT_TotalIADs(driver).sendKeys(
		TotalIAD);
	P006_Tow_AAPTTechnical_Page.waitFor();
	P006_Tow_AAPTTechnical_Page.BTN_APPTT_Save(driver).click();
	P006_Tow_AAPTTechnical_Page.waitFor();
	A006_Tow_AAPTTechnical_Action.UpdateValidation(driver);
	P006_Tow_AAPTTechnical_Page.waitFor();

    }

    public static void UpdateValidation(WebDriver driver) throws Exception {
	String message = P006_Tow_AAPTTechnical_Page.AAPT_Validation_Updatemsg(
		driver).getText();
	String Validation = ExcelUtils.getCellData(1, 31);
	if (Validation.equals(message)) {
	    Reporter.log("TC006_TOW_APPTTechnical_Page : "
		    + "Label Message - Update Message Verification - PASSED",
		    true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC006_TOW_APPTTechnical_Page : "
		    + "Label Message - Update Message Verification - FAILED",
		    true);
	    System.out.println(message);
	}
    }
}
