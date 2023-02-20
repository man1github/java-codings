package org.testleaf.TestLeaf;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testleaf.home.AuthPage;
import org.testleaf.home.HomePage;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001HomePage {
	
  @Test
  public void page() {
	  
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/");
		
		HomePage.clickHomeButton(driver).click();
		HomePage.clickDashboard(driver).click();
		
		AuthPage.clickHomeButton(driver).click();
		AuthPage.clickAuth(driver).click();
		AuthPage.clickBasicAuth(driver).click();		
	  
  }
}
