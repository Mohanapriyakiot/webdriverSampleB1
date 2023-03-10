package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class Sample {

	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "E:\\WebDriver\\edgedriver_win64\\msedgedriver.exe");
	
//	ChromeOptions options = new ChromeOptions();
//	options.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	//driver.quit();
	driver.get("https://www.google.com/");
	WebElement searchBox = driver.findElement(By.name("q"));
	searchBox.sendKeys("Java Tutorial");
	searchBox.submit();
	//searchBox.sendKeys(Keys.ENTER);
	System.out.println("Page Title : " + driver.getTitle());
	driver.navigate().back();
	System.out.println("Current URL : " + driver.getCurrentUrl());
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.navigate().to("https://www.selenium.dev/");
	}

}

