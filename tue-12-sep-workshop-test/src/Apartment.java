public class Apartment {
    private double rent;
    private int numberOfRooms;
    private Tenant tenant;
    public Apartment(double rent){
        this.rent = rent;
        this.numberOfRooms = 1;
        this.tenant = null;
    }

    public Apartment(double rent, int numberOfRooms){
        this.rent = rent;
        this.numberOfRooms = numberOfRooms;
        this.tenant = null;
    }

    public double getRent() {
        return rent;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public boolean isAvailable(){
        if (tenant == null){
            return true;
        }
        else {
            return false;
        }
    }

    public void rentTo(Tenant tenant){
        if (this.isAvailable()){
            this.tenant = tenant;
        }
    }

    public void evict(){
        this.tenant = null;
    }

    public String toString(){
        var roomsString = numberOfRooms == 1 ? "room" : "rooms";
        if (this.isAvailable()){
            return "Apartment with " + numberOfRooms + " " + roomsString + ", rent " + rent + ", no tenant";
        }
        else {
            return "Apartment with " + numberOfRooms + " " + roomsString + ", rent " + rent + ", tenant: " + tenant.getName();
        }
    }
}
