package org.testleaf.browser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage {
	
	@FindBy(xpath = "//ul[@id='menuform:j_idt37']/li[@id='menuform:j_idt39']")
	public static WebElement clickBrowserElement;
	
	@FindBy(xpath = "//li[@id='menuform:m_frame']/preceding-sibling::li[@id='menuform:m_overlay']")
	public static WebElement clickAlertElement;
	
	@FindBy(xpath = "//butto[@id='j_idt88:j_idt91']")
	public static WebElement clickAlertSimpleDialog;
	
	@FindBy(xpath = "//button[@id='j_idt88:j_idt93']")
	public static WebElement clickAlertConfirmDialog;
}
