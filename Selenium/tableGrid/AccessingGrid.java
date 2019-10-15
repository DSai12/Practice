package tableGrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessingGrid {
	public static void main(String[] args) {

		int sum = 0;

		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium\\Selenium Self Study\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");

		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size();
		System.out.println("Row count is : " + count);

		for (int i = 0; i < (count - 2); i++) {
			String value = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();
			int valueCount = Integer.parseInt(value);
			sum = sum + valueCount;
		}
		System.out.println("Sum is " + sum);

		String extra = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int countExtra = Integer.parseInt(extra);
		int totalExtra = sum + countExtra;

		System.out.println("Sum with extra " + totalExtra);

		String total = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int givenTotal = Integer.parseInt(total);

		if (totalExtra == givenTotal) {
			System.out.println("Your calculation is correct");
		} else {
			System.out.println("Your calculation is incorrect");
		}

		driver.close();

	}
}
