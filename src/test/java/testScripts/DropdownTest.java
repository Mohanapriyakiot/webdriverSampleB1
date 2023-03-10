package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Zuci\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
	
		//single select:
		
	Select singleSel = new Select(driver.findElement(By.id("select-demo")));
	singleSel.selectByValue("Tuesday");
	
		//multi select:
		
//	Select mulSel = new Select(driver.findElement(By.id("multi-select")));
//	if(mulSel.isMultiple()) {
//		mulSel.selectByIndex(1);
//		mulSel.selectByVisibleText("Texas");
//		mulSel.selectByValue("New York");
//		List<WebElement> items= mulSel.getAllSelectedOptions();
//		System.out.println("Number of selected options : " + items.size());
//		mulSel.deselectByIndex(1);
//	} 
	
//	driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
//	WebElement age = driver.findElement(By.id("isAgeSelected"));
//	if(!age.isSelected()) {
//		age.click();
//	}
	
//	 driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
//	 driver.findElement(By.xpath("(//label[contains(text(),'Female')])[1]")).click();
	}

}
