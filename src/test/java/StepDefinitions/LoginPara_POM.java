package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPara_POM {
	WebDriver driver=null;
	LoginPage lp;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhagy\\eclipse-workspace\\CucumberJava\\src\\test\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://practice.expandtesting.com/login");
	    
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) {
		 lp=new LoginPage(driver);
		 lp.enterUsername(username);
		lp.enterPassword(password);
		
			

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		lp.checkLogin();
		
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
	lp.checkLogout();
	}
	



}

