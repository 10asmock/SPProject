package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TTPStorePage {
	
	WebDriver driver;
	
	public TTPStorePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By product_title = By.tagName("h1");
	By size= By.id("size");
	By quantity= By.cssSelector("input.qty");
	By reset= By.className("reset_variations");
	By submit=By.xpath("//button[contains(text(),'Add to cart')]");
	By contents=By.className("cart-contents");
	
	
	public WebElement productTitle() {
		return driver.findElement(product_title);
	}
	
	public void selectSize(String itemSize) {
		Select drop = new Select(driver.findElement(size));
		drop.selectByValue(itemSize);
	}
	
	public void quantityItem(String item) {
		WebElement itemQty = driver.findElement(quantity);
		itemQty.clear();
		itemQty.sendKeys(item);
	}
	
	public WebElement resetItems() {
		return driver.findElement(reset);
	}
	
	public void addItemsToCart() {
		WebElement addItemsToCart = driver.findElement(submit);
		addItemsToCart.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement goToCart = driver.findElement(contents);
		goToCart.click();
	}

}
