package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class browserLaunchTime {
	
	WebDriver driver;
	long start,stop,total;
	
	
  @BeforeSuite
  public void startBrowser() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\harichaser\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  start = System.currentTimeMillis();
  }
  @Test
  public void google() {
	  driver.get("https://gooogle.com/");
	  
  }
  @Test
  public void bing() {
	  driver.get("https://www.bing.com/");
  }
  @Test
  public void demoqa() {
	  driver.get("https://demoqa.com/");
  }
  @Test
  public void facebook() {
	  driver.get("https://www.facebook.com/");
  }
  
  @AfterSuite
  public void closeBrowser() {
	  stop = System.currentTimeMillis();
	  total = start - stop;
	  System.out.println("total time of executing in milliseconds - " + total);
	  driver.quit();
  }
}
