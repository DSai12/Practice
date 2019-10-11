package CheckBoxRadioEnabledDisabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAndIsEnabled {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium Self Study\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		
		System.out.println(driver.findElement(By.cssSelector(".picker-second")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.cssSelector(".picker-second")).getAttribute("style"));
		
		if(driver.findElement(By.cssSelector(".picker-second")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Element is enable");
		}
		else
		{
			System.out.println("Element id disable");
		}
	}

}
