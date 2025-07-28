package Login;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Enter the URL
		driver.get("https://websitechat-qa.netlify.app/login");
		Thread.sleep(5000);
		//driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form/div[2]/p")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/input")).sendKeys("gaja1@mailinator.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/button")).click();
		Thread.sleep(5000);
		//driver.close();
		// Open a new tab
        ((JavascriptExecutor) driver).executeScript("window.open()");

        // Switch to the new tab
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        // Open another URL in the new tab
		driver.get("https://www.mailinator.com/");
		
		driver.findElement(By.id("search")).sendKeys("gaja1@mailinator.com");
		driver.findElement(By.xpath("/html/body/div[1]/header[1]/div[1]/div/div/div[1]/div/button")).click();
		Thread.sleep(5000);
		//driver.findElement(By.className("ng-binding")).click();
		//Click on the email
		driver.findElement(By.xpath("(//tr[@ng-repeat='email in emails'])[1]/td[3]")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		//Click on the verification link
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Your Email')]")).click();
		/*WebElement verificationLink = driver.findElement(By.xpath("/html/body/a"));
        String linkUrl = verificationLink.getAttribute("href");
        System.out.println("Verification Link: " + linkUrl);

        // Open the verification link in a new tab
        driver.get(linkUrl);
		
		*/
		
		Thread.sleep(3000);
		Set<String> ids = driver.getWindowHandles();
		for (String string : ids) {
			driver.switchTo().window(string);
		}
		Thread.sleep(3000);
		String pass = "Qwerty@321";
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(pass);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(pass);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[data-cy='submit-password-button']")).sendKeys("NFN Labs");
		
		//Login with new password
		driver.findElement(By.cssSelector("[data-cy='login-email-input']")).sendKeys("gaja1@mailinator.com");
		driver.findElement(By.cssSelector("[data-cy='login-password-input']")).sendKeys(pass);
		driver.findElement(By.cssSelector("[data-cy='login-submit-button']")).click();
		System.out.println("Login Successful with new password");
		}
		
	}
//submit-password-button
//a[contains(text(),'Your Email')]
