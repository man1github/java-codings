package org.testleaf.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthPage {
		

	@FindBy(xpath = "//ul[@id='menuform:j_idt37']/li[@id='menuform:j_idt38']")
	public static WebElement clickHomeButton;
	
	@FindBy(linkText = "Auth")
	public static WebElement clickAuth;
	
	@FindBy(xpath = "//button[@id='j_idt88:j_idt90'][@type='button']")
	public static WebElement clickBasicAuth;
	
	// how to pass value in basic auth 
}
