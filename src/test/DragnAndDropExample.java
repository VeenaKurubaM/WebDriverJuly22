package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnAndDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		driver.switchTo().frame("ccpa-consent-notice");
		//child element
		WebElement Close = driver.findElement(By.xpath("//span[@class='mat-button-wrapper']/mat-icon"));
		Close.click();

		driver.switchTo().defaultContent();

		WebElement From = driver.findElement(By.xpath("//li[@id='credit2']/a"));
		WebElement To = driver.findElement(By.xpath("//ol[@id='bank']/li"));
		/// Alert alert = driver.switchTo().alert();
		//// System.out.println(alert.getText());
		// alert.accept();

		// WebElement
		// Close=driver.findElement(By.xpath("//span[@class='mat-button-wrapper']/mat-icon"));
		// Close.click();

		Actions act = new Actions(driver);
		act.dragAndDrop(From, To).build().perform();

	}

}
