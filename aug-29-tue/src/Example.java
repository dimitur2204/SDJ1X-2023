import java.io.IOException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name");
        var name = keyboard.nextLine();
        System.out.println("How many hours did you work this week?");
        var hours = keyboard.nextInt();
        System.out.println("What is your hourly pay rate?");
        var hourlyPayRate = keyboard.nextDouble();
        System.out.println("Hello " + name + ", your gross pay is $" + hours * hourlyPayRate);
    }
}
