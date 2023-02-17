package testngclass.mavenproject2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo2 {
	@Test
	public void f() {
		// soft assertion - verify

		SoftAssert softassert = new SoftAssert();

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		String actualTitle = driver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";

		softassert.assertEquals(actualTitle, expectedTitle, "title mismatch");
		System.out.println("title completed");

		String actualText = driver.findElement(By.xpath("//img[@alt='Facebook']")).getAttribute("alt");
		String expectedText = "Facebook";

		softassert.assertEquals(actualText, expectedText, "text mismatch");
		System.out.println("text completed");

		softassert.assertAll();

	}
}
