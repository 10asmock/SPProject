package SimpleProgrammer;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.SimpleProgrammerForum;
import resources.Base;

public class validateTitle extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void setup() throws IOException {
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.get("https://simpleprogrammer.com/members/");
	}
	
	@Test
	public void Login() {
		SimpleProgrammerForum sp=new SimpleProgrammerForum(driver);
		Assert.assertEquals(sp.page_title().getText(), "Simple Programmer - Member Forums");
		log.info("Successfully validated forum page title");
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}

}
