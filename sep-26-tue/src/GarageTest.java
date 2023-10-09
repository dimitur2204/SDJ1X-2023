public class GarageTest {
    public static void main(String[] args) {
        var garage = new Garage();
        garage.park(new Car("Toyota", "Corolla", "Blue", 1999), 1);
        garage.park(new Car("BMW", "M4", "Black", 2013), 2);
        System.out.println(garage);
        garage.leaveGarage(2);
        System.out.println(garage);
        garage.park(new Car("Toyota", "Corolla", "Blue", 1999), 1);
    }
}
