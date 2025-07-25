package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteChatbot {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Enter the URL
		driver.get("https://app.websitechat.in/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("gajaprod@mailinator.com");
		driver.findElement(By.name("password")).sendKeys("Qwerty@123");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/form/button[1]")).click();
		System.out.println("Login Successful");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[starts-with(@id, 'menu::r')]"));
		driver.findElement(By.xpath("//*[@id=\"menu::rb::trigger\"]")).click();
		//*[@id="menu::r5::trigger"]
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"delete\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/button[2]")).click();
		
		

	}

}
