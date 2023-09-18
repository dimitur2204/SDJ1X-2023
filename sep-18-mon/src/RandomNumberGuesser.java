import java.util.Random;

public class RandomNumberGuesser {
    public static void main(String[] args) {
        var numberToGuess = new Random().nextInt(1000);
        var keyboard = new java.util.Scanner(System.in);
        System.out.println("Enter your guess:");
        var guess = keyboard.nextInt();
        var attempts = 1;
        while (guess != numberToGuess) {
            attempts++;
            if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
            System.out.println("Enter your guess:");
            guess = keyboard.nextInt();
        }
        System.out.printf("You guessed it in %d attempts !\uD83D\uDE80%n", attempts);
    }
}
