import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        var keyboard = new Scanner(System.in);
        System.out.print("Type an integer: ");
        var input1 = keyboard.nextInt();
        System.out.print("Type a second integer: ");
        var input2 = keyboard.nextInt();
        System.out.print("Type a third integer: ");
        var input3 = keyboard.nextInt();
        System.out.print("Type a fourth integer: ");
        var input4 = keyboard.nextInt();
        System.out.print("Type your name: ");
        var name = keyboard.next();
        System.out.println("Hi " + name + ", here are the results of the calculations");
        var sum = input1 + input2;
        var product = input2 * input3;
        var difference = input3 - input4;
        double quotient = (double) input4 / input1;
        double sumOfCalculations = sum + product + difference + quotient;
        System.out.println("The sum of (" + input1 + "+" + input2 + ") is " + sum);
        System.out.println("The product of (" + input2 + "*" + input3 + ") is " + product);
        System.out.println("The difference of (" + input3 + "-" + input4 + ") is " + difference);
        System.out.println("The quotient of (" + input4 + "/" + input1 + ") is " + quotient);
        System.out.println("The sum of all calculations is " + sumOfCalculations);
    }
}
