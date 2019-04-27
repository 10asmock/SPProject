package SimpleProgrammer;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.SimpleProgrammerForum;
import resources.Base;

public class LoginApplication extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void setup() throws IOException {
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.get("https://simpleprogrammer.com/members/");
	}
	
	@Test(dataProvider="getData")
	public void Login(String Username, String Password) throws IOException {
		
		SimpleProgrammerForum sp=new SimpleProgrammerForum(driver);
		sp.Loginnav().click();
		sp.Userid().sendKeys(Username);
		sp.Userpass().sendKeys(Password);
		sp.Login_button().click();
		
		Assert.assertEquals(sp.loginValidation().getText(), "The requested user '10asmock' could not be found.");
		log.info("Successfully logged in and validated user credentials");
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[1][2];
		data[0][0]="10asmock";
		data[0][1]="secret";
		
		return data;
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}

}
