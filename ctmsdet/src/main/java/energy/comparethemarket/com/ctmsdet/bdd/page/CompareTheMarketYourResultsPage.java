package energy.comparethemarket.com.ctmsdet.bdd.page;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import energy.comparethemarket.com.ctmsdet.bdd.constants.CTMConstants;
import energy.comparethemarket.com.ctmsdet.bdd.util.SeleniumUtitlityClass;

public class CompareTheMarketYourResultsPage {

	public static WebElement priceTable(WebDriver driver) throws InterruptedException {

		
		for (int second = 0;; second++) {
            if (second >= 200) fail("timeout");
            try { 
                if (SeleniumUtitlityClass.IsElementActive(By.xpath(CTMConstants.PRICESTABLEXPATH+"/tbody/tr"), driver)) 
                    break; 
                } catch (Exception e) {}
            Thread.sleep(1000);
        }
		
		WebElement element = SeleniumUtitlityClass.fluentWaitFindElementbyxPath(driver, CTMConstants.PRICESTABLEXPATH, 100);
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOf(element));
		
		return element;
	}
	
}
