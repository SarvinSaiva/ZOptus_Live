package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Desktop_Maintanence_Page {
    private static WebElement element = null;

    public static WebElement tab_Maintenance(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='Maintenance']/img"));
	return element;
    }

    public static WebElement tab_security(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='Security']/img"));
	return element;
    }

    public static WebElement tab_Useradmin(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[7]/div/ul/li[1]/div/ul/li[1]/a/img"));
	return element;
    }

    public static WebElement tab_UserEventLog(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[7]/div/ul/li[1]/div/ul/li[2]/a/img"));
	return element;
    }

    public static WebElement tab_materials(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[7]/div/ul/li[2]/a/img"));
	return element;
    }

    public static WebElement tab_wrkTypeBudget(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[7]/div/ul/li[3]/a/img"));
	return element;
    }

    public static WebElement tab_wrkTypeBudgetPhase1(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='ui-id-1']"));
	return element;
    }

    public static WebElement tab_wrkTypeBudgetPhase2(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='ui-id-3']"));
	return element;
    }

    public static WebElement tab_wrkTypeBudgetPhase3(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='ui-id-5']"));
	return element;
    }

    public static WebElement tab_wrkTypeBudgetPhase4(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='ui-id-7']"));
	return element;
    }

    public static WebElement tab_formadmin(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[7]/div/ul/li[4]/a/img"));
	return element;
    }

    public static WebElement tab_formadmin1(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='ui-id-1']"));
	return element;
    }

    public static WebElement tab_formadminShewms(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='ui-id-3']"));
	return element;
    }

    public static WebElement tab_bulkupload(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[7]/div/ul/li[5]/a/img"));
	return element;
    }

    public static WebElement tab_milestone(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='ui-id-1']"));
	return element;
    }

    public static WebElement tab_purchaseorder(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='ui-id-3']"));
	return element;
    }

    public static WebElement tab_poPDS(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='ui-id-5']"));
	return element;
    }

    public static WebElement tab_claimhistory(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='ui-id-7']"));
	return element;
    }

    public static WebElement tab_newworks(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='ui-id-9']"));
	return element;
    }

    public static WebElement tab_resourcemanag(WebDriver driver) {
	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[7]/div/ul/li[6]/a/img"));
	return element;
    }

    public static WebElement waitForLoad(WebDriver driver)
	    throws InterruptedException {
	Thread.sleep(5000);
	return element;
    }
}
