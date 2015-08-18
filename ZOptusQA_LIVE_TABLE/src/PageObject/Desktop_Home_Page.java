package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Desktop_Home_Page {
    static WebElement element = null;

    public static WebElement mover_Home(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='Home']/img"));
	return element;

    }

    public static WebElement btn_searchdocs(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[1]/div/ul/li[1]/a/img"));
	return element;

    }

    public static WebElement btn_help(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='HelpOneTeam']/img"));
	return element;

    }

    public static WebElement waitForLoad(WebDriver driver)
	    throws InterruptedException {
	Thread.sleep(5000);
	return element;
    }
}
