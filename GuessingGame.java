

public class GuessingGame {
	final private int MaxGueses = 10;
	final private int Min = 1;
	final private int Max = 100;
	private int GuessCount;
	private int CorrectNo;
	private boolean GameWon;
	
	
	public GuessingGame(int CorrectNum) {
		
		if (CorrectNum >= Max) {
			CorrectNum = Max;
		}else if (CorrectNum <= Min) {
			CorrectNum = Min;
		}else {
			this.CorrectNo = CorrectNum;
		}
		GuessCount = 0;
		GameWon = false;
	}
	public void guess(int userGuess) {
		if (!gameOver()) {
			GuessCount+=1 ;
			if (userGuess == CorrectNo) {
				System.out.println("It's Correct :)");
				GuessCount=10;
			}else if (userGuess >= CorrectNo) {
				System.out.println("To High!");
			}else if (userGuess<= CorrectNo) {
				System.out.println("To Low...");
			}
		}		
	}
	
	public int guessRemaining() {
		return MaxGueses - GuessCount;
	}
	
	public boolean gameOver() {
		if (GameWon) {
			return true;
		}else {
			return (GuessCount >= MaxGueses);
		}
	}
}
