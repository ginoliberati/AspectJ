package pages;

import org.openqa.selenium.By;

import controls.Button;
import controls.Input;

public class DataPage extends BasePage{
	
	public  DataPage() {
		super(By.cssSelector("div#main"));
	}
	
	public Input inputFirtName() {
		return new Input(By.id("first-name"));
	}
	
	public Input inputLastName() {
		return new Input(By.id("last-name"));
	}
	
	public Input inputPostaCode() {
		return new Input(By.id("postal-code"));
	}
	
	public Button btnContinue() {
		return new Button(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input"));
	}
}
	