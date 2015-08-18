package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Desktop_UserProfile_Page {
    private static WebElement element = null;

    public static WebElement tab_UserImage(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='UserImage']"));
	return element;
    }

    public static WebElement tab_EditProfile(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_ProfileMenu']/ul/li/div[2]/ul/li[2]/a/span"));
	return element;
    }

    public static WebElement tab_timesheet(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_ProfileMenu']/ul/li/div[2]/ul/li[3]/a/span"));
	return element;
    }

    public static WebElement tab_timesheetnewentries(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='ui-id-1']"));
	return element;
    }

    public static WebElement tab_timesheetpastentries(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='pastEntryTab']"));
	return element;
    }

    public static WebElement tab_switchlogged(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_ProfileMenu']/ul/li/div[2]/ul/li[4]/a/span"));
	return element;
    }

    public static WebElement tab_switchloggedclose(WebDriver driver) {
	element = driver.findElement(By
		.xpath("./html/body/div[4]/div[1]/button/span[1]"));
	return element;
    }

    public static WebElement tab_logout(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_ProfileMenu']/ul/li/div[2]/ul/li[5]/a/span"));
	return element;
    }

    public static WebElement waitForLoad(WebDriver driver)
	    throws InterruptedException {
	Thread.sleep(5000);
	return element;
    }
}
