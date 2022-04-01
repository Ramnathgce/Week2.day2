package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead_Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
ChromeDriver driver =new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElement(By.id ("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
//click the lead 
driver.findElement(By.linkText("Leads")).click();
//click create lead
driver.findElement(By.linkText("Create Lead")).click();
//Give input to Company Name
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
//Give First name
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramnath");
//Give Last name
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("GCE");
//Give First name local
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ram");
//Give Department name
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
// Give description
driver.findElement(By.className("inputBox")).sendKeys("SUCCESS with TEST LEAF");
//Give email id
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ramnathgcecse@gmail.com");

//DropDown
//Select is a class
WebElement dropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
//ctrl+2+l
Select source = new Select(dropDown);
source.selectByVisibleText("New York");
//Create Button
driver.findElement(By.className("smallSubmit")).click();
// EDIT button
driver.findElement(By.linkText("Edit")).click();
//Clear Description
driver.findElement(By.id("updateLeadForm_description")).clear();
//Fill the Important filed
driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("IMPORTANT FIELD ENTRY");
// Click update button
driver.findElement(By.className("smallSubmit")).click();
//GET The title
String title = driver.getTitle();
System.out.println("The title is"+title);

	}

}
