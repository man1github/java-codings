package testngclass.mavenproject2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo1 {

	@Test
	public void f() {
		// hard assertion - Assert

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		String actualTitle = driver.getTitle();
		String expectedTitle = "1Facebook – log in or sign up";

		Assert.assertEquals(actualTitle, expectedTitle, "title mismatch");
		System.out.println("title completed");

		String actualText = driver.findElement(By.xpath("//img[@alt='Facebook']")).getAttribute("alt");
		String expectedText = "Facebook";

		Assert.assertEquals(actualText, expectedText, "text mismatch");
		System.out.println("text completed");

	}

	@Test
	public void name() {
		System.out.println("12345");
	}
}
