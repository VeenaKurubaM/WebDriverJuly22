package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		WebElement signUp = driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]"));
		signUp.click();
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement phone = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		firstName.sendKeys("Vima");
		lastName.sendKeys("gopa");
		phone.sendKeys("980123455");
		password.sendKeys("Testaing@123");
		WebElement Month = driver.findElement(By.name("birthday_month"));
		Select DOBMonth = new Select(Month);
		DOBMonth.selectByVisibleText("Jan");
		WebElement Day = driver.findElement(By.name("birthday_day"));
		Select DOBDay = new Select(Day);
		DOBDay.selectByVisibleText("20");
		WebElement Year = driver.findElement(By.name("birthday_year"));
		Select DOByear = new Select(Year);
		DOByear.selectByVisibleText("1986");
		WebElement radio1 = driver.findElement(By.xpath("//input[@type=\"radio\"]"));
		List<WebElement> DDMonth = DOBMonth.getOptions();
		/*
		 * for (WebElement elm : DDMonth) {
		 * 
		 * System.out.println(elm.getText()); }
		 */

		// System.out.println("The selected month " +
		// DOBMonth.getFirstSelectedOption().getText());

		List<WebElement> doddat1 = DOBDay.getOptions();
		/*
		 * for (WebElement elm : doddat1) { System.out.println(elm.getText());
		 * 
		 * }
		 */

		for (int i = 0; i < doddat1.size(); i++) {

			System.out.println(doddat1.get(i).getText());
		}

		List<WebElement> dmonth = driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
		for (WebElement elm : dmonth) {

			System.out.println(elm.getText());
		}

		//// select[@name='birthday_month']/option[@selected='1']
		WebElement selecteMonth = driver
				.findElement(By.xpath("//select[@name='birthday_month']/option[@selected='1']"));

		System.out.println("The selected month  " + selecteMonth.getText());//// select[@name='birthday_month']/parent::span
//driver.close();
		String Gender = "Custom";
		/*
		 * WebElement other =
		 * driver.findElement(By.xpath("//input[@type='radio' and @value='-1']"));
		 * WebElement Male =
		 * driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		 * WebElement Female =
		 * driver.findElement(By.xpath("//input[@type='radio' and @value='1']")); if
		 * (Gender.equals("Male")) { Male.click(); } else if (Gender.equals("Female")) {
		 * 
		 * Female.click(); } else { other.click();
		 * 
		 * // other.click(); }
		 */
		 String Xpath1 = "//label[text()='" + Gender + "']/following-sibling::input";
		// String xPath="//label[text()="+'Female'+"]/following-sibling::input";
		//// String Xpath = "//label[text()='placeholder']/following-sibling::input";
		// String newXpath = Xpath.replace("PlaceHolder", Gender);
		// Xpath.replaceAll("placeholder", Gender);
		// WebElement radioButton=driver.findElement(By.xpath(newXpath));
		// radioButton.click();
		String XPath = "//label[text()='PlaceHolder']/following-sibling::input";
		String newxpath = XPath.replace("PlaceHolder", Gender);
		WebElement GenderRadioBtn = driver.findElement(By.xpath(newxpath));
		GenderRadioBtn.click();

	}

}
