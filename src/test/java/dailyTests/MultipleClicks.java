package dailyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleClicks {

	public void multipleClicks() throws Exception {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("vinothkumar@testleaf.com");
		
		driver.findElement(By.id("password")).sendKeys("SeleniumChallenge@24");
		
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(" //div[@class='uiInput uiInputSearch uiInput--custom']//input")).sendKeys("App Manager");
	}

}
