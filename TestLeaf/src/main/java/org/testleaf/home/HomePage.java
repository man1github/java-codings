package org.testleaf.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
	
	/**
	 * @return 
	 * @discription - click the home button
	 */
	public static WebElement clickHomeButton(WebDriver driver) {
		return driver.findElement(By.xpath("//ul[@id='menuform:j_idt37']/li[@id='menuform:j_idt38']"));
	}	
	
	/**
	 * @discription - click the dashboard button
	 */
	public static WebElement clickDashboard(WebDriver driver) {
		return driver.findElement(By.linkText("Dashboard"));		
	}
}
