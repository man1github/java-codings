package org.testleaf.element;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dev.failsafe.internal.util.Durations;

public class TextBoxPage {

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

	public static WebElement clickItalicTextEditor(WebDriver driver) {
		return driver.findElement(By.xpath("following::button[@class='ql-italic']"));
	}
	
	public static WebElement clickBoldTextEditor(WebDriver driver) {
		return driver.findElement(By.xpath("[@class='ql-editor ql-blank']"));
	}
	
	public static WebElement clickTextEditor(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@Id='j_idt88:j_idt103_editor']/div[@class='ql-editor ql-blank']"));
	}
	
	public static WebElement pressEnterConfirmError(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']"));
	}
	
	public static WebElement confirmError(WebDriver driver) {
		return driver.findElement(By.xpath("//span[@id='j_idt106:thisform:j_idt110_error-detail']"));
	}
	
	public static WebElement clickAndConfirmLabelPositionChanges(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='j_idt106:float-input']"));
	}

	public static WebElement typeNameChooseThirdOption(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='j_idt106:auto-complete_input']"));
	}
	
	public static WebElement chooseThirdOption(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver.findElement(By.xpath("//li[text()='2']"));
	}

	public static WebElement typeDOBConfirmDateChoosen(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']"));
	}
	
	public static WebElement typeNumberandSpinValue(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']"));
	}
	
	public static WebElement spinValue(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver.findElement(By.xpath("//a[@class='ui-spinner-button ui-spinner-up ui-corner-tr ui-button ui-widget ui-state-default ui-button-text-only']/span[@class='ui-button-text']"));
	}
	
	public static WebElement typeRandomNumber(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='j_idt106:slider']"));
	}
	
	public static String confirmMovesCorrectly(WebDriver driver) {
		return driver.findElement(By.xpath("//span[@style='left: 20%;']")).getAttribute("style");
	}
	
	public static WebElement clickAndConfirmKeyboardAppears(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='j_idt106:j_idt122']"));
	}
	
	public static WebElement closekeyboard(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver.findElement(By.xpath("//button[@title='Close the keypad']"));
	}
	
	public static WebElement clickBoldCustomToolBar(WebDriver driver) {
		return driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-s']/following::button[@class='ql-bold']"));
	}
	
	public static WebElement clickItalicCustomToolBar(WebDriver driver) {
		return driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-s']/following::button[@class='ql-italic']"));
	}
	
	public static WebElement clickCustomToolBar(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_editor']/div[@class='ql-editor ql-blank']"));
	}

}
