package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import controls.Button;
import controls.Label;

public class ProductPageWithItem extends BasePage {

	public ProductPageWithItem() {
		super(By.xpath("//div[contains(text(),'Your Cart')]"));
	}

	public Label myFirstProduct() { 
		return new Label(By.xpath("//div[@class='cart_item'][1]"));
	}

	public Button btnCheckOut() {
		return new Button(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]"));
	}
}
