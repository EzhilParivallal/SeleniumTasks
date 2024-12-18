package day27;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JATTask11_task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("http://the-internet.herokuapp.com/nested_frames");
		//WebElement TopFrame = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		//driver.switchTo().frame(0);
		//TopFrame.click();
		WebElement TopFrame = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(TopFrame);
		//WebElement MiddleFrame = TopFrame.findElement(By.xpath("//frameset[@name='frame-middle']"));
		//driver.switchTo().frame(MiddleFrame);
		WebElement LeftFrame = driver.findElement(By.xpath("//frame[@name='frame-left']"));
		WebElement MidFrame = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		WebElement RightFrame = driver.findElement(By.xpath("//frame[@name='frame-right']"));
		driver.switchTo().frame(LeftFrame);
		String left = LeftFrame.getText();
		if(left.equals("LEFT")) {
			System.out.println("Frame text in first child frame of top frame: "+left);
		}
		//driver.switchTo().frame(MiddleFrame);
		driver.switchTo().frame(TopFrame);
		driver.switchTo().frame(MidFrame);
		String middle = MidFrame.getText();
		if(middle.equals("MIDDLE")) {
			System.out.println("Frame text in second child frame of top frame: "+middle);
		}
		driver.switchTo().frame(TopFrame);
		//driver.switchTo().frame(MiddleFrame);
		driver.switchTo().frame(RightFrame);
		String right = RightFrame.getText();
		if(right.equals("RIGHT")) {
			System.out.println("Frame text in third child frame of top frame: "+right);
		}
		WebElement BottomFrame = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		driver.switchTo().frame(TopFrame);
		driver.switchTo().frame(BottomFrame);
		String bottom = BottomFrame.getText();
		if(bottom.equals("BOTTOM")) {
			System.out.println("Frame text in bottom frame: "+bottom);
		}
		driver.switchTo().frame(TopFrame);
		driver.close();
	}

}
