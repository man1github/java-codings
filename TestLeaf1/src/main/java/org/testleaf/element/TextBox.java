package org.testleaf.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBox {
	
	public static WebElement clickElement(WebDriver driver) {
		return driver.findElement(By.xpath("//li[@id='menuform:j_idt40']"));
	}
	
	public static WebElement clickTextBox(WebDriver driver) {
		return driver.findElement(By.linkText("Text Box"));
	}
	
	public static WebElement typeYourName(WebDriver driver) {
		return driver.findElement(By.cssSelector("input[name='j_idt88:name']"));
	}
	
	public static WebElement appendCountryName(WebDriver driver) {
		return driver.findElement(By.cssSelector("input[id='j_idt88:j_idt91']"));
	}
	
	public static WebElement verifTextBoxDisabled(WebDriver driver) {
		return driver.findElement(By.cssSelector("input[id='j_idt88:j_idt93'][name='j_idt88:j_idt93']"));
	}
	
	public static WebElement clearText(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95'][@name='j_idt88:j_idt95']"));
	}
	
	public static WebElement retrieveText(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97'][@name='j_idt88:j_idt97'][@type='text']"));
	}

	public static WebElement enterEmailAndTab(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99'][@role='textbox']"));
	}
	
	public static WebElement enterAboutYourself(WebDriver driver) {
		return driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']"));
	}
	
	/*
	 * public static WebElement retrieveText(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "//input[@id='j_idt88:j_idt97'][@name='j_idt88:j_idt97'][@type='text']")); }
	 * 
	 * public static WebElement retrieveText(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "//input[@id='j_idt88:j_idt97'][@name='j_idt88:j_idt97'][@type='text']")); }
	 * 
	 * public static WebElement retrieveText(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "//input[@id='j_idt88:j_idt97'][@name='j_idt88:j_idt97'][@type='text']")); }
	 * 
	 * public static WebElement retrieveText(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "//input[@id='j_idt88:j_idt97'][@name='j_idt88:j_idt97'][@type='text']")); }
	 */
}
