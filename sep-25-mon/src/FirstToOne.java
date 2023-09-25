import java.util.Scanner;

public class FirstToOne {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.println("Enter the die's limit");
        var die = new Die(keyboard.nextInt());
        keyboard.nextLine();
        System.out.println("Enter Player 1's name");
        var player1 = new Player(keyboard.nextLine(), die);
        System.out.println("Enter Player 2's name");
        var player2 = new Player(keyboard.nextLine(), die);
        while (!player1.isWinner() && !player2.isWinner()) {
            player1.play();
            player2.play();
        }

        if (player1.isWinner()) {
            System.out.println(player1.getName() + " wins!");
        } else {
            System.out.println(player2.getName() + " wins!");
        }
    }
}
