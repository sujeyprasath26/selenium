package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAlert {
	@Test
public  void handleAlert() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\inc2011\\eclipse-workspace\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("/html/body/main/form/div/div/div[2]/div[3]/button")).click();
		Thread.sleep(7000);
		//Alert alt=driver.switchTo().alert();
		//alt.accept();
		String actual_msg=driver.switchTo().alert().getText();
		System.out.println("Alert Message is:"+ actual_msg);
		driver.switchTo().alert().dismiss();
		String expected_msg="Please select start place.";
		//SoftAssert assert1=new SoftAssert();
		Assert.assertEquals(actual_msg, expected_msg);
		driver.quit();
		
		
		
		
}
}
