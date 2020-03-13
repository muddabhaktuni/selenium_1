package com.schn.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.schn.qa.util.TestUtil;
/*import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;*/

public class TestBase {
	protected static WebDriver driver;
	protected static Properties prop;

	public TestBase(){
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\Muddabhaktuni\\selenium-workspace\\SeniorCitizenHousing\\src\\"
					+ "main\\java\\com\\schn\\qa\\config\\config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void initialization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("ff")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
		}


		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}


}



