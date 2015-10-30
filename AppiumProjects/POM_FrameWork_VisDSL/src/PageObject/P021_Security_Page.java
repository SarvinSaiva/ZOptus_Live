package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P021_Security_Page {

    static WebElement element = null;

    public static WebElement IMG_HDR_security(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ucHeaderMenu_tdSecurity']"));
	return element;
    }

    public static WebElement TXTBX_STY_username(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtUserName']"));
	return element;
    }

    public static WebElement BTN_STY_stysearch(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSearch']"));
	return element;

    }

    public static WebElement BTN_STY_styclear(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnClear']"));
	return element;

    }

    public static WebElement LNKBTN_STY_styaddnew(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_lnkNewWorkOrder']"));
	return element;

    }

    public static WebElement BTN_STY_createuser(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSave']"));
	return element;

    }

    public static WebElement BTN_STY_Cancel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnCancel']"));
	return element;

    }

    public static WebElement CHKBX_STY_project(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_chklProject_0']"));
	return element;

    }

    public static WebElement DDN_STY_company(WebDriver driver) {

	element = driver
		.findElement(By.name("ctl00$cphMainContent$rcbCompany"));
	return element;

    }

    public static WebElement DDN_STY_AccessLevel(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rcbCustomerType']/table/tbody/tr/td[1]"));
	return element;

    }

    public static WebElement DDN_STY_Technician(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_rcbTechnician_Input']"));
	return element;

    }

    public static WebElement TXTBX_STY_addusername(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtUserName']"));
	return element;

    }

    public static WebElement TXTBX_STY_addfirstname(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtFirstName']"));
	return element;

    }

    public static WebElement TXTBX_STY_addlastname(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtLastName']"));
	return element;

    }

    public static WebElement BTN_STY_updateuser(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnSave']"));
	return element;

    }

    public static WebElement BTN_STY_styedit(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgUserSummary_ctl00_ctl04_ibtnEdit']"));
	return element;

    }

    public static WebElement TXTBX_STY_editemail(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_txtEmail']"));
	return element;

    }

    public static WebElement Sec_val_Projectlst(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_cvProjects']"));
	return element;

    }

    public static WebElement Sec_Val_Company(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_rfvCompany']"));
	return element;

    }

    public static WebElement Sec_Val_Acclevel(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_rfvCustomerType']"));
	return element;

    }

    public static WebElement Sec_Val_Username(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_rfvUserName']"));
	return element;

    }

    public static WebElement Sec_Val_FirstName(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_rfvFirstName']"));
	return element;

    }

    public static WebElement Sec_Val_LastName(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_rfvLastName']"));
	return element;

    }

    public static void waitFor() throws Exception {

	Thread.sleep(5000);

    }

}
