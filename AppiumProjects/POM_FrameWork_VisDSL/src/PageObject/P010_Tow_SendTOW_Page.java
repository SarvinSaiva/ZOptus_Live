package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P010_Tow_SendTOW_Page {

    static WebElement element = null;

    public static WebElement BTN_ST_SendTOW(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnSend']"));
	return element;
    }

    public static WebElement TXT_ST_From(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtFrom']"));
	return element;
    }

    public static WebElement TXT_ST_To(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtTo']"));
	return element;
    }

    public static WebElement TXT_ST_CC(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='txtCC']"));
	return element;
    }

    public static WebElement TXT_ST_Attachfile(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='fuWorkUpload']"));
	return element;
    }

    public static WebElement BTN_ST_Send(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='btnSend']"));
	return element;
    }

    public static void waitFor() throws Exception {

	Thread.sleep(5000);

    }

    public static WebElement PTOW_SendM_FrmVal(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='rxpEmail']"));
	return element;
    }

    public static WebElement PTOW_SendM_ToVal(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='RegularExpressionValidator1']"));
	return element;
    }

    public static WebElement PTOW_SendM_CCVal(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='RegularExpressionValidator2']"));
	return element;
    }

    public static WebElement PTOW_iframeSendEmail(WebDriver driver) {

	driver.switchTo().frame("SendEmail");
	return element;

    }

}
