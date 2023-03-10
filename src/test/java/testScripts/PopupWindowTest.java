package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopupWindowTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Zuci\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.get("https://stqatools.com/demo/Windows.php");
	
		String parentWin = driver.getWindowHandle();
		System.out.println("Parent Win Handle : "+ parentWin);
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
		Set<String> tabs = driver.getWindowHandles();
		System.out.println("Number of Windows: "+ tabs.size());
	//using switch to --
		for(String tab : tabs) {
			if(!tab.equalsIgnoreCase(parentWin)) {
				driver.switchTo().window(tab);
				driver.findElement(By.xpath("(//span[contains(text(),'Java')])[1]")).click();
			}
		}
	
		driver.close();
		driver.switchTo().window(parentWin);
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[2]")).click();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("http://watir.com/examples/shadow_dom.html");
		driver.quit();
	}

}
