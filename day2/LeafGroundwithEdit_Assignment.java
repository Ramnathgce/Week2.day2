package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundwithEdit_Assignment {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();

		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		System.out.println("LEAF GROUND");

		//Is Displayed
		WebElement display = driver.findElement(By.xpath("//label[text()='Enter your email address']"));
		boolean isVisible =display.isDisplayed();
		System.out.println(isVisible);
		// is Enabled
		WebElement username =driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input"));
	    System.out.println(username.isEnabled());
	}
}
