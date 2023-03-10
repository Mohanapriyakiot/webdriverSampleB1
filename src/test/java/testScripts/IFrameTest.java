package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class IFrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Zuci\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	
		String strLbl = driver.findElement(By.cssSelector("label span")).getText();
		System.out.println("Label in Main page: " +strLbl);
		
		//MainPage to Frame1
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input")).sendKeys("Hello");
	
	    //Frame1 to Frame 3
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		
		//Frame3 to frame1
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input")).clear();
        driver.findElement(By.xpath("//input")).sendKeys("Hello welcome");
	
        //frame1 to mainpage
        driver.switchTo().defaultContent();
	    
        //mainpage to frame2
        driver.switchTo().frame("frame2");
        Select singleSel = new Select(driver.findElement(By.id("Animals")));
	    singleSel.selectByValue("avatar");
	}

}
