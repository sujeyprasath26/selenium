package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dismissalert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\inc2011\\eclipse-workspace\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		JavascriptExecutor jsx=(JavascriptExecutor)driver;
		jsx.executeScript("window.confirm('Alert dismiss in 5 sec');");
		try {
			Alert confirmation=driver.switchTo().alert();
			String alertmsg=driver.switchTo().alert().getText();
			System.out.println("Alert message is :"+alertmsg);
			Thread.sleep(5000);
			confirmation.accept();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
