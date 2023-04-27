package seleniumm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attachfile {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			  driver.get("https://www.mycontactform.com/");
			  driver.findElement(By.linkText("Sample Forms")).click();
			  
			  //attach file===sendkeys("folder location.name.extension")
			  driver.findElement(By.id("attach4589")).sendKeys("C:\\Users\\Umesh Patil\\Desktop\\resume\\we.jpeg");
			
			

	}

}
