package locators;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink {
	
	public static WebDriver driver = new ChromeDriver();


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harichaser\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/");

		WebElement element = driver.findElement(By.xpath("//ul[@id='menuform:j_idt37']/li[@id='menuform:j_idt40']"));
		element.click();
		
		WebElement hyperlink = driver.findElement(By.xpath("//li[@id='menuform:m_link']")); 
		hyperlink.click();
		
		WebElement dashboardlink = driver.findElement(By.linkText("Go to Dashboard")); 
		dashboardlink.click();
		
		
		
		findDestinationAndBrokenLink();
		
	}
	public static void findDestinationAndBrokenLink() throws IOException {
		
		driver.get("https://www.leafground.com/link.xhtml");
		
		WebElement findDestination = driver.findElement(By.xpath("//a[contains(text(),'Find the URL without clicking me')]"));
		String link = findDestination.getAttribute("href");
		System.out.println(link);
		
		WebElement brokenlink = driver.findElement(By.xpath("//a[starts-with(text(),'Broken?')]"));
		String bk = brokenlink.getAttribute("href");

		URL url = new URL(bk);  //create an object for URL
		HttpURLConnection httpurlconnection =  (HttpURLConnection) url.openConnection(); //create a connection using URL object "url"
		httpurlconnection.connect(); //establish connection
		
		int responseCode = httpurlconnection.getResponseCode();
		
		if (responseCode>400) {
			System.out.println(bk + "-" +  "link is broken");
		}else {
			System.out.println(bk + "link is not broken");
		}

		
	}
	

}
