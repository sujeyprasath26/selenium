package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsdemo1_click_checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inc2011\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("sujeyprasath@yahoo.com");
		
		//driver.findElement(By.xpath("//*[contains(text),'Stay signed in']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//To click a checkbox with JavascriptExecutor using id
		
		js.executeScript("document.getElementById('persistent').click()");
		
		//To click a checkbox withJavascriptExecutor using xpath
		
		//WebElement checkbox=driver.findElement(By.xpath("//input[@id='persistent']"));
		//js.executeScript("arguments[0].click()",checkbox);
		
	}

}
