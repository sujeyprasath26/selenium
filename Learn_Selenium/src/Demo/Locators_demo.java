package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inc2011\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//1 .id -direct locator for static
		//findElement-method,By-class,id-attribute(accepts string and returns by),WebElement-interface
		
		WebElement uname=driver.findElement(By.id("txtUsername"));
		uname.sendKeys("Admin");
		
		//2. name -direct locator for static
		//By pass=By.name("txtUsername");
		driver.findElement(By.name("txtUsername")).sendKeys("admin123");
		
		//3.classname -many times class name may not be unique
		
		driver.findElement(By.className("textInputContainer")).click();
		
		 //4.Xpath -for dynamic webelement
		
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		//5.CSS -for dynamic webelement
		
		driver.findElement(By.cssSelector("#txtPassword")).click();
		
     //6.Linktext -for hyperlinks /use the exact text for linktext
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//7.PartialLinktext -dynamic links where a part is fixed and part
		//is changing -click her for signup/join us
		
		driver.findElement(By.partialLinkText("Forgot your")).click();
		
		//8.Tagname -<a -anchor tag /<input-input tag/ <span-span /use tagname for   similar kind of webelements
		
		System.out.println(driver.findElements(By.tagName("img")).size());
	}

}
