package Login;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateBot {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String mail = "r@mailinator.com";
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
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='company-address-input']")).sendKeys("Mylapore");
				System.out.println("Attribute - Address");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='about-company-textarea']")).sendKeys("We are an independent design and development platform");
				System.out.println("Attribute - About us");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='company-email-input']")).sendKeys("support@nfnlabs.in");
				System.out.println("Attribute - email");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='company-phone-input']")).sendKeys("9900998765");
				System.out.println("Attribute - phone number");
		//SOCIALS TAB
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='socials-tab']")).click();
				System.out.println("Switched to Socials tab");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='twitter-url-input']")).sendKeys("https://x.com/explore");
				System.out.println("Socials - Twitter");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='linkedin-url-input']")).sendKeys("https://www.linkedin.com/in/gaja-lakshme-036633125");
				System.out.println("Socials - Linkedin");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='instagram-url-input']")).sendKeys("https://www.instagram.com/madhu");
				System.out.println("Socials - Instagram");
		//QUESTIONS TAB
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='question-tab']")).click();
				System.out.println("Switched to Question tab");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='number-of-fars-input']")).clear();
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='number-of-fars-input']")).sendKeys("2");
				System.out.println("Enter how far user can input");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='select-trigger']")).click();
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='select-item-full_name']")).click();
				System.out.println("Select name question");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='question-required-checkbox-0']")).click();
				System.out.println("Click required checkbox");
				
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[data-cy='continue-update-button']")).click();
		System.out.println("Configure chatbot Successful");
		
		//CUSTOMIZE TAB
				Thread.sleep(2000);
				
				/*
				driver.findElement(By.cssSelector("[data-cy='tab-general']")).click();
				System.out.println("Switched to general tab");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='font-select']")).click();
				System.out.println("Click font dropdown");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='font-select-3']")).click();
				System.out.println("Choose font");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='font-size-select']")).click();
				System.out.println("Click font size dropdown");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='font-size-select-3']")).click();
				System.out.println("Choose font size");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='tab-layout']")).click();
				System.out.println("Switched to general tab");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[data-cy='tab-chat']")).click();
				System.out.println("Click font dropdown");
				Thread.sleep(2000);
				*/
				
				
		System.out.println("Apply and create button click");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[data-cy='save-button']")).click();
		System.out.println("Chatbot created");

	}

}
