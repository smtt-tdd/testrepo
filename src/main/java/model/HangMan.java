package model;

public class HangMan {

	
	public int MAX_TRIES = 4;
	

	char[] letters;
	char[] lettersDisplay;
	char[] lettersUsed;
	int lettersUsedCount = 0;
	
	int lettersRemaining = 0;
	int currentTries = 0; 
		
	String gameWord;

	int  status;

	// pierde, gana, repetido, valido, invalido
	// -1, 0, 1, ,2, 3

	public HangMan(String word) {
		gameWord = word;
		//retryNum = gameWord.length();
				
		
		lettersUsed = new char[1000];		
		letters = new char[word.length()];
		lettersDisplay = new char[word.length()];
		lettersRemaining = word.length();
		for (int i = 0; i < lettersDisplay.length; i++) {
			lettersDisplay[i]='-';
		}
		
	}

	public boolean checkCharacter(char c) {
		boolean result = false;

		for (int i = 0; i < letters.length; i++) {
			if(c==letters[i])
			{
				result = true;
				lettersDisplay[i] = c;
				lettersRemaining--;
			}
		}	
		return result;
	}

	public boolean isWinner() {
		return (lettersRemaining == 0);
	}

	public int play(char c) {

		if (isUsedLetter(c)) {
			return 1;
		} else if (checkCharacter(c)) {
			if (isWinner()) {
				return 0;
			} else {
				return 2;
			}
		} else {
			currentTries++;
			if (isLoser()) {
				return -1;
			} else {
				return 3;
			}
		}
	}

	public boolean isLoser() {
		return (MAX_TRIES == currentTries);
	}

	public boolean isUsedLetter(char c) {

		boolean result = false;
		
		for (int i = 0; i < this.lettersUsed.length; i++) {
			if(c==this.lettersUsed[i])
			{
				result = true;
				break;
			}
		}	
		
		return result;	
	}
	

	public String GetDiscoveredLetters()
	{
		return new String(this.lettersDisplay);
	}
}
