public class GradeList {
    private int[] grades;

    public GradeList(int numberOfGrades) {
        this.grades = new int[numberOfGrades];
    }

    private GradeList(int[] grades) {
        this.grades = grades;
    }
    public int getNumberOfGrades() {
        return this.grades.length;
    }

    public int getGrade(int index) {
        return this.grades[index];
    }

    public void setGrade(int grade, int index){
        this.grades[index] = grade;
    }

    public double getAverage(){
        double sum = 0;
        for (int i = 0; i < this.grades.length; i++) {
            sum += this.grades[i];
        }
        return sum/this.grades.length;
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < this.grades.length; i++) {
            result.append(this.grades[i]).append(" ");
        }
        return result.toString();
    }

    public boolean equals(Object obj){
        if (!(obj instanceof GradeList gradeList)){
            return false;
        }
        if (this.grades.length != gradeList.grades.length){
            return false;
        }
        for (int i = 0; i < this.grades.length; i++) {
            if (this.grades[i] != gradeList.grades[i]){
                return false;
            }
        }
        return true;
    }
}
