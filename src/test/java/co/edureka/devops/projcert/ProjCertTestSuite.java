/**
 * 
 */
package co.edureka.devops.projcert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author alfiguer
 *
 */
public class ProjCertTestSuite {

	private WebDriver driver;

	private Map<String, Object> vars;

	JavascriptExecutor js;

	/**
	 * 
	 */
	public ProjCertTestSuite() {
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setUp() {
		String driverOS = "mac";
		String driverBinary = "/Applications/Chromium.app/Contents/MacOS/Chromium";

		File resourcesPath = new File("src/test/resources");
		StringBuilder driverPath = new StringBuilder(resourcesPath.getAbsolutePath()).append(File.separator)
				.append("webdrivers").append(File.separator).append(driverOS).append(File.separator)
				.append("chromedriver");

		System.setProperty("webdriver.chrome.driver", driverPath.toString());

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setBinary(driverBinary);
		chromeOptions.addArguments("--headless");

		driver = new ChromeDriver(chromeOptions);
		driver.manage().deleteAllCookies();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void testcasehome() {
		// Test name: test.case.home
		// Step # | name | target | value | comment
		// 1 | open | http://132.145.208.119/ | |
		driver.get("http://132.145.208.119/");
		// driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
		// driver.manage().timeouts().pageLoadTimeout(3L, TimeUnit.SECONDS);
		// 2 | setWindowSize | 1280x800 | |
		driver.manage().window().setSize(new Dimension(1280, 800));
		// 3 | click | id=Home | |
		driver.findElement(By.id("Home")).click();
	}

	@Test
	public void testcaseabout() {
		// Test name: test.case.about
		// Step # | name | target | value | comment
		// 1 | open | http://132.145.208.119/ | |
		driver.get("http://132.145.208.119/");
		// 2 | setWindowSize | 1280x800 | |
		driver.manage().window().setSize(new Dimension(1280, 800));
		// 3 | click | id=About Us | |
		driver.findElement(By.id("About Us")).click();
	}

	@Test
	public void testcaseproducts() {
		// Test name: test.case.products
		// Step # | name | target | value | comment
		// 1 | open | http://132.145.208.119/ | |
		driver.get("http://132.145.208.119/");
		// 2 | setWindowSize | 1280x800 | |
		driver.manage().window().setSize(new Dimension(1280, 800));
		// 3 | click | id=Products | |
		driver.findElement(By.id("Products")).click();
	}

	@Test
	public void testcasecontact() {
		// Test name: test.case.contact
		// Step # | name | target | value | comment
		// 1 | open | http://132.145.208.119/ | |
		driver.get("http://132.145.208.119/");
		// 2 | setWindowSize | 1280x800 | |
		driver.manage().window().setSize(new Dimension(1280, 800));
		// 3 | click | id=Contact | |
		driver.findElement(By.id("Contact")).click();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
