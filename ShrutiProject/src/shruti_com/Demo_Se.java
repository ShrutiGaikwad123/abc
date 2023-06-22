package shruti_com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Se
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shrutishripad.g\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		String strTitle = driver.getTitle();   // get title code (create string)
		System.out.println(strTitle);
		
		driver.manage().window().maximize();  //maximize window
		
		driver.manage().timeouts().implicitlyWait(20000,TimeUnit.SECONDS); //waitImplicit
		driver.close();

	}

}
