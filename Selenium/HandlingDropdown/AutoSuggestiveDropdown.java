package handlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium Self Study\\ChromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com");
	
	driver.findElement(By.id("fromCity")).click();
	WebElement source=driver.findElement(By.xpath("//input[starts-with(@class,'react-autosuggest__input')]"));
	source.sendKeys("Che");
	Thread.sleep(2000);
	source.sendKeys(Keys.ARROW_DOWN);
	source.sendKeys(Keys.ENTER);
	
	WebElement dest=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
	dest.sendKeys("Ben");
	Thread.sleep(2000);
	dest.sendKeys(Keys.ARROW_DOWN);
	dest.sendKeys(Keys.ENTER);
	
	
	
	
}
}

