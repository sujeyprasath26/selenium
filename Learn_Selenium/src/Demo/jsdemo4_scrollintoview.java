package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class jsdemo4_scrollintoview {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inc2011\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement element=driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]"));
		//Scroll through javascript
		//+ve-scrolldown,-ve-scrollup
		//scroll page 400 pixel  vertical
		//scroll(horizontal,vertical)");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(2000);
		js.executeScript("scroll(0,1500)");
		System.out.println(element.getText());
		
		
		
		

	}

}
