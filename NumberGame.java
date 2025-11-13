import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        char playAgain;

        do {
            int secretnumber = rand.nextInt(100) + 1;
            int attempts = 0, myguess = 0;
            boolean won = false;

            System.out.println("\nGuess the number (1-100)! You have 7 attempts.");

            while (attempts < 7) {
                System.out.print("Enter your guess: ");
                myguess = sc.nextInt();
                attempts++;

                if (myguess == secretnumber) {
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                    won = true;
                    break;
                } else if (myguess > secretnumber)
                    System.out.println("Too high!");
                else
                    System.out.println("Too low!");
            }

            if (!won) System.out.println("Out of attempts! The number was " + secretnumber + ".");

            System.out.print("Play again? (y/n): ");
            playAgain = sc.next().toLowerCase().charAt(0);

        } while (playAgain == 'y');
        System.out.println("Thanks for playing!");
        sc.close();
    }
}