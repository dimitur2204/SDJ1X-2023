import java.util.Scanner;

public class PayrollTest {
    public static void main(String[] args){
        var employee1 = new Payroll();
        var keyboard = new Scanner(System.in);
        var name = keyboard.nextLine();
        var hours = keyboard.nextInt();
        var payRate = keyboard.nextDouble();
        employee1.setName(name);
        employee1.setHours(hours);
        employee1.setPayRate(payRate);
        System.out.println(employee1);
    }
}
