package automation2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   //number of windows opened

		closeWindowExceptPrimary();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harichaser\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		
		WebElement openmultiple = driver.findElement(By.xpath("//span[text()='Open Multiple']"));
		openmultiple.click();
		
		int size = driver.getWindowHandles().size();      //number of windows opened
		System.out.println(size);
	}
	
	public static void closeWindowExceptPrimary() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harichaser\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		
		WebElement closeWindows = driver.findElement(By.xpath("//span[text()='Close Windows']"));
		closeWindows.click();
		
		Set<String> window =  driver.getWindowHandles();
		Iterator<String> iterator =  window.iterator();
		String pw = iterator.next();
		String cw1 = iterator.next();
		String cw2 = iterator.next();
		String cw3 = iterator.next();
		
		driver.switchTo().window(cw1);
		driver.close();

		driver.switchTo().window(cw2);
		driver.close();
		
		driver.switchTo().window(cw3);
		driver.close();
		
		driver.switchTo().window(pw);
		String pwName = driver.getTitle();
		System.out.println(pwName);
	}
	 

}
