package source;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
public class DragandDrop {
	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		System.setProperty("webdriver.chrome.driver","./Folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions act = new Actions(driver);
      WebElement source=driver.findElement(By.xpath("(//div[text()=\"Copenhagen\"])[2]"));
	  WebElement destination=driver.findElement(By.xpath("//div[text()=\"Italy\"]"));
	act.dragAndDrop(source, destination).perform();
	}

}
