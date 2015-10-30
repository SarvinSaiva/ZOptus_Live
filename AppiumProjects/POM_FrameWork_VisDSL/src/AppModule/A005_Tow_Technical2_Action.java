package AppModule;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import PageObject.P005_Tow_Technical2_Page;
import Utility.ExcelUtils;

public class A005_Tow_Technical2_Action {

    public static void Execute(WebDriver driver) throws Exception {

	P005_Tow_Technical2_Page.waitFor();
	P005_Tow_Technical2_Page.LNK_T2_lnkTechnical2(driver).click();
	P005_Tow_Technical2_Page.waitFor();
	String DoorKey = ExcelUtils.getCellData(1, 1);
	P005_Tow_Technical2_Page.TXT_T2_DoorKeys(driver).sendKeys(DoorKey);
	P005_Tow_Technical2_Page.waitFor();
	String UplinkMedia = ExcelUtils.getCellData(1, 2);
	P005_Tow_Technical2_Page.TXT_T2_UplinkMedia(driver).sendKeys(
		UplinkMedia);
	String ULLSSS = ExcelUtils.getCellData(1, 3);
	P005_Tow_Technical2_Page.TXT_T2_ULLSSS(driver).sendKeys(ULLSSS);
	P005_Tow_Technical2_Page.waitFor();
	String GateKey = ExcelUtils.getCellData(1, 4);
	P005_Tow_Technical2_Page.TXT_T2_GateKeys(driver).sendKeys(GateKey);
	P005_Tow_Technical2_Page.waitFor();
	String ECNPort = ExcelUtils.getCellData(1, 5);
	P005_Tow_Technical2_Page.TXT_T2_ECNPort(driver).sendKeys(ECNPort);
	P005_Tow_Technical2_Page.waitFor();
	String Cpair = ExcelUtils.getCellData(1, 6);
	P005_Tow_Technical2_Page.TXT_T2_Cpair(driver).sendKeys(Cpair);
	P005_Tow_Technical2_Page.waitFor();
	P005_Tow_Technical2_Page.BTN_T2_Save(driver).click();
	P005_Tow_Technical2_Page.waitFor();
	A005_Tow_Technical2_Action.UpdateValidation(driver);
	P005_Tow_Technical2_Page.waitFor();
    }

    public static void UpdateValidation(WebDriver driver) throws Exception {
	String message = P005_Tow_Technical2_Page.Tech2_Validation_Updatemsg(
		driver).getText();
	String Validation = ExcelUtils.getCellData(1, 17);
	if (Validation.equals(message)) {
	    Reporter.log("TC005_TOW_Technical2_Page : "
		    + "Label Message - Update Message Verification - PASSED",
		    true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC005_TOW_Technical2_Page : "
		    + "Label Message - Update Message Verification - FAILED",
		    true);
	    System.out.println(message);
	}
    }
}
