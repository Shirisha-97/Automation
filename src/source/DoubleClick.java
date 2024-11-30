package source;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DoubleClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement c=driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		Actions act=new Actions(driver);
		act.doubleClick(c).perform();
		driver.switchTo().alert().accept();
		//driver.quit();
		
	}

}
