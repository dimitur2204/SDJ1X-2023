import java.util.Scanner;

//In math a quadratic equation is given as: 0
//        2
//        ax + bx + c =
//        For such an equation the determinant (D) is defined as D b 4ac
//        2
//        = − and the solution to
//        the equation can then be calculated as:
//         If D<0, there is no solution
//         If D=0, there is one solution:
//        a
//        b
//        x
//        2
//        = −
//         If D>0, there are two solutions:
//        a
//        b D
//        x
//        2
//        1
//        − +
//        = and
//        a
//        b D
//        x
//        2
//        2
//        − −
//        =
//    Create a program that asks the user to input values for a, b and c, then calculates the
//    solutions (if any) to a quadratic equation defined by those values, and prints them out.
//    Remember that in Java the square root of a number is found by: Math.sqrt(number).
public class Ex6 {
    public static void main(String[] args){
        var keyboard = new Scanner(System.in);
        System.out.println("Enter a, b and c");
        var a = keyboard.nextInt();
        var b = keyboard.nextInt();
        var c = keyboard.nextInt();
        var d = b * b - 4 * a * c;
        if (d <  0){
            System.out.println("No solution");
        } else if (d == 0){
            var x = -b / (2 * a);
            System.out.println(x);
        } else {
            var x1 = (-b + Math.sqrt(d)) / (2 * a);
            var x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}
