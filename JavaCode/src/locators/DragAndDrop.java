package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harichaser\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver.manage().window().maximize(); 
		driver.get("https://www.leafground.com/");
		
		WebElement browser = driver.findElement(By.xpath("//ul[@id='menuform:j_idt37']/li[2]"));
		browser.click();
		
		WebElement dragmenu = driver.findElement(By.xpath("//ul[@role='menu']/li[@id='menuform:m_drag']"));
		dragmenu.click();
		
		WebElement draganddrop = driver.findElement(By.xpath("//div[@id='form:conpnl_header']"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(draganddrop, 300, 0).perform();
		
		
		DragAndDrop d = new DragAndDrop();  //create an object for drag and drop method
		d.dragAndDropMethod();
		
		
	}
	
	public void dragAndDropMethod() {
		
		WebElement source =  driver.findElement(By.xpath("//div[@id='form:drag']"));
		WebElement target =  driver.findElement(By.xpath("//div[@id='form:drop']"));		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
	}
	
}
