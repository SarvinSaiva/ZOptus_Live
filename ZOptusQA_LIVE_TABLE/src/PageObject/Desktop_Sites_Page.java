package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Desktop_Sites_Page {
    static WebElement element = null;

    public static WebElement mover_Sites(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='MainSite']/img"));
	return element;

    }

    public static WebElement btn_sitedetails(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[3]/div/ul/li[1]/a/img"));
	return element;

    }

    public static WebElement btn_sitedocuments(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath("//*[@id='HeaderMenuTop_MainMenu']/ul/li[3]/div/ul/li[2]/a/img"));
	return element;

    }

    public static WebElement btn_IssueRegister(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath("//*[@id='HeaderMenuTop_MainMenu']/ul/li[3]/div/ul/li[3]/a/img"));
	return element;

    }

    public static WebElement btn_Faults(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath("//*[@id='HeaderMenuTop_MainMenu']/ul/li[3]/div/ul/li[4]/a/img"));
	return element;

    }

    public static WebElement txtbx_Change_Work(WebDriver driver)
	    throws AWTException {
	element = driver.findElement(By
		.xpath(".//*[@id='selectNewSiteDisplay']"));
	return element;
    }

    public static WebElement DwnKey_Change_Work(WebDriver driver)
	    throws AWTException {
	element = driver.findElement(By
		.xpath(".//*[@id='selectNewSiteDisplay']"));
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	return element;
    }

    public static WebElement EnterKey_Change_Work(WebDriver driver)
	    throws AWTException {
	element = driver.findElement(By
		.xpath(".//*[@id='selectNewSiteDisplay']"));
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	return element;
    }

    public static WebElement waitForLoad(WebDriver driver)
	    throws InterruptedException {
	Thread.sleep(5000);
	return element;
    }
}
