package pages;

import org.openqa.selenium.By;
import controls.Button;
import controls.Input;

public class LoginPage extends BasePage {

	public LoginPage() {
		super(By.cssSelector("div#main"));
	}

	public LoginPage(By by) {
		super(by);
	}

	public Input inputUserName() {
		return new Input(By.id("user-name"));
	}

	public Input inputUserPassword() {
		return new Input(By.id("password"));
	}

	public Button btnLogin() {
		return new Button(By.xpath("//input[@value='LOGIN']"));
	}

}
