package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mobility_WorkMaterials_Page {
    static WebElement element = null;

    public static WebElement btn_WorkMaterials(WebDriver driver) {
	element = driver.findElement(By.id("lnkSiteMaterials"));
	return element;
    }

    public static WebElement waitForminLoad(WebDriver driver)
	    throws InterruptedException {
	Thread.sleep(2000);
	return element;
    }

    public static WebElement waitForLoad(WebDriver driver)
	    throws InterruptedException {
	Thread.sleep(5000);
	return element;
    }

    public static WebElement tab_VPLIssue(WebDriver driver) {
	element = driver.findElement(By.id("ReqItem1"));
	return element;
    }

    public static WebElement tab_ExTraywork(WebDriver driver) {
	element = driver.findElement(By.id("ReqItem4"));
	return element;
    }

    public static WebElement txtbx_Search_Site(WebDriver driver) {
	element = driver.findElement(By.id("cphMainContent_txtSearchText"));
	return element;
    }

    public static WebElement drop_Search_Site(WebDriver driver) {
	element = driver.findElement(By.id("ui-id-1"));
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

    public static WebElement Untill_waitload(WebDriver driver) {

	element = (new WebDriverWait(driver, 10))
		.until(new ExpectedCondition<WebElement>() {
		    @Override
		    public WebElement apply(WebDriver d) {
			return d.findElement(By
				.id("cphMainContent_txtSearchText"));
		    }
		});

	return element;
    }
}
