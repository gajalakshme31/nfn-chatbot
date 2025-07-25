package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditChatbot {

	public static void edit() throws InterruptedException {
		//Launch the browser
				//ChromeDriver driver = new ChromeDriver();
				WebDriver driver = new ChromeDriver();
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				//Enter the URL
				driver.get("https://app.websitechat.in/login");
				driver.manage().window().maximize();
				driver.findElement(By.name("email")).sendKeys("gajaprod@mailinator.com");
				driver.findElement(By.name("password")).sendKeys("Qwerty@123");
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/form/button[1]")).click();
				System.out.println("Login Successful");
				Thread.sleep(6000);
				
				driver.findElement(By.xpath("//*[@id=\"menu::rc::trigger\"]")).click();
				//*[@id="menu::r5::trigger"]
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"edit\"]")).click();
				Thread.sleep(2000);
				//Click continue button
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div/div/div[3]/button[2]")).click();
				Thread.sleep(5000);
				// Scroll page
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				//Fill attribtes - Company name
				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/main/div/div/form/div/div[1]/div[2]/div[4]/div[2]/div/div[1]/input")).sendKeys("NFN Labs");
			
				//Fill attribtes - Address
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/main/div/div/form/div/div[1]/div[2]/div[4]/div[2]/div/div[2]/input")).sendKeys(" Address ");
				//Fill Attributes - About us
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/main/div/div/form/div/div[1]/div[2]/div[4]/div[2]/div/div[3]/textarea")).sendKeys("About us");
				//Fill Attribtes - email
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/main/div/div/form/div/div[1]/div[2]/div[4]/div[2]/div/div[4]/input")).sendKeys("gajalakshme@nfnla.in");
				//Fill Attributes - Phone number
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/main/div/div/form/div/div[1]/div[2]/div[4]/div[2]/div/div[5]/input")).sendKeys("9360116855");
				//Click continue button
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div/form/div/div[2]/div[2]/button[2]")).click();
				//Select dark theme
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/main/div/div/form/div/div[1]/div[2]/div[2]/div[1]/div/div[2]/div[2]")).click();
			
				
				/*Thread.sleep(2000);
				System.out.println("enter text");
				driver.findElement(By.xpath("//*[@id=\":r1a:\"]")).sendKeys("re");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\":r1b:\"]")).sendKeys("re");
				Thread.sleep(2000);
				*/
				//Click update button
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div/form/div/div[2]/div[2]/div/button[2]")).click();
	}

}
