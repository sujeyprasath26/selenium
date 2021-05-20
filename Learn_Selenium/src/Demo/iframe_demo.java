package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iframe_demo {
	
	@Test
	public void testFrames() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inc2011\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("file:///C:\\Users\\inc2011\\eclipse-workspace/myframes.html");
		driver.switchTo().frame("javatpoint");
		driver.findElement(By.id("gsc-i-id2")).sendKeys("java");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div/form/table/tbody/tr/td[2]/button")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/a")).click();
	int total_frames=driver.findElements(By.tagName("iframe")).size();
	System.out.println("Total frames in the application" +" "+ total_frames);
	
		Thread.sleep(3000);
		driver.quit();
	}

}
