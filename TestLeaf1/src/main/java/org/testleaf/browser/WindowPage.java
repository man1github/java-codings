package org.testleaf.browser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowPage {

	public static WebElement clickBrowserElement(WebDriver driver) {
		return driver.findElement(By.xpath("//ul[@id='menuform:j_idt37']/li[@id='menuform:j_idt39']"));
	}
	
	public static WebElement clickWindowElement(WebDriver driver) {
		return driver.findElement(By.xpath("//li[@id='menuform:m_window']"));
	}
	
	
	public static WebElement clickOpenWindowButton(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@id='j_idt88:new']"));
	}

	public static WebElement clickOpenMultipleWindowButton(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']"));
	}

	public static WebElement clickCloseWindowsExceptPrimary(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']"));		
	}
	
	public static WebElement clickOpenDelayButton(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@id='j_idt88:j_idt95']"));
	}
}
