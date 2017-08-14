package energy.comparethemarket.com.ctmsdet.bdd.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {
	static WebDriver createInstance(String browserName) {
		WebDriver driver = null;
		
		switch (browserName) {
		case "firefox" :{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}		
		case "chrome" :{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		case "ie" :{
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir") + "/src/test/resources/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		}
		case "edge" :{
			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir") + "/src/test/resources/drivers/MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			break;
		}
		default:
			break;
		}
		return driver;
	}
}
