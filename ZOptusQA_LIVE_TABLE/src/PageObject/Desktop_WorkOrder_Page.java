package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Desktop_WorkOrder_Page {
    static WebElement element = null;

    public static WebElement mover_Wrkorder(WebDriver driver) {

	element = driver.findElement(By.xpath("//*[@id='WorkOrder']/img"));
	return element;

    }

    // public static WebElement btn_Details(WebDriver driver){

    // element =
    // driver.findElement(By.xpath("//*[@id='HeaderMenuTop_MainMenu']/ul/li[2]/div/ul/li[1]/a/img"));
    // return element;

    // }
    public static WebElement txtbx_Change_Work(WebDriver driver)
	    throws AWTException {
	element = driver.findElement(By
		.xpath("//*[@id='selectNewWorkDisplay']"));
	return element;
    }

    public static WebElement DwnKey_Change_Work(WebDriver driver)
	    throws AWTException {
	element = driver.findElement(By
		.xpath("//*[@id='selectNewWorkDisplay']"));
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	return element;
    }

    public static WebElement EnterKey_Change_Work(WebDriver driver)
	    throws AWTException {
	element = driver.findElement(By
		.xpath("//*[@id='selectNewWorkDisplay']"));
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	return element;
    }

    public static WebElement btn_details(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[2]/div/ul/li[1]/a/img"));
	return element;

    }

    public static WebElement btn_documents(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[2]/div/ul/li[2]/a/img"));
	return element;

    }

    public static WebElement txtbx_search(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='searchterm']"));
	return element;
    }

    public static WebElement btn_Searchworkorder(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='filterdiv']/button[1]"));
	return element;

    }

    public static WebElement btn_editwrkorder(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='workSearchResults']/div[1]/div[1]/div/div[1]/table/tbody/tr/td[1]/button/span"));
	return element;

    }

    public static WebElement tab_resource(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ui-id-2']"));
	return element;

    }

    public static WebElement tab_saed(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ui-id-3']"));
	return element;

    }

    public static WebElement tab_build(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ui-id-4']"));
	return element;

    }

    public static WebElement tab_comments(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ui-id-5']"));
	return element;

    }

    public static WebElement tab_finance(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ui-id-6']"));
	return element;

    }

    public static WebElement tab_ptw(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ui-id-7']"));
	return element;

    }

    public static WebElement tab_tags(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ui-id-8']"));
	return element;

    }

    public static WebElement tab_technology(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ui-id-9']"));
	return element;

    }

    public static WebElement tab_logs(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ui-id-10']"));
	return element;

    }

    //
    public static WebElement div_work(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ui-id-2']/div/div[1]/div[1]/span"));
	return element;

    }

    public static WebElement div_arrowwork(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ui-id-2']/div/div[1]/div[1]/a"));
	return element;

    }

    public static WebElement div_sitepack(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ui-id-2']/div/div[2]/div[1]/span"));
	return element;

    }

    public static WebElement div_arrowsitepack(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ui-id-2']/div/div[2]/div[1]/a"));
	return element;

    }

    public static WebElement div_quality(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ui-id-2']/div/div[3]/div[1]/span"));
	return element;

    }

    public static WebElement div_arrowquality(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ui-id-2']/div/div[3]/div[1]/a"));
	return element;

    }

    public static WebElement div_site(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ui-id-2']/div/div[4]/div[1]/span"));
	return element;

    }

    public static WebElement div_arrowsite(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ui-id-2']/div/div[4]/div[1]/a"));
	return element;

    }

    public static WebElement div_program(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ui-id-2']/div/div[5]/div[1]/span"));
	return element;

    }

    public static WebElement div_arrowprogram(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ui-id-2']/div/div[5]/div[1]/a"));
	return element;

    }

    public static WebElement div_project(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ui-id-2']/div/div[6]/div[1]/span"));
	return element;

    }

    public static WebElement div_arrowproject(WebDriver driver) {

	element = driver.findElement(By
		.xpath(".//*[@id='ui-id-2']/div/div[6]/div[1]/a"));
	return element;

    }

    public static WebElement tab_siteforms(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ui-id-3']"));
	return element;

    }

    public static WebElement btn_IssueRegister(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[2]/div/ul/li[3]/a/img"));
	return element;

    }

    public static WebElement btn_Faults(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[2]/div/ul/li[4]/a/img"));
	return element;

    }

    public static WebElement btn_snag(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[2]/div/ul/li[5]/a/img"));
	return element;

    }

    public static WebElement btn_materialordrng(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[2]/div/ul/li[6]/a/img"));
	return element;

    }

    public static WebElement tab_mtrlexternal(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ReqItem4']"));
	return element;

    }

    public static WebElement tab_mtrlprevious(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ui-id-3']"));
	return element;

    }

    public static WebElement btn_milestone(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[2]/div/ul/li[7]/a/img"));
	return element;

    }

    public static WebElement btn_budgettrcker(WebDriver driver) {

	element = driver
		.findElement(By
			.xpath(".//*[@id='HeaderMenuTop_MainMenu']/ul/li[2]/div/ul/li[8]/a/img"));
	return element;

    }

    public static WebElement tab_phase1(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ui-id-1']"));
	return element;

    }

    public static WebElement tab_phase2(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ui-id-2']"));
	return element;

    }

    public static WebElement tab_phase3(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ui-id-3']"));
	return element;

    }

    public static WebElement tab_phase4(WebDriver driver) {

	element = driver.findElement(By.xpath(".//*[@id='ui-id-4']"));
	return element;

    }

    public static WebElement waitForLoad(WebDriver driver)
	    throws InterruptedException {
	Thread.sleep(5000);
	return element;
    }

    public static WebElement PageloadTimeout(WebDriver driver) {
	driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	return element;
    }
}
