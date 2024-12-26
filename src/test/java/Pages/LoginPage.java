package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	
	By username1=By.id("username");
	By password1=By.id("password");
	By login=By.xpath("//*[@id=\"login\"]/button");
	By logout=By.xpath("/html/body/main/div[3]/div/a/i");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterUsername(String username) {
		driver.findElement(username1).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(password1).sendKeys(password);
	}

	public void checkLogin() {
		driver.findElement(login).click();
	}
	
	public void checkLogout() {
		driver.findElement(logout).click();
	}
}
