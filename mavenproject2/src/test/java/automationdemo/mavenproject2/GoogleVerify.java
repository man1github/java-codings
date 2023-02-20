package automationdemo.mavenproject2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleVerify {
	
  @Test
  public void google() {
	  
	 // System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
	  WebDriverManager.chromedriver().setup(); 
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
	  
	  String et = "Google";
	  
	  String  at = driver.getTitle();
	  
	  boolean title = et.equals(at);             //confirm the title name
	  System.out.println(title);
	  
	  WebElement searchBox = driver.findElement(By.name("q"));
	  boolean sbox = searchBox.isEnabled();
	  System.out.println(sbox);
	  
	  WebElement button = driver.findElement(By.cssSelector("input[value='Google Search']"));
	  boolean vr = button.isEnabled();     //verify the button
	  System.out.println(vr);
	  
	  WebElement google = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	  boolean tryw = google.isDisplayed();
	  System.out.println(tryw);
	  
  }

}
