package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();

		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		System.out.println("LEAF GROUND");
		
		// get CSS Value
				WebElement css= driver.findElement(By.xpath("//button[text()='What is my size?']"));
				String color=css.getCssValue("background-color");
				System.out.println("The color is:" + color);
		//get Attribute
		WebElement att = driver.findElement(By.xpath("//button[text()='Go to Home Page']"));
		String output= att.getAttribute("onclick");
		System.out.println("GetATTRIBUTE o/p is"+output);
		//getlocation
WebElement loc =driver.findElement(By.xpath("//label[text()='Find position of button (x,y)']"));
System.out.println(loc.getLocation());
//getsize
WebElement size= driver.findElement(By.xpath("//button[text()='What is my size?']"));
System.out.println(size.getSize());
//getTagname
WebElement In =driver.findElement(By.xpath("//button[text()='What color am I?']"));
	String output2 =In.getTagName();
	System.out.println(output2);

	
	
	}

}
