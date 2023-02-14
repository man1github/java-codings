package automation2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harichaser\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://demoqa.com/frames");
		
		WebElement frame = driver.findElement(By.xpath("//span[text()='Frames']"));
		frame.click();

		driver.switchTo().frame(0);
		System.out.println(driver.getTitle());
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(1);
		System.out.println(driver.getTitle());
		driver.switchTo().parentFrame();
	}

}
