package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Desktop_ProjectManagement_Page {
    private static WebElement element = null;

    public static WebElement tab_projectmanagement(WebDriver driver) {
	element = driver.findElement(By
		.xpath(".//*[@id='ProjectManagement']/img"));
	return element;
    }

    public static WebElement tab_projectmanagementNSW(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='ui-id-2']"));
	return element;
    }

    public static WebElement tab_projectmanagementQLD(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='ui-id-3']"));
	return element;
    }

    public static WebElement tab_projectmanagementSA(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='ui-id-4']"));
	return element;
    }

    public static WebElement tab_projectmanagementVIC(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='ui-id-5']"));
	return element;
    }

    public static WebElement tab_projectmanagementWA(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='ui-id-6']"));
	return element;
    }

    public static WebElement tab_Tags(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[6]/div/ul/li[4]/a/img"));
	return element;
    }

    public static WebElement tab_PM_Program_Works(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[6]/div/ul/li[1]/a/img"));
	return element;
    }

    public static WebElement tab_Program_Details(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[6]/div/ul/li[1]/div/ul/li[1]/a/img"));
	return element;
    }

    public static WebElement tab_Program_Documents(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[6]/div/ul/li[1]/div/ul/li[2]/a/img"));
	return element;
    }

    public static WebElement tab_Program_IssueRegister(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[6]/div/ul/li[1]/div/ul/li[3]/a/img"));
	return element;
    }

    public static WebElement tab_PM_Documents(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[6]/div/ul/li[2]/a/img"));
	return element;
    }

    public static WebElement tab_PM_IssueRegister(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[6]/div/ul/li[3]/a/img"));
	return element;
    }

    public static WebElement tab_PM_Tags(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[6]/div/ul/li[4]/a/img"));
	return element;
    }

    public static WebElement tab_PM_YearlyPrgm(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[6]/div/ul/li[5]/a/img"));
	return element;
    }

    public static WebElement txtbx_Change_Work(WebDriver driver)
	    throws AWTException {
	element = driver.findElement(By
		.xpath(".//*[@id='selectNewProgramDisplay']"));
	return element;
    }

    public static WebElement DwnKey_Change_Work(WebDriver driver)
	    throws AWTException {
	element = driver.findElement(By
		.xpath(".//*[@id='selectNewProgramDisplay']"));
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	return element;
    }

    public static WebElement EnterKey_Change_Work(WebDriver driver)
	    throws AWTException {
	element = driver.findElement(By
		.xpath(".//*[@id='selectNewProgramDisplay']"));
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
