package WebTableTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BasePack.BaseClass;
import PomPack.SampleWeb;

public class Test1 extends BaseClass {
	SampleWeb sb = new SampleWeb();
	
	WebDriver driver = new ChromeDriver();

	@BeforeClass

	public void BeforeTest() throws IOException, InterruptedException {

		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		implicitWait();
		
		
		driver.manage().window().maximize();
	}
		@Test
		public void Test() throws InterruptedException
		{
		implicitWait();

		driver.findElement(sb.SampleWeb).click();

		driver.findElement(sb.SampleWeb);

		implicitWait();

		driver.findElement(sb.FirstName).sendKeys("Ram");

		implicitWait();

		driver.findElement(sb.LastName).sendKeys("Sundar");

		implicitWait();

		driver.findElement(sb.Email).sendKeys("Ram222@Gmail.com");

		implicitWait();

		driver.findElement(sb.Age).sendKeys("twenty six");

		implicitWait();

		driver.findElement(sb.Salary).sendKeys("Thirty Nine Thousand");

		implicitWait();

		driver.findElement(sb.Dept).sendKeys("Information Technology");

		

	}
@Test
public void Test2() throws InterruptedException
{
	implicitWait();

	driver.findElement(sb.Login).click();
	
}
	@AfterClass
	public void EndTest() throws IOException, InterruptedException {

		implicitWait();

		driver.quit();
	}
}