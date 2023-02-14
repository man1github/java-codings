package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harichaser\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/");
		
		
		WebElement button = driver.findElement(By.xpath("//ul[@id='menuform:j_idt37']/li[@id='menuform:j_idt40']")); //ul[@id='menuform:j_idt35']/	
		button.click();
		
		WebElement dd = driver.findElement(By.xpath("//ul[@role='menu']/following::i[@class='pi pi-fw pi-chevron-down layout-menuitem-icon']"));	
		dd.click();
		
		WebElement country = driver.findElement(By.xpath("//label[@id='j_idt87:country_label']"));	
		country.click();
		
		WebElement germany = driver.findElement(By.xpath("//li[@data-label='Germany']"));	
		germany.click();
		
		WebElement city = driver.findElement(By.xpath("//label[@id='j_idt87:city_label']"));	
		city.click();
		
		WebElement Berlin = driver.findElement(By.xpath("//li[@data-label='Berlin']"));	
		Berlin.click();
		
		WebElement course = driver.findElement(By.xpath("//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']"));	
		course.click();
		
		WebElement sele = driver.findElement(By.xpath("//li[@data-item-label='Selenium WebDriver']"));	
		sele.click();
		
		WebElement language = driver.findElement(By.xpath("//label[@id ='j_idt87:lang_label'][@class='ui-selectonemenu-label ui-inputfield ui-corner-all']"));	
		language.click();
		
		WebElement tamil = driver.findElement(By.xpath("//*[@data-label='Tamil']"));	
		tamil.click();
		
//		WebElement two = driver.findElement(By.xpath("//label[@id='j_idt87:value_label']")) ;
//		two.click();
		
		for(int i=0; i<=2;i++){
			  try{
			     driver.findElement(By.xpath("//label[@id='j_idt87:value_label']")).click();
			     break;
			  }
			  catch(Exception e){
				  System.out.println(e.getMessage());
			  }
		}
			
		
		WebElement twoselect = driver.findElement(By.xpath("//*[@id='j_idt87:value_1']"));	
		twoselect.click();
	}

}
