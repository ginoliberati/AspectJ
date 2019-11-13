package pages;

import org.openqa.selenium.By;

import controls.Label;

public class FinishPage extends BasePage{
	
	public  FinishPage() {
		super(By.cssSelector("div#main"));
	}
	
	public Label lblThanks() {
		return new Label(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
	}
	
	public Label lblMessege() {
		return new Label(By.xpath("//*[@id=\"checkout_complete_container\"]/div[1]"));
	}
}
