package energy.comparethemarket.com.ctmsdet.bdd.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import energy.comparethemarket.com.ctmsdet.bdd.constants.CTMConstants;
import energy.comparethemarket.com.ctmsdet.bdd.drivers.WebDriverManager;
import energy.comparethemarket.com.ctmsdet.bdd.page.CompareTheMarketYourPreferencesPage;

public class CompareTheMarketUtility {

	static WebDriver driver = WebDriverManager.getDriver();
	
	public static void selectYourCurrentElectricitySupplier(String currentElectricitySupplier){
		String locator = null;
		switch (currentElectricitySupplier.toLowerCase()) {
        case "british gas":
            locator = CTMConstants.CURRENTELECTRICITYPROVIDERBRITISHGAS;
            break;
        case "edf":
        	locator = CTMConstants.CURRENTELECTRICITYPROVIDEREDF;
        	break;
        case "eon":
        	locator = CTMConstants.CURRENTELECTRICITYPROVIDEREON;
        	break;
        case "npower":
        	locator = CTMConstants.CURRENTELECTRICITYPROVIDERNPOWERXPATH;
        	break;
        case "scottish power":
        	locator = CTMConstants.CURRENTELECTRICITYPROVIDERSCOTTISHPOWER;
        	break;
        case "sse":
        	locator = CTMConstants.CURRENTELECTRICITYPROVIDERSSE;
        	break;
        default :
        	break;
		}
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyxPath(driver, locator, 100);
		element.click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.attributeContains(element.findElement(By.xpath("..")), "class", "checked"));
	}
	
	public static WebElement nextButton(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyxPath(driver, CTMConstants.NEXTBUTTONCSS, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}
	
	public static void selectYourTariffPreference(String tariffPreference){
		WebElement element = null;
		switch (tariffPreference.toLowerCase()) {
        case "all tariff":
            element = CompareTheMarketYourPreferencesPage.allTariffPreference(driver);
            break;
        default :
        	break;
		}
		element.click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.attributeContains(element.findElement(By.xpath("..")), "class", "checked"));
	}
	
	public static void selectYourPaymentPreference(String tariffPreference){
		WebElement element = null;
		switch (tariffPreference.toLowerCase()) {
        case "all":
            element = CompareTheMarketYourPreferencesPage.allPaymentTypePreference(driver);
            break;
        default :
        	break;
		}
		element.click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.attributeContains(element.findElement(By.xpath("..")), "class", "checked"));
	}
}
