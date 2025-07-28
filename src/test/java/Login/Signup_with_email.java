package Login;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup_with_email {

	public static void main(String[] args) throws InterruptedException {
		int result=1;
		String mail = "r@mailinator.com";
		String pass = "Qwerty@123";
		// Launch the browser
				WebDriver driver = new ChromeDriver();
				// Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				// Enter the URL
				driver.get("https://websitechat-qa.netlify.app/login");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				//Click signup
				driver.findElement(By.cssSelector("[data-cy='signup-link']")).click();
				Thread.sleep(2000);
				//Enter email
				driver.findElement(By.cssSelector("[data-cy='email-input']")).sendKeys(mail);
				Thread.sleep(2000);
				//Click on the agree checkbox
				driver.findElement(By.cssSelector("[data-cy='terms-checkbox'] [data-part='control']")).click();
				Thread.sleep(4000);		
				driver.findElement(By.cssSelector("[data-cy='get-started-button']")).click();
				Thread.sleep(6000);		
				
				
				// Open a new tab
		        ((JavascriptExecutor) driver).executeScript("window.open()");
		        Thread.sleep(6000);	
		        // Switch to the new tab
		        for (String handle : driver.getWindowHandles()) {
		            driver.switchTo().window(handle);
		        }
		        Thread.sleep(6000);	
				 // Open another URL in the new tab
				driver.get("https://www.mailinator.com/");
				Thread.sleep(6000);	
				driver.findElement(By.id("search")).sendKeys(mail);
				Thread.sleep(6000);	
				driver.findElement(By.xpath("/html/body/div[1]/header[1]/div[1]/div/div/div[1]/div/button")).click();
				Thread.sleep(6000);
				//Click on the email
				driver.findElement(By.xpath("(//tr[@ng-repeat='email in emails'])[1]/td[3]")).click();
				Thread.sleep(5000);
				driver.switchTo().frame(0);
				//Click on the verification link
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[contains(text(),'Your Email')]")).click();
				Thread.sleep(3000);
				//Switch control to next tab
				Set<String> ids = driver.getWindowHandles();
				for (String string : ids) {
					driver.switchTo().window(string);
				}
				Thread.sleep(3000);
				//Enter password and confirm password
				
				driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(pass);
				driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(pass);
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("[data-cy='submit-password-button']")).sendKeys("NFN Labs");
				
				//Trying to login into the created account
					// Open a new tab
			        ((JavascriptExecutor) driver).executeScript("window.open()");

			        // Switch to the new tab
			        for (String handle : driver.getWindowHandles()) {
			            driver.switchTo().window(handle);
			        }
					 // Open another URL in the new tab
			        driver.get("https://websitechat-qa.netlify.app/login");
					driver.manage().window().maximize();
					driver.findElement(By.cssSelector("[data-cy='login-email-input']")).sendKeys(mail);
					driver.findElement(By.cssSelector("[data-cy='login-password-input']")).sendKeys(pass);
					driver.findElement(By.cssSelector("[data-cy='login-submit-button']")).click();
					result=0;
					System.out.println("Login Successful");
				
				if(result==0)
				{
					System.out.println("Signup Successful");
				}
				else
				{
					System.out.println("Signup Failed");
				}
			
				
	}

}
