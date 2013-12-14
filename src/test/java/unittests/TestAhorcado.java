package unittests;

import static org.junit.Assert.*;
import model.HangMan;

import org.junit.Before;
import org.junit.Test;


public class TestAhorcado {

	HangMan ahorcado;
	
	@Before
	public void setup(){
		
	}
	
	@Test
	public void testLetraExistente(){
		String word = "pepito";
		ahorcado = new HangMan(word);
		boolean checked = ahorcado.checkCharacter('o');
		assertTrue(checked);
	}
	
	@Test
	public void testPlayUnCaracterValido(){
		String word = "hola";
		ahorcado = new HangMan(word);

		int value = ahorcado.play(word.charAt(0));
		assertEquals(String.valueOf(2), String.valueOf(value));
	}
	
	
}
