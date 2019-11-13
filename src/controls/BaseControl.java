package controls;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver.DriverWrapper;

public class BaseControl {

	protected By by;

	public BaseControl(By findBy) {
		this.by = findBy;
	}

	protected WebDriver Driver() {
		return DriverWrapper.Driver();
	}

	protected WebElement Element() {
		try {
			return this.Driver().findElement(this.by);
		} catch (NoSuchElementException e) {
			return null;
		}
	}

	public boolean visible() {
		try {
			return DriverWrapper.isVisible(this.by);
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public boolean enabled() {
		try {
			return DriverWrapper.isEnable(this.by);
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public String id() {
		return by.toString();
	}

}
