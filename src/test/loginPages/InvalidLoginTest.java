package test.loginPages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import pages.LoginPage;
import test.BaseTest;

public class InvalidLoginTest extends BaseTest {

	private LoginPage loginPage;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void VerifyInvalidLogin() throws Exception {

		loginPage = new LoginPage();
		loginPage.inputUserName().write("standard_user");
		loginPage.inputUserPassword().write("noexiste");
		loginPage.btnLogin().click();

		WebElement errorMessage = this.driver().findElement(By.tagName("h3"));

		Assert.assertTrue(errorMessage.isDisplayed());
	}

	@After
	public void tearDown() {
		this.finalize();

	}

}
