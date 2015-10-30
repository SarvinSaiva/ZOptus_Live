package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P018_Invoices_Contr_Page {

    static WebElement element = null;

    public static WebElement IMG_HDR_invoice(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ucHeaderMenu_tdInvoices']/a"));
	return element;
    }

    public static WebElement IMG_HDR_contrinvoice(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ucHeaderMenu_tdCtrtInv']"));
	return element;
    }

    public static WebElement BTN_INV_createinvoice(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnCreateInvoice']"));
	return element;

    }

    public static WebElement DDN_INV_CreateInvoiceCompany(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_ddlCreateInvoiceCompany']"));
	return element;

    }

    public static WebElement DATE_INV_endappr(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rdpEndDate_dateInput']"));
	return element;

    }

    public static WebElement BTN_INV_InvoiceOK(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnInvoiceOK']"));
	return element;

    }

    public static WebElement TXTBX_INV_refsearch(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtRef1']"));
	return element;

    }

    public static WebElement BTN_INV_searchsave(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSearch']"));
	return element;

    }

    public static WebElement BTN_INV_searchclear(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnClear']"));
	return element;

    }

    public static WebElement BTN_INV_edit(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInvoiceSummary_ctl00_ctl04_EditButton']"));
	return element;

    }

    public static WebElement CHKBX_INV_vplapproved(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInvoiceSummary_ctl00_ctl05_chkPreApproved']"));
	return element;

    }

    public static WebElement BTN_INV_update(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInvoiceSummary_ctl00_ctl05_btnSave']"));
	return element;

    }

    public static WebElement CHKBX_INV_single(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInvoiceSummary_ctl00_ctl04_chkSelect']"));
	return element;

    }

    public static WebElement BTN_INV_deleteinvoice(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnDeleteInvoice']"));
	return element;

    }

    public static WebElement BTN_INV_view(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInvoiceSummary_ctl00_ctl04_ImageButton1']"));
	return element;

    }

    public static WebElement BTN_UINV_BackToInvoice(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnBackToInvoice']"));
	return element;

    }

    public static WebElement BTN_INV_export(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnExportToExcel']"));
	return element;

    }

    public static WebElement IMG_LM_Approved(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphLeftMenu_ucLeftMenu_lnkApproved']"));
	return element;

    }

    public static WebElement TXT_AINV_Ref1(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtRef1']"));
	return element;

    }

    public static WebElement BTN_AINV_Search(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSearch']"));
	return element;

    }

    public static WebElement BTN_AINV_EditInvoice(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInvoiceSummary_ctl00_ctl04_EditButton']"));
	return element;

    }

    public static WebElement BTN_AIN_Updatebutton(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInvoiceSummary_ctl00_ctl05_btnSave']"));
	return element;

    }

    public static WebElement BTN_AINV_Viewbutton(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgInvoiceSummary_ctl00_ctl04_ImageButton1']"));
	return element;

    }

    public static WebElement BTN_AINV_BacktoInvoice(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnBackToInvoice']"));
	return element;

    }

    public static WebElement IMG_LM_Disputed(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphLeftMenu_ucLeftMenu_lnkDisputed']"));
	return element;

    }

    public static WebElement TXT_DIS_Ref1(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtRef1']"));
	return element;

    }

    public static WebElement BTN_DIS_Search(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSearch']"));
	return element;

    }

    public static WebElement IMG_LM_Resolved(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphLeftMenu_ucLeftMenu_lnkResolved']"));
	return element;

    }

    public static WebElement DDN_Res_Company(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlCompany']"));
	return element;

    }

    public static WebElement BTN_Res_Search(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSearch']"));
	return element;

    }

    public static WebElement BTN_Res_Exportexcel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnExportToExcel']"));
	return element;

    }

    public static WebElement LNK_lnkTOWHome(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ucHeaderMenu_tdHome']"));
	return element;
    }

    public static WebElement TXTBX_WO_searchref(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='SearchtxtRef1']"));
	return element;
    }

    public static WebElement BTN_WO_search(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnSearch']"));
	return element;
    }

    public static WebElement WO_iframeEditItem(WebDriver driver) {

	driver.switchTo().frame("AddEditItem");
	return element;

    }

    public static WebElement BTN_WO_Additem(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnAddItem']"));
	return element;
    }

    public static WebElement DDN_WO_AIitem(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ddlItems']"));
	return element;
    }

    public static WebElement TXTBX_WO_AIquantity(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtQuantity']"));
	return element;
    }

    public static WebElement DDN_WO_AIcontractor(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ddlContractor']"));
	return element;
    }

    public static WebElement DATE_WO_AIcomdate(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='rdpCompletedDate_dateInput']"));
	return element;
    }

    public static WebElement BTN_WO_AIsave(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnSave']"));
	return element;
    }

    public static WebElement BNT_WO_Aicancel(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btncancel']"));
	return element;
    }

    public static WebElement INContr_Val_CI(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ctl00_lblMessage']"));
	return element;
    }

    public static WebElement INContr_ValCI_Savemsg(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ctl00_lblMessage']"));
	return element;
    }

    public static WebElement AppContr_Val_Savemsg(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ctl00_lblMessage']"));
	return element;
    }

    public static void waitFor() throws Exception {

	Thread.sleep(4000);

    }

}
