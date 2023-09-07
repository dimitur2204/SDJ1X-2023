public class JobTest {
    public static void main(String[] args) {
        var person = new Person("Dimitar", "02/04/2002");
        var job = new Job("Software Engineer", 1000, person);
        job.jobTitle = "Software Developer";
        System.out.println(job);
        job.givePercentageRaise(10.5);
        System.out.println(job);
        var job2 = new Job("Software Engineer", 1000);
        System.out.println(job2);
    }
}