package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HRMActivity4 {
	
	WebDriver driver;
	WebDriverWait wait;
	@BeforeClass
		  public void beforeClass() {
			  driver= new FirefoxDriver();
			  driver.get("http://alchemy.hguy.co/orangehrm");
			  wait=new WebDriverWait(driver,20);
 
			 driver.findElement(By.id("txtUsername")).sendKeys("orange");
			 driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
			 driver.findElement(By.id("btnLogin")).click();
			  
	}
  @Test
  public void f() throws InterruptedException {
//Find the PIM option in the menu and click it
	 WebElement PIM=driver.findElement(By.id("menu_pim_viewPimModule"));
	 // WebElement PIM=driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b"));
		 
	  wait.until(ExpectedConditions.visibilityOf(PIM));
	  PIM.click();
	  PIM.click();
//Click the Add button to add a new Employee.
	 WebElement Add=driver.findElement(By.id("btnAdd"));
	 Add.click();
//Fill in the required fields and click Save.
	 driver.findElement(By.id("firstName")).sendKeys("Durga");
	 driver.findElement(By.id("lastName")).sendKeys("Kundu");
	 driver.findElement(By.id("btnSave")).click();
//Navigate back to the PIM page (Employee List tab) and verify the creation of youremployee.
	 driver.findElement(By.id("menu_pim_viewPimModule")).click();
	 //PIM.click();
	 //PIM.click();
	 Thread.sleep(100);
	 driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Durga Kundu");
	 driver.findElement(By.id("searchBtn")).click();
	 WebElement Name=driver.findElement(By.cssSelector(".odd > td:nth-child(3) > a")); 
	 Assert.assertTrue(Name.isDisplayed());
  }
  @AfterClass
  public void afterClass() {
	driver.close();
  }
   
}
