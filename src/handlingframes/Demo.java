package handlingframes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Demo {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		//opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		System.setProperty("webdriver.chrome.driver","./Folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://paynext.co.in/contact-us.php");
		System.out.println("before");
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='map-c']/iframe")));
		Thread.sleep(2000);
		System.out.println("after");
		driver.findElement(By.xpath("//a[contains(text(),'View larger map')]")).click();
		
}

}
