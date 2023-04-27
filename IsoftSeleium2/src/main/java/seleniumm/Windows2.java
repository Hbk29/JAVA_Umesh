package seleniumm;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows2 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.get("https://letcode.in/windows/");
	
	//parent window id
	System.out.println(driver.getWindowHandle());
	
	driver.findElement(By.id("multi")).click();
	
    Set<String> a=driver.getWindowHandles();
    
    System.out.println(a.size());     //total window
    
    System.out.println(a);            //all window id
    
    //Iterator class and iterator method
    Iterator<String> b=a.iterator();
    
    String parent=b.next();
    String child1=b.next();
    String child2=b.next();
    
    
    //control will go inside child window2
    driver.switchTo().window(child2);     
    
    System.out.println("child2="+driver.getTitle());
    System.out.println("child2="+driver.getWindowHandle());
   
    //control will go inside parent
    driver.switchTo().window(parent);
     System.out.println("parent="+driver.getWindowHandle());
    
     //control will go inside child window1
    driver.switchTo().window(child1);
    
    System.out.println("child1="+driver.getWindowHandle());
    
    
     
	

	}

}
