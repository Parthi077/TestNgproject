package BasePack;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static void Bowserlaunch() {
		driver = new ChromeDriver();
	}

	public static void geturl(String url) {
		driver.get(url);
	}
	
	public static void Robot() throws AWTException
	{
		Robot rs = new Robot();

	}

	public static void toMaximize() {
		driver.manage().window().maximize();
	}

	public static void implicitWait() throws InterruptedException {
		Thread.sleep(2000);
	}

	public static void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click() ;", element);
	}

	public static void jsScroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void explicitWait(WebElement locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
		wait.until(ExpectedConditions.elementToBeClickable(locator));

	}

	public static void ScreenShort(WebDriver driver2, String screenshort, String string) throws IOException {

		TakesScreenshot screen = (TakesScreenshot) driver2;
		File src = screen.getScreenshotAs(OutputType.FILE);
		File path = new File(
				"C:\\Users\\91812\\Documents\\WebTable\\target\\Screenshorts\\" + screenshort + ".png");
		FileUtils.copyFile(src, path);

	}

	public static void RobotClass() throws AWTException {
		Robot robot = new Robot();
	}

	public static void log(String text) {
		System.out.println(text);
	}
	
	public static void NavigateBack() {
	   driver.navigate().back();
	}

	public static void quit() {
		driver.quit();
	}

}
