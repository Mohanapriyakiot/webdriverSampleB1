package testScripts;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShadowDOMTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Zuci\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		
		driver.get("http://watir.com/examples/shadow_dom.html");
		
		WebElement shadowHost = driver.findElement(By.cssSelector("#shadow_host"));
		SearchContext shadowRoot = shadowHost.getShadowRoot();
		String strText = shadowRoot.findElement(By.cssSelector("#shadow_content")).getText();
		
		//String strText = shadowRoot.findElement(By.cssSelector("#shadow_content")).getText();
		
		System.out.println("Shadow DOM Text : "+ strText);
	}

}
