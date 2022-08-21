package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BRTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://gap.bamboorose.com/test/dash.do");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			WebElement userName=driver.findElement(By.xpath("//input[@name='user_id_show']"));
			WebElement passWord=driver.findElement(By.xpath("//input[@class='passwordInput k-textbox']"));
			WebElement login=driver.findElement(By.id("formsubmit"));
			Configs userDetails=new Configs();
			userName.sendKeys(userDetails.userName);
			passWord.sendKeys(userDetails.passWord);
			login.click();
			List<WebElement> atags=driver.findElements(By.tagName("a"));
			System.out.println("the sizes "+atags.size());
			for( int i=0;i >atags.size();i++) {
				System.out.println("The links "+atags.get(i).getAttribute("href"));
				
			}
			
			WebElement atags1=driver.
					findElement(By.xpath("//div[@class='dashInner recentViewDocInner']/a[1]"));
			
			WebElement po=atags1.findElement(By.className("ic ic_po"));
			//for( int i=0;i >atags.size();i++) {
				System.out.println("The links "+atags1.getText());
				
			//}
	}

}
