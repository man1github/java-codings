package org.testleaf.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testleaf.browser.WindowPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.testleaf.commonActions.CommonActions;

public class TC005Window extends CommonActions {

	@Test
	public void clickWindowElement() {

		WindowPage.clickBrowserElement(driver).click();
		WindowPage.clickWindowElement(driver).click();
		windowType1();
		windowType2();
		windowType3();
		windowType4();
	}

	public void windowType1() {

		WindowPage.clickOpenWindowButton(driver).click(); // 1
		Set<String> window = driver.getWindowHandles();
		Iterator<String> iterator = window.iterator();
		String oldWindow = iterator.next();
		String newWindow = iterator.next();
		String actual = driver.switchTo().window(newWindow).getTitle();
		Assert.assertEquals(actual, "Dashboard");
		driver.close();
		driver.switchTo().window(oldWindow);
	}

	public void windowType2() {

		WindowPage.clickOpenMultipleWindowButton(driver).click(); // 2
		Set<String> window = driver.getWindowHandles();
		Iterator<String> iterator1 = window.iterator();
		String oldWindow = iterator1.next();
		String newWindow1 = iterator1.next();
		String newWindow2 = iterator1.next();

		System.out.println(window.size());

		driver.switchTo().window(newWindow1);
		driver.close();

		driver.switchTo().window(newWindow2);
		driver.close();

		driver.switchTo().window(oldWindow);
	}

	public void windowType3() {
		WindowPage.clickCloseWindowsExceptPrimary(driver).click();

		Set<String> window = driver.getWindowHandles();
		Iterator<String> iterator1 = window.iterator();
		String oldWindow = iterator1.next();
		String newWindow1 = iterator1.next();
		String newWindow2 = iterator1.next();
		String newWindow3 = iterator1.next();

		driver.switchTo().window(newWindow1);
		driver.close();

		driver.switchTo().window(newWindow2);
		driver.close();

		driver.switchTo().window(newWindow3);
		driver.close();

		driver.switchTo().window(oldWindow);
	}

	public void windowType4() {

		WindowPage.clickOpenDelayButton(driver).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(2));
	}
}
