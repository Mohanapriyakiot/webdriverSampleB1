package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyClearTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Zuci\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationbookstore.dev/");
		
		WebElement searchBox=driver.findElement(By.id("searchBar"));
		searchBox.sendKeys("Automation");
		Thread.sleep(1000);
		boolean isDis=driver.findElement(By.xpath("//a[contains(text(),'Clear')]")).isDisplayed();
		if(isDis) {
			driver.findElement(By.xpath("//a[contains(text(),'Clear')]")).click();
			System.out.println("Test cleared");		
		}
		else {
			System.out.println("Clear text icon is hidden");
	//		System.out.println(isDis);
		}

	}

}
