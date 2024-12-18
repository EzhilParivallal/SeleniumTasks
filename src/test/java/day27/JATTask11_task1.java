package day27;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JATTask11_task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Thread.sleep(5000);
		Set<String> windowHandles = driver.getWindowHandles();
		// Convert Set to List
		List<String> windows = new ArrayList<String>(windowHandles);
		// Pick up the particular window and switch to it
		driver.switchTo().window(windows.get(1));
		String Title =driver.getTitle();
		//System.out.println(Title);
		
		if(Title.equals("New Window")){
			driver.close();
		}
		Thread.sleep(2000);
		driver.switchTo().window(windows.get(0));
		
		//System.out.println(Title1);
        if(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).isDisplayed()) {
        	driver.quit();
        }
	}

}
