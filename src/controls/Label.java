package controls;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class Label extends BaseControl {

	private String text;
	
	public Label(By by) {
		super(by);
	}

	public String text() {
		try {
			text = this.Element().getText();
			return text;
		} catch (NoSuchElementException e) {
			return null;
		}
	}
	
	public String getText() {
		return text;
	}
	
}

