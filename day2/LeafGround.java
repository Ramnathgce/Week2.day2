package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
//	Launch URL "http://leafground.com/pages/Link.html"
		driver.get("http://leafground.com/pages/Link.html");
		
		driver.manage().window().maximize();
		System.out.println("LEAF GROUND");
		//Using getText()
		System.out.println(driver.findElement(By.linkText("Go to Home Page")).getText());		
	    //Using getTitle
		String title= driver.getTitle();
		System.out.println(title);
		//getURL
		//String url=driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		//getPageSource
		String pgsource=driver.getPageSource();
		System.out.println(pgsource);
		
		
	}

}
