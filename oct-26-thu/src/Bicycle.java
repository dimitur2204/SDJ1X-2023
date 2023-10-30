public class Bicycle extends Vehicle{
    private int gears;

    public Bicycle (String owner, double price, int gears) {
        super(owner, price);
        this.gears = gears;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public String toString() {
        return super.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Bicycle bicycle){
            return super.equals(bicycle) && this.gears == bicycle.gears;
        }
        return false;
    }
}
