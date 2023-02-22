package org.testleaf.browser;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	public static WebElement clickSweetAlertbutton(WebDriver driver) {        // CSS selector button tag
		return driver.findElement(By.cssSelector("button[id='j_idt88:j_idt95']"));		
	}
	
	public static WebElement clickDismissbutton(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']"));		
	}
	
	public static WebElement clickSweetModalDialog(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']"));		
	}
	
	public static WebElement closeAlertSweetModalDialog(WebDriver driver) {		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[@id='j_idt88:j_idt101_title']/following-sibling::a"))));
	}
	
	public static WebElement clickAlertPromptDialog(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']"));		
	}
	
	public static WebElement clickSweetAlertConfirmation(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@id='j_idt88:j_idt106'][@name='j_idt88:j_idt106']"));		
	}
	
	public static WebElement clickConfirmationAlert(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@id='j_idt88:j_idt108'][@name='j_idt88:j_idt108']"));		
	}

	public static WebElement clickAlertMinAndMax(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@id='j_idt88:j_idt111'][@name='j_idt88:j_idt111']"));		
	}
	
	public static WebElement clickAlertMax(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-maximize ui-corner-all'] [@role='button']"));		
	}
	
	public static WebElement clickAlertMin(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-minimize ui-corner-all'] [@role='button']"));		
	}


	
}
