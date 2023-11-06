import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentListTemplate {
    public static void main(String[] args) {
        HashMap<String, String> placeholders = new HashMap<String, String>();
        placeholders.put("$title", "Students");
        placeholders.put("$header", "Students");
        placeholders.put("$paragraph1", "This is a table of students here");
        placeholders.put("$tableHeader1", "First Name");
        placeholders.put("$tableHeader2", "Last Name");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(10, "Ivan", "Dimitrov"));
        int counter = 1;
        for (Student student :
                students) {
            String key = "$tableData" + counter;
            counter++;
            placeholders.put(key, student.getFirstName());
            key = "$tableData" + counter;
            placeholders.put(key, student.getLastName());
        }
        try {
            FileInputStream fileInputStream = new FileInputStream("html-template/template.html");
            FileOutputStream fileOutputStream = new FileOutputStream("html-template/populated.html");
            PrintWriter writer = new PrintWriter(fileOutputStream);
            Scanner scanner = new Scanner(fileInputStream);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                for (String placeholder : placeholders.keySet()) {
                    String entry = placeholders.get(placeholder);
                    if (line.contains(placeholder)) {
                        line = line.replace(placeholder, entry);
                    }
                }
                writer.println(line);
            }
            writer.close();
        } catch (FileNotFoundException ex) {
            System.exit(1);
        }
    }
}
