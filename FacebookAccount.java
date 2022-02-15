package weeek2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAccount {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver facebook=new ChromeDriver();
	facebook.get("https://www.facebook.com/");
	facebook.findElement(By.id("email")).sendKeys("venkatsuja02@gmail.com");
	facebook.findElement(By.id("password")).sendKeys("hemapriya");
	facebook.findElement(By.name("login")).click();
	

	}

}
