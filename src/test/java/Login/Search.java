package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) throws InterruptedException {
	
		//Launch the browser
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		String searchh = "gaja";
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String mail = "gajabase@mailinator.com";
		String pass = "Qwerty@123";
		String url = "https://appvance.ai/";
		// Enter the URL
		driver.get("https://websitechat-qa.netlify.app/login");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[data-cy='login-email-input']")).sendKeys(mail);
		driver.findElement(By.cssSelector("[data-cy='login-password-input']")).sendKeys(pass);
		driver.findElement(By.cssSelector("[data-cy='login-submit-button']")).click();
		System.out.println("Login Successful");
		Thread.sleep(8000);
		//Navigate to Visitor tab
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[3]/a/div[2]")).click();
		Thread.sleep(2000);
		//Click search box
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div[1]/div/input")).sendKeys(searchh);
		
		
		WebElement heading = driver.findElement(By.cssSelector("[data-cy='visitor-row-name-0']"));
		System.out.print(heading);
        String resultText = heading.getText();

        if (resultText.contains("gaja")) {
            System.out.println("Search successful: " + resultText);
        } else {
            System.out.println("Data not found");
        }
		
		
		

	}

}
