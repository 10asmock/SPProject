package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TTPProductPage {
	
	WebDriver driver;
	
	public TTPProductPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By size_button = By.cssSelector("a[class='tcb-button-link']");
	
	public WebElement TTPButton() {
		return driver.findElement(size_button);
	}

}
