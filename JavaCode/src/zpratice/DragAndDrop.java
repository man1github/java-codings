package zpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harichaser\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.leafground.com/");
		
		WebElement browser = driver.findElement(By.xpath("//ul[@id='menuform:j_idt37']/li[2]"));
		browser.click();
		
		WebElement dragmenu = driver.findElement(By.xpath("//ul[@role='menu']/li[@id='menuform:m_drag']"));
		dragmenu.click();
		
		WebElement source = driver.findElement(By.xpath("//th[@role='columnheader'][@aria-label='Name'][@class='ui-state-default ui-draggable-column ui-draggable ui-draggable-handle ui-droppable']"));
		WebElement target =  driver.findElement(By.xpath("//th[@role='columnheader'][@aria-label='Category'][@class='ui-state-default ui-draggable-column ui-draggable ui-draggable-handle ui-droppable']"));		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(source, 0, 0);
	}

}
