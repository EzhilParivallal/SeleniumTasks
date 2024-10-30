package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JATTask9_task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence",Keys.ENTER);
		WebElement Hist = driver.findElement(By.xpath("//span[normalize-space()='History']"));
		Hist.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//String url1 = driver.getCurrentUrl();
		//driver.get(url1);
		System.out.println("Title : "+Hist.getText());
		driver.quit();
		

	}

}
