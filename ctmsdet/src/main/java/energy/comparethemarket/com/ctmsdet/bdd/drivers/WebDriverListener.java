package energy.comparethemarket.com.ctmsdet.bdd.drivers;

import org.openqa.selenium.WebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;


public class WebDriverListener implements IInvokedMethodListener {
	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		if (method.isTestMethod()) {
			String browserName = method.getTestMethod().getXmlTest().getLocalParameters().get("browserName");
			WebDriver driver = WebDriverFactory.createInstance(browserName);
			WebDriverManager.setWebDriver(driver);
		}
	}
	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		if (method.isTestMethod()) {
			WebDriver driver = WebDriverManager.getDriver();
			if (driver != null) {
				driver.quit();
			}
		}
	}
}
