package energy.comparethemarket.com.ctmsdet.bdd.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import energy.comparethemarket.com.ctmsdet.bdd.constants.CTMConstants;
import energy.comparethemarket.com.ctmsdet.bdd.util.SeleniumUtitlityClass;

public class CompareTheMarketYourPreferencesPage {

	public static WebElement allTariffPreference(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyxPath(driver, CTMConstants.ALLTARIFFPREFERENCEXPATH, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
				
		return element;
	}
	
	public static WebElement allPaymentTypePreference(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyxPath(driver, CTMConstants.ALLPAYMENTTYPEXPATH, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
				
		return element;
	}
	
	public static WebElement refineResultYes(WebDriver driver) {
		List<WebElement> elements = SeleniumUtitlityClass.fluentWaitFindElementbyxPathList(driver, CTMConstants.REFINERESULTRADIOGROUPXPATH, 100);
		for(WebElement element : elements){
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
			new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
		}
		
		if(elements.size()==0){
			return null;
		}else{
			return elements.get(1);
		}
	}
	
	public static WebElement email(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyCssSelector(driver, CTMConstants.EMAILCSS, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
				
		return element;
	}
	
	public static WebElement uptodate(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyxPath(driver, CTMConstants.UPTODATEXPATH, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
				
		return element;
	}
	
	public static WebElement termsandconditions(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyxPath(driver, CTMConstants.TERMSANDCONDITIONXPATH, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
				
		return element;
	}
	
	public static WebElement gotopricesButton(WebDriver driver) {
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyCssSelector(driver, CTMConstants.GOTOPRICESBUTTONCSS, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
				
		return element;
	}
	
}
