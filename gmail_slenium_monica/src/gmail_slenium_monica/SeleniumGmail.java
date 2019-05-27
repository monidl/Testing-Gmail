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
				WebElement element = driver.findElement(By.name("q"));
				try{
				Thread.sleep(2000);
				} catch(InterruptedException e){
					System.out.printf("got interrupted!");
				}
				element.sendKeys("");
				element.submit();
				try{
					Thread.sleep(2000);
					} catch(InterruptedException e){
						System.out.printf("got interrupted!");
					}
				driver.quit();
	}

}
