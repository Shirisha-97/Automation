    package synchronization;

   import java.util.concurrent.TimeUnit;
   import org.openqa.selenium.By;
   import org.openqa.selenium.WebDriver;
   import org.openqa.selenium.chrome.ChromeDriver;
   import org.openqa.selenium.remote.server.handler.SendKeys;
    public class Insta {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		 driver.get("https://www.instagram.com/");
//		 driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("shirisha");
//		//driver.findElement(By.xpath("name=\"password\"")).sendKeys("shirisha446@");
//		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("hello");
//		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.get("https://www.fireflink.com/signin");
		driver.findElement(By.xpath("//input[@name=\"emailId\"]")).sendKeys("shirisha.d@testyantra.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Shirisha97@");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		}
	}
