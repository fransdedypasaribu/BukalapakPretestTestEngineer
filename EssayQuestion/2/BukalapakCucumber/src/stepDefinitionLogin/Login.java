package stepDefinitionLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	private WebDriver driver = new FirefoxDriver();
	@Given("^open firefox$")
	public void open_firefox() throws Throwable {
		driver.get("https://www.bukalapak.com/");
	}

	@When("^I input valid email and password$")
	public void I_input_valid_email_and_password() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div/section/header/div[3]/div/div/div[2]/div/a[2]/p")).click();
		driver.findElement(By.xpath("//*[@id=\"user_session_username\"]")).sendKeys("fransdedypasaribu@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"user_session_password\"]")).sendKeys("@A1b2c3d4");	
	}
	

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.cssSelector(".c-btn--spinner__icon")).click();
	}
	
}
