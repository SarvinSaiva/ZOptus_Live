package appmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObject.Desktop_Commercial_Page;
import PageObject.Desktop_Home_Page;

public class Desktop_Home_Action {

    @Test
    public void Home_click(WebDriver driver) throws Exception {

	Desktop_Commercial_Page.waitForLoad(driver);
	WebElement element = driver.findElement(By
		.xpath(".//*[@id='Home']/img"));
	Actions action = new Actions(driver);
	action.moveToElement(element).build().perform();
	Desktop_Commercial_Page.waitForLoad(driver);
	Desktop_Home_Page.btn_searchdocs(driver).click();
	Desktop_Commercial_Page.waitForLoad(driver);
	Verification_Action.Execute(driver);
	Reporter.log("Click on Home Page");
    }

}
