package org.question8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Question8 {

	public WebDriver driver;

	@When("user will open the browser and hit URL")
	public void user_will_open_the_browser_and_hit_URL() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

	}

	@When("user will enter username and password")
	public void user_will_enter_username_and_password() {

		driver.findElement(By.name("email")).sendKeys("praveen paul raj");

		driver.findElement(By.name("pass")).sendKeys("abc@123");
	}

	@When("user will hit the login button")
	public void user_will_hit_the_login_button() {

		driver.findElement(By.name("login")).click();
	}

	@Then("application will respond with invalid user and and password message")
	public void application_will_respond_with_invalid_user_and_and_password_message() {

		System.out.println("done");
	}

}