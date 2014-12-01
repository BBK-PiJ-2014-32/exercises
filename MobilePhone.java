public class MobilePhone extends OldPhone {

	public void rignAlarm(String){
		int x = Integer.parseInt(String);
		System.out.println("Wake up it's: " + x);
	}

	public void playGame(String){
		int numberToGuess = (int)(1000 * Math.random());
		int guessnum = 0;
		int guess = 0;
		System.out.println("Try to guess my number!");
		while (guess != numberToGuess){
			System.out.print("Tell me a number: ");
			String str = System.console().readLine();
			guess = Integer.parseInt(str);
				if (guess > numberToGuess){
					System.out.println("No! My number is lower.");
					guessnum++;
				} else {
					System.out.println("No! My number is higher.");
					guessnum++;
					}
		}
		System.out.println("CORRECT!");
		System.out.println("You needed " + guessnum + " guesses.");
	}
}