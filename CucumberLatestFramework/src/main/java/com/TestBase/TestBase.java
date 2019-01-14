package com.TestBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.utils.utilities;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	
	public void initilization() {
		try {
			prop = new Properties();
			
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\lilbansa1\\eclipse-workspace\\CucumberLatestFramework\\src\\main\\java\\properties\\config.properties");
			prop.load(ip);
			ip.close();
			String browserName = prop.getProperty("browser");
			switch (browserName) {

			case "chrome": {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\lilbansa1\\Desktop\\ProtractorPractice\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
			}
			case "firefox": {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\lilbansa1\\Desktop\\ProtractorPractice\\geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			}
			case "ie": {
				System.setProperty("webdriver.chrome.driver", "");
				driver = new InternetExplorerDriver();
				break;
			}
			}
			
			
			prop.setProperty("baseUrl", "https://www.makemytrip.com/");
			driver.get(prop.getProperty("baseUrl"));
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(utilities.Page_load_timeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(utilities.Implicit_timeout, TimeUnit.SECONDS);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
