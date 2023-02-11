package zpratice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\harichaser\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://ksrtc.in/oprs-web/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement searchBus = driver.findElement(By.className("btn btn-primary btn-lg btn-block btn-booking"));
			searchBus.click();
			
			Alert button = driver.switchTo().alert();  //using alert concept for to dismiss or accept popups.
			button.accept();
			
			WebElement from = driver.findElement(By.id("fromPlaceName"));
			from.sendKeys("chennai");
			driver.close();
	}

}
