package appmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verification_Action {

    static WebElement element = null;

    @Test
    public static void Execute(WebDriver driver) throws Exception {
	try {
	    String actualTitle = driver.getTitle();
	    System.out.println(actualTitle);
	    if (driver.getTitle().endsWith("ShowErrorPage")
		    || actualTitle.contains("The resource cannot be found")
		    || actualTitle.contains("Runtime Error")
		    || actualTitle.contains("Error")
		    || driver.getTitle().endsWith("ValidateLogin")) {
		// System.out.println(actualTitle);
		System.out.println("Error Page Found");

		// driver.getCurrentUrl().equals("Test");
		// Reporter.log(actualTitle);

		String ErrDt = actualTitle
			+ " : Error Page Found"
			+ ",CurrentUrl : "
			+ driver.getCurrentUrl()
			+ "Error_Image_Location : <a href='http://www.chinta-tms.com/Error_Screenshots.zip'"
			+ driver.getTitle() + ".jpg'</a>";

		Assert.fail(actualTitle
			+ " : Error Page Found"
			+ ",CurrentUrl : "
			+ driver.getCurrentUrl()
			+ "Error_Image_Location : <a href='http://www.chinta-tms.com/Error_Screenshots.zip'</a>");

		Reporter.log(actualTitle
			+ " : Error Page Found"
			+ ",CurrentUrl : "
			+ driver.getCurrentUrl()
			+ "Error_Image_Location : <a href='http://www.chinta-tms.com/Error_Screenshots.zip'"
			+ driver.getTitle() + ".jpg'</a>");

	    } else {
		// System.out.println(actualTitle);
		System.out.println("Page Found");
		// Reporter.log(actualTitle);
		Reporter.log(actualTitle + " : Page Found", true);
	    }

	} catch (Exception ErrorVer) {

	    String ErrVF = ErrorVer.getMessage();

	    Reporter.log("Verification Fail Exception" + ErrVF);
	}

    }
}
