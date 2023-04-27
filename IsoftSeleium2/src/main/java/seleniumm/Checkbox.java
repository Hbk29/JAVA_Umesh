package seleniumm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.mycontactform.com/");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 //launch the app
		  driver.get("https://www.mycontactform.com/");
		  
		  //samle forms
		  driver.findElement(By.linkText("Sample Forms")).click();
         
		  
		  //check box==Third check box===by xpath locator
		driver.findElement(By .xpath("//input[@value='Third Check Box']")).click();
	
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[1]")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[2]")).click();
	
	}

}
