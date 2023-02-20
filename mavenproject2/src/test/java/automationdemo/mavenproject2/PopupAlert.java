package automationdemo.mavenproject2;



import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PopupAlert {
  @Test
  public void f() {
	  
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\harichaser\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		WebElement jsAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		jsAlert.click();	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String name = alert.getText();
		System.out.println(name);
		alert.accept();
		
	
		WebElement jsConfirm = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		jsConfirm.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert1 = driver.switchTo().alert();
		String name1 = alert1.getText();
		System.out.println(name1);
		alert1.accept();	
		
		WebElement jsPrompt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		jsPrompt.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("rrrrrrrr");
		String name3 = alert2.getText();
		System.out.println(name3);
		alert2.accept();
		
  }
  

}
