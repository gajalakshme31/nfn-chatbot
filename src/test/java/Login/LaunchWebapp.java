package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchWebapp {

	public static void main(String[] args) {
		

		//Launch the browser
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Enter the URL
		driver.get("https://nfnchatbot.netlify.app/login");
		//Validate page title
		
		String actual_title = driver.getTitle();
		if (actual_title.equals("NFN Chatbot"))
		{
			System.out.println("Title matched");
		}
		else
		{
			System.out.println("Title not matched");
		}
		

		driver.findElement(By.name("email")).sendKeys("gaja@mailinator.com");
		driver.findElement(By.name("password")).sendKeys("Qwerty@123");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/form/button[1]")).click();
		System.out.println("Login Successful");
		
		//Login failure - Invalid password
				System.out.println(driver.findElement(By.cssSelector("p.text-xs")).getText());
				
//close the browser
		//driver.close();
	}

}


