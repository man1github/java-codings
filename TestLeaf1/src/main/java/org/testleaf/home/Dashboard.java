package org.testleaf.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Dashboard {
		
	public static WebElement clickHomeButton(WebDriver driver) {
		return driver.findElement(By.xpath("//li[@id='menuform:j_idt38']"));
	}
	
	public static WebElement clickDashboard(WebDriver driver) {
		return driver.findElement(By.linkText("Dashboard"));
	}
	
}
