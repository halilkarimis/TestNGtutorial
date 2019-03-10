package Basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.ie.InternetExplorerDriver;

@Test
public class DataDrivingfromProperties {

	public WebDriver driver = null; // Not to declare same driver in each if condition

	public void getData() throws IOException {

		Properties prop = new Properties();
		FileInputStream filein = new FileInputStream(
				"C:\\Users\\halil\\eclipse-workspace\\TestNGtutorial\\src\\Basics\\datasource.properties");
		prop.load(filein);

		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("url"));
		String browser = prop.getProperty("browser");

		if (browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "c:\\users\\halil\\downloads\\00programs\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", "c:\\users\\halil\\downloads\\00programs\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.contains("iexplorer")) {
			System.setProperty("webdriver.ie.driver",
					"c:\\users\\halil\\downloads\\00programs\\MicrosoftWebDriver.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Error");
		}

		driver.get(prop.getProperty("url"));

	}
}
