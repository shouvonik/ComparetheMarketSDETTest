package energy.comparethemarket.com.ctmsdet.bdd.drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class WebDriverManager {
	private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		if (webDriver.get() == null) {
			setWebDriver(WebDriverFactory.createInstance(null));
		}
		return webDriver.get();
	}

	static void setWebDriver(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webDriver.set(driver);
	}
}
