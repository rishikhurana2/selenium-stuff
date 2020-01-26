package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;

public class tester {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/league/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://demo.guru99.com/test/newtours/";
		
		driver.get(baseURL);
		WebElement security = driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[6]/a"));
		int x = security.getLocation().getX();
		int y = security.getLocation().getY();
		System.out.println(x);
		System.out.println(y);
		Actions acts = new Actions(driver);
		acts.moveByOffset(x + 5, y + 5).click();
		//driver.close();
	}
}
