package testscripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheAllLinksOfFaceBook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		JavascriptExecutor scroll= (JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0,400)");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		for(WebElement links:alllinks) {
			System.out.println(links.getText());
		}

	}

}
