package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SimpleProgrammerForum {
	
	WebDriver driver;
	
	public SimpleProgrammerForum(WebDriver driver) {
		this.driver = driver;
	}
	
	By loginValidation = By.cssSelector("div.blockMessage.blockMessage--error");
	By title=By.tagName("h1");
	By login_navbar_button=By.xpath("//span[@class='p-navgroup-linkText'][contains(text(),'Log in')]");
	By username=By.name("login");
	By password=By.name("password");
	By login_checkbox=By.name("remember");
	By login_button=By.xpath("//button[contains(@class,'login')]");
	
	public WebElement loginValidation() {
		return driver.findElement(loginValidation);
	}
	
	public WebElement page_title() {
		return driver.findElement(title);
	}
	
	public WebElement Loginnav() {
		return driver.findElement(login_navbar_button);
	}
	
	public WebElement Userid() {
		return driver.findElement(username);
	}
	
	public WebElement Userpass() {
		return driver.findElement(password);
	}
	
	public WebElement Rememberme() {
		return driver.findElement(login_checkbox);
	}
	
	public WebElement Login_button() {
		return driver.findElement(login_button);
	}

}
