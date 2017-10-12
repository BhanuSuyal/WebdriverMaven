import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest 
{
	public static WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\software\\Selenium with java\\Geckodriver\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		driver= new FirefoxDriver();
	}

	@Test
	public void doLogin() throws InterruptedException
	{
		driver.get("https://google.com");
		driver.findElement(By.xpath("//*[@id='gs_htif0']")).sendKeys("Selenium");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id='sbse2']/div[2]")).click();
		Thread.sleep(2000L);
		
		driver.findElement(By.xpath("//*[@id='rso']/div[2]/div/div[2]/div/div/h3/a")).click();
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	

}
