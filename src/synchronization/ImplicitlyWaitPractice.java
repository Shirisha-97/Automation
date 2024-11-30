package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitPractice {

public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("fhgfjkyhgjhgkjhjkh");
		driver.findElement(By.name("password")).sendKeys("fhtgfhgfhgfjhgfjhhj");
		driver.findElement(By.xpath("//button[.='Log in']")).submit();
		Thread.sleep(3000);
		driver.close();
	}

}
