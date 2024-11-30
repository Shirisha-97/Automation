package testscripts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutoSuggestions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElements(By.xpath("//textarea[@class='gLFyf']"));
	}

}
