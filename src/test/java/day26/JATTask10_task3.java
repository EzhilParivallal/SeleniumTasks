package day26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JATTask10_task3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.guvi.in/");
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.id("name")).sendKeys("Ezhil");
		driver.findElement(By.id("email")).sendKeys("ezhilparivallal11@gmail.com");
		driver.findElement(By.id("password")).sendKeys("E@L@i@1793");
		driver.findElement(By.id("mobileNumber")).sendKeys("9659528819");
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='May be later']")).click();
 
		if(driver.findElement(By.xpath("//h1[text()='Almost Done! Check Your Inbox!']")).isDisplayed()) {
		System.out.println("Sign up successful");
	
		WebElement guvilogo =driver.findElement(By.xpath("//img[@alt='Guvi Logo']"));
		
		guvilogo.click();
		driver.findElement(By.id("login-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("ezhilparivallal17@gmail.com");
		driver.findElement(By.id("password")).sendKeys("E@l@i@1793");
		driver.findElement(By.id("login-btn")).click();
		Thread.sleep(5000);
		Set<String> windowHandles = driver.getWindowHandles();
				// Convert Set to List
				List<String> windows = new ArrayList<String>(windowHandles);
				// Pick up the particular window and switch to it
				driver.switchTo().window(windows.get(0));
				String Title =driver.getTitle();
				//System.out.println(Title);
		
		if(Title.equals("GUVI | courses")){
			System.out.println("Log in successful");
		}
		
		}
		driver.quit();

	}

}
