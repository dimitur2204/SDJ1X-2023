public class ApartmentTest {
    public static void main(String[] args){
        var apartment1 = new Apartment(450.5, 1);
        var apartment2 = new Apartment(1200.4, 4);
        var apartment3 = new Apartment(2000, 7);
        apartment1.setRent(500);
        var tenant1 = new Tenant("Dimitar");
        var tenant2 = new Tenant("Mario");
        apartment1.rentTo(tenant1);
        apartment3.rentTo(tenant2);
        System.out.println(apartment1);
        System.out.println(apartment2);
        System.out.println(apartment3);
    }
}
