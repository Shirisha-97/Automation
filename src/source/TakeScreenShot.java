package source;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//a[contains(@title,'Read')]")).click();
		//driver.navigate().back();
		//if we have taken chromedriver interface no need to typecaste
		TakesScreenshot st=(TakesScreenshot) driver;
		
		
		
	}

}
