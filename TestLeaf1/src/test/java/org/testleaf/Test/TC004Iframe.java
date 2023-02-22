package org.testleaf.Test;

import org.testleaf.browser.FramePage;
import org.testng.annotations.Test;

import com.testleaf.commonActions.CommonActions;

public class TC004Iframe extends CommonActions{

	public void clickFrameElement() {	
		FramePage.clickBrowserElement(driver).click();
		FramePage.clickIframeElement(driver).click();				
	}
	
	@Test
    public void frameType() {
		
		clickFrameElement();
		
		driver.switchTo().frame(0);
		FramePage.clickInsideFrame(driver).click();
		driver.switchTo().parentFrame();
		
		int totalFrame = FramePage.CountNumberOfFrame(driver).size(); //totally 4 but it shows 3
		System.out.println(totalFrame); 
		
		driver.switchTo().frame(2);
		driver.switchTo().frame(0);
		FramePage.clickInsideNestedFrame(driver).click();
		driver.switchTo().defaultContent();

		
	}
}
