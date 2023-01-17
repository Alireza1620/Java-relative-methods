
public class Tester {

	public static void main(String[] args) {
		GuessingGame gg = new GuessingGame(23);
		Tamagochi tam = new Tamagochi();
		
		
		gg.guess(21);
		System.out.println("Remain chance is: " + gg.guessRemaining());
		gg.guess(24);
		System.out.println("Remain chance is: " + gg.guessRemaining());
		gg.guess(21);
		System.out.println("Remain chance is: " + gg.guessRemaining());
		gg.guess(21);
		System.out.println("Remain chance is: " + gg.guessRemaining());
		
		// Use correct value and Game is Over.
		/*gg.guess(23);
		System.out.println("Remain chance is: " + gg.guessRemaining());*/
		
		//Use wrong value and continue until the Game reaches max guess and is Over.
		/*gg.guess(21);
		System.out.println("Remain chance is: " + gg.guessRemaining());*/
		
		
		gg.guess(21);
		System.out.println("Remain chance is: " + gg.guessRemaining());
		gg.guess(21);
		System.out.println("Remain chance is: " + gg.guessRemaining());
		gg.guess(21);
		System.out.println("Remain chance is: " + gg.guessRemaining());
		gg.guess(21);
		System.out.println("Remain chance is: " + gg.guessRemaining());
		gg.guess(21);
		System.out.println("Remain chance is: " + gg.guessRemaining());
		
		
		System.out.println();
		
		
		System.out.println(tam.getMood());
		tam.pet();
		tam.pet();
		System.out.println(tam.getMood());
		tam.passTime();
		tam.passTime();
		tam.passTime();
		tam.passTime();
		tam.passTime();
		tam.passTime();
		tam.passTime();
		tam.passTime();
		tam.passTime();
		tam.passTime();
		tam.passTime();
		tam.passTime();
		System.out.println(tam.getMood());
		tam.feed();
		System.out.println(tam.getMood());
		tam.clean();
		System.out.println(tam.getMood());
		tam.pet();
		//tam.pet();
		System.out.println(tam.getMood());
	}
	

}
