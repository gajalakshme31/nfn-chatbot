package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filter_Visitor {

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
		//Navigate to Visitor tab
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[3]/a/div[2]")).click();
		Thread.sleep(2000);
		//Select months filter
		driver.findElement(By.xpath("//*[@id=\"menu::rg::trigger\"]")).click();
		Thread.sleep(2000);
		// Select last 30 days
		driver.findElement(By.xpath("//*[@id=\"30d\"]")).click();
		
		Thread.sleep(2000);
		//Select old vs new filter
		driver.findElement(By.xpath("//*[@id=\"menu::ri::trigger\"]")).click();
		Thread.sleep(2000);
		// Select oldest
		driver.findElement(By.xpath("//*[@id=\"ASC\"]")).click();
		Thread.sleep(2000);
		

	}

}
