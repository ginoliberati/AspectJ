package test.products;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import pages.LoginPage;
import pages.ProductPage;
import test.BaseTest;

public class BuyProductsTest extends BaseTest {

	private LoginPage loginPage;
	private ProductPage productPage;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void VerifyBuyThreeProducts() {

		loginPage = new LoginPage();

		loginPage.inputUserName().write("standard_user");
		loginPage.inputUserPassword().write("secret_sauce");
		loginPage.btnLogin().click();

		productPage = new ProductPage();

		Assert.assertTrue(productPage.lblProduct().enabled());
		Assert.assertEquals(productPage.lblProduct().text(), "Products");

		productPage.btnFirstProduct().click();
		productPage.btnSecondProduct().click();
		productPage.btnThirdProduct().click();

		Assert.assertEquals(productPage.counterShoppingCart.findElement(By.xpath("a/span")).getText(), "3");
	}

	@After
	public void tearDown() {
		this.finalize();

	}
}
