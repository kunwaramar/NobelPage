package FirstModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//import src.test.java.MyPackage.ChromeDriver;
//import src.test.java.MyPackage.WebDriver;
//import src.test.java.MyPackage.WebElement;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://nobelpagedev.iworklab.com/");
		driver.manage().window().maximize();
		System.out.println("Title of the page" + driver.getTitle());
		System.out.println("Curret URL is" + driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		WebElement email= driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[2]/form/div[1]/div/input"));
		email.clear();
		Thread.sleep(2000);
		email.sendKeys("amarkunw@gmail.com");
		Thread.sleep(200);
		WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[2]/form/div[2]/div/input"));
		password.clear();
		password.sendKeys("Amar@12345");
		Thread.sleep(2000);
		WebElement btnLogin = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[2]/form/div[4]/button"));
		Thread.sleep(2000);
		btnLogin.click();
		
	}

}
