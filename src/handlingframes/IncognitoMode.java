package handlingframes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class IncognitoMode 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Folder/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(options);
	}

}
