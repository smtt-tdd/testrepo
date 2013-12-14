package story.steps;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import story.pages.GamePage;
import story.pages.HomePage;
import static org.junit.Assert.*;

public class AhorcadoSteps {

	WebDriver webdriver;
	HomePage hPage;
	GamePage gPage;
	String word;
	
	@BeforeScenario
	public void setupWebDriver() {
		webdriver=new FirefoxDriver();
	}
	
	@AfterScenario
	public void closeWebDriver() {
		webdriver.close();
	}
	
	//Scenario 1
		
	@Given("quiero jugar ahorcado")
	public void givenQuieroJugarAhorcado() {
	  // PENDING
		hPage = new HomePage(webdriver);
		hPage.home();
	}

	@When("escribo una palabra")
	public void whenEscriboUnaPalabra() {
	  // PENDING
	   hPage.setWord("HOLA");
	}

	@Then("inicia el juego")
	public void thenIniciaElJuego() {
	  
		gPage = new GamePage(webdriver);
		String word = gPage.getWordInGame();
		assertEquals("HOLA", word);
	}

	//Scenario 2
	
	@Given("jugando")
	public void givenJugando() {
	  // PENDING
		//gPage = new GamePage(webdriver);
		//gPage.startGame(word);
	}

	@When("ingreso una letra")
	public void whenIngresoUnaLetra() {
	  // PENDING
	}

	@Then("verifico la existencia en la palabra")
	public void thenVerificoLaExistenciaEnLaPalabra() {
	  // PENDING
	}

	
	//Scenario 3	
	
	@When("ingreso una letra existente")
	public void whenIngresoUnaLetraExistente() {
	  // PENDING
	}

	@Then("muestra la letra en la palabra escondida")
	public void thenSeMuestraLaLetraEnLaPalabraEscondida() {
	  // PENDING
	}

	//Scenario 4
	
	@When("ingreso una letra que no existe")
	public void whenIngresoUnaLetraQueNoExiste() {
	  // PENDING
	}

	@Then("descuenta un intento disponible")
	public void thenSeDescuentaUnIntentoDisponible() {
	  // PENDING
	}

	//Scenario 5
	
	@When("ingreso la letra que falta por descubrir")
	public void whenIngresoLaLetraQueFaltaPorDescubrir() {
	  // PENDING
	}

	@Then("gano el juego")
	public void thenGanoElJuego() {
	  // PENDING
	}

	//Scenario 6
	
	@Given("jugando y no se tienen intentos disponibles")
	public void givenJugandoYNoSeTienenIntentosDisponibles() {
	  // PENDING
	}

	@Then("pierdo el juego")
	public void thenPierdoElJuego() {
	  // PENDING
	}

	//Scenario 7

	@When("ingreso una letra que ya fue ingresada")
	public void whenIngresoUnaLetraQueYaFueIngresada() {
	  // PENDING
	}

	@Then("muestra advertencia de letra repetida")
	public void thenMuestraAdvertenciaDeLetraRepetida() {
	  // PENDING
	}

}
