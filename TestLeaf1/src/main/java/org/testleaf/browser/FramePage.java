package org.testleaf.browser;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramePage {
	
	public static WebElement clickBrowserElement(WebDriver driver) {
		return driver.findElement(By.xpath("//ul[@id='menuform:j_idt37']/li[@id='menuform:j_idt39']"));
	}
	
	public static WebElement clickIframeElement(WebDriver driver) {
		return driver.findElement(By.xpath("//li[@id='menuform:m_frame']"));
	}
	
	public static WebElement clickInsideFrame(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@id='Click'][@style='color:#ffffff;background: linear-gradient(240deg, #ff7295 0%, #fe875d 100%);border: 0 none;width:15%;height:40%']"));
	}
	
	public static List<WebElement> CountNumberOfFrame(WebDriver driver) {
		return driver.findElements(By.tagName("iframe"));
	}
	
	public static WebElement clickInsideNestedFrame(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@id='Click'][@style='background: linear-gradient(240deg, #4b7ecf 0%, #8e70ee 100%); color:#ffffff;border: 0 none;width:15%;height:40%']"));
	}

}
