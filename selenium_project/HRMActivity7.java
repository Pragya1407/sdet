package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HRMActivity7 {
	
	WebDriver driver;
	Actions act;

	@BeforeClass
		  public void beforeClass() {
			  driver= new FirefoxDriver();
			  driver.get("http://alchemy.hguy.co/orangehrm");
			  
			  act = new Actions(driver);
			  driver.findElement(By.id("txtUsername")).sendKeys("orange");
			  driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
			  driver.findElement(By.id("btnLogin")).click();
			  
	}
		
  @Test
  public void f() throws InterruptedException {
//Find the “My Info” menu item and click it.
	 // WebElement MyInfo= driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']/b"));
	  //MyInfo.click();
	  WebElement element = driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']/b"));
      JavascriptExecutor executor = (JavascriptExecutor)driver;
      executor.executeScript("arguments[0].click();", element);
	  
//Scroll the Page
     
     //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
     // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//a[text()='Qualifications']")));
      //executor.executeScript("window.scrollBy(0,1000)");
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("javascript:window.scrollBy(250,350)");
      Thread.sleep(10000);
	  WebElement Qualification=driver.findElement(By.xpath("(//a[text()='Qualifications'])[2]"));
	  //WebElement q = dr.findElement(By.linkText("Qualifications"));
     //WebElement Qualification= driver.findElement(By.xpath("//a[@href='/orangehrm/symfony/web/index.php/pim/viewQualifications/empNumber/1']"));
	   
	// ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Qualification); 
	 Qualification.click();
	 
//Add Work Experience and click Save
	 driver.findElement(By.id("addWorkExperience")).click();
	 driver.findElement(By.id("experience_employer")).sendKeys("IBM");
	 driver.findElement(By.id("experience_jobtitle")).sendKeys("Test Specialist-Automation");
	 WebElement FromDate= driver.findElement(By.id("experience_from_date"));
	 FromDate.clear();
	 FromDate.sendKeys("2020-02-02");
	 WebElement ToDate= driver.findElement(By.id("experience_to_date"));
	 ToDate.clear();
	 ToDate.sendKeys("2021-02-02");
	 driver.findElement(By.id("experience_comments")).sendKeys("Selenium Automation Activity 7");
	 driver.findElement(By.id("btnWorkExpSave")).click();
	  
  }
  
  @AfterClass
  public void afterClass() {
	  //driver.close();
  }
     
}
