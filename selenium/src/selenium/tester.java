package selenium;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
public class tester {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/league/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "https://www.dmv.ca.gov/portal/dmv/detail/forms/reg/reg138";
		
		driver.get(baseURL);
		WebElement pdfLink = driver.findElement(By.xpath("//*[@id=\"app_content\"]/p[5]/a"));
		pdfLink.click();
		driver.findElement(By.xpath("//*[@id=\"icon\"]")).click();
		driver.close();
	}
}
