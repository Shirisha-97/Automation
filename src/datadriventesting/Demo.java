package datadriventesting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {

		// configure the browser
		System.setProperty("webdriver.chrome.driver", "./Folder/chromedriver.exe");

		// launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// wait Statement by java
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// nav to url
		driver.get("https://www.flipkart.com/");

		// fetch the url
		String a = driver.getCurrentUrl();
	

		// print the url
		

		// close the browser
	

		//System.out.println("execution completed");

}

}
