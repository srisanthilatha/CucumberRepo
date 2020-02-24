package cs4;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Moveforward {
	WebDriver driver;

	@Given("user wants to login on TestMeApp")
	public void user_wants_to_login_on_TestMeApp() {
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
		 
		driver=new ChromeDriver();
		 
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		 driver.findElement(By.xpath("//a[@href=\'login.htm\']")).click();
		 driver.findElement(By.name("userName")).sendKeys("Lalitha");
		 driver.findElement(By.name("password")).sendKeys("password123");
		 driver.findElement(By.name("Login")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("searching item")
	public void searching_item() {
		driver.findElement(By.xpath("//a[@href=\'#\']")).click();
		driver.findElement(By.linkText("All Categories"));
		driver.findElement(By.linkText("Electronics")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Head Phone")).click();
		//driver.findElement(By.linkText("Add to cart")).click();
		driver.findElement(By.xpath("//a[@href=\'displayCart.htm\']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("TestMeApp doesnot allow the user without adding an item into cart")
	public void testmeapp_doesnot_allow_the_user_without_adding_an_item_into_cart() {
		System.out.println("TestMeApp doesnot allow the user without adding an item into cart");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}



}
