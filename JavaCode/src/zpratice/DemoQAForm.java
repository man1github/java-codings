package zpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQAForm {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harichaser\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize(); 		
		WebElement forms = driver.findElement(By.xpath("//*[text()='Forms']"));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", forms);
				
		WebElement practiceForms = driver.findElement(By.xpath("//span[contains(text(),'Practice')]"));
		practiceForms.click();
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Mahendiran");
		
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Natarajan");
		
		WebElement email = driver.findElement(By.xpath("//*[@placeholder='name@example.com']"));
		email.sendKeys("Mahendiran@gmail.com");
		
		WebElement male = driver.findElement(By.id("gender-radio-1"));
		male.click();
		
		WebElement mobile = driver.findElement(By.xpath("//*[@placeholder='Mobile Number']"));
		mobile.sendKeys("9876543210");
		
		WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
		dob.click();
		
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		Select select = new Select(month);
		select.selectByIndex(1);
		
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select selectyear = new Select(year);
		selectyear.selectByVisibleText("1998");
		
		WebElement date = driver.findElement(By.className("react-datepicker__day react-datepicker__day--014"));
		date.click();	
		
		WebElement subject = driver.findElement(By.className("subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3"));
		subject.sendKeys("computer science");
		
		WebElement hobbies = driver.findElement(By.id("hobbies-checkbox-1"));
		hobbies.click();
		
		WebElement hobbies1 = driver.findElement(By.id("hobbies-checkbox-2"));
		hobbies1.click();
		
		WebElement upload = driver.findElement(By.className("form-control-file"));
		upload.sendKeys("C:\\Users\\harichaser\\Downloads\\dhoni images.jfif");
			
		WebElement address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		address.sendKeys("xxxx yyyyy zzzzzz");
		
		WebElement state = driver.findElement(By.className(" css-yk16xz-control"));
		state.sendKeys("Uttar Pradesh");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Agra");
		
		WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
		submit.click();
		
		boolean button = submit.isEnabled();
		boolean buttonDisplay = submit.isDisplayed();

		System.out.println("button is clickable " + button);
		System.out.println("button is visible " + buttonDisplay);

	
	}
}
