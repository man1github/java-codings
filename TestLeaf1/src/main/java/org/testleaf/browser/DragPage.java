package org.testleaf.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DragPage {
	
	public static WebElement clickBrowserElement(WebDriver driver) {
		return driver.findElement(By.xpath("//ul[@id='menuform:j_idt37']/li[@id='menuform:j_idt39']"));
	}
	
	public static WebElement clickDragElement(WebDriver driver) {
		return driver.findElement(By.xpath("//li[@id='menuform:m_drag']"));
	}
	
	public static WebElement clickDraggable(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@id='form:conpnl_header']"));
	}
	
	public static WebElement clickDragElementInDroppable(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@id='form:drag_content']"));
	}
	
	public static WebElement clickDropElementInDroppable(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@id='form:drop_content']"));
	}
	
	public static WebElement clickDraggableColumnsName(WebDriver driver) {
		return driver.findElement(By.xpath("//th[@id='form:j_idt94:j_idt95']"));
	}
	
	public static WebElement clickDraggableColumnsCategory(WebDriver driver) {
		return driver.findElement(By.xpath("//th[@id='form:j_idt94:j_idt99']"));
	}
	
	public static WebElement clickDraggableRowsBambooWatch(WebDriver driver) {
		return driver.findElement(By.xpath("//tbody[@id='form:j_idt111_data']/tr[@data-ri='0']"));
	}
	
	public static WebElement clickDraggableRowsBlackWatch(WebDriver driver) {
		return driver.findElement(By.xpath("//tbody[@id='form:j_idt111_data']/tr[@data-ri='2']"));
	}
}
