package AppModule;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import PageObject.P018_Invoices_Contr_Page;
import Utility.ExcelUtils;

public class A018_Invoices_Contr_Action {

    @Test
    public void UnApproved_Invoices(WebDriver driver) throws Exception {
	P018_Invoices_Contr_Page.waitFor();
	Actions action = new Actions(driver);
	WebElement element1 = P018_Invoices_Contr_Page.IMG_HDR_invoice(driver);
	action.moveToElement(element1)
		.moveToElement(
			P018_Invoices_Contr_Page.IMG_HDR_contrinvoice(driver))
		.click().build().perform();
	P018_Invoices_Contr_Page.waitFor();
	P018_Invoices_Contr_Page.BTN_INV_createinvoice(driver).click();
	P018_Invoices_Contr_Page.waitFor();
	A018_Invoices_Contr_Action.MandatoryValidation(driver);
	P018_Invoices_Contr_Page.waitFor();
	String endappr = ExcelUtils.getCellData(1, 4);
	P018_Invoices_Contr_Page.DATE_INV_endappr(driver).sendKeys(endappr);
	P018_Invoices_Contr_Page.BTN_INV_createinvoice(driver).click();
	P018_Invoices_Contr_Page.waitFor();
	P018_Invoices_Contr_Page.BTN_INV_InvoiceOK(driver).click();
	P018_Invoices_Contr_Page.waitFor();
	A018_Invoices_Contr_Action.SaveValidation(driver);
	P018_Invoices_Contr_Page.waitFor();
	String refsearch = ExcelUtils.getCellData(1, 1);
	P018_Invoices_Contr_Page.TXTBX_INV_refsearch(driver)
		.sendKeys(refsearch);
	P018_Invoices_Contr_Page.waitFor();
	P018_Invoices_Contr_Page.BTN_INV_searchsave(driver).click();
	P018_Invoices_Contr_Page.waitFor();
	P018_Invoices_Contr_Page.BTN_INV_searchclear(driver).click();
	P018_Invoices_Contr_Page.waitFor();
    }

    @Test
    public void Approved_Invoices(WebDriver driver) throws Exception {

	P018_Invoices_Contr_Page.waitFor();
	P018_Invoices_Contr_Page.IMG_LM_Approved(driver).click();
	P018_Invoices_Contr_Page.waitFor();
	P018_Invoices_Contr_Page.BTN_AINV_EditInvoice(driver).click();
	P018_Invoices_Contr_Page.waitFor();
	P018_Invoices_Contr_Page.BTN_AIN_Updatebutton(driver).click();
	P018_Invoices_Contr_Page.waitFor();
	A018_Invoices_Contr_Action.UpdateValidation(driver);
	P018_Invoices_Contr_Page.waitFor();
	P018_Invoices_Contr_Page.BTN_AINV_Viewbutton(driver).click();
	P018_Invoices_Contr_Page.waitFor();
	P018_Invoices_Contr_Page.BTN_AINV_BacktoInvoice(driver).click();
	P018_Invoices_Contr_Page.waitFor();
	String AppRef1 = ExcelUtils.getCellData(1, 6);
	P018_Invoices_Contr_Page.TXT_AINV_Ref1(driver).sendKeys(AppRef1);
	P018_Invoices_Contr_Page.waitFor();
	P018_Invoices_Contr_Page.BTN_AINV_Search(driver).click();
    }

    @Test
    public void Disputed_Invoices(WebDriver driver) throws Exception {

	P018_Invoices_Contr_Page.waitFor();
	P018_Invoices_Contr_Page.IMG_LM_Disputed(driver).click();
	P018_Invoices_Contr_Page.waitFor();
	String AppRef1 = ExcelUtils.getCellData(1, 12);
	P018_Invoices_Contr_Page.TXT_DIS_Ref1(driver).sendKeys(AppRef1);
	P018_Invoices_Contr_Page.waitFor();
	P018_Invoices_Contr_Page.BTN_DIS_Search(driver).click();
	P018_Invoices_Contr_Page.waitFor();

    }

    @Test
    public void Resolved_Invoices(WebDriver driver) throws Exception {

	P018_Invoices_Contr_Page.waitFor();
	P018_Invoices_Contr_Page.IMG_LM_Resolved(driver).click();
	P018_Invoices_Contr_Page.waitFor();
	String Company = ExcelUtils.getCellData(1, 19);
	Select oSelection1 = new Select(
		P018_Invoices_Contr_Page.DDN_Res_Company(driver));
	oSelection1.selectByVisibleText(Company);
	P018_Invoices_Contr_Page.waitFor();
	P018_Invoices_Contr_Page.BTN_Res_Search(driver).click();
	P018_Invoices_Contr_Page.waitFor();
	P018_Invoices_Contr_Page.BTN_Res_Exportexcel(driver).click();
	P018_Invoices_Contr_Page.waitFor();
    }

    public static void MandatoryValidation(WebDriver driver) throws Exception {
	String message = P018_Invoices_Contr_Page.INContr_Val_CI(driver)
		.getText();
	String Validation = ExcelUtils.getCellData(1, 22);
	if (Validation.equals(message)) {
	    Reporter.log("TC018_Invoice_Contr_Page : "
		    + "Label Message - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC018_Invoice_Contr_Page : "
		    + "Label Message - Mandatory Verification - FAILED", true);
	    System.out.println(message);
	}
    }

    public static void SaveValidation(WebDriver driver) throws Exception {
	String message = P018_Invoices_Contr_Page.INContr_ValCI_Savemsg(driver)
		.getText();
	String Validation = ExcelUtils.getCellData(1, 23);
	if (Validation.equals(message)) {
	    Reporter.log("TC018_Invoice_Contr_Page : "
		    + "Label Message - Create Message Verification - PASSED",
		    true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC018_Invoice_Contr_Page : "
		    + "Label Message - Create Message Verification - FAILED",
		    true);
	    System.out.println(message);
	}
    }

    public static void UpdateValidation(WebDriver driver) throws Exception {
	String message = P018_Invoices_Contr_Page.AppContr_Val_Savemsg(driver)
		.getText();
	String Validation = ExcelUtils.getCellData(1, 26);
	if (Validation.equals(message)) {
	    Reporter.log("TC018_Invoice_Contr_Page : "
		    + "Label Message - Save Message Verification - PASSED",
		    true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC018_Invoice_Contr_Page : "
		    + "Label Message - Save Message Verification - FAILED",
		    true);
	    System.out.println(message);
	}
    }

}
