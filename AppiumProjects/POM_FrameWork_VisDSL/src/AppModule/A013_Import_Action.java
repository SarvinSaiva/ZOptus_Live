package AppModule;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import PageObject.P013_Import_Page;
import Utility.ExcelUtils;

public class A013_Import_Action {

    public static void Execute(WebDriver driver) throws Exception {
	P013_Import_Page.waitFor();
	P013_Import_Page.IMG_HDR_Import(driver).click();
	P013_Import_Page.waitFor();
	P013_Import_Page.BTN_IMD_IDimport(driver).click();
	P013_Import_Page.waitFor();
	A013_Import_Action.AlertMessageverify(driver);
	P013_Import_Page.waitFor();
	String jobtype = ExcelUtils.getCellData(1, 1);
	Select oSelection1 = new Select(
		P013_Import_Page.DDN_IMD_IDjobtype(driver));
	oSelection1.selectByVisibleText(jobtype);
	P013_Import_Page.waitFor();
	String IDrecdate = ExcelUtils.getCellData(1, 2);
	P013_Import_Page.DATE_IMD_IDrecdate(driver).sendKeys(IDrecdate);
	String Fileupload = ExcelUtils.getCellData(1, 3);
	P013_Import_Page.BTNfile_IMD_choosefile(driver).sendKeys(Fileupload);
	// driver.findElement(By.xpath(".//*[@id='ctl00_cphMainContent_fuWorkOrder']")).sendKeys("//CIS20/UploadFiles/TestData.txt");
	P013_Import_Page.waitFor();
	P013_Import_Page.BTN_IMD_IDimport(driver).click();
	P013_Import_Page.waitFor();
    }

    public static void AlertMessageverify(WebDriver driver) throws Exception {

	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 4);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC013_Import_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC013_Import_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	    System.out.println(Alertmsg);
	}
	alert.accept();
    }

}
