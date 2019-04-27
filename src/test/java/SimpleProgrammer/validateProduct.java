package SimpleProgrammer;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.TTPStorePage;
import resources.Base;

public class validateProduct extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void setup() throws IOException {
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.get("https://simpleprogrammer.com/store/t-shirts/trust-the-process/");
	}
	
	@Test
	public void Product() {
		TTPStorePage sp = new TTPStorePage(driver);
		Assert.assertEquals(sp.productTitle().getText(), "Trust the Process T-Shirt");
		log.info("Successfully validated product");
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}

}
