package seleniumm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");
		
		//element in frame==so we need to switch in frame
		List<WebElement> ref=driver.findElements(By.tagName("iframe"));
		
		System.out.println(ref.size());   //total size of frames
		
		driver.switchTo().frame(0);      //swiched into iframe
		
		//only drag===move element 
		//strored element in webelement
		WebElement draggble=driver.findElement(By.id("draggable"));
		
		//Action class object
		Actions act=new Actions(driver);
		
		Thread.sleep(1000);
		act.dragAndDropBy(draggble, 10, 20).build().perform(); //how to drag or move element
		
		System.out.println("drag sussesfull");
		
		driver.switchTo().defaultContent();
		
		//drag and drop
		
		driver.findElement(By.linkText("Droppable")).click();
		
		driver.switchTo().frame(0);
		
		WebElement draggble1=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement droppable=driver.findElement(By.xpath("//*[@id='droppable']"));
		
		act.dragAndDrop(draggble1, droppable).build().perform();
		
		System.out.println("drop sucessed");
		
		
		
		

	}

}
