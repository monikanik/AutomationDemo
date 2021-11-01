package Automation.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://spicejet.com");
		Thread.sleep(2000);
		
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		//selecting banglore from dropdown
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

		//selecting current date from calender
				driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
				
	    //selecting check box
				driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
				
		//clicking on search button
				
				driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
				
		//Handling alert box
				
			System.out.println(driver.switchTo().alert().getText());
			
			driver.switchTo().alert().accept();
			System.out.println("abc");
			
			//1.checking in code into git..
			//2.checking in code into git..
			//Branch code..

			//4 checking in code into git ..
	}

}
