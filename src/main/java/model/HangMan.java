package model;

public class HangMan {

	String gameWord;

	int retryNum, status;

	// pierde, gana, repetido, valido, invalido
	// -1, 0, 1, ,2, 3

	public HangMan(String word) {
		gameWord = word;
		retryNum = gameWord.length();
	}

	public boolean checkCharacter(char c) {
		return (gameWord.lastIndexOf(c) >= 0);
	}

	public boolean isWinner() {
		return false;
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
			retryNum--;
			if (isLoser()) {
				return -1;
			} else {
				return 3;
			}
		}
	}

	public boolean isLoser() {
		return (retryNum == 0);
	}

	public boolean isUsedLetter(char c) {
		return false;
	}
}
