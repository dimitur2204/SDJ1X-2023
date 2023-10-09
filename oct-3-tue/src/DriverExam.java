public class DriverExam {
    private final int PASS_TRESHOLD = 15;
    private char[] answers = new char[20];
    private char[] responses = new  char[20];

    public void setAnswers(char[] answers) {
        this.answers = answers;
    }

    public void setResponses(char[] responses) {
        this.responses = responses;
    }

    public int totalCorrect() {
        int total = 0;
        for (int i = 0; i < this.answers.length; i++) {
            if (this.answers[i] == this.responses[i]) {
                total++;
            }
        }
        return total;
    }

    public int totalIncorrect(){
        int total = 0;
        for (int i = 0; i < this.answers.length; i++) {
            if (this.answers[i] != this.responses[i]){
                total++;
            }
        }
        return total;
    }

    public int questionsMissed(){
        int total = 0;
        for (char response : this.responses) {
            if (response == 0) {
                total++;
            }
        }
        return total;
    }

    public boolean passed(){
        var total = 0;
        for (int i = 0; i < this.answers.length; i++) {
            if (this.answers[i] == this.responses[i]) {
                total++;
            }
        }
        return total >= PASS_TRESHOLD;
    }

}
