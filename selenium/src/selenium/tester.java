package selenium;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class tester {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/league/Desktop/chromedriver");
	//	String downloadFilepath = "c:\\download";
		//		DesiredCapabilities cap = DesiredCapabilities.chrome();
//		cap.setCapability("download.default_directory","C:");
//		cap.setCapability("download.prompt_for_download","false");
//		cap.setCapability("directory_upgrade","true");
//		cap.setCapability("plugins.plugins_disabled","Chrome PDF Viewer");
//		WebDriver driver = new ChromeDriver(cap);
//		
		String baseURL = "https://www.dmv.ca.gov/portal/dmv/detail/forms/reg/reg138";
//		
////		driver.get(baseURL);
////		WebElement pdfLink = driver.findElement(By.xpath("//*[@id=\"app_content\"]/p[5]/a"));
////		pdfLink.click();
////		driver.findElement(By.xpath("//*[@id=\"icon\"]")).click();
////		driver.close();
////		driver.get("chrome://settings/content/pdfDocuments");
////		new WebDriverWait(driver, 10).until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("body/deep/#control"), 10));
////		driver.findElement(By.xpath("//*[@id=\"knob\"]")).click();
////		try {
////			Thread.sleep(2000);
////		} catch (InterruptedException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		} // only to see the result
//
//		driver.get(baseURL);
//		WebElement pdfLink = driver.findElement(By.xpath("//*[@id=\"app_content\"]/p[5]/a"));
//		pdfLink.click();
////		driver.close();
//		
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("plugins.plugins_disabled", new String[] {"Chrome PDF Viewer"});
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("plugins.always_open_pdf_externally", true);
        chromePrefs.put("download.default_directory", "/Users/league/Desktop/Chrome Test Downloads");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver driver = new ChromeDriver(cap);
		driver.get(baseURL);
		WebElement pdfLink = driver.findElement(By.xpath("//*[@id=\"app_content\"]/p[5]/a"));
		pdfLink.click();
	//	driver.close();
	}
}
