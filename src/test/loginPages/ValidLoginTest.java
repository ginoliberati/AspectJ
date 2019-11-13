package test.loginPages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import pages.LoginPage;
import pages.ProductPage;
import test.BaseTest;

public class ValidLoginTest extends BaseTest {

	private LoginPage loginPage;
	private ProductPage productPage;

	public ValidLoginTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void verifyLogin() throws Exception {

		loginPage = new LoginPage();

		loginPage.inputUserName().write("standard_user");
		loginPage.inputUserPassword().write("secret_sauce");
		loginPage.btnLogin().click();

		productPage = new ProductPage();

		Assert.assertTrue(productPage.lblProduct().enabled());
		Assert.assertEquals(productPage.lblProduct().text(), "Products");
	}

	@After
	public void tearDown() {
		this.finalize();

	}

}
