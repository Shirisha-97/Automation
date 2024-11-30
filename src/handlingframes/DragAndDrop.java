package handlingframes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		
	//	dra.dragAndDrop(("//div[text()="Washington"])[1]", null)
		 WebElement a1=driver.findElement(By.xpath("//div[@id=\"box5\"]"));
		 WebElement a2= driver.findElement(By.xpath("//div[text()=\"Norway\"]"));
		 
		 Actions a=new Actions(driver);
		 a.dragAndDrop(a1, a2).build().perform();
		
		
		
	}

}
