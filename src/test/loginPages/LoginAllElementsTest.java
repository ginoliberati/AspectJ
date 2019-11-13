package test.loginPages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import pages.LoginPage;
import test.BaseTest;

public class LoginAllElementsTest extends BaseTest {

	public LoginAllElementsTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void verfyVisibilityOfAllElements() throws Exception {
		new LoginPage();

		WebElement logoLogin = this.driver().findElement(By.className("login_logo"));
		WebElement inputUsername = this.driver().findElement(By.id("user-name"));
		WebElement inputPassword = this.driver().findElement(By.id("password"));
		WebElement btnLogin = this.driver().findElement(By.xpath("//input[@value='LOGIN']"));

		Assert.assertTrue(logoLogin.isDisplayed());
		Assert.assertTrue(inputUsername.isDisplayed());
		Assert.assertEquals(inputUsername.getAttribute("placeholder"), "Username");
		Assert.assertTrue(inputPassword.isDisplayed());
		Assert.assertEquals(inputPassword.getAttribute("placeholder"), "Password");
		Assert.assertTrue(btnLogin.isDisplayed());

	}

	@After
	public void tearDown() {
		this.finalize();
	}
}
