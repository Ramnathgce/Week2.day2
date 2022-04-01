package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundwithcheck_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();

		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		System.out.println("LEAF GROUND");
//is Selected
		WebElement agree = driver.findElement(By.xpath("//input[@type='checkbox']"));
			System.out.println(agree.isSelected());
		boolean selected = driver.findElement(By.xpath("(//div[@class='example'])[4]/input[3]")).isSelected();
			System.out.println(selected);

	}

}
