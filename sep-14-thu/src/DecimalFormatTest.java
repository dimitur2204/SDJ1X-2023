import java.text.DecimalFormat;

public class DecimalFormatTest {
    public static void main(String[] args){
        var number = 123456.789;
        var formatter = new DecimalFormat("000.00");
        var cyrillic = '\'';
        System.out.println((int)cyrillic);
        System.out.println(formatter.format(number));
    }
}
