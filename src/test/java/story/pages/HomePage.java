package story.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	
	public HomePage(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
	
	public void home()
	{
		this.driver.get("http://localhost:8080/ahorcado");
	}
	
	
	public void setWord(String word)
	{
	
		 this.driver.findElement(By.id("word")).sendKeys(word);
		 this.driver.findElement(By.id("go")).click();
		
	}
}
