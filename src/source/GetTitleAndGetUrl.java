package source;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class GetTitleAndGetUrl {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions a=new ChromeOptions();
	    a.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		System.setProperty("webdriver.chrome.driver","./Folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver(a);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
//	    String url=driver.getCurrentUrl();
//	    String title=driver.getTitle();
//	   String pagesource=driver.getPageSource();
//	    System.out.println(title + "\n" + url+"\n"+ pagesource);
//	    
	
	}

}
