package automation2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harichaser\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/forms");
		driver.manage().window().maximize(); 	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement practiceForms = driver.findElement(By.xpath("//span[contains(text(),'Practice')]"));
		practiceForms.click();
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Mahendiran");
		
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Natarajan");
		
		WebElement email = driver.findElement(By.xpath("//*[@placeholder='name@example.com']"));
		email.sendKeys("Mahendiran@gmail.com");
		
		
		WebElement male = driver.findElement(By.xpath("//input[@id='gender-radio-1'][@class='custom-control-input'][@value='Male']/following-sibling::label[text()='Male']"));
		male.click();
				
		
		WebElement mobile = driver.findElement(By.xpath("//*[@placeholder='Mobile Number']"));
		mobile.sendKeys("9876543210");
		
		WebElement dob = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[starts-with(@id,'dateOfBirthInput')]")));
		dob.click();
		
		
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		Select select = new Select(month);
		select.selectByIndex(1);
		WebElement monthName = select.getFirstSelectedOption();
		String na = monthName.getText();
		System.out.println(na);
		
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select selectyear = new Select(year);
		selectyear.selectByVisibleText("1998");
		
		WebElement date = driver.findElement(By.xpath("//div[starts-with(@class,'react-datepicker__day react-datepicker__day--014')]"));
		date.click();	
			 
		WebElement subject = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[starts-with(@class,'subjects-auto-complete__input')]/input")));
		subject.sendKeys("computer science");
		WebElement subjectClick = driver.findElement(By.xpath("//div[text()='Computer Science']"));
		subjectClick.click();
//		
		WebElement hobbies = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']/following-sibling::label[text()='Sports']"));
		hobbies.click();
		
		WebElement hobbies1 = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']/following-sibling::label[text()='Reading']"));
		hobbies1.click();
		
		WebElement upload = driver.findElement(By.id("uploadPicture"));
		upload.sendKeys("C:\\Users\\harichaser\\Downloads\\dhoni images.jfif");
			
		WebElement address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		address.sendKeys("xxxx yyyyy zzzzzz");
	
		/*
		 * WebElement state = wait.until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("//input[@id='react-select-3-input']/preceding::div[text()='Select State']"
		 * ))); state.sendKeys("Uttar Pradesh"); WebElement up =
		 * driver.findElement(By.xpath("//div[@id='react-select-3-option-1']"));
		 * up.click();
		 * 
		 * WebElement city = wait.until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("//div[text()='Select City']"))); city.sendKeys("Agra"); WebElement
		 * agra = driver.findElement(By.xpath("//div[@id='react-select-4-option-1']"));
		 * agra.click();
		 * 
		 */		
		WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
		submit.click();
	
		boolean button = submit.isEnabled();
		boolean buttonDisplay = submit.isDisplayed();

		System.out.println("button is clickable " + button);
		System.out.println("button is visible " + buttonDisplay);

	

	}

}
