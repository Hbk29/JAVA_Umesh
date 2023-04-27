package seleniumm;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows1 {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://letcode.in/windows/");
			 
			 driver.findElement(By.id("home")).click();
			 
			 //still control in parent window hence shows parent window id
			 System.out.println(driver.getWindowHandle());
			 
			 //print all window====getwindowhandles has inbuilt set method(pre defined)
			 Set<String> allwindow=driver.getWindowHandles(); 
	         
			 //System.out.println(driver.getWindowHandles());
			 System.out.println(allwindow);
			 
			 //size of all window
			 System.out.println(allwindow.size());
			 
			 //Set collection not have get(index) method so we use Iterator class 
			 Iterator<String> op=allwindow.iterator();
			 
			 String a1=op.next();   //parent window
			 String a2=op.next();   //child window
			 
			 System.out.println(a2);
			 
			 //switch to child window
			 driver.switchTo().window(a2);
			 
			 driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/footer/a")).click();

	}
}
