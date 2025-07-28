package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditSetup {

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


	}

}
