package handlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium Self Study\\ChromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://ksrtc.in/oprs-web/");
	
	driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("ben");
	driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	String script="return document.getElementById(\"fromPlaceName\").value";
	String text=(String) js.executeScript(script);
	int i=0;
	
	while(!text.equalsIgnoreCase("BENGALURU INTERNATION ")) {
		i++;
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
		text=(String) js.executeScript(script);
		
	}
	
	
	
	
	
}


}
