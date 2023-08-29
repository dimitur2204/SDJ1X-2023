import java.util.Scanner;

public class Challenge12P147 {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.println("What is your favourite city?");
        var favouriteCity = keyboard.nextLine();
        var numberOfCharacters = favouriteCity.length();
        var uppercaseName = favouriteCity.toUpperCase();
        var lowercaseName = favouriteCity.toLowerCase();
        var firstChar  = favouriteCity.charAt(0);
        System.out.println("Your favourite city is " + favouriteCity);
        System.out.println("Number of characters: " + numberOfCharacters);
        System.out.println("Uppercase: " + uppercaseName);
        System.out.println("Lowercase: " + lowercaseName);
        System.out.println("First character: " + firstChar);

    }
}
