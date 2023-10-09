public class Garage {
    private Car car1;
    private Car car2;
    public Garage(){
        this.car1 = null;
        this.car2 = null;
    }
    public boolean isParkingAreaTaken(int parkingArea){
        if (parkingArea == 1){
            return this.car1 != null;
        } else if (parkingArea == 2){
            return this.car2 != null;
        } else {
            return false;
        }
    }

    public void park(Car car, int parkingArea){
        if (parkingArea == 1 && car1 != null){
            throw new IllegalArgumentException("Parking area 1 is taken");
        }
        if (parkingArea == 2 && car2 != null){
            throw new IllegalArgumentException("Parking area 2 is taken");
        }
        if (parkingArea == 1){
            this.car1 = car;
        }
        if (parkingArea == 2){
            this.car2 = car;
        }
    }

    public Car leaveGarage(int parkingArea){
        if (parkingArea == 1){
            var savedCar = this.car1;
            this.car1 = null;
            return savedCar;
        }
        if (parkingArea == 2){
            var savedCar = this.car2;
            this.car2 = null;
            return savedCar;
        }
        return null;
    }

    public String toString(){
        return "Parking area 1: " + this.car1 + "\n" +
                "Parking area 2: " + this.car2;
    }

    public boolean equals(Object obj){
        if (!(obj instanceof Garage other)){
            return false;
        }
        return this.car1.equals(other.car1) &&
                this.car2.equals(other.car2);
    }
}
