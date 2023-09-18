public class MyClockTest {

    public static void main(String[] args){
        var time = new MyClock(23, 59, 59);
        var timeForDifference = new MyClock(22, 59, 59);
        timeForDifference.tic();
        System.out.println(time);
        System.out.println(timeForDifference);  
        time.setTimeFormat(12);
        System.out.println(time);
        System.out.println(time.isBefore(timeForDifference));
    }

}
