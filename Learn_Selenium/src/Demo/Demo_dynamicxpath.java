package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_dynamicxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\inc2011\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://crm.cxc.academy/login");
		driver.manage().window().maximize();
		
		//--//tagname[@attribute='value1'] -dynamic xpath
		//--//input[@id=''] ,//input[@name=''],//a[@title=''],//input[@id=''][@class=''],
		//--//input[@id=''or @class='']-2 matching node,//input[@id=''and @class='']-1 matching node
		//--//*[contains(@id,'')],//*[contains(text(),'')],//*[text(),''],//*[starts-with(@id='')]
		//*-not specific element
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Welcome@123");
		
		driver.findElement(By.xpath("//input[@id='remember']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		driver.findElement(By.xpath("//*[starts-with(text(),'Student')]")).click();
		driver.findElement(By.xpath("//i[@class='icofont icofont-plus']")).click();
		driver.findElement(By.xpath("//input[@class='form-control'and @id='name']")).sendKeys("sujey");
		driver.findElement(By.xpath("//input[@class='form-control'][@id='email']")).sendKeys("sujey@gmail.com");
		driver.findElement(By.xpath("//input[@class='form-control'or @id='contact_number']")).sendKeys("634643634");
		Thread.sleep(1000);
		driver.quit();
		
	}

}
