package driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	private WebDriver activeDriver;

	private DriverManager() {
	}

	private static DriverManager instance;

	public static DriverManager Instance() {
		if (instance == null) {
			instance = new DriverManager();
		}
		return instance;
	}

	public WebDriver Driver() {
		if (this.activeDriver == null) {
			String driverPath = System.getProperty("user.dir") + "/driver/chromedriver";
			System.setProperty("webdriver.chrome.driver", driverPath);
			this.activeDriver = new ChromeDriver();
			activeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		return this.activeDriver;
	}

	public void CloseDriver() {
		activeDriver.close();
		activeDriver.quit();
		activeDriver = null;
	}
}
