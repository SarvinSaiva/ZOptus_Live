package AppModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import PageObject.P004_Tow_Technical1_Page;
import Utility.ExcelUtils;

public class A004_Tow_Technical1_Action {

    public static void Execute(WebDriver driver) throws Exception {

	P004_Tow_Technical1_Page.waitFor();
	P004_Tow_Technical1_Page.LNK_T1_lnkTechnical1(driver).click();
	P004_Tow_Technical1_Page.waitFor();
	String Macquarie = ExcelUtils.getCellData(1, 1);
	P004_Tow_Technical1_Page.TXT_T1_MacquarieServiceID(driver).sendKeys(
		Macquarie);
	P004_Tow_Technical1_Page.waitFor();
	String Telstra = ExcelUtils.getCellData(1, 37);
	P004_Tow_Technical1_Page.TXT_T1_TelCblLength(driver).sendKeys(Telstra);
	String Brand = ExcelUtils.getCellData(1, 38);
	P004_Tow_Technical1_Page.TXT_T1_Brand(driver).sendKeys(Brand);
	String Alarm = ExcelUtils.getCellData(1, 39);
	Select oSelection1 = new Select(
		P004_Tow_Technical1_Page.DDN_T1_Alarm(driver));
	oSelection1.selectByVisibleText(Alarm);
	P004_Tow_Technical1_Page.waitFor();
	String ModemType = ExcelUtils.getCellData(1, 40);
	P004_Tow_Technical1_Page.TXT_T1_ModemType(driver).sendKeys(ModemType);
	P004_Tow_Technical1_Page.waitFor();
	P004_Tow_Technical1_Page.BTN_T1_Save(driver).click();
	P004_Tow_Technical1_Page.waitFor();
	A004_Tow_Technical1_Action.UpdateValidation(driver);
	P004_Tow_Technical1_Page.waitFor();
    }

    public static void UpdateValidation(WebDriver driver) throws Exception {
	String message = P004_Tow_Technical1_Page.Tech1_Validation_Updatemsg(
		driver).getText();
	String Validation = ExcelUtils.getCellData(1, 44);
	if (Validation.equals(message)) {
	    Reporter.log("TC004_TOW_Technical1_Page : "
		    + "Label Message - Update Message Verification - PASSED",
		    true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC004_TOW_Technical1_Page : "
		    + "Label Message - Update Message Verification - FAILED",
		    true);
	    System.out.println(message);
	}
    }
}
