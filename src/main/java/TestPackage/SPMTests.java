package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SPMTests {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\All_JARs\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		options.addArguments("--options.infobars");
		options.setAcceptInsecureCerts(true);

		driver = new ChromeDriver(options);
		driver.get("https://devweb.sslproc.com/net/posweb/");

	}

	@Test
	public void verifyLogo() {
		boolean logoDisplay = driver.findElement(
				By.xpath("//div[@class='logo']")).isDisplayed();
		Assert.assertTrue(logoDisplay);

	}

	@Test
	public void verifyUsernameEntry() {
		/*
		 * driver.findElement(By.xpath("//div[@class='logo123']")).sendKeys("abcd"
		 * ); String actual
		 */
		Assert.assertEquals(true, false);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
