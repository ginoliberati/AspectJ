package pages;

import org.openqa.selenium.By;

import controls.Button;

public class OverView extends BasePage{

	public  OverView() {
		super(By.cssSelector("div#main"));
	}
	
	public Button btnFinish() {
		return new Button(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]"));
	}
}
