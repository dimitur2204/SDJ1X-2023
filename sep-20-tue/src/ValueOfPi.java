import java.text.DecimalFormat;

public class ValueOfPi {
    public static void main(String[] args) {
//        var pi = 0.0;
//        var sign = 1;
//        for (int i = 1; i < 10000; i+=2) {
//            if (sign == 1){
//                sign = 0;
//                pi += 1.0 / i;
//            } else {
//                sign = 1;
//                pi -= 1.0 / i;
//            }
//        }
//        System.out.println("Pi: " + pi * 4);
        var pi = 0.0;
        var isPiEqual = false;
        final double DECIMAL_PLACES = 0.000001;

        var sign = 1;
        var i = 1;
        while (!isPiEqual){
            if (sign == 1){
                sign = 0;
                pi += 1.0 / i;
            } else {
                sign = 1;
                pi -= 1.0 / i;
            }
            var piRounded = Math.round(4 * pi / DECIMAL_PLACES) * DECIMAL_PLACES;
            i+=2;
            isPiEqual = piRounded == Math.round(Math.PI / DECIMAL_PLACES) * DECIMAL_PLACES;
        }
        System.out.println("Pi: " + Math.round(pi * 4 / DECIMAL_PLACES) * DECIMAL_PLACES);
        System.out.println("i: " + i);
    }

}
