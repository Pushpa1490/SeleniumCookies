package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class delete_Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\CHOTU\\\\Selenium\\\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		//Delete cookies
		d.manage().deleteAllCookies();
		//d.manage().deleteCookieNamed("Cookie name");
		
		d.get("https://google.com");
	}

}
