package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mobility_WorkDetails_Page {

    static WebElement element = null;

    public static WebElement btn_WorkDetails(WebDriver driver) {
	element = driver.findElement(By.id("workDetails"));
	return element;
    }

    public static WebElement waitForLoad(WebDriver driver)
	    throws InterruptedException {
	Thread.sleep(5000);
	return element;
    }

    public static WebElement WorkDetails_WorkDetailsTable(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='workDetailsIcon']"));
	return element;
    }

    public static WebElement WorkDetails_SiteDetailsTable(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='siteDetailsIcon']"));
	return element;
    }

    public static WebElement WorkDetails_SAEDTable(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='saedIcon']"));
	return element;
    }

    public static WebElement WorkDetails_BuildTable(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='buildIcon']"));
	return element;
    }

    public static WebElement WorkDetails_FinanceTable(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='financeIcon']"));
	return element;
    }

    public static WebElement WorkDetails_PTWsTable(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='ptwsIcon']"));
	return element;
    }

    public static WebElement WorkDetails_OutagesTable(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='OutagesIcon']"));
	return element;
    }

}
