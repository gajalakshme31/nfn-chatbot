package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Array {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch the browser
				//ChromeDriver driver = new ChromeDriver();
				WebDriver driver = new ChromeDriver();
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				//Enter the URL
				driver.get("https://websitechat-qa.netlify.app/login");
					String [] email = {"freeacc@mailinator.com","basicqa@mailinator.com"};
					String [] pass = {"Qwerty@123","Qwerty@123"};
					for(int i=0;i<2;i++)
					{
				driver.findElement(By.cssSelector("[data-cy='login-email-input']")).sendKeys(email[i]);
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='login-password-input']")).sendKeys(pass[i]);
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='login-submit-button']")).click();
				System.out.println("Login Successful");
					}

	}

}
