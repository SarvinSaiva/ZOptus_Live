package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P015_Schedule_Page {

    static WebElement element = null;

    public static WebElement IMG_HDR_Schdule(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ucHeaderMenu_lnkAllocation']"));
	return element;
    }

    public static WebElement DATE_SDL_weelstrt(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='ctl00_cphMainContent_rdpWeekStartDate_dateInput']"));
	return element;
    }

    public static WebElement DDN_SDL_Scclient(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlClient']"));
	return element;

    }

    public static WebElement DDN_SDL_Scjobtype(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_ddlJobType']"));
	return element;

    }

    public static WebElement Day_SDL_date1(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='divlstDays']/ul/li[1]"));
	return element;

    }

    public static WebElement DDN_SDL_all(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='-1']"));
	return element;

    }

    public static WebElement BTN_SDL_go(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ctl00_cphMainContent_btnGo']"));
	return element;

    }

    public static void waitFor() throws Exception {

	Thread.sleep(10000);

    }

    public static void waitForSec() throws Exception {

	Thread.sleep(3000);

    }

}
