package cs2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	@Given("i enter username")
	public void i_enter_username() {
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	}
	@When("enters {string} , {string}")
	public void enters(String string, String string2) {
		driver.findElement(By.name("userName")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
		driver.findElement(By.name("Login")).click();
	}
	@Then("click on login button")
	public void click_on_login_button() {
		System.out.println("login successful");
	}
}
