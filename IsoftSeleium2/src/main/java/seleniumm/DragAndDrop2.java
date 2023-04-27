package seleniumm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");
		driver.findElement(By.linkText("Droppable")).click();
		
		WebElement g=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		
		//switch to inside frame
	    driver.switchTo().frame(g);
		
        WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		
		//drag and drop
		act.dragAndDrop(draggable, droppable).build().perform();
		
		driver.navigate().back();
		
		//drag
		WebElement b=driver.findElement(By.id("draggable"));
		act.dragAndDropBy(b, 110, 50).build().perform();
        
	}

}
