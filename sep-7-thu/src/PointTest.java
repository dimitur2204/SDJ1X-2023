public class PointTest {
    public static void main(String[] args){
        var point1 = new Point(1, 2);
        var point2 = new Point(12, 44);
        System.out.println(point1);
        System.out.println(point2);
        var distance = Point.distance(point1, point2);
        System.out.println(distance);
    }
}
