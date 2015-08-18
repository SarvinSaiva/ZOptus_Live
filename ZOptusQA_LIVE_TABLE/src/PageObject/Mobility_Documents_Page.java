package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mobility_Documents_Page {

    static WebElement element = null;

    public static WebElement btn_Documents(WebDriver driver) {
	element = driver.findElement(By.id("lnkSiteDocuments"));
	return element;
    }

    public static WebElement waitForLoad(WebDriver driver)
	    throws InterruptedException {
	Thread.sleep(5000);
	return element;
    }
}
