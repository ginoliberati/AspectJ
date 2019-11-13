package test.products;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.LoginPage;
import pages.ProductPage;
import pages.ProductPageSelected;
import pages.ProductPageWithItem;
import pages.ProductPageWithItems;
import test.BaseTest;

public class MyCartTest extends BaseTest {
	public LoginPage loginPage;
	public ProductPage productPage;

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void VerifyMyCart() {

		loginPage = new LoginPage();
		loginPage.inputUserName().write("standard_user");
		loginPage.inputUserPassword().write("secret_sauce");
		loginPage.btnLogin().click();

		productPage = new ProductPage();
		productPage.btnFirstProduct().click();
		productPage.btnSecondProduct().click();
		productPage.btnThirdProduct().click();

		ProductPageSelected productPage = new ProductPageSelected();

		productPage.goToMyCart().click();

		ProductPageWithItems payPage = new ProductPageWithItems();

		Assert.assertTrue(payPage.myFirstProduct().visible());
		Assert.assertTrue(payPage.mySecondProduct().visible());
		Assert.assertTrue(payPage.myThirdProduct().visible());

	}

	@After
	public void tearDown() {
		this.finalize();

	}
}
