public class MyDate {
        private int day;
        private int month;
        private int year;

        public MyDate(){
            this.day = 1;
            this.month = 1;
            this.year = 2000;
        }

        public MyDate(int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public void displayDate() {
            System.out.println(this);
        }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    }
}
