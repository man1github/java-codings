package testngclass.mavenproject2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderClass {

	@Test(dataProvider = "logindata")
	public void login(String Username, String Password) {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement name1 = driver
				.findElement(By.cssSelector("input[class='oxd-input oxd-input--active'][name='username']"));
		name1.sendKeys(Username);

		WebElement passwordc = driver
				.findElement(By.cssSelector("input[class='oxd-input oxd-input--active'][name='password']"));
		passwordc.sendKeys(Password);

		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
	}

	@DataProvider(name = "logindata")
	@Test
	public Object data() {

		Object[][] obj = new Object[4][2];

		obj[0][0] = "Admin";
		obj[0][1] = "admin123";

		obj[1][0] = "Admin";
		obj[1][1] = "admin12";

		obj[2][0] = "Admin1";
		obj[2][1] = "admin123";

		obj[3][0] = "Admin1";
		obj[3][1] = "admin123";
		
		return obj;

	}
}
