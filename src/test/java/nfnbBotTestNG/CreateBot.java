package nfnbBotTestNG;
import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class CreateBot {
	WebDriver driver ;
	/*@Test(priority=10)
	void Signup() throws InterruptedException
	{
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
	
	*/
	
	@Test(priority=1)
	void AppLogin() throws InterruptedException
	{
			// Launch the browser
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
	}
	
	@Test(priority=2)
   void createBot() throws InterruptedException
   {  
   		String url = "https://appvance.ai/";
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div[2]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[data-cy='website-url-input']")).sendKeys(url);
		Thread.sleep(2000);
		//Upload pdf
		File file = new File("./files/Trending_QA_Tools.pdf");
		String path = file.getAbsolutePath();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(path);

		Thread.sleep(7000);
		driver.findElement(By.cssSelector("[data-cy='continue-button']")).click();
		System.out.println("Get started successfull");
		Thread.sleep(7000);
		driver.findElement(By.cssSelector("[data-cy='side-select-menu-Website']")).click();
		// enable toggle in knowledge page
		driver.findElement(By.cssSelector("[data-cy='group-toggle-switch']")).click();
		// click continue button
		driver.findElement(By.cssSelector("[data-cy='website-continue-button']")).click();
		System.out.println("Knowledge successfull");
		Thread.sleep(7000);
		// Configure page
		driver.findElement(By.cssSelector("[data-cy='website-integrate-input']")).sendKeys("https://appvance.ai/");
		System.out.println("Entered website to be integrated");
		driver.findElement(By.cssSelector("[data-cy='chatbot-name-input']")).sendKeys("Chatbot name");
		System.out.println("Entered chatbot name");
		//ATTRIBUTES TAB
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='company-name-input']")).sendKeys("NFN Labs");
				System.out.println("Attribute - Company name");
				//Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='company-address-input']")).sendKeys("Mylapore");
				System.out.println("Attribute - Address");
				//Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='about-company-textarea']")).sendKeys("We are an independent design and development platform");
				System.out.println("Attribute - About us");
				//Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='company-email-input']")).sendKeys("support@nfnlabs.in");
				System.out.println("Attribute - email");
				//Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='company-phone-input']")).sendKeys("9900998765");
				System.out.println("Attribute - phone number");
		//SOCIALS TAB
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='socials-tab']")).click();
				System.out.println("Switched to Socials tab");
				//Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='twitter-url-input']")).sendKeys("https://x.com/explore");
				System.out.println("Socials - Twitter");
				//Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='linkedin-url-input']")).sendKeys("https://www.linkedin.com/in/gaja-lakshme-036633125");
				System.out.println("Socials - Linkedin");
				//Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='instagram-url-input']")).sendKeys("https://www.instagram.com/madhu");
				System.out.println("Socials - Instagram");
		//QUESTIONS TAB
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='question-tab']")).click();
				System.out.println("Switched to Question tab");
				//Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='number-of-fars-input']")).clear();
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='number-of-fars-input']")).sendKeys("2");
				System.out.println("Enter how far user can input");
				//Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='select-trigger']")).click();
				//Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='select-item-full_name']")).click();
				System.out.println("Select name question");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='question-required-checkbox-0']")).click();
				System.out.println("Click required checkbox");
				
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[data-cy='continue-update-button']")).click();
		System.out.println("Configure chatbot Successful");
		System.out.println("Apply and create button click");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("[data-cy='save-button']")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("[data-cy='scraping-progress-close']")).click();
		
		System.out.println("Chatbot created");
		Thread.sleep(5000);
   }
	@Test(priority=3)
	void editSetup() throws InterruptedException
	{	
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
				Thread.sleep(8000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/button")).click();
				//driver.findElement(By.cssSelector("[data-cy='confirmation-dialog-confirm']")).clear();
				Thread.sleep(4000);
				driver.findElement(By.cssSelector("[data-cy='scraping-progress-close']")).click();
				Thread.sleep(4000);
	}
	@Test(priority=4)
	void editCustomize()throws InterruptedException
	{
	//Click customize button
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div[4]/div/button")).click();
	System.out.println("Click customize button");
	Thread.sleep(2000);
//Switch to customize
	driver.findElement(By.cssSelector("[data-cy='tab-layout']")).click();
	System.out.println("Switched to layout tab");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("[data-cy='chatbot-launcher-input']")).clear();
	driver.findElement(By.cssSelector("[data-cy='chatbot-launcher-input']")).sendKeys("Click me..");
	System.out.println("Updated Text");
	Thread.sleep(6000);
	driver.findElement(By.cssSelector("[data-cy='save-button']")).click(); //not working without manual refresh
	}
	
	/*@Test(priority=4)
	void DeactivateBot() throws InterruptedException
	{	
		
		//Click three dots
		driver.findElement(By.cssSelector("[data-cy='three-dots-vertical']")).click();
		Thread.sleep(2000);
		//Click deactivate option
		driver.findElement(By.cssSelector("[data-cy='deactivate-assistant']")).click();
		Thread.sleep(2000);
		//Click deactivate confirmation button
		driver.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button[2]")).click();
	}
	
	void logout() throws InterruptedException
	{
		//Click avatar icon
		driver.findElement(By.cssSelector("[data-cy='sidebar-avatar']")).click();
		Thread.sleep(2000);
		//Click logout button
		driver.findElement(By.cssSelector("[data-cy='logout-button']")).click();
		System.out.println("Logout Successful");
	}*/
}
