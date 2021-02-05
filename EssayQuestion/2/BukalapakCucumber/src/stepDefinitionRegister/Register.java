package stepDefinitionRegister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {

	private WebDriver driver = new FirefoxDriver();
	@Given("^open firefox$")
	public void open_firefox() throws Throwable {
		driver.get("https://www.bukalapak.com/");
	}

	@When("^I input valid email or telephone number$")
	public void I_input_valid_email_or_telephone_number() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div/section/header/div[3]/div/div/div[2]/div/a[1]/p")).click();
		driver.findElement(By.cssSelector(".bl-text-field__input")).sendKeys("fransdedypasaribu12@gmail.com");
	}

	@Then("^I click register button$")
	public void I_click_register_button() throws Throwable {
		driver.findElement(By.xpath("/html/body/main/div/div[2]/div[2]/button")).click();
	}

	@When("^I filled out the form$")
	public void I_filled_out_the_form() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("Frans Dedy");
		driver.findElement(By.xpath("/html/body/main/div[2]/div/form/div[3]/label[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("qwertyuiop1234");
		driver.findElement(By.xpath("//*[@id=\"user_password_confirmation\"]")).sendKeys("qwertyuiop1234");
		driver.findElement(By.xpath("/html/body/main/div[2]/div/form/div[8]/label/span")).click();
	}

	@Then("^I have registered$")
	public void I_have_registered() throws Throwable {
		driver.findElement(By.xpath("/html/body/main/div[2]/div/form/button")).click();
	}

}
