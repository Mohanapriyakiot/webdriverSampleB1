package testScripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Zuci\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");

		//Explicit wait: wait until the expected cond implemented
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement btn = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		wait.until(ExpectedConditions.elementToBeClickable(btn));
		btn.click();
		
	// alert:	
//		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
//		Alert alert = driver.switchTo().alert();
//		System.out.println("Simple Alert msg : " + alert.getText());
//		alert.accept();
		
//	confirm:	
//		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
//		Alert confirm = driver.switchTo().alert();
//		System.out.println("Simple confirm msg : " + confirm.getText());
//	    confirm.accept();
//		
		
//prompt:
//		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
//		Alert prompt = driver.switchTo().alert();
//		System.out.println("Simple prompt msg : " + prompt.getText());
//		prompt.accept();
//		
	//	
		
		
		
		
	}

}
