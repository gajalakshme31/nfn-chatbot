package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisitorDelete {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		//ChromeDriver driver = new ChromeDriver();
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
		
		Thread.sleep(5000);
		//Navigate to Visitor tab
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[3]/a/div[2]")).click();
		Thread.sleep(2000);
		//Delete single entry
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div/table/tbody/tr[1]/td[4]/button")).click();
		Thread.sleep(2000);
		//Confirmation popup
		driver.findElement(By.xpath("//*[@id=\"dialog::rt::content\"]/div/div[2]/button[2]")).click();
		//*[@id="dialog::rs::content"]/div/div[2]/button[2]
		Thread.sleep(2000);
		
		//Multiselect
		
				driver.findElement(By.xpath("//*[@id=\"checkbox::rm::control\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"checkbox::rn::control\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div[2]/button")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"dialog::rt::content\"]/div/div[2]/button[2]")).click();
				Thread.sleep(2000);
				
				
	}

}
