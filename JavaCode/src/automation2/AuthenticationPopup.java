package automation2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harichaser\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		WebElement result = driver.findElement(By.xpath("//p[contains(text(),'Congratulations! Yo')]"));
		String word = result.getText();
		System.out.println(word);
		
		
		
		
	}

}
