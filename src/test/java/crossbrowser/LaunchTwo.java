package crossbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchTwo {

	@Test

	public void login_Test() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ashique\\eclipse\\java-2021-03\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");

		driver.close();

	}

}
