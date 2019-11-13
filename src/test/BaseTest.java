package test;

import org.openqa.selenium.WebDriver;

import driver.DriverManager;

public class BaseTest {
	protected WebDriver driver;

	public BaseTest() {
		this.driver = DriverManager.Instance().Driver();
		this.driver.get("https://www.saucedemo.com/");
	}

	protected WebDriver driver() {
		return this.driver;
	}

	protected void finalize() {
		DriverManager.Instance().CloseDriver();
	}
}
