package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
//		  1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id ("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//	  5. Click on contacts Button

		driver.findElement(By.linkText("Contacts")).click();
		  
	//	  6. Click on Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
				
	//	  7. Enter FirstName Field Using id Locator
		driver.findElement(By.id("ffirstNameField")).sendKeys("Ramnath");
	//	  8. Enter LastName Field Using id Locator
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("M"); 
	//	  9. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Ram");	  
	//	  10. Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Nachiar"); 
	//	  11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("CSE"); 
	//	  12. Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createContactForm_description")).sendKeys("Welcome to next stage");  
      //  13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("ramnathgcecse@gmail.com");  
	//  14. Select State/Province as NewYork Using Visible Text
	WebElement dropDown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		//ctrl+2+l
		Select state = new Select(dropDown);
          state.selectByVisibleText("New York");
		//  15. Click on Create Contact
		  driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		// 16. Click on edit button 
		  driver.findElement(By.linkText("Edit")).click();
		//  17. Clear the Description Field using .clear 
		  driver.findElement(By.id("updateContactForm_description")).clear();
	    // 18. Fill ImportantNote Field with Any text
		  driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important description");
		// 19. Click on update button using Xpath locator
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
				  			  
		// Get the Title of Resulting Page.
       
		  String title = driver.getTitle();
		  System.out.println("The title is"+title);

	}

}
