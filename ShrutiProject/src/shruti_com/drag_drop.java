package shruti_com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shrutishripad.g\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);     //instantiate Actions method for drag&drop
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));    //use frame if the image is in frame
		driver.switchTo().frame(frame);     //switch to frame
		WebElement src = driver.findElement(By.id("draggable"));      //use ID for drag img
		WebElement target = driver.findElement(By.id("droppable"));  //use ID for drop img
		
		
//		action.clickAndHold(src).build().perform();
//		action.moveToElement(target).build().perform();        Method 1 using click and Hold
//		action.release(target).build().perform();
		   
		
		action.dragAndDrop(src, target).perform();              // method 2 using drag&drop method
	
		
		
		
		
	}

}
