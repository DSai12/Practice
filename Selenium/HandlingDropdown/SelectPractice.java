package HandlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium Self Study\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		
		
		
		/*Static select*/
		Select s= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("INR");
		s.selectByVisibleText("AED");
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		/*Handling dynamic dropdown list*/
		
		driver.findElement(By.className("select_CTXT valid")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		
		
		driver.quit();
	}
	
}
