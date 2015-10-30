package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P011_Tow_Copy_Page {

    static WebElement element = null;

    public static WebElement BTN_C_CopyJob(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnCopyJob']"));
	return element;
    }

    public static WebElement BTN_ALERT_YesCopy(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnYesCopy']"));
	return element;
    }

    public static void waitFor() throws Exception {

	Thread.sleep(5000);

    }
}
