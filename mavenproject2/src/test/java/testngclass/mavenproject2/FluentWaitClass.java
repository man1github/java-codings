package testngclass.mavenproject2;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class FluentWaitClass {

	@Test
	public void login() {
		// fluent wait

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		WebElement uname = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver
						.findElement(By.cssSelector("input[class='oxd-input oxd-input--active'][name='username']"));
			}

		});

		uname.sendKeys("Admin");

		/*
		 * WebElement name1 = driver .findElement(By.
		 * cssSelector("input[class='oxd-input oxd-input--active'][name='username']"));
		 * name1.sendKeys("Admin");
		 * 
		 */

		WebElement passwordc = driver
				.findElement(By.cssSelector("input[class='oxd-input oxd-input--active'][name='password']"));
		passwordc.sendKeys("admin123");

		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();

	}
	
}
