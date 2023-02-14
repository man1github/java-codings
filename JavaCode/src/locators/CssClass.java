package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harichaser\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/");
				
		WebElement email = driver.findElement(By.cssSelector("input#email"));	
		email.sendKeys("xyz@abc.com");
		
		WebElement textarea = driver.findElement(By.xpath("//textarea[@id='message']"));	
		textarea.sendKeys("work");
		
		WebElement button = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']/parent::button[@id='j_idt130']"));	
		button.click();
	
	}

}
