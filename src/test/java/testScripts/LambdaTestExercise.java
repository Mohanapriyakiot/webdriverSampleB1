package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LambdaTestExercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Zuci\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/blog/");
		
		List<WebElement> PrecedingItems = driver.findElements(By.xpath("//ul[@id='menu-side-menu']//li[@id='menu-item-31219']//preceding-sibling::li"));
		for(WebElement items:PrecedingItems) {
			System.out.println("Before playwright testing: "+items.getText());
		}
		
		List<WebElement> FollowingItems= driver.findElements(By.xpath("//ul[@id='menu-side-menu']//li[@id='menu-item-31219']//following-sibling::li"));
		for(WebElement items:FollowingItems) {
			System.out.println("After playwright testing: "+items.getText());
		}
	}

}
