package energy.comparethemarket.com.ctmsdet.bdd.util;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;


public class SeleniumUtitlityClass {
	public static WebElement fluentWaitFindElementbyID(WebDriver driver, String id, final int timeoutSeconds) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(timeoutSeconds, TimeUnit.SECONDS)
				.pollingEvery(500, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
		return wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver webDriver) {
				return driver.findElement(By.id(id));
			}
		});
	}

	public static WebElement fluentWaitFindElementbyclassName(WebDriver driver, String className,
			final int timeoutSeconds) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(timeoutSeconds, TimeUnit.SECONDS)
				.pollingEvery(500, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
		return wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver webDriver) {
				return driver.findElement(By.className(className));
			}
		});
	}

	public static WebElement fluentWaitFindElementbyCssSelector(WebDriver driver, String cssSelector,
			final int timeoutSeconds) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(timeoutSeconds, TimeUnit.SECONDS)
				.pollingEvery(10, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
		return wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver webDriver) {
				return driver.findElement(By.cssSelector(cssSelector));
			}
		});
	}

	public static WebElement fluentWaitFindElementbyxPath(WebDriver driver, String xpath, final int timeoutSeconds) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(timeoutSeconds, TimeUnit.SECONDS)
				.pollingEvery(500, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
		return wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver webDriver) {
				return driver.findElement(By.xpath(xpath));
			}
		});
	}

	public static List<WebElement> fluentWaitFindElementbyxPathList(WebDriver driver, String xpath,
			final int timeoutSeconds) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(timeoutSeconds, TimeUnit.SECONDS)
				.pollingEvery(500, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
		return wait.until(new Function<WebDriver, List<WebElement>>() {
			public List<WebElement> apply(WebDriver webDriver) {
				return driver.findElements(By.xpath(xpath));
			}
		});
	}

	public static List<WebElement> fluentWaitFindElementbycssSelectorList(WebDriver driver, String cssSelector,
			final int timeoutSeconds) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(timeoutSeconds, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		return wait.until(new Function<WebDriver, List<WebElement>>() {
			public List<WebElement> apply(WebDriver webDriver) {
				return driver.findElements(By.cssSelector(cssSelector));
			}
		});
	}

	public static List<WebElement> fluentWaitFindElementclassList(WebDriver driver, String className,
			final int timeoutSeconds) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(timeoutSeconds, TimeUnit.SECONDS)
				.pollingEvery(500, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
		return wait.until(new Function<WebDriver, List<WebElement>>() {
			public List<WebElement> apply(WebDriver webDriver) {
				return driver.findElements(By.className(className));
			}
		});
	}

	public static List<WebElement> fluentWaitFindElementbyidList(WebDriver driver, String id,
			final int timeoutSeconds) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(timeoutSeconds, TimeUnit.SECONDS)
				.pollingEvery(500, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
		return wait.until(new Function<WebDriver, List<WebElement>>() {
			public List<WebElement> apply(WebDriver webDriver) {
				return driver.findElements(By.id(id));
			}
		});
	}
	
	public static boolean IsElementActive(By id, WebDriver driver) {
		WebElement we =  driver.findElement(id);
	    if(we.isEnabled())
	        return true;
	    return false;
	}
	
	public static int getRowCount(WebElement webtable){
		List <WebElement> rows = webtable.findElements(By.tagName("tr"));
		return rows.size();
	}
}
