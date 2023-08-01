package GroupNew.RandomApplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorkbookDocument;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RandomNew {
	
	public static void main(String[] args) throws FileNotFoundException {
//		ChromeOptions options=new Chrome
//		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		
	}
	

}
