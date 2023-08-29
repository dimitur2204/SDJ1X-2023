import java.util.Scanner;

public class Exercise204 {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        var name = keyboard.nextLine();
        System.out.println("What is your age?");
        var age = keyboard.nextInt();
        System.out.println("What is your address?");
        var address = keyboard.nextLine();
        System.out.println("Hello " + name + ", you are " + age + " years old, and you live at " + address);
    }
}
