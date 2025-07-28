package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisitorChatView {

	
		public static void main(String[] args) throws InterruptedException {
			//Launch the browser
			//ChromeDriver driver = new ChromeDriver();
			WebDriver driver = new ChromeDriver();
			String mail = "gajabase@mailinator.com";
			String pass = "Qwerty@123";
			//Implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//Enter the URL
			driver.get("https://websitechat-qa.netlify.app/login");
			driver.manage().window().maximize();
			driver.findElement(By.name("email")).sendKeys(mail);
			driver.findElement(By.name("password")).sendKeys(pass);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/form/button[1]")).click();
			System.out.println("Login Successful");
			
			Thread.sleep(5000);
			//Navigate to Visitor tab
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[3]/a/div[2]")).click();
			Thread.sleep(2000);
			//Open chat
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/main/div/div[2]/div/table/tbody")).click();
			System.out.print("Chat opened successfully");

	}

}
