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
				String mail = "gajabase@mailinator.com";
				String pass = "Qwerty@123";
				
				// Enter the URL
				driver.get("https://websitechat-qa.netlify.app/login");
				driver.manage().window().maximize();
				driver.findElement(By.cssSelector("[data-cy='login-email-input']")).sendKeys(mail);
				driver.findElement(By.cssSelector("[data-cy='login-password-input']")).sendKeys(pass);
				driver.findElement(By.cssSelector("[data-cy='login-submit-button']")).click();
				System.out.println("Login Successful");
				Thread.sleep(8000);
				//All chats filter
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div[1]/div[1]/div[2]/button")).click();
				Thread.sleep(2000);
				//Choose Last 30 days
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div[1]/div[1]/div[2]/div/ul/li[2]")).click();
				Thread.sleep(2000);
				//Last 3 months
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div[1]/div[1]/div[2]/button")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div[1]/div[1]/div[2]/div/ul/li[3]")).click();
				Thread.sleep(2000);
				//Last 12 months
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div[1]/div[1]/div[2]/button")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div[1]/div[1]/div[2]/div/ul/li[4]")).click();
				Thread.sleep(3000);
				
				// Scroll page
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				System.out.print("Filter Applied");
				
				//Busiest period
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div[2]/div[1]/div[2]/button")).click();
				Thread.sleep(2000);
				//Last 30 days
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div[2]/div[1]/div[2]/div/ul/li[2]")).click();
				Thread.sleep(2000);
				//Last 3 months
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div[2]/div[1]/div[2]/button")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div[2]/div[1]/div[2]/div/ul/li[3]")).click();
				Thread.sleep(2000);
				//Last 12 months
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div[2]/div[1]/div[2]/button")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div[2]/div[1]/div[2]/div/ul/li[4]")).click();
				Thread.sleep(2000);
	}

}
