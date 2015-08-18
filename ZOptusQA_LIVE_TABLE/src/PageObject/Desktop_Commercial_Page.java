package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Desktop_Commercial_Page {
    private static WebElement element = null;

    public static WebElement tab_Commercial(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='Payments']/img"));
	return element;
    }

    public static WebElement tab_purchaseorder(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[4]/div/ul/li[1]/a/img"));
	return element;
    }

    public static WebElement tab_claims(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[4]/div/ul/li[2]/a/img"));
	return element;
    }

    public static WebElement tab_requesttoclient(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[4]/div/ul/li[3]/a/img"));
	return element;
    }

    public static WebElement tab_rentalagreements(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[4]/div/ul/li[4]/a/img"));
	return element;
    }

    public static WebElement waitForLoad(WebDriver driver)
	    throws InterruptedException {
	Thread.sleep(5000);
	return element;
    }
}
