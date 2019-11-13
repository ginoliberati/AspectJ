package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import controls.Button;

public class ProductPageButtonRandom extends BasePage {

	public ProductPageButtonRandom() {
		super(By.xpath("//div[contains(text(),'Products')]"));
	}

	public Button btnRandom() {
		List<Button> buttons = new ArrayList<Button>();
		for (int i = 0;i<7;i++) {
			Button boton = new Button(By.xpath("//div[@class='inventory_list']/div["+i+"]/div[@class='pricebar']/button"));
			buttons.add(boton);
		}
		Random r = new Random();
		int valorRandom = r.nextInt(6)+1;
		return buttons.get(valorRandom);
	}
}
