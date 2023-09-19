import java.util.Scanner;

public class Ex8 {
//    ##
//    # #
//    #  #
//    #   #
//    #    #

    public static void main(String[] args) {
        final char CHARACTER = '#';
        var keyboard = new Scanner(System.in);
        var height = keyboard.nextInt();
        for (int i = 0; i < height; i++) {
            System.out.println(CHARACTER + " ".repeat(i) + CHARACTER);
        }
    }
}
