import java.util.Scanner;

public class Challenge4P146 {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.println("How many rows do you want?");
        var numberOfRows =  keyboard.nextInt();
        var numberOfSpaces = numberOfRows - 1;
        var numberOfStars = 1;
        for (var i = 0; i < numberOfRows; i++) {
            for (var j = 0; j < numberOfSpaces; j++) {
                System.out.print(" ");
            }
            for (var j = 0; j < numberOfStars; j++) {
                System.out.print("*");
            }
            System.out.println();
            numberOfSpaces--;
            numberOfStars += 2;
        }
        numberOfSpaces = 1;
        numberOfStars = numberOfRows * 2 - 3;
        for (var i = 0; i < numberOfRows; i++) {
            for (var j = 0; j < numberOfSpaces; j++) {
                System.out.print(" ");
            }
            for (var j = 0; j < numberOfStars; j++) {
                System.out.print("*");
            }
            System.out.println();
            numberOfSpaces++;
            numberOfStars -= 2;
        }
    }
}
