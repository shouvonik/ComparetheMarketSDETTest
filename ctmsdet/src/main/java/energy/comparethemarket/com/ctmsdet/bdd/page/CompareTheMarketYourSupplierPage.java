package energy.comparethemarket.com.ctmsdet.bdd.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import energy.comparethemarket.com.ctmsdet.bdd.constants.CTMConstants;
import energy.comparethemarket.com.ctmsdet.bdd.util.SeleniumUtitlityClass;

public class CompareTheMarketYourSupplierPage {

	public static WebElement customerPostcode(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyCssSelector(driver, CTMConstants.POSTCODECSS, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}
	
	public static WebElement findPostcode(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyCssSelector(driver, CTMConstants.FINDPOSTCODECSS, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}
	
	public static WebElement noBill(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyxPath(driver, CTMConstants.NOBILLXPATH, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}
	
	public static WebElement compareElectricity(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyxPath(driver, CTMConstants.ELECTRICITYONLYOPTIONXPATH, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}
	
	

	public static void validPostcode(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyxPath(driver, CTMConstants.VALIDPOSTCODEXPATH, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
		//return element;
	}
	
	/*public static void validBillOption(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyxPath(driver, CTMConstants.VALIDBILLOPTIONXPATH, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
		//return element;
	}
	
	public static void validCompareWhatOption(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyxPath(driver, CTMConstants.VALIDCOMPAREWHATOPTIONXPATH, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
		//return element;
	}
	
	public static void validCurrentElectricitySupplier(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyxPath(driver, CTMConstants.VALIDELECTRICITYSUPPLIEROPTIONXPATH, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
		//return element;
	}*/
}
