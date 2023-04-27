package seleniumm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
        // create File class and pass the path of excel file
		
		File src=new File("C:\\Users\\Umesh Patil\\Desktop\\excel.xlsf");
		
		FileInputStream fec=new FileInputStream(src);
		
		XSSFWorkbook xs= new XSSFWorkbook();
		
		XSSFSheet sh=xs.getSheet("sheet1");
		
		//get sheet name
		System.out.println(sh.getSheetName());
		
		//total no of row
		System.out.println(sh.getPhysicalNumberOfRows());
		
		//total no of cell
		System.out.println(sh.getRow(0).getPhysicalNumberOfCells());
		
		// print value of row[0]coloumn[2]
		System.out.println(sh.getRow(0).getCell(2).getStringCellValue());
		

	}

}
