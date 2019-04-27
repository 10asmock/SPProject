package SimpleProgrammer;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.Base;
import pageObjects.TTPCartPage;
import pageObjects.TTPProductPage;
import pageObjects.TTPStorePage;

public class ProductApplication extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void setup() throws IOException {
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.get("https://simpleprogrammer.com/store/products/trust-the-process-t-shirt/");
	}
	
	@Test(dataProvider="getProductData", dataProviderClass=dataProvider.class)
	public void BuyItem(String Size, String Amount) {
		TTPProductPage pp= new TTPProductPage(driver);
		pp.TTPButton().click();
		TTPStorePage sp = new TTPStorePage(driver);
		sp.selectSize(Size);
		sp.quantityItem(Amount);
		sp.addItemsToCart();
	}
	
	@Test(dataProvider="getCartData", dataProviderClass=dataProvider.class)
	public void CartItem(String State, String City, String Zip) {
		TTPCartPage cp = new TTPCartPage(driver);
		cp.shippingButtons();
		cp.stateInput().sendKeys(State);
		cp.stateInput().sendKeys(Keys.ENTER);
		cp.cityInput().sendKeys(City);
		cp.zipInput().sendKeys(Zip);
		cp.itemToCheckOut();
		
		Assert.assertEquals(cp.validateProduct().getText(), "Trust the Process T-Shirt - M ");
		log.info("Successfully added product to cart and validated item");
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}

}
