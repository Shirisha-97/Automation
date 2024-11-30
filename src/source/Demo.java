package source;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		List<WebElement> a=driver.findElements(By.tagName("span"));
		//System.out.println(a);
		int count=0;
		for(WebElement k:a) {
			System.out.println(k.getText());
			count++;}
		System.out.println(a);
		System.out.println(a.size());
		
	}

}
