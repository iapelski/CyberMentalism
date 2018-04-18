import java.util.Random;
import java.util.Scanner;

public class GuessMachine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int guessMachine = random.nextInt(100) +1;
		int guessPlayer = -1;
		int counter = 0;
		
		System.out.println("I have number in my system, guess which one");
		
		while(guessPlayer != guessMachine) {
			try {
				guessPlayer = Integer.parseInt(scan.nextLine());
			}catch (Exception e) {
				System.out.println("hahaha, try again");
				continue;
			}
			if (guessPlayer > guessMachine) {
				System.out.println("Smaller!");
			}else if(guessPlayer < guessMachine) {
				System.out.println("Bigger!");
			}
			counter ++;
		}
		System.out.println("Nice! It is my number, after " + counter + " tries.");
		scan.close();
	}
	
	
}
