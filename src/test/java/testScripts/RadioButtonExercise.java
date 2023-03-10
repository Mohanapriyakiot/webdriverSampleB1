package testScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Zuci\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//label[text()='London']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//label[starts-with(@for,'checkbox')]"));
	for(WebElement select : list) {
	if(!select.isSelected()) {
		select.click();
	}
	}

	}

}
