package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import controls.Button;

public class ProductPageSelected extends BasePage {

	public ProductPageSelected() {
		super(By.xpath("//div[contains(text(),'Products')]"));
	}

	public Button goToMyCart() { 
		return new Button(By.xpath("//span[contains(@class, 'shopping_cart_badge')]/.."));
	}

}
