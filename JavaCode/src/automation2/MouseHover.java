package automation2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harichaser\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/guide/action-class-in-selenium");	
		
		WebElement developers = driver.findElement(By.xpath("//span[@class='nav_item_name']"));
		Actions actions =  new Actions(driver);
		actions.moveToElement(developers).perform();
		
		WebElement Documentation = driver.findElement(By.xpath("//a[text()='Documentation']"));
		Documentation.click();
		
		WebElement website = driver.findElement(By.xpath("//h2[text()='Test your websites']"));
		String name = website.getText();
		System.out.println(name);
		
		
		
		

	}

}
