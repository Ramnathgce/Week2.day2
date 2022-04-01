package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
ChromeDriver driver =new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.findElement(By.linkText("Create New Account")).click();
driver.findElement(By.name("firstname")).sendKeys("Ramnath" );
driver.findElement(By.name("lastname")).sendKeys("M");
driver.findElement(By.name("reg_email__")).sendKeys("9486795282");
driver.findElement(By.name("reg_passwd__")).sendKeys("123a456b789c");

WebElement dropDown = driver.findElement(By.name("birthday_day"));
//ctrl+2+l
Select date = new Select(dropDown);
date.selectByVisibleText("8");

WebElement dropDown1 = driver.findElement(By.name("birthday_month"));
//ctrl+2+l
Select month = new Select(dropDown1);
month.selectByVisibleText("Oct");

WebElement dropDown2 = driver.findElement(By.name("birthday_year"));
//ctrl+2+l
Select year = new Select(dropDown2);
year.selectByVisibleText("1992");
driver.findElement(By.xpath("//label[text()='Male']")).click();
	
}
	}
