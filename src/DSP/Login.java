package DSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\Drivers\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/v4");
		
		driver.findElement(By.name("uid")).sendKeys("mngr509374");
		driver.findElement(By.name("password")).sendKeys("zAgedup");
		driver.findElement(By.name("btnLogin")).click();
		
		
		
	}

}
