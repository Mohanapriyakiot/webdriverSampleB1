package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExcercise {

	public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "E:\\Zuci\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
				
				List<WebElement> name = driver.findElements(By.xpath("//td[contains(text(),'San Francisco')]//preceding-sibling::td[2]"));
				List<WebElement> salary = driver.findElements(By.xpath("//td[contains(text(),'San Francisco')]//following-sibling::td[3]"));
				List<WebElement> office = driver.findElements(By.xpath("//td[contains(text(),'San Francisco')]"));
	for(int i=0; i<salary.size();i++)
		System.out.println(name.get(i).getText()+": "+ office.get(i).getText() +": "+ salary.get(i).getText());
	}

}
