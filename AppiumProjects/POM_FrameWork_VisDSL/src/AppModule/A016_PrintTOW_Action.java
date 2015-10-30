package AppModule;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import PageObject.P016_PrintTOW_Page;
import Utility.ExcelUtils;

public class A016_PrintTOW_Action {

    public static void Execute(WebDriver driver) throws Exception {

	P016_PrintTOW_Page.IMG_HDR_printow(driver).click();
	P016_PrintTOW_Page.waitFor();
	P016_PrintTOW_Page.BTN_PT_ptsend(driver).click();
	P016_PrintTOW_Page.waitFor();
	A016_PrintTOW_Action.AlertMessageverify(driver);
	P016_PrintTOW_Page.waitFor();
	String Scheduledte = ExcelUtils.getCellData(1, 1);
	P016_PrintTOW_Page.DATE_PT_Scheduledte(driver).sendKeys(Scheduledte);
	String PTcontractor = ExcelUtils.getCellData(1, 2);
	Select oSelection1 = new Select(
		P016_PrintTOW_Page.DDN_PT_PTcontractor(driver));
	oSelection1.selectByVisibleText(PTcontractor);
	P016_PrintTOW_Page.waitFor();
	String status = ExcelUtils.getCellData(1, 4);
	Select oSelection2 = new Select(
		P016_PrintTOW_Page.DDN_PT_status(driver));
	oSelection2.selectByVisibleText(status);
	P016_PrintTOW_Page.waitFor();
	P016_PrintTOW_Page.BTN_PT_ptsend(driver).click();
	P016_PrintTOW_Page.waitFor();

	if (!P016_PrintTOW_Page.PT_iframeMailpopup(driver).equals(null)) {
	    // PrintTOW_Page.PT_iframeMailpopup(driver);
	    String From = ExcelUtils.getCellData(1, 13);
	    P016_PrintTOW_Page.TXT_PT_From(driver).clear();
	    P016_PrintTOW_Page.waitFor();
	    P016_PrintTOW_Page.BTN_PT_Send(driver).click();
	    P016_PrintTOW_Page.waitFor();
	    A016_PrintTOW_Action.SendMailFromAlertmsgVerfication(driver);
	    P016_PrintTOW_Page.waitFor();
	    P016_PrintTOW_Page.TXT_PT_From(driver).sendKeys(From);
	    String TO = ExcelUtils.getCellData(1, 14);
	    P016_PrintTOW_Page.TXT_PT_To(driver).clear();
	    P016_PrintTOW_Page.waitFor();
	    P016_PrintTOW_Page.BTN_PT_Send(driver).click();
	    P016_PrintTOW_Page.waitFor();
	    A016_PrintTOW_Action.SendMailToAlertmsgVerfication(driver);
	    P016_PrintTOW_Page.waitFor();
	    P016_PrintTOW_Page.TXT_PT_To(driver).sendKeys(TO);
	    String CC = ExcelUtils.getCellData(1, 15);
	    P016_PrintTOW_Page.TXT_PT_CC(driver).clear();
	    P016_PrintTOW_Page.TXT_PT_CC(driver).sendKeys(CC);
	    P016_PrintTOW_Page.waitFor();
	    P016_PrintTOW_Page.BTN_PT_Send(driver).click();
	    P016_PrintTOW_Page.waitFor();
	    Alert alert1 = driver.switchTo().alert();
	    alert1.accept();
	    P016_PrintTOW_Page.waitFor();
	    A016_PrintTOW_Action.MailValidation(driver);
	    P016_PrintTOW_Page.waitFor();
	    String From1 = ExcelUtils.getCellData(1, 5);
	    P016_PrintTOW_Page.TXT_PT_From(driver).clear();
	    P016_PrintTOW_Page.TXT_PT_From(driver).sendKeys(From1);
	    String TO1 = ExcelUtils.getCellData(1, 6);
	    P016_PrintTOW_Page.TXT_PT_To(driver).clear();
	    P016_PrintTOW_Page.TXT_PT_To(driver).sendKeys(TO1);
	    String CC1 = ExcelUtils.getCellData(1, 7);
	    P016_PrintTOW_Page.TXT_PT_CC(driver).clear();
	    P016_PrintTOW_Page.TXT_PT_CC(driver).sendKeys(CC1);
	    // driver.findElement(By.xpath(".//*[@id='fpuAttachment']")).sendKeys("//CIS20/UploadFiles/TestData.txt");
	    // PrintTOW_Page.waitFor();
	    P016_PrintTOW_Page.waitFor();
	    P016_PrintTOW_Page.BTN_PT_Send(driver).click();
	    P016_PrintTOW_Page.waitFor();
	    Alert alert = driver.switchTo().alert(); // *Accept Popup
	    alert.accept();
	    P016_PrintTOW_Page.waitFor();
	    String ParentWindow = driver.getWindowHandle();
	    driver.switchTo().window(ParentWindow);
	}

	P016_PrintTOW_Page.BTN_PT_ptpreview(driver).click();
	P016_PrintTOW_Page.waitFor();

	P016_PrintTOW_Page.BNT_PT_ptclear(driver).click();
	P016_PrintTOW_Page.waitFor();

    }

    public static void MailValidation(WebDriver driver) throws Exception {
	String message1 = P016_PrintTOW_Page.PTOW_SendM_FrmVal(driver)
		.getText();
	String message2 = P016_PrintTOW_Page.PTOW_SendM_ToVal(driver).getText();
	String message3 = P016_PrintTOW_Page.PTOW_SendM_CCVal(driver).getText();
	String Validation1 = ExcelUtils.getCellData(1, 10);
	String Validation2 = ExcelUtils.getCellData(1, 11);
	String Validation3 = ExcelUtils.getCellData(1, 12);
	if (Validation1.equals(message1)) {
	    Reporter.log("TC016_PrintTOW_Page : "
		    + "Label Message - Invalid From Address - PASSED", true);
	    System.out.println(Validation1);
	} else {
	    Reporter.log("TC016_PrintTOW_Page : "
		    + "Label Message - Invalid From Address - FAILED", true);
	    System.out.println(message1);
	}
	if (Validation2.equals(message2)) {
	    Reporter.log("TC016_PrintTOW_Page : "
		    + "Label Message - Invalid To Address - PASSED", true);
	    System.out.println(Validation2);
	} else {
	    Reporter.log("TC016_PrintTOW_Page : "
		    + "Label Message - Invalid To Address - FAILED", true);
	    System.out.println(message2);
	}
	if (Validation3.equals(message3)) {
	    Reporter.log("TC016_PrintTOW_Page : "
		    + "Label Message - Invalid CC Address - PASSED", true);
	    System.out.println(Validation3);
	} else {
	    Reporter.log("TC016_PrintTOW_Page : "
		    + "Label Message - Invalid CC Address - FAILED", true);
	    System.out.println(message3);
	}
    }

    public static void AlertMessageverify(WebDriver driver) throws Exception {

	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 16);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC016_PrintTOW_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC016_PrintTOW_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	    System.out.println(Alertmsg);
	}
	alert.accept();
    }

    public static void SendMailFromAlertmsgVerfication(WebDriver driver)
	    throws Exception {
	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 17);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC016_PrintTOW_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC016_PrintTOW_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	    System.out.println(Alertmsg);
	}
	alert.accept();
    }

    public static void SendMailToAlertmsgVerfication(WebDriver driver)
	    throws Exception {
	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 18);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC016_PrintTOW_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC016_PrintTOW_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	    System.out.println(Alertmsg);
	}
	alert.accept();
    }
}
