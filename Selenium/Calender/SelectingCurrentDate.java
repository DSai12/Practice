package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingCurrentDate {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium Self Study\\ChromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.spicejet.com");
	
	
	/*Selecting source location*/
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//td[@class='mapbg'] //a[@value='MAA']")).click();
	
	Thread.sleep(3000);
	
	/*Selecting destination location*/
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//td[@class='mapbg'] //a[@value='BHO']")).click();
	
	
	/*Selecting current date*/
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	
	
	
}
}
