package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class jsdemo3_scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inc2011\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://learn-automation.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Scroll through javascript
		//+ve-scrolldown,-ve-scrollup
		//scroll page 400 pixel  vertical
		//scroll(horizontal,vertical)");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,1500)");
		
		
		
		
		
		

	}

}
