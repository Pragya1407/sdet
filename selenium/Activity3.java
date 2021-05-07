package SeleniumProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		
		//Get the title of the page 
		String title = driver.getTitle();
		System.out.println("Title of the webpage is : " +title);
		
		WebElement firstName= driver.findElement(By.id("firstName")); 
		firstName.sendKeys("Durga");
	    driver.findElement(By.id("lastName")).sendKeys("Kundu");
		driver.findElement(By.id("email")).sendKeys("durgakundu2009@gmail.com");
	    driver.findElement(By.id("number")).sendKeys("9062892415");
		
		//WebElement submit= driver.findElement(By.cssSelector(".ui.green.button"));
		driver.findElement(By.xpath("//input[@value='submit']")).click();
				//driver.close();
		
	}

}
