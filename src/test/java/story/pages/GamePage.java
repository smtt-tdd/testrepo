package story.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GamePage {


	WebDriver driver;
	
	
	public GamePage(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
	
	public void startGame(String word)
	{
		driver.get("http://localhost:8080/ahorcado/game.jsp?word=" + word);	
	}
	
	public String getWordInGame()
	{
		return this.driver.findElement(By.id("word")).getText();
	}
	
}
