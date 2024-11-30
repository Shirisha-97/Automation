package source;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseActions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement a=driver.findElement(By.xpath("//a[@id=\"course\"]"));
		WebElement b=driver.findElement(By.xpath("(//a[text()='SkillTesting'])[1]"));
		Actions actions=new Actions(driver);
		Thread.sleep(3000);
		//any mouse actions we peform build(create an action).Perform(it completes the action) coz to see the action in UI
		//we can directly give the perform method
		actions.moveToElement(a).moveToElement(b).click(b).build().perform();
		}
	//mouse hover action
	}
