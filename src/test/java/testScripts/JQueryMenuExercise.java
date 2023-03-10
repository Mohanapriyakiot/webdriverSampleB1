package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JQueryMenuExercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Zuci\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.get("http://the-internet.herokuapp.com/jqueryui/menu");
		WebElement Enabled=driver.findElement(By.xpath("//a[text()='Enabled']"));
		actions.moveToElement(Enabled).perform();
		
		WebElement Downloads=driver.findElement(By.xpath("//a[text()='Downloads']"));
		wait.until(ExpectedConditions.elementToBeClickable(Downloads));
		actions.moveToElement(Downloads).perform();
		
		WebElement Excel=driver.findElement(By.xpath("//a[text()='Excel']"));
		wait.until(ExpectedConditions.elementToBeClickable(Excel));
		actions.click(Excel).perform();
	
	}

}
