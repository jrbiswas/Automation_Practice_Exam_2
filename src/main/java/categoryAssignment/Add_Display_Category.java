package categoryAssignment;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Add_Display_Category {
	WebDriver driver;

	@BeforeMethod
	public void init() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		driver.get("http://techfios.com/test/103/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void addCategory() throws InterruptedException {

		// Relative xpath : //select[@name='category']
		By CATEGORY_DROPDOWN_Field = By.xpath("//select[@name='category']");

		Select sel = new Select(driver.findElement(CATEGORY_DROPDOWN_Field));
		sel.selectByVisibleText("Sports");
		Thread.sleep(4000);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}