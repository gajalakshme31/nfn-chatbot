package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Launch the browser
				WebDriver driver = new ChromeDriver();
				// Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				// Enter the URL
				driver.get("https://websitechat-qa.netlify.app/login");
				driver.manage().window().maximize();
				driver.findElement(By.cssSelector("[data-cy='login-email-input']")).sendKeys("gajalakshme@nfnlabs.in");
				driver.findElement(By.cssSelector("[data-cy='login-password-input']")).sendKeys("Qwerty@123");
				driver.findElement(By.cssSelector("[data-cy='login-submit-button']")).click();
				System.out.println("Login Successful");
				driver.findElement(By.cssSelector(" ")).click();

	}

}
