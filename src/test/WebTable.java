package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		List<WebElement> Rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("total number of rows are "+ Rows.size());
		//List<WebElement> Columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		List<WebElement> Columns=driver.findElements(By.xpath("//table[@id='customers']//th"));

		System.out.println("total number of columns are "+ Columns.size());
		WebElement element=driver.findElement(By.xpath("//table[@id='customers']//tr[4]/td[1]"));
		System.out.println("elemente "+ element.getText());
		List<WebElement> Data=driver.findElements(By.xpath("//table[@id='customers']"));
		/*for(WebElement elm:Data) {
			
			System.out.println(elm.getText());
			
		}*/
		/*for(WebElement row: Rows) {
            
            List<WebElement> AllCell = row.findElements(By.xpath("td"));
            
            for(WebElement cell: AllCell) {
                
                System.out.print(cell.getText() + "\t");
            }
            
            System.out.println();
           
		}*/

	}

}
