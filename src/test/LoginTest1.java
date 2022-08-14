package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Step1. Click on the Login Link
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		
		// Step2 : locating user name
		
		WebElement userName = driver.findElement(By.name("user_login"));
		
		// Step 3: entering text
		
		userName.sendKeys("abd@xyz.com");

		//Step 4: entring password
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Testoing@123");
		
		//Step 5: Clicking on Rememberme
		
		WebElement checkBox=driver.findElement(By.className("rememberMe"));
		checkBox.click();


		// Step 6: click on login button

		WebElement loginBtn = driver.findElement(By.name("btn_login"));
		loginBtn.click();
		
		//Step 7: Validating error message on screen
		
		WebElement errorMessage=driver.findElement(By.id("msg_box"));
		String ActualErrorMessage=errorMessage.getText();
		
		String ExpectedErrorMessage="The email or password you have entered is invalid.";
		
		//Step 9: Validating actyal and expected error messages
		if(ActualErrorMessage.equals(ExpectedErrorMessage)) {
			
			System.out.println("TC Passed");
		}
		else
			System.out.println("TC Failed");
		
		//Step 10 : To find the total number of links present in screen
		
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println("Total Number of links "+Links.size());
		
		for(int index=0;index < Links.size(); index++) {
			
			System.out.println(Links.get(index).getAttribute("href"));
		}
		
		
		//Step 10:closing Browseer
		 driver.close();
	}

}
