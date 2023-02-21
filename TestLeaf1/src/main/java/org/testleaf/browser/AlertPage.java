package org.testleaf.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPage {
	
	public static WebElement clickBrowserElement(WebDriver driver) {
		return driver.findElement(By.xpath("//ul[@id='menuform:j_idt37']/li[@id='menuform:j_idt39']"));
	}
	
	public static WebElement clickAlertElement(WebDriver driver) {
		return driver.findElement(By.xpath("//li[@id='menuform:m_frame']/preceding-sibling::li[@id='menuform:m_overlay']"));
	}
	
	public static WebElement clickAlertSimpleDialog(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']"));		
	}
	
	public static WebElement clickAlertConfirmDialog(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']"));		
	}
}
