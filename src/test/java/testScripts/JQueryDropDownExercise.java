package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class JQueryDropDownExercise {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Zuci\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
			Actions actions=new Actions(driver);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://demo.seleniumeasy.com/jquery-dropdown-search-demo.html");
			//For privacy error
					driver.findElement(By.cssSelector("button#details-button")).click();
					driver.findElement(By.cssSelector("a#proceed-link")).click();
			driver.findElement(By.xpath("(//span[@class='select2-selection__arrow'])[1]")).click();
			
			
			
			//By SendKeys
//			WebElement Sel=driver.findElement(By.xpath("(//input[@class='select2-search__field'])[2]"));
//			Sel.click();
//			Sel.sendKeys("Japan");
//			Sel.sendKeys(Keys.ENTER);
			
			//Mouse Action
			WebElement Sel=driver.findElement(By.xpath("//li[text()='India']"));
			actions.moveToElement(Sel).click().perform();
			
//			Select sel=new Select(driver.findElement(By.id("country")));
//			sel.selectByValue("Japan");
			
//			WebElement mulSel=driver.findElement(By.xpath("(//input[@class='select2-search__field'])[1]"));
//			actions.click(mulSel).perform();
//			WebElement first=driver.findElement(By.xpath("//li[text()='California']"));
//			actions.moveToElement(first).click().click(mulSel).perform();
//			WebElement second=driver.findElement(By.xpath("//li[text()='Delaware']"));
//			actions.moveToElement(second).click().click(mulSel).perform();
//			WebElement third=driver.findElement(By.xpath("//li[text()='Arizona']"));
//			actions.moveToElement(third).click().perform();
			
			Select mulSel=new Select(driver.findElement(By.xpath("//select[@class='js-example-basic-multiple select2-hidden-accessible']")));
			mulSel.selectByValue("AK");
			mulSel.selectByValue("ID");
			mulSel.selectByValue("MN");
			
			actions.scrollByAmount(10, 500).perform();
			
			Select disabledVal=new Select(driver.findElement(By.xpath("//select[@class='js-example-disabled-results select2-hidden-accessible']")));
			disabledVal.selectByValue("VI");
			
			Select CategoryDrpDwn=new Select(driver.findElement(By.cssSelector("select#files")));
			CategoryDrpDwn.selectByValue("somefile");
			
		}
	}
