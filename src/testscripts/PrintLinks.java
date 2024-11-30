package testscripts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintLinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
	WebElement	dropdown=driver.findElement(By.id("country"));
	Select options=new Select(dropdown);
	options.selectByIndex(6);
     //options.selectByValue("Canada");
		
		

		
	}

}
