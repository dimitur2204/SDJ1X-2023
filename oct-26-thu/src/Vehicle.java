public class Vehicle {
    private String owner;
    private double price;

    public Vehicle(String owner, double price) {
        this.owner = owner;
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getPrice() {
        return this.price;
    }

    public String toString() {
        return "Owner: " + this.owner + " Price: " + this.price;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Vehicle vehicle)) {
            return false;
        }
        Vehicle newVehicle = (Vehicle) vehicle;
        if (this.owner.equals(newVehicle.owner) && this.price == newVehicle.price) {
            return true;
        }
        return false;
    }
}