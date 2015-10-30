package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P003_Tow_ScheduleItems_Page {

    static WebElement element = null;

    public static WebElement LNK_SI_lnkSchedulEItems(WebDriver driver) {

	element = driver.findElement(By
		.xpath(". //*[@id='ucLeftMenu_lnkTaskItems']"));
	return element;
    }

    public static WebElement IMG_SI_Addnewitems(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgItems_ctl00_ctl02_ctl00_lnkAddNewItem']/img"));
	return element;
    }

    public static WebElement DDN_SI_Item(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ddlItems']"));
	return element;
    }

    public static WebElement TXT_SI_quantity(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtQuantity']"));
	return element;
    }

    public static WebElement DDN_SI_Contractor(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ddlContractor']"));
	return element;
    }

    public static WebElement Date_SI_CompletedDate(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='rdpCompletedDate_dateInput']"));
	return element;
    }

    public static WebElement Btn_SI_PopupSave(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnSave'] "));
	return element;
    }

    public static WebElement Btn_SI_PopuoClose(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btncancel']"));
	return element;
    }

    public static WebElement IMG_SI_EditItems(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgItems_ctl00_ctl04_EditLink']/img"));
	return element;
    }

    public static WebElement TXT_SI_Comments(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtComments']"));
	return element;
    }

    public static WebElement BTN_SI_ExportExcel(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_btnExportToExcelItems']"));
	return element;
    }

    public static void waitFor() throws Exception {

	Thread.sleep(3000);

    }

    public static WebElement SI_iframeAddNew(WebDriver driver) {

	driver.switchTo().frame("UserListDialog");
	return element;

    }

    public static WebElement SItems_Validation_PSavemsg(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='lblSuccessMsg']"));
	return element;
    }

    public static WebElement SItems_Validation_PUpdatemsg(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='lblSuccessMsg']"));
	return element;
    }

    public static WebElement Schedule_Validation_Updatemsg(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ctl00_lblMessage']"));
	return element;
    }

}
