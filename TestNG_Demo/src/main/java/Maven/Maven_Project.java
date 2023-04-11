package Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Maven_Project {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "E:\\Pranit\\chromedriver.exe") ;
		
        ChromeOptions options = new ChromeOptions() ;
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options) ;
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in");
	}

}
