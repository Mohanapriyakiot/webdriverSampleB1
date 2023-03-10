package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Zuci\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		
		driver.get("https://demo.opencart.com/");
		
		TakesScreenshot screen =(TakesScreenshot)driver;
		File scr = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,  new File("E:\\Zuci\\Screenshot\\FullScreen.png"));
		
		WebElement menu = driver.findElement(By.xpath("//li/a[contains(text(),'Components')]"));
		WebElement submenu = driver.findElement(By.xpath("//a[contains(text(),'Monitors')]"));
	//actions.moveToElement(menu).click(submenu).build().perform();

		//(impicit wait - wait for some to to find element)
		actions.moveToElement(menu).perform();
		actions.click(submenu).perform();
		actions.scrollByAmount(10, 500).perform();
		//(Waiting some time to find element...correct product ..it open the product after some time to find element)
		driver.findElement(By.partialLinkText("Apple Cinema")).click();
		//(Waiting some time before it throwssome expection ..wrong product..wait tofind...produce exception)
	//	driver.findElement(By.partialLinkText("Apple Cinema1")).click();

		//	actions.click(submenu).perform();
//    actions.moveToElement(menu).perform();
//	
//	  WebElement searchbox = driver.findElement(By.name("search"));
//    actions.contextClick(searchbox).perform();
//	
//	Thread.sleep(3000);
//	actions.scrollByAmount(10, 500).perform();
//	
	
	}

}
