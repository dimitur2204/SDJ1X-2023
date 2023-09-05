public class Student {
    private String name;
    private Gender gender;

    private int studentNumber;

    public Student(String name, Gender gender, int studentNumber){
        this.name = name;
        this. gender = gender;
        this.studentNumber = studentNumber;
    }

    public Student(String name, Gender gender){
        this.name = name;
        this. gender = gender;
        this.studentNumber = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String toString(){
        return String.format("%s, ‘%s’, %d", this.name, this.gender, this.studentNumber);
    }
}
