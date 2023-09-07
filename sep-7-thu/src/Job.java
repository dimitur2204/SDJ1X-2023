public class Job {
    public String jobTitle;
    public double monthlySalary;
    public Person employee;

    public Job(String jobTitle, double monthlySalary, Person employee){
        this.jobTitle = jobTitle;
        this.monthlySalary = monthlySalary;
        this.employee = employee;
    }
    public Job(String jobTitle, double monthlySalary){
        this.jobTitle = jobTitle;
        this.monthlySalary = monthlySalary;
        this.employee = null;
    }

    public void givePercentageRaise(double percentage){
        this.monthlySalary += this.monthlySalary * percentage / 100;
    }

    public String toString(){
        return String.format("Job Title: %s, Monthly Salary: %.2f, Employee: %s", this.jobTitle, this.monthlySalary, this.employee);
    }
}
