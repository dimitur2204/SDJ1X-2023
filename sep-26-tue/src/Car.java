public class Car {
    private String make;
    private String model;
    private String color;

    private String licenseNumber;

    private int year;

    public Car(String make, String model, String color, String licenseNumber, int year){
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNumber = licenseNumber;
        this.year = year;
    }

    public Car(String make, String model, String color, int year){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }


    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Car copy(){
        return new Car(this.make, this.model, this.color, this.licenseNumber, this.year);
    }

    public String toString(){
        return this.make + " " + this.model + " " + this.color + " " + this.licenseNumber + " " + this.year;
    }

    public boolean equals(Object other){
        if(!(other instanceof Car carToCheck)){
            return false;
        }
        return this.make.equals(carToCheck.make) && this.model.equals(carToCheck.model) && this.color.equals(carToCheck.color) && this.licenseNumber.equals(carToCheck.licenseNumber) && this.year == carToCheck.year;
    }
}
