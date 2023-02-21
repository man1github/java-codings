package org.testleaf.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Dashboard {
		
	@FindBy(xpath = "//li[@id='menuform:j_idt38']")
	public static WebElement clickHomeButton;
	
	@FindBy(linkText = "Dashboard")
	public static WebElement clickDashboard;
	
}
