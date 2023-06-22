package shruti_com;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelSheet {
 
   
	public static void main(String[] args) throws FileNotFoundException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrutishripad.g\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("www.facebook.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS );
		
	
		 String filePath = System.getProperty("user.dir") + "\\Cred.xlsx";
		 
		 
		//File input stream which needs the input as the file location
		 FileInputStream fileStream = new FileInputStream(filePath);
		 
		 XSSFSheet sheet =  get.XSSFSheet()
		 
		
		

	}

}
