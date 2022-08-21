package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.switchTo().frame("ccpa-consent-notice");
		// child element
		WebElement Close = driver.findElement(By.xpath("//span[@class='mat-button-wrapper']/mat-icon"));
		Close.click();

		WebElement FileUpload = driver.findElement(By.name("uploadfile_0"));
		FileUpload.sendKeys("C:\\Upload.txt");

		WebElement TnC = driver.findElement(By.id("terms"));
		TnC.click();

		WebElement Submit = driver.findElement(By.id("submitbutton"));
		Submit.click();
		// Text verifying under bold
		String text = driver.findElement(By.xpath("//h3[@id='res']/center")).getAttribute("innerText");
		System.out.println(text);
		if (text.equals("2 file has been successfully uploaded.")) {

			System.out.println("success");
		}
		else {
			System.out.println("failed");
		}

	}

}
