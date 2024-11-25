package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JATTask10_task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://jqueryui.com/datepicker/");
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		Thread.sleep(5000);
		int date=22;
		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@class='hasDatepicker']")).getAttribute("value"));
		driver.quit();
	}

}
