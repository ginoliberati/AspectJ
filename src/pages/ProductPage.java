package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import controls.Button;
import controls.Label;

public class ProductPage extends BasePage {

	public ProductPage() {
		super(By.xpath("//div[contains(text(),'Products')]"));
	}

	public Label lblProduct() {
		return new Label(By.xpath("//div[contains(text(),'Products')]"));

	}

	public Button btnFirstProduct() {
		return new Button(By.xpath("//div[@class='inventory_list']/div[2]/div[@class='pricebar']/button"));
	}

	public Button btnSecondProduct() {
		return new Button(By.xpath("//div[@class='inventory_list']/div[1]/div[@class='pricebar']/button"));
	}

	public Button btnThirdProduct() {
		return new Button(By.xpath("//div[@class='inventory_list']/div[4]/div[@class='pricebar']/button"));
	}

	public WebElement counterShoppingCart = this.Driver().findElement(By.xpath("//div[@id='shopping_cart_container']"));

}
