import java.util.Scanner;

public class Exercise203 {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.println("What is the tax rate?");
        var tax = keyboard.nextDouble() / 100;
        var firstItemAfterTax = 80 * tax + 80;
        var secondItemAfterTax = 140 * tax + 140;
        var thirdItemAfterTax = 230 * tax + 230;
        System.out.println(firstItemAfterTax);
        System.out.println(secondItemAfterTax);
        System.out.println(thirdItemAfterTax);
    }
}
