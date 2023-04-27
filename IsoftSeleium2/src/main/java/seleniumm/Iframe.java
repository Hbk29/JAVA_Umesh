


package seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
//when webpage is embeded in another webpage its a "IFRAME"
	//IF OUR WEB ELEMENT IN A IFRAME THEN WE NEED TO SWICH FROM PAIN PAGE INTO IFRAME
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://letcode.in/frame/");
	
	//we have frame name
	driver.switchTo().frame("firstFr");
	
   WebElement k =driver.findElement(By.name("fname"));
   
   k.sendKeys("ajay");
   
   driver.findElement(By.name("lname")).sendKeys("sharma");
   
   //we dont have frame name so take xpath
   WebElement d=driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div/iframe"));
   
   //switch to child frame
   driver.switchTo().frame(d);
   
   driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
   
   //switch to main page
   driver.switchTo().defaultContent();
   
   //again switch to parent frame
   driver.switchTo().frame("firstFr");
	
	

	}

}
