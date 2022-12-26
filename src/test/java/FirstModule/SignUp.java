package FirstModule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://nobelpagedev.iworklab.com/");
		driver.manage().window().maximize();
		System.out.println("Title of the page" + driver.getTitle());
		System.out.println("Curret URL is" + driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		WebElement CreateAccount= driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[2]/form/div[5]/p/a/span"));
		//email.clear();
		CreateAccount.click();
		//Thread.sleep(2000);
		//WebElement email= 
		// first Name
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[2]/div/form/div[1]/div[1]/div/input")).sendKeys("Amar");	
		//Thread.sleep(2000);
		//Last Name
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[2]/div/form/div[1]/div[2]/div/input")).sendKeys("Kunwar");
		//Thread.sleep(2000);
		//Email Address
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[2]/div/form/div[2]/div/input")).sendKeys("amarkunwar03@gmail.com");
		//Thread.sleep(2000);
		//password
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[2]/div/form/div[3]/div/input")).sendKeys("Amar@123@");
		//Thread.sleep(2000);
		//country dropdown			
		//WebElement drpDownList = (WebElement) 
				driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[2]/div/form/div[4]/div/div/div[2]/div")).click();
				
				List<WebElement> drpDownList =  driver.findElements(By.xpath("//ul[@role='listbox'][1]//li"));
		
		//Select drpList = new Select(drpDownList);
		System.out.println(drpDownList.size());
		
		//List<WebElement> list=  drpList.getOptions();
		for(WebElement list:drpDownList)
		{
			if(list.getText().contains("+91"))
			{
				list.click();	
				driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[2]/div/form/div[4]/div/div/input")).sendKeys("9810778021");
				break;
				
				
			}
		}
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[2]/div/form/div[6]/button")).click();
		
		//drpList.selectByVisibleText("India +1");
		//Thread.sleep(2000);
		//btnLogin.click();
		
		
		//email.sendKeys("amarkunw@gmail.com");

	}
}

