package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TTPCartPage {
	
	WebDriver driver;
	
	public TTPCartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By delete = By.cssSelector("a.remove");
	By product_name = By.cssSelector("td[class='product-name']");
	By shipping_calculator = By.className("shipping-calculator-button");
	By state_button = By.id("select2-calc_shipping_state-container");
	By shipping_state = By.className("select2-search__field");
	By shipping_city = By.id("calc_shipping_city");
	By shipping_zip = By.id("calc_shipping_postcode");
	By update_button = By.cssSelector("button[name='calc_shipping']");
	By checkout = By.cssSelector("a.checkout-button");
	
	public WebElement validateProduct() {
		return driver.findElement(product_name);
	}
	
	public WebElement removeItem() {
		return driver.findElement(delete);
	}
	
	public void shippingButtons() {
		WebElement shipBtn = driver.findElement(shipping_calculator);
		shipBtn.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement stateBtn = driver.findElement(state_button);
		stateBtn.click();
	}
	
	public WebElement stateInput() {
		return driver.findElement(shipping_state);
	}
	
	public WebElement cityInput() {
		return driver.findElement(shipping_city);
	}
	
	public WebElement zipInput() {
		return driver.findElement(shipping_zip);
	}
	
	public void itemToCheckOut() {
		WebElement shippingInfo = driver.findElement(update_button);
		shippingInfo.click();
	}
	
}
