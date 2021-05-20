package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iframe_demo2 {
	
	@Test
	public void testFrames() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inc2011\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("file:///C:\\Users\\inc2011\\eclipse-workspace/myframes.html");
		
		int total_frames=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total frames in the application" +" "+ total_frames);
		WebElement my_frame=driver.findElement(By.xpath("//iframe[@title='selenium_news']"));
		driver.switchTo().frame(my_frame);
		driver.findElement(By.xpath("/html/body/header/a[2]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/a")).click();
	
	
		Thread.sleep(3000);
		driver.quit();
	}

}
