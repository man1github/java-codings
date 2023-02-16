package automationdemo.mavenproject2;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import javademo.mavenproject2.Driverclass;

public class GoogleReadonly extends Driverclass {
  @Test
  public void f() {
	  
	  String readonly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");  //confirm readonly box
	  System.out.println(readonly);
  }
  
  
  @BeforeSuite
  public void beforeSuite() {
	openDriver("https://letcode.in/edit");
}
  @AfterSuite
  public void afterSuite() {
		closeDriver(driver);
	}
}
