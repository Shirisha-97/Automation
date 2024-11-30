package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserAnotherWay {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	}

}