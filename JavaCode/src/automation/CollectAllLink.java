package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectAllLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harichaser\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone 14" + Keys.ENTER);
		
		List<WebElement> mobilelist = driver.findElements(By.tagName("a"));   //to get all link  //some blank space will be there for output which means angular tag was created but they didn't give name for that. 
		
//		List<WebElement> mobilelist = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));	
		
		for(int i=0; i<mobilelist.size(); i++) {
			String linklist = mobilelist.get(i).getText();
			System.out.println(linklist);
		}

	}

}
