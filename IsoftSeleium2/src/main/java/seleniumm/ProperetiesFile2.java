package seleniumm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProperetiesFile2 {

	public static void main(String[] args) throws Exception {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
				
	  //create File class object and pass the location of properties file
		File src=new File("C:\\Users\\Umesh Patil\\git\\selenium\\IsoftSeleium2\\src\\main\\java\\seleniumm\\repostiory\\Object2_repo.properties");
		
		//create FileInputStream class object and pass the ref pf File class
		FileInputStream frs=new FileInputStream(src);
		
		//Create properties class object
		Properties pro=new Properties();
		
		pro.load(frs);
		
		driver.get(pro.getProperty("url"));
		
		driver.findElement(By.xpath(pro.getProperty("loginbutton"))).click();
		
		driver.findElement(By.name(pro.getProperty("names"))).sendKeys((pro.getProperty("Testdata1")));
		
		driver.findElement(By.name(pro.getProperty("sirname"))).sendKeys((pro.getProperty("Testdata2")));
		
		//WebElement ok=driver.findElement(By.name(pro.getProperty("birthday_day")));
		
		//Select s=new Select(ok);
		
		//s.selectByIndex(30);
		
        WebElement kss=driver.findElement(By.name(pro.getProperty("birthday_month")));
		
		Select gs=new Select(kss);
		
		gs.selectByValue(pro.getProperty("Testdata3"));
		
		WebElement t=driver.findElement(By.id(pro.getProperty("year")));
		t.sendKeys(pro.getProperty("Testdata4"));
		
		List<WebElement> gd=driver.findElements(By.xpath(pro.getProperty("radiobutton")));
		
		gd.get(2).click();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
