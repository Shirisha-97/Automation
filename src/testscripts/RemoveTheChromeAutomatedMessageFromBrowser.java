package testscripts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class RemoveTheChromeAutomatedMessageFromBrowser {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.setExperimentalOption("excludeSwitches", new String[]{ "enable-automation"});
		System.setProperty("webdriver.chrome.driver", "./Folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		Thread.sleep(2000);
		driver.get("https://www.selenium.dev/blog/2023/headless-is-going-away/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.close();
	

}
}
