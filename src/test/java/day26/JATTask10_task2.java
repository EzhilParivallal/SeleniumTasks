package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JATTask10_task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		Actions mouse = new Actions(driver);
		mouse.dragAndDrop(source, destination).perform();
        String clr = destination.getCssValue("background-color");
        String text = destination.getText();
        //System.out.println(clr+" "+text);
        if(clr.equals("rgba(255, 250, 144, 1)") && text.equals("Dropped!")) {
        	System.out.println("Drop successful");
        }
        driver.quit();
	}

}
