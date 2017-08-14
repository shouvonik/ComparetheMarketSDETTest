package energy.comparethemarket.com.ctmsdet.bdd.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import energy.comparethemarket.com.ctmsdet.bdd.constants.CTMConstants;
import energy.comparethemarket.com.ctmsdet.bdd.util.SeleniumUtitlityClass;

public class CompareTheMarketYourEnergyPage {

	public static WebElement prePaymentMeterNo(WebDriver driver) {
		List<WebElement> elements = SeleniumUtitlityClass.fluentWaitFindElementbyxPathList(driver, CTMConstants.PREPAYMENTMETERRADIOGROUPXPATH, 100);
		for(WebElement element : elements){
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
			new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
		}
		
		return elements.get(1);
	}
	
	public static WebElement economyMeterNo(WebDriver driver) {
		List<WebElement> elements = SeleniumUtitlityClass.fluentWaitFindElementbyxPathList(driver, CTMConstants.ECONOMYMETERRADIOGROUPXPATH, 100);
		for(WebElement element : elements){
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
			new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
		}
		
		return elements.get(1);
	}
	
	public static WebElement spendOnElectricityNotKnown(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyCssSelector(driver, CTMConstants.CURRENTSPENDONELECTRICITYNOTKNOWNRADIOCSS, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
				
		return element;
	}
	
	public static WebElement oneBedroom(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyCssSelector(driver, CTMConstants.ONEBEDROOMCSS, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
				
		return element;
	}
	
	public static WebElement oneOccupant(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyCssSelector(driver, CTMConstants.ONEOCCUPANTCSS, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
				
		return element;
	}
	
	public static WebElement sourceOfHeatingElectricity(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyCssSelector(driver, CTMConstants.SOURCEOFHEATINGCSS, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
				
		return element;
	}
	
	public static WebElement heatingUsageTemperate(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyCssSelector(driver, CTMConstants.HEATINGUSAGECSS, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
				
		return element;
	}
	
	public static WebElement houseInsulationLevelWellWrapped(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyCssSelector(driver, CTMConstants.HOUSEINSULATIONLEVELCSS, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
				
		return element;
	}
	
	public static WebElement cookingSourceElectricity(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyCssSelector(driver, CTMConstants.COOKINGSOURCECSS, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
				
		return element;
	}
	
	public static WebElement houseOccupancyWeekends(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyCssSelector(driver, CTMConstants.HOUSEOCCUPANCYCSS, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
				
		return element;
	}
}
