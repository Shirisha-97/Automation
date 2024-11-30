package datadriventesting;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Google {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("tshirts",Keys.ENTER);
		int a=90;
	}

}
