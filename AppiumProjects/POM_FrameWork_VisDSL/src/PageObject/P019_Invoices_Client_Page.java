package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P019_Invoices_Client_Page {

    static WebElement element = null;

    public static WebElement IMG_HDR_clientinvoice(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ucHeaderMenu_tdClientInv']"));
	return element;
    }

    public static WebElement IMG_HDR_invoice(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ucHeaderMenu_tdInvoices']/a"));
	return element;
    }

    public static WebElement BTN_CLIN_createinvoice1(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnCreateClaim']"));
	return element;
    }

    public static WebElement BTN_CLIN_InvoiceOK(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnYes']"));
	return element;

    }

    public static WebElement DDN_CLIN_crejobtype(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlJobType']"));
	return element;

    }

    public static WebElement TXTBX_CLIN_creinvoice(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtCreateClaim']"));
	return element;

    }

    public static WebElement DATE_CLIN_creend(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rdpEndDate_dateInput']"));
	return element;

    }

    public static WebElement DDN_CLIN_CLjob(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlSearchWorkType']"));
	return element;

    }

    public static WebElement BTN_CLIN_CLsearch(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSearch']"));
	return element;

    }

    public static WebElement BTN_CLIN_clientexport(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnExportToExcel']"));
	return element;

    }

    public static WebElement BTN_CLIN_cledit(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgClaimSummary_ctl00_ctl04_EditButton']"));
	return element;

    }

    public static WebElement DDN_CLIN_invstatus(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgClaimSummary_ctl00_ctl05_rcbInvoiceStatus']"));
	return element;

    }

    public static WebElement BTN_CLIN_clupdate(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgClaimSummary_ctl00_ctl05_btnSave']"));
	return element;

    }

    public static WebElement IMG_CAPP_Approved(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rtsClaimsummary']/div/ul/li[2]/a/span/span/span"));
	return element;

    }

    public static WebElement DDN_CAPP_jobtype(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlSearchWorkType']"));
	return element;

    }

    public static WebElement BTN_CAPP_Search(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSearch']"));
	return element;

    }

    public static WebElement BTN_CAPP_ExportToExcel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnExportToExcel']"));
	return element;

    }

    public static WebElement BTN_CAPP_Edit(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgClaimSummary_ctl00_ctl04_EditButton']"));
	return element;

    }

    public static WebElement TXT_CAPP_InvName(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgClaimSummary_ctl00_ctl05_txtInvName']"));
	return element;

    }

    public static WebElement BTN_CAPP_Update(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgClaimSummary_ctl00_ctl05_btnSave']"));
	return element;

    }

    public static WebElement TXT_CAPP_EditComments(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgClaimSummary_ctl00_ctl05_txtInvoiceStatusComments']"));
	return element;

    }

    public static WebElement BTN_CAPP_ViewIcon(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgClaimSummary_ctl00_ctl04_ImageButton1']"));
	return element;

    }

    public static WebElement BTN_CAPP_Back(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnBackToInvoice']"));
	return element;

    }

    public static WebElement AppClient_Val_Updatemsg(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ctl00_lblMessage']"));
	return element;
    }

    public static void waitFor() throws Exception {

	Thread.sleep(5000);

    }

}
