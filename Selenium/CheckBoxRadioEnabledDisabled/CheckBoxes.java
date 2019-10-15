package checkBoxRadioEnabledDisabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium Self Study\\ChromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.spicejet.com");
	
	/*checking checkbox*/
	driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
	
	/*Counting no of checkboxes on page */
	System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	
}
}
