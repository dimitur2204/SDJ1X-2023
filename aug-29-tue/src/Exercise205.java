public class Exercise205 {
    public static void main(String[] args) {
        var keyboard = new java.util.Scanner(System.in);
        System.out.println("Write three test scores.");
        var testScore1 = keyboard.nextDouble();
        var testScore2 = keyboard.nextDouble();
        var testScore3 = keyboard.nextDouble();
        var average = (testScore1 + testScore2 + testScore3) / 3;
        System.out.println("The average of the three test scores is " + average);
    }
}
