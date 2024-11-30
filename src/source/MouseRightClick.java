package source;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Folder/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.jiomart.com/");
		  WebElement q=driver.findElement(By.xpath("//*[@id=\"btn_search_list\"]/img"));
		  Actions a=new Actions(driver);
		  //contextClick is used to right click action
		  Thread.sleep(3000);
		  a.contextClick(q).build().perform();
		 
		
	}

}
