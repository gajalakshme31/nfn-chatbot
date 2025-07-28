package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draft_create_view_delete {

	public static void main(String[] args) throws InterruptedException {
		
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
				Thread.sleep(8000);
				//Create draft
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div[2]/div")).click();
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='website-url-input']")).sendKeys("https://appvance.ai/");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='continue-button']")).click();
				System.out.println("Get started successfull");
				Thread.sleep(7000);
				// enable toggle in knowledge page
				driver.findElement(By.cssSelector("[data-cy='group-toggle-switch']")).click();
				// click continue button
				driver.findElement(By.cssSelector("[data-cy='website-continue-button']")).click();
				System.out.println("Knowledge successfull");
				Thread.sleep(6000);
				// Configure page
				driver.findElement(By.cssSelector("[data-cy='website-integrate-input']")).sendKeys("https://appvance.ai/");
				System.out.println("Entered website to be integrated");
				driver.findElement(By.cssSelector("[data-cy='chatbot-name-input']")).sendKeys("Chatbot name");
				System.out.println("Entered chatbot name");
				//Click back icon
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/button")).click();
				Thread.sleep(3000);
				
				
				//Open draft
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div[2]/div[1]")).click();
				Thread.sleep(2000);
				//Click back icon
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/button")).click();
				Thread.sleep(3000);
				
				//Delete draft
				//Hover
				WebElement menuElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div[2]/div[2]"));
				Actions actions = new Actions(driver);
				 actions.moveToElement(menuElement).perform();
				 Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div[2]/div[2]")).click();
				Thread.sleep(2000);
				//Confirmation popup
				driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/button[2]")).click();
				Thread.sleep(2000);
				
				

	}

}
