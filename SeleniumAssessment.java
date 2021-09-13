package Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumAssessment {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CHOTU\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		// Convert web driver object to TakeScreenshot
		TakesScreenshot src=((TakesScreenshot)driver);
		// Call getScreenshotAs method to create image file
		File scrShot= src.getScreenshotAs(OutputType.FILE);
		
		//Copy file to Desired Location
		File DestFile=new File("C:\\Users\\CHOTU\\Selenium\\Screenshot.jpg");
		FileUtils.copyFile(scrShot, DestFile);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait wait =new WebDriverWait(driver,30);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@class,'gLFyf')]")));
		element.sendKeys("COVID-19");
		element.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[2]/a")).click();
		
		
		driver.quit();

	}

}
