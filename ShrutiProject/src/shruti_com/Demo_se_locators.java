package shruti_com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_se_locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shrutishripad.g\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2Fcampaign%2Flanding.php%3Fcampaign_id%3D14884913640%26extra_1%3Ds%257Cc%257C589460569849%257Cb%257Cfacebook%2B%2527%257C%26placement%26creative%3D589460569849%26keyword%3Dfacebook%2B%2527%26partner_id%3Dgooglesem%26extra_2%3Dcampaignid%253D14884913640%2526adgroupid%253D128696220912%2526matchtype%253Db%2526network%253Dg%2526source%253Dnotmobile%2526search_or_content%253Ds%2526device%253Dc%2526devicemodel%253D%2526adposition%253D%2526target%253D%2526targetid%253Dkwd-327195741349%2526loc_physical_ms%253D1007785%2526loc_interest_ms%253D%2526feeditemid%253D%2526param1%253D%2526param2%253D%26gad%3D1%26gclid%3DEAIaIQobChMIhuTi-6Sw_gIVBkZ9Ch1ing3pEAAYASAAEgJt1PD_BwE");
		String strTitle = driver.getTitle();
		System.out.println(strTitle);
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("9036555535");   //send text in textbox password
		driver.findElement(By.name("pass")).sendKeys("Shruti@91");    //send text in textbox password
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"login_link\"]/div[3]/a")); //click on login using xpath
		ele.click();
		 driver.findElement(By.name("firstname")).sendKeys("Shruti");   //send text in textbox password
		 driver.findElement(By.name("lastname")).sendKeys("Gaikwad");
		 driver.findElement(By.name("reg_email__")).sendKeys("9036555535");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("asdf");
		 
		 WebElement date = driver.findElement(By.name("birthday_day"));   //dropdown using select method
		 Select se = new Select(date);
		 se.selectByIndex(28);                         //method1 using Index
		 
		WebElement month = driver.findElement(By.name("birthday_month"));
		 Select se1 = new Select(month);
		se1.selectByVisibleText("Jul");         //method2 using visible text
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		 Select se2 = new Select(year);
		se2.selectByValue("1991");              //method3 using value
		
		WebElement radio = driver.findElement(By.className("_8esa"));
		radio.click();
		System.out.println(radio.isSelected());
	}

}

