package excel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Meesho {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
        driver.get("https://www.meesho.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("shirts",Keys.ENTER);
		//driver.findElement(By.xpath("")).click();
		

		
		
	}

}
