package WeatherForecast;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class forecast {
	
	 static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
//		driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://localhost:3000/");
		driver.findElement(By.id("city")).clear();
		// select city as perth
		driver.findElement(By.id("city")).sendKeys("perth");
		driver.findElement(By.id("city")).submit();
		
		// Select day, get 3 hourly forecast
		driver.findElement(By.xpath("//span[@class='name' and @data-test='day-1']")).click();
		// to wait for 5 seconds
		Thread.sleep(5000);
		
		// Select day again, hide 3 hourly forecast
		driver.findElement(By.xpath("//span[@class='name' and @data-test='day-1']")).click();
		
		//driver.close();
		
		
			
		

	}

}
