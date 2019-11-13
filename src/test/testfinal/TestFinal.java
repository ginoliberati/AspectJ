package test.testfinal;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import pages.DataPage;
import pages.FinishPage;
import pages.OverView;
import pages.LoginPage;
import pages.ProductPage;
import pages.ProductPageButtonRandom;
import pages.ProductPageSelected;
import pages.ProductPageWithItem;
import pages.ProfilePage;
import test.BaseTest;

public class TestFinal extends BaseTest {

	public LoginPage loginPage;

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void VerifyMyCart() throws InterruptedException {
		//loggeo
		loginPage = new LoginPage();
		loginPage.inputUserName().write("standard_user");
		loginPage.inputUserPassword().write("secret_sauce");
		loginPage.btnLogin().click();
		
		
		//selecciono un boton random
		ProductPageButtonRandom productPageRandom = new ProductPageButtonRandom();
		productPageRandom.btnRandom().click();
		
		Thread.sleep(2000);

		//pagina con item seleccionado y checkout
		ProductPageSelected productPageSelected = new ProductPageSelected();
		productPageSelected.goToMyCart().click();
		
	
		
		//clickea el checkout
		ProductPageWithItem payPage = new ProductPageWithItem();
		payPage.btnCheckOut().click();
		
		
		
		//busca el perfil en entra pagina
		this.driver.get("https://www.fakepersongenerator.com/Index/generate");
	
		Thread.sleep(4000);

		
		ProfilePage profilePage = new ProfilePage();
		String name = profilePage.name().split("\\s+")[0];
		String lastName = profilePage.name().split("\\s+")[2];
		String zip = profilePage.zip().split(",")[2];
		
		
		//completa los campos
		this.driver.navigate().back();
		
	
		DataPage dataPage = new DataPage();
		dataPage.inputFirtName().write(name);;
		dataPage.inputLastName().write(lastName);
		dataPage.inputPostaCode().write(zip);
		dataPage.btnContinue().click();
		
	
		
		//boton Finish
		OverView overViewPage = new OverView();
		overViewPage.btnFinish().click();
		
	
		
		//Verifo los mensajes
		FinishPage finishPage = new FinishPage();
		Assert.assertEquals(finishPage.lblThanks().text(), "THANK YOU FOR YOUR ORDER");
		Assert.assertEquals(finishPage.lblMessege().text(), "Your order has been dispatched, and will arrive just as fast as the pony can get there!");
	}

	@After
	public void tearDown() {
		this.finalize();
		

	}
}