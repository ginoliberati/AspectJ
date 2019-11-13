package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import controls.Label;

public class ProfilePage extends BasePage {

	public ProfilePage() {
		super(By.xpath("//h1"));
	}
	
	public String name() {
		return (new Label((By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/div/div[1]/p/b"))).text());
	}
	
	public String zip() {
		return (new Label((By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/div/div[2]/p[5]/b"))).text());
	}
}
