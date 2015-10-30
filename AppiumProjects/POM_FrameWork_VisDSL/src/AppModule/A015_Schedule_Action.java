package AppModule;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import PageObject.P015_Schedule_Page;
import Utility.ExcelUtils;

public class A015_Schedule_Action {

    @Test
    public void UnAllocate(WebDriver driver) throws Exception {

	P015_Schedule_Page.waitForSec();
	P015_Schedule_Page.IMG_HDR_Schdule(driver).click();
	P015_Schedule_Page.waitForSec();
	P015_Schedule_Page.BTN_SDL_go(driver).click();
	P015_Schedule_Page.waitForSec();
	A015_Schedule_Action.AlertMessageverify(driver);
	P015_Schedule_Page.waitForSec();
	P015_Schedule_Page.DATE_SDL_weelstrt(driver).clear();
	String weelstrt = ExcelUtils.getCellData(1, 1);
	P015_Schedule_Page.DATE_SDL_weelstrt(driver).sendKeys(weelstrt);
	P015_Schedule_Page.DATE_SDL_weelstrt(driver).sendKeys(Keys.TAB);
	P015_Schedule_Page.waitForSec();
	String Scclient = ExcelUtils.getCellData(1, 2);
	Select oSelection1 = new Select(
		P015_Schedule_Page.DDN_SDL_Scclient(driver));
	oSelection1.selectByVisibleText(Scclient);
	P015_Schedule_Page.waitForSec();
	String Scjobtype = ExcelUtils.getCellData(1, 3);
	Select oSelection2 = new Select(
		P015_Schedule_Page.DDN_SDL_Scjobtype(driver));
	oSelection2.selectByVisibleText(Scjobtype);
	P015_Schedule_Page.waitForSec();
	P015_Schedule_Page.Day_SDL_date1(driver).click();
	P015_Schedule_Page.waitForSec();
	P015_Schedule_Page.Day_SDL_date1(driver).click();
	P015_Schedule_Page.waitFor();
	P015_Schedule_Page.DDN_SDL_all(driver).click();
	P015_Schedule_Page.waitFor();

	driver.findElement(By.xpath(".//table/tbody/tr/td[2]/input[1]"))
		.click();

	P015_Schedule_Page.waitFor();

	WebElement AllocateTable = driver.findElement(By
		.xpath(".//*[@id='divContractorDetails']"));

	WebElement UnAllocateTable = driver.findElement(By
		.xpath(".//*[@id='divLstUnallocated']"));

	/*
	 * WebElement UnAllocateTable1 = driver.findElement(By
	 * .xpath(".//*[@id='tblUnallocated']/tbody/tr[2]/td"));
	 */

	WebElement AllocatedTows = driver.findElement(By
		.xpath(".//*[@id='416888']"));

	if (!AllocateTable.getText().equals(null)) {

	    P015_Schedule_Page.waitFor();

	    Actions Unallocate = new Actions(driver);

	    Action dragAndDrop = Unallocate.clickAndHold(AllocatedTows)

	    .moveToElement(UnAllocateTable)

	    .release(UnAllocateTable)

	    .build();

	    P015_Schedule_Page.waitFor();
	    dragAndDrop.perform();

	    P015_Schedule_Page.waitFor();

	} else {
	    System.out.println("There is no AllocatedTow ");
	}
    }

    @Test
    public void Allocate(WebDriver driver) throws Exception {
	P015_Schedule_Page.waitForSec();
	P015_Schedule_Page.DATE_SDL_weelstrt(driver).clear();
	String weelstrt1 = ExcelUtils.getCellData(1, 1);
	P015_Schedule_Page.DATE_SDL_weelstrt(driver).sendKeys(weelstrt1);
	P015_Schedule_Page.DATE_SDL_weelstrt(driver).sendKeys(Keys.TAB);
	P015_Schedule_Page.waitForSec();
	String Scclient1 = ExcelUtils.getCellData(1, 2);
	Select oSelection3 = new Select(
		P015_Schedule_Page.DDN_SDL_Scclient(driver));
	oSelection3.selectByVisibleText(Scclient1);
	P015_Schedule_Page.waitForSec();
	String Scjobtype1 = ExcelUtils.getCellData(1, 3);
	Select oSelection4 = new Select(
		P015_Schedule_Page.DDN_SDL_Scjobtype(driver));
	oSelection4.selectByVisibleText(Scjobtype1);
	P015_Schedule_Page.waitForSec();
	P015_Schedule_Page.Day_SDL_date1(driver).click();
	P015_Schedule_Page.waitForSec();
	P015_Schedule_Page.Day_SDL_date1(driver).click();
	P015_Schedule_Page.waitFor();
	P015_Schedule_Page.DDN_SDL_all(driver).click();
	P015_Schedule_Page.waitFor();
	driver.findElement(By.xpath(".//table/tbody/tr/td[2]/input[1]"))
		.click();
	P015_Schedule_Page.waitFor();

	WebElement UnAllocateTable1 = driver.findElement(By
		.xpath(".//*[@id='tblUnallocated']/tbody/tr[2]/td"));

	WebElement UnAllocateTable = driver.findElement(By
		.xpath(".//*[@id='divLstUnallocated']"));

	WebElement UnallocatedTows = driver.findElement(By
		.xpath(".//*[@id='416888']"));

	WebElement ContractorName = driver.findElement(By
		.xpath(".//*[@id='Barratt, Mathew']"));

	if (!UnAllocateTable.getText().equals(null)
		|| !UnAllocateTable1.getText().equals(null)) {

	    P015_Schedule_Page.waitFor();

	    Actions MovingContr = new Actions(driver);

	    Action dragAndDrop = MovingContr.clickAndHold(UnallocatedTows)

	    .moveToElement(ContractorName)

	    .release(ContractorName)

	    .build();

	    P015_Schedule_Page.waitFor();

	    dragAndDrop.perform();

	    P015_Schedule_Page.waitFor();

	} else {
	    System.out
		    .println("There is no unallocatedTows to allocate the contractor");
	}

    }

    public static void AlertMessageverify(WebDriver driver) throws Exception {

	Alert alert = driver.switchTo().alert();
	String Alertmsg = alert.getText();
	String Validation = ExcelUtils.getCellData(1, 4);
	if (Validation.equals(Alertmsg)) {
	    Reporter.log("TC015_Schedule_Page : "
		    + "Alert popup - Mandatory Verification - PASSED", true);
	    System.out.println(Validation);
	} else {
	    Reporter.log("TC015_Schedule_Page : "
		    + "Alert popup - Mandatory Verification - FAILED", true);
	}
	alert.accept();
    }

}
