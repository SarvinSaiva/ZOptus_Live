package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mobility_Dashboard_Page {

    static WebElement element = null;

    public static WebElement btn_Dashboard(WebDriver driver) {
	element = driver.findElement(By.id("lnkSiteDetails"));
	return element;
    }

    public static WebElement txtbx_Search_Site(WebDriver driver) {
	element = driver.findElement(By.id("cphMainContent_txtSearchText"));
	return element;
    }

    public static WebElement DwnKey_Search_Site(WebDriver driver)
	    throws AWTException {
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	return element;
    }

    public static WebElement EnterKey_Search_Site(WebDriver driver)
	    throws AWTException {
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	return element;
    }

    public static WebElement TabKey_Search_Site(WebDriver driver)
	    throws AWTException {
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_TAB);
	return element;
    }

    public static WebElement btn_clear_Site(WebDriver driver) {
	element = driver.findElement(By
		.id("cphMainContent_ClearSiteDetailsButton"));
	return element;
    }

    public static WebElement waitForLoad(WebDriver driver)
	    throws InterruptedException {
	Thread.sleep(5000);
	return element;
    }

    public static WebElement btn_SiteDoc_Today(WebDriver driver) {
	element = driver.findElement(By.id("cphMainContent_lnkDocToday"));
	return element;
    }

    public static WebElement btn_SiteIssue_Today(WebDriver driver) {
	element = driver.findElement(By.id("cphMainContent_lnkIssueToday"));
	return element;
    }

    public static WebElement btn_SiteDoc_Yestrday(WebDriver driver) {
	element = driver.findElement(By.id("cphMainContent_lnkDocYester"));
	return element;
    }

    public static WebElement btn_SiteIssue_Yestrday(WebDriver driver) {
	element = driver.findElement(By.id("cphMainContent_lnkIssueYester"));
	return element;
    }

    public static WebElement btn_SiteDoc_Lastweek(WebDriver driver) {
	element = driver.findElement(By.id("cphMainContent_lnkDocWeek"));
	return element;
    }

    public static WebElement btn_SiteIssue_Lastweek(WebDriver driver) {
	element = driver.findElement(By.id("cphMainContent_lnkIssueWeek"));
	return element;
    }

    public static WebElement btn_SiteDoc_Inprogress(WebDriver driver) {
	element = driver.findElement(By
		.xpath("//*[@id='cphMainContent_divDocInProgress']/div/div"));
	return element;
    }

    public static WebElement btn_SiteDoc_Complete(WebDriver driver) {
	element = driver.findElement(By
		.xpath("//*[@id='cphMainContent_divDocCompleted']/div/div"));
	return element;
    }

    public static WebElement btn_SiteIssue_High(WebDriver driver) {
	element = driver.findElement(By
		.xpath("//*[@id='cphMainContent_divIssueHigh']/div/div"));
	return element;
    }

    public static WebElement btn_SiteIssue_Medium(WebDriver driver) {
	element = driver.findElement(By
		.xpath("//*[@id='cphMainContent_divIssueMed']/div/div"));
	return element;
    }

    public static WebElement btn_SiteIssue_Low(WebDriver driver) {
	element = driver.findElement(By
		.xpath("//*[@id='cphMainContent_divIssueLow']/div/div"));
	return element;
    }

    public static WebElement btn_SiteIssue_Complete(WebDriver driver) {
	element = driver.findElement(By
		.xpath("//*[@id='cphMainContent_divIssueComplete']/div/div"));
	return element;
    }
}
