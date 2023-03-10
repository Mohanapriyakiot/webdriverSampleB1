package testScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameExercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Zuci\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame(0);
		WebElement para=driver.findElement(By.xpath("//body[@id='tinymce']"));
		para.clear();
	    para.sendKeys("I am priya..........here it is");

	}

}
