public class Payroll {
    private String name;
    private int hours;
    private double payRate;
    public Payroll(){
        this.name = null;
        this.hours = 0;
        this.payRate = 0;
    }

    public Payroll(String name, int hours, double payRate){
        this.name = name;
        this.hours = hours;
        this.payRate = payRate;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getGrossPay() {
        return hours * payRate;
    }

    public int getHours() {
        return hours;
    }

    public String getName() {
        return name;
    }

    public double getPayRate() {
        return payRate;
    }

    public String toString() {
        return String.format("Name: %s, Hours: %d, Pay Rate: %.2f, Gross Pay: %.2f", name, hours, payRate, getGrossPay());
    }
}
