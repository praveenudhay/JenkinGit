

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckOutPage {

	public static WebDriver openBrowser(){
	
		WebDriver wd=new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		return wd;
	}
	
	public static void loadURL(WebDriver wd, String url){
		wd.get(url);
	}
	
	public static void verifyURL(WebDriver wd){
		String data=wd.getTitle();
		System.out.println(data);
	}
	
	public static void enterUserName(WebDriver wd, String name){
		wd.findElement(By.name("username")).sendKeys(name);
	}
	
	public static void enterPassword(WebDriver wd, String password){
		wd.findElement(By.name("password")).sendKeys(password);
	
	}
	
	public static void clickLogin(WebDriver wd){
		wd.findElement(By.name("password")).sendKeys(Keys.ENTER);

	}
}
