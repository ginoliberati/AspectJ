package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import controls.Label;

public class ProductPageWithItems extends ProductPageWithItem{

	public Label mySecondProduct() {
		return new Label(By.xpath("//div[@class='cart_item'][2]"));
	}
	
	public Label myThirdProduct() {
		return new Label(By.xpath("//div[@class='cart_item'][3]"));
	}
}
