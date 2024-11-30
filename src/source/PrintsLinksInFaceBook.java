package source;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class PrintsLinksInFaceBook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int count=0;
//		for(WebElement a :links) {
//			System.out.println(a.getText());
//			count++;
//			//System.out.println(a.getSize());
//			
//		}
//		System.out.println(links.size());
//		//System.out.println(((Object) links).delete());
//		System.out.println(count);
		for(int i=0;i<links.size();i++) {
			
			count++;
			
		}
		System.out.println(count);
		ChromeOptions a=new ChromeOptions();
		
				
		
		
	}

}
