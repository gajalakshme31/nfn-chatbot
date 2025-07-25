package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filter_Dashboard {

	public static void main(String[] args) throws InterruptedException {
		
				//Launch the browser
				WebDriver driver = new ChromeDriver();
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				//Enter the URL
				driver.get("https://app.websitechat.in/login");
				driver.manage().window().maximize();
				driver.findElement(By.name("email")).sendKeys("visitorprod@mailinator.com");
				driver.findElement(By.name("password")).sendKeys("Qwerty@123");
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/form/button[1]")).click();
				System.out.println("Login Successful");
				Thread.sleep(6000);
				//All chats filter
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div[1]/div[1]/div[2]/button")).click();
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div[1]/div[1]/div[2]/div/ul/li[2]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div[2]/div[1]/div[2]/button")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div[2]/div[1]/div[2]/div/ul/li[2]")).click();
				// Scroll page
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				
	}

}
