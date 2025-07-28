package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit_customize {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		//Launch the browser
				//ChromeDriver driver = new ChromeDriver();
				WebDriver driver = new ChromeDriver();
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				String mail = "w@mailinator.com";
				String pass = "Qwerty@123";
				//Enter the URL
				driver.get("https://websitechat-qa.netlify.app/login");
				driver.manage().window().maximize();
				driver.findElement(By.name("email")).sendKeys(mail);
				driver.findElement(By.name("password")).sendKeys(pass);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/form/button[1]")).click();
				System.out.println("Login Successful");
				Thread.sleep(6000);
		//Click customize btton
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div[4]/div/button")).click();
				Thread.sleep(2000);
				
		
		//Switch to customize
				driver.findElement(By.cssSelector("[data-cy='tab-layout']")).click();
				System.out.println("Switched to layout tab");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='chatbot-launcher-input']")).clear();
				driver.findElement(By.cssSelector("[data-cy='chatbot-launcher-input']")).sendKeys("Click me..");

				System.out.println("Updated Text");
				Thread.sleep(6000);
				driver.findElement(By.cssSelector("[data-cy='save-button']")).click(); //not working without manual refresh

	}

}
