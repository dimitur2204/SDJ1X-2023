import java.util.Scanner;

public class Ex2 {

    //        Write a program that reads a gender (char 'M' or 'F') and an age (int) from the keyboard
//        and then prints a message (Hint: for some reason there is no nextChar() method when
//        using a Scanner object, so first read a String with the nextLine() method and then use
//        charAt(0) on the String to extract the first char).
//        The message should depend on the typed values, in the following way:
//        If gender is not either 'M' or 'F' or age is less than 0 display the message: "Error in
//        typed values".
//        If gender is 'M' and age is less than 18 display the message: "Boy".
//        If gender is 'M' and age is greater than or equal to 18 display the message: "Man".
//        If gender is 'F' and age is less than 18, display the message: "Girl".
//        If gender is 'F' and age is greater than or equal to 18 display the message:
//        "Woman".
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        var age = keyboard.nextInt();
        var gender = keyboard.next().charAt(0);
        if ((gender != 'M' && gender != 'F') || age < 0) {
            System.out.println("Error in typed values");
        }
        if (gender == 'M' && age <= 18) {
            System.out.println("Boy");
        }
        if (gender == 'M' && age > 18) {
            System.out.println("Man");
        }
        if (gender == 'F' && age < 18) {
            System.out.println("Girl");

        }
        if (gender == 'F' && age > 18) {
            System.out.println("Woman");
        }
    }
}
