package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead_Assignment {

	public static void main(String[] args) throws InterruptedException {
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
//click find lead
driver.findElement(By.linkText("Find Leads")).click();
//Click on phone
driver.findElement(By.linkText("Phone")).click();
//Enter the ph.no
driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9486795282");

//Click find leads button
driver.findElement(By.linkText("Find Leads")).click();

//Capture lead-id of first resulting lead
String capture = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
System.out.println("The captured id is" +capture);

//Click first resulting lead
driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
// Click delete
driver.findElement(By.linkText("Delete")).click();
//Click find lead
driver.findElement(By.linkText("Find Leads")).click();

//Enter captured lead-id
driver.findElement(By.name("id")).sendKeys(capture);
	
//click find leads button
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

/*Verify message "No records to display" in the Lead List.
This message confirms the successful deletion*/
Thread.sleep(3000);
String capture1= driver.findElement(By.xpath("//div[text()='No records to display']")).getText();

if (capture1.contains("No records")) 
{
	System.out.println("Deletion of lead-id success");
}
else {
	System.out.println("Lead-id Not deleted");
}
driver.close();

//Close the browser (Do not log out)
//driver.manage().window().close();
	
	}
	}
