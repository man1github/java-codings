package automation2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harichaser\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		
		WebElement open = driver.findElement(By.xpath("//span[text()='Open']"));
		open.click();
		
		Set<String> window = driver.getWindowHandles(); //store all window in set
		Iterator<String>it =  window.iterator(); // iterating the windows
		String parentwindow = it.next();   
		String childwindow = it.next();
		
		driver.switchTo().window(childwindow);
		System.out.println("childwindow - " + driver.getTitle());
		System.out.println("childwindow - " + driver.getCurrentUrl());
		
	
		driver.switchTo().window(parentwindow);
		System.out.println("parentwindow - " + driver.getTitle());
		System.out.println("parentwindow - " + driver.getCurrentUrl());

		
		

	}

}
