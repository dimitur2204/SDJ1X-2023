import java.util.Scanner;

public class DriverExamTest {
    public static void main(String[] args) {
        System.out.println("Started a driver's exam. Write your answers one by one");
        var keyboard = new Scanner(System.in);
        var responses = new char[20];
        for (int i = 0; i < 20; i++) {
            System.out.printf("Question %d: ", i + 1);
            var response = keyboard.nextLine().charAt(0);
            responses[i] = response;
        }
        char[] answers = {'A', 'A', 'C', 'B', 'D', 'A', 'B', 'C', 'A', 'D', 'A', 'B', 'B', 'A', 'D', 'C', 'C', 'D', 'B', 'A'};
        var exam = new DriverExam();
        exam.setAnswers(answers);
        exam.setResponses(responses);
        System.out.println("Total correct: " + exam.totalCorrect());
        System.out.println("Total incorrect: " + exam.totalIncorrect());
        System.out.println("Total missed: " + exam.questionsMissed());
        System.out.println("Passed: " + exam.passed());
    }
}
