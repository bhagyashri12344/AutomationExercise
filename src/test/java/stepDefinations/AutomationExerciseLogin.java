package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExerciseLogin{
	WebDriver driver;

@Given("I am on the Automation Exercise login page")
public void i_am_on_the_automation_exercise_login_page() {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://www.automationexercise.com/");
    
}

@When("I login with valid credentials")
public void i_login_with_valid_credentials() {
	driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
	driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("patilbhagyashri011@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Sw@mi2296");
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

}


@And("I navigate to the products page")
public void i_navigate_to_the_products_page() {
   driver.findElement(By.xpath("//a[@href='/products']")).click();
   List<WebElement> productPrice=driver.findElements(By.xpath("(//div[contains(@class,'productinfo')])/child::h2"));
	for (WebElement price : productPrice) {
		System.out.println(price.getText());
	}

}

@Then("I print all product names and prices")
public void i_print_all_product_names_and_prices() {
	   List<WebElement> productPrice=driver.findElements(By.xpath("(//div[contains(@class,'productinfo')])/child::p"));
		for (WebElement price : productPrice) {
			System.out.println(price.getText());
}

}

}

	





