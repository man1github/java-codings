package org.testleaf.home;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthPage {
		

	public static WebElement clickHomeButton(WebDriver driver) {
		return driver.findElement(By.xpath("//ul[@id='menuform:j_idt37']/li[@id='menuform:j_idt38']"));
	}
	
	public static WebElement clickAuth(WebDriver driver) {
		return driver.findElement(By.linkText("Auth"));
	}
	
	public static WebElement clickBasicAuth(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90'][@type='button']"));
	}
	
	public static WebElement AuthPopup(WebDriver driver) { // doubt
		driver.switchTo().alert();
		return driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90'][@type='button']"));
	}
}
