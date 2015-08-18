package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Desktop_Reports_Page {

    private static WebElement element = null;

    public static WebElement tab_Reports(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='Reports']/img"));
	return element;
    }

    public static WebElement tab_PMO(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[5]/div/ul/li[1]/a/img"));
	return element;
    }

    public static WebElement tab_Finance(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[5]/div/ul/li[2]/a/img"));
	return element;
    }

    public static WebElement tab_Logistics(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[5]/div/ul/li[3]/a/img"));
	return element;
    }

    public static WebElement tab_Delivery(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[5]/div/ul/li[4]/a/img"));
	return element;
    }

    public static WebElement tab_Map(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[5]/div/ul/li[5]/a/img"));
	return element;
    }

    public static WebElement waitForLoad(WebDriver driver)
	    throws InterruptedException {
	Thread.sleep(5000);
	return element;
    }
}
