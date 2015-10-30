package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P017_Reports_Page {

    static WebElement element = null;

    public static WebElement LNK_RPT_lnkReports(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ucHeaderMenu_lnkReports']"));
	return element;
    }

    public static WebElement IMG_rpt_AcknowledgementRpt_View(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgReports_ctl00_ctl04_img']"));
	return element;
    }

    public static WebElement BTN_AcknowledgementRpt_ViewReport(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnViewReport']"));
	return element;

    }

    public static WebElement DDN_AcknowledgementRpt_client(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ddlCient']"));
	return element;

    }

    public static WebElement Date_AcknowledgementRpt_Date(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rdpDate_dateInput']"));
	return element;

    }

    public static WebElement BTN_AcknowledgementRpt_Clear(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnClear']"));
	return element;

    }

    public static WebElement ICON_AcknowledgementRpt_Close(WebDriver driver)
	    throws InterruptedException, AWTException {

	/*
	 * element = driver .findElement(By .xpath(
	 * ".//*[@id='RadWindowWrapper_ctl00_cphMainContent_RadReportWindow']/table/tbody/tr[1]/td[2]/table/tbody/tr/td[3]/ul/li[2]"
	 * ));
	 */

	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_F5);

	robot.keyRelease(KeyEvent.VK_F5);
	robot.keyRelease(KeyEvent.VK_CONTROL);

	Thread.sleep(3000);

	robot.keyRelease(KeyEvent.VK_ENTER);

	return element;

    }

    public static WebElement Report_iframe(WebDriver driver) {

	driver.switchTo().frame("RadReportWindow");
	return element;

    }

    public static WebElement IMG_rpt_NoAppointmentRpt_View(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgReports_ctl00_ctl06_img']"));
	return element;
    }

    public static WebElement DDN_NoAppointmentRpt_client(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ddlCient']"));
	return element;

    }

    public static WebElement Date_NoAppointmentRpt_Date(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rdpDate_dateInput']"));
	return element;

    }

    public static WebElement BTN_NoAppointmentRpt_ViewReport(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnViewReport']"));
	return element;

    }

    public static WebElement BTN_NoAppointmentRpt_Clear(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnClear']"));
	return element;

    }

    public static WebElement ICON_NoAppointmentRpt_Close(WebDriver driver)
	    throws InterruptedException {

	/*
	 * element = driver .findElement(By .xpath(
	 * ".//*[@id='RadWindowWrapper_ctl00_cphMainContent_RadReportWindow']/table/tbody/tr[1]/td[2]/table/tbody/tr/td[3]/ul/li[2]/a"
	 * ));
	 */
	Actions CtlK = new Actions(driver);
	CtlK.sendKeys(Keys.chord(Keys.CONTROL, "F5"));
	Thread.sleep(3000);
	CtlK.sendKeys(Keys.ENTER);
	return element;

    }

    public static WebElement IMG_rpt_AppointmentRpt_View(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgReports_ctl00_ctl08_img']"));
	return element;
    }

    public static WebElement DDN_AppointmentRpt_client(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ddlCient']"));
	return element;

    }

    public static WebElement Date_AppointmentRpt_Date(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rdpDate_dateInput']"));
	return element;

    }

    public static WebElement BTN_AppointmentRpt_ViewReport(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnViewReport']"));
	return element;

    }

    public static WebElement BTN_AppointmentRpt_Clear(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnClear']"));
	return element;

    }

    public static WebElement ICON_AppointmentRpt_Close(WebDriver driver)
	    throws InterruptedException {

	/*
	 * element = driver .findElement(By .xpath(
	 * ".//*[@id='RadWindowWrapper_ctl00_cphMainContent_RadReportWindow']/table/tbody/tr[1]/td[2]/table/tbody/tr/td[3]/ul/li[2]/a"
	 * ));
	 */
	Actions CtlK = new Actions(driver);
	CtlK.sendKeys(Keys.chord(Keys.CONTROL, "F5"));
	Thread.sleep(3000);
	CtlK.sendKeys(Keys.ENTER);
	return element;

    }

    public static WebElement IMG_rpt_Completion_View(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgReports_ctl00_ctl10_img']"));
	return element;
    }

    public static WebElement DDN_Completion_client(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ddlCient']"));
	return element;

    }

    public static WebElement Date_Completion_Date(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rdpDate_dateInput']"));
	return element;

    }

    public static WebElement BTN_Completion_ViewReport(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnViewReport']"));
	return element;

    }

    public static WebElement BTN_Completion_Clear(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnClear']"));
	return element;

    }

    public static WebElement ICON_Completion_Close(WebDriver driver)
	    throws InterruptedException {

	/*
	 * element = driver .findElement(By .xpath(
	 * ".//*[@id='RadWindowWrapper_ctl00_cphMainContent_RadReportWindow']/table/tbody/tr[1]/td[2]/table/tbody/tr/td[3]/ul/li[2]/a"
	 * ));
	 */
	Actions CtlK = new Actions(driver);
	CtlK.sendKeys(Keys.chord(Keys.CONTROL, "F5"));
	Thread.sleep(3000);
	CtlK.sendKeys(Keys.ENTER);
	return element;

    }

    public static WebElement IMG_rpt_OutSPW_View(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgReports_ctl00_ctl12_img']"));
	return element;
    }

    public static WebElement DDN_OutSPW_Contractor(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ddlContractor']"));
	return element;

    }

    public static WebElement chk_OutSPW_Email(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rblCheck_1']"));
	return element;

    }

    public static WebElement BTN_OutSPW_ViewReport(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnViewReport']"));
	return element;

    }

    public static WebElement BTN_OutSPW_Clear(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnClear']"));
	return element;

    }

    public static WebElement ICON_OutSPW_Close(WebDriver driver)
	    throws InterruptedException, AWTException {

	/*
	 * element = driver .findElement(By .xpath(
	 * ".//*[@id='RadWindowWrapper_ctl00_cphMainContent_RadReportWindow']/table/tbody/tr[1]/td[2]/table/tbody/tr/td[3]/ul/li[2]/a"
	 * ));
	 */
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_F5);

	robot.keyRelease(KeyEvent.VK_F5);
	robot.keyRelease(KeyEvent.VK_CONTROL);

	Thread.sleep(3000);

	robot.keyRelease(KeyEvent.VK_ENTER);

	return element;

    }

    public static WebElement IMG_rpt_DSLMonthly_View(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgReports_ctl00_ctl14_img']"));
	return element;
    }

    public static WebElement date_DSLMonthly_StartDate(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='rdpStartDate_dateInput']"));
	return element;

    }

    public static WebElement date_DSLMonthly_EndDate(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='rdpEndDate_dateInput']"));
	return element;

    }

    public static WebElement BTN_DSLMonthly_ViewReport(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnViewReport']"));
	return element;

    }

    public static WebElement BTN_DSLMonthly_Clear(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnClear']"));
	return element;

    }

    public static WebElement ICON_DSLMonthly_Close(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='RadWindowWrapper_ctl00_cphMainContent_RadReportWindow']/table/tbody/tr[1]/td[2]/table/tbody/tr/td[3]/ul/li[2]/a"));
	return element;

    }

    public static WebElement IMG_rpt_AAPTStock_View(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgReports_ctl00_ctl16_img']"));
	return element;
    }

    public static WebElement date_AAPTStock_Date(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rdpDate_dateInput']"));
	return element;

    }

    public static WebElement BTN_AAPTStock_ViewReport(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnViewReport']"));
	return element;

    }

    public static WebElement BTN_AAPTStock_Clear(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnClear']"));
	return element;

    }

    public static WebElement ICON_AAPTStock_Close(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='RadWindowWrapper_ctl00_cphMainContent_RadReportWindow']/table/tbody/tr[1]/td[2]/table/tbody/tr/td[3]/ul/li[2]/a"));
	return element;

    }

    public static WebElement IMG_rpt_TOWComplete_View(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgReports_ctl00_ctl18_img']"));
	return element;

    }

    public static WebElement date_TOWComplete_Date(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rdpDate_dateInput']"));
	return element;

    }

    public static WebElement BTN_TOWComplete_ViewReport(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnViewReport']"));
	return element;

    }

    public static WebElement BTN_TOWComplete_Clear(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnClear']"));
	return element;

    }

    public static WebElement ICON_TOWComplete_Close(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='RadWindowWrapper_ctl00_cphMainContent_RadReportWindow']/table/tbody/tr[1]/td[2]/table/tbody/tr/td[3]/ul/li[2]/a"));
	return element;

    }

    public static WebElement IMG_rpt_ScheduleItemQty_View(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgReports_ctl00_ctl20_img']"));
	return element;

    }

    public static WebElement DDN_ScheduleItemQty_client(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ddlCient']"));
	return element;

    }

    public static WebElement date_ScheduleItemQty_StartDate(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='rdpStartDate_dateInput']"));
	return element;

    }

    public static WebElement date_ScheduleItemQty_EndDate(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='rdpEndDate_dateInput']"));
	return element;

    }

    public static WebElement BTN_ScheduleItemQty_ViewReport(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnViewReport']"));
	return element;

    }

    public static WebElement BTN_ScheduleItemQty_Clear(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnClear']"));
	return element;

    }

    public static WebElement ICON_ScheduleItemQty_Close(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='RadWindowWrapper_ctl00_cphMainContent_RadReportWindow']/table/tbody/tr[1]/td[2]/table/tbody/tr/td[3]/ul/li[2]/a"));
	return element;

    }

    public static WebElement IMG_rpt_P1_View(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgReports_ctl00_ctl22_img']"));
	return element;

    }

    public static WebElement date_P1_Date(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rdpDate_dateInput']"));
	return element;

    }

    public static WebElement BTN_P1_ViewReport(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnViewReport']"));
	return element;

    }

    public static WebElement ICON_P1_Close(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='RadWindowWrapper_ctl00_cphMainContent_RadReportWindow']/table/tbody/tr[1]/td[2]/table/tbody/tr/td[3]/ul/li[2]/a"));
	return element;

    }

    public static WebElement IMG_rpt_P2_View(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgReports_ctl00_ctl24_img']"));
	return element;

    }

    public static WebElement date_P2_Date(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rdpDate_dateInput']"));
	return element;

    }

    public static WebElement BTN_P2_ViewReport(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnViewReport']"));
	return element;

    }

    public static WebElement BTN_P2_Clear(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnClear']"));
	return element;

    }

    public static WebElement ICON_P2_Close(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='RadWindowWrapper_ctl00_cphMainContent_RadReportWindow']/table/tbody/tr[1]/td[2]/table/tbody/tr/td[3]/ul/li[2]/a"));
	return element;

    }

    public static WebElement IMG_rpt_P3_View(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgReports_ctl00_ctl26_img']"));
	return element;

    }

    public static WebElement date_P3_Date(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rdpDate_dateInput']"));
	return element;

    }

    public static WebElement BTN_P3_ViewReport(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnViewReport']"));
	return element;

    }

    public static WebElement BTN_P3_Clear(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnClear']"));
	return element;

    }

    public static WebElement ICON_P3_Close(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='RadWindowWrapper_ctl00_cphMainContent_RadReportWindow']/table/tbody/tr[1]/td[2]/table/tbody/tr/td[3]/ul/li[2]/a"));
	return element;

    }

    public static WebElement IMG_rpt_P4_View(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgReports_ctl00_ctl28_img']"));
	return element;

    }

    public static WebElement date_P4_Date(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rdpDate_dateInput']"));
	return element;

    }

    public static WebElement BTN_P4_ViewReport(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnViewReport']"));
	return element;

    }

    public static WebElement ICON_P4_Close(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='RadWindowWrapper_ctl00_cphMainContent_RadReportWindow']/table/tbody/tr[1]/td[2]/table/tbody/tr/td[3]/ul/li[2]/a"));
	return element;

    }

    public static WebElement IMG_rpt_Pxx_View(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgReports_ctl00_ctl30_img']"));
	return element;

    }

    public static WebElement DDN_PXX_Client(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ddlCient']"));
	return element;

    }

    public static WebElement date_Pxx_Date(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rdpDate_dateInput']"));
	return element;

    }

    public static WebElement BTN_Pxx_ViewReport(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnViewReport']"));
	return element;

    }

    public static WebElement BTN_Pxx_Clear(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnClear']"));
	return element;

    }

    public static WebElement ICON_Pxx_Close(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='RadWindowWrapper_ctl00_cphMainContent_RadReportWindow']/table/tbody/tr[1]/td[2]/table/tbody/tr/td[3]/ul/li[2]/a"));
	return element;

    }

    public static WebElement IMG_rpt_EndOfDay_View(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgReports_ctl00_ctl32_img']"));
	return element;

    }

    public static WebElement DDN_EndOfDay_Client(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ddlCient']"));
	return element;

    }

    public static WebElement date_EndOfDay_Date(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rdpDate_dateInput']"));
	return element;

    }

    public static WebElement BTN_EndOfDay_ViewReport(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnViewReport']"));
	return element;

    }

    public static WebElement BTN_EndOfDay_Clear(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnClear']"));
	return element;

    }

    public static WebElement ICON_EndOfDay_Close(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='RadWindowWrapper_ctl00_cphMainContent_RadReportWindow']/table/tbody/tr[1]/td[2]/table/tbody/tr/td[3]/ul/li[2]/a"));
	return element;

    }

    public static WebElement IMG_rpt_iiNet_View(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rgReports_ctl00_ctl34_img']"));
	return element;

    }

    public static WebElement BTN_iiNet_ViewReport(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnViewReport']"));
	return element;

    }

    public static WebElement ICON_iiNet_Close(WebDriver driver)
	    throws InterruptedException {

	Actions CtlK = new Actions(driver);
	CtlK.sendKeys(Keys.chord(Keys.CONTROL, "F5"));
	Thread.sleep(3000);
	CtlK.sendKeys(Keys.ENTER);

	return element;

    }

    public static void waitFor() throws Exception {

	Thread.sleep(5000);

    }

    public static WebElement RptVal_Client(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rfvClient']"));
	return element;
    }

    public static WebElement RptVal_Date(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rfvDate']"));
	return element;
    }

    public static WebElement OSP_RptVal_Check(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rfvEndDate']"));
	return element;
    }

    public static WebElement DSL_RptVal_StartDate(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rfvStartDate']"));
	return element;
    }

    public static WebElement DSL_RptVal_EndDate(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rfvEndDate']"));
	return element;
    }

    public static WebElement AAPT_RptVal_Date(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rfvDate']"));
	return element;
    }

    public static WebElement SIQ_RptVal_Client(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rfvClient']"));
	return element;
    }

    public static WebElement SIQ_RptVal_Startdate(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rfvStartDate']"));
	return element;
    }

    public static WebElement SIQ_RptVal_EndDate(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rfvEndDate']"));
	return element;
    }

}
