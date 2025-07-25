package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		driver.findElement(By.xpath("//*[@id=\"inbox_pane\"]/div[3]/div/div[4]/div/div/table")).click();
		Thread.sleep(5000);
		//Click on the verification link
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/a")).click();
		/*WebElement verificationLink = driver.findElement(By.xpath("/html/body/a"));
        String linkUrl = verificationLink.getAttribute("href");
        System.out.println("Verification Link: " + linkUrl);

        // Open the verification link in a new tab
        driver.get(linkUrl);
		
		*/
		
		}
		
	}


