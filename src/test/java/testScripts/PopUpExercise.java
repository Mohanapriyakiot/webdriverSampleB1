package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUpExercise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Zuci\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.get("https://demo.seleniumeasy.com/window-popup-modal-demo.html");
	
		String parentWin = driver.getWindowHandle();
		System.out.println("Parent Win Handle : "+ parentWin);
		
		driver.findElement(By.xpath("//a[text()='  Follow On Twitter ']")).click();
		Set<String> tabs = driver.getWindowHandles();
	//	System.out.println("Number of Windows: "+ tabs.size());
	
		for(String tab : tabs) {
			if(!tab.equalsIgnoreCase(parentWin)) {
				driver.switchTo().window(tab);
				//driver.findElement(By.xpath("(//span[contains(text(),'Java')])[1]")).click();
			}
		}
	
		driver.close();
		driver.switchTo().window(parentWin);
		driver.findElement(By.xpath("//a[text()='Follow All']")).click();
		Set<String> four = driver.getWindowHandles();
		
			for(String tab : four) {
				if(!tab.equalsIgnoreCase(parentWin)) {
					driver.switchTo().window(tab);
					driver.manage().window().maximize();
					driver.close();
				}
		Thread.sleep(3000);
		driver.quit();
	}

}

	}


