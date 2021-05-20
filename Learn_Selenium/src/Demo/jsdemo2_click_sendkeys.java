package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class jsdemo2_click_sendkeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inc2011\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement email=driver.findElement(By.name("username"));
		
		//Sendkeys through javascript
		
		js.executeScript("arguments[0].value=('sujeyprasath@yahoo.com')",email);
		//js.executeScript("arguments[0].value=argument[1]",email,"sujeyprasath@yahoo.com");
		//Click through javascript
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='persistent']"));
		
		js.executeScript("arguments[0].click()",checkbox);
		Thread.sleep(3000);
		
		

	}

}
