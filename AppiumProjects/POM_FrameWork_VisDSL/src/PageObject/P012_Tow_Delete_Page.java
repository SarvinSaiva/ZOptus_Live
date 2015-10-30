package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P012_Tow_Delete_Page {

    static WebElement element = null;

    public static WebElement BTN_D_DeleteJob(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnDeleteJob']"));
	return element;
    }

    public static WebElement BTN_D_YesDelete(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnYesDelete']"));
	return element;
    }

    public static void waitFor() throws Exception {

	Thread.sleep(5000);

    }
}
