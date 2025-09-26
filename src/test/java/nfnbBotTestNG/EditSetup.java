package nfnbBotTestNG;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class EditSetup {
	WebDriver driver ;
	@Test
	void editSetup() throws InterruptedException
	{	// Launch the browser
		driver = new ChromeDriver();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String mail = "r@mailinator.com";
		String pass = "Qwerty@123";
		
		// Enter the URL
		driver.get("https://websitechat-qa.netlify.app/login");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[data-cy='login-email-input']")).sendKeys(mail);
		driver.findElement(By.cssSelector("[data-cy='login-password-input']")).sendKeys(pass);
		driver.findElement(By.cssSelector("[data-cy='login-submit-button']")).click();
		System.out.println("Login Successful");
		Thread.sleep(8000);
		//Click three dots
				driver.findElement(By.cssSelector("[data-cy='three-dots-vertical']")).click();
				Thread.sleep(2000);
				//Click edit knowledge option
				driver.findElement(By.cssSelector("[data-cy='edit-configure']")).click();
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='company-name-input']")).clear();
				driver.findElement(By.cssSelector("[data-cy='company-name-input']")).sendKeys("Company");
				System.out.println("Attribute - Company name");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='company-address-input']")).clear();
				driver.findElement(By.cssSelector("[data-cy='company-address-input']")).sendKeys("Adayar");
				System.out.println("Attribute - Company name");
				Thread.sleep(2000);
				
				//Click update button
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='continue-update-button']")).click();
				//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/button")).click();
				//driver.findElement(By.cssSelector("[data-cy='confirmation-dialog-confirm']")).clear();
				
				Thread.sleep(5000);
	}
}
