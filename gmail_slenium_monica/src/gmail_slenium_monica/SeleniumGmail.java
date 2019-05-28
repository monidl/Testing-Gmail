package gmail_slenium_monica;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.lang.Thread;


public class SeleniumGmail {
	
	public static void main(String args[])
	{
		System.setProperty(
				"webdriver.chrome.driver",
				"D:/Selenium/Chrome Driver/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.gmail.com");
				WebElement element = driver.findElement(By.name("identifier"));

				try{
				Thread.sleep(2000);
				} catch(InterruptedException e){
					System.out.printf("got interrupted!");
				}
				
				//email
				element.sendKeys("rockstars.enroute@gmail.com");
				element = driver.findElement(By.id("identifierNext"));
				element.click();

				try{
					Thread.sleep(2000);
					} catch(InterruptedException e){
						System.out.printf("got interrupted!");
					}
				
				//password
				element = driver.findElement(By.name("password"));
				element.sendKeys("Rockstars2019");
				element = driver.findElement(By.id("passwordNext"));
				element.click();
				
				try{
					Thread.sleep(1000);
					} catch(InterruptedException e){
						System.out.printf("got interrupted!");
					}
				
				driver.quit();
	}

}
