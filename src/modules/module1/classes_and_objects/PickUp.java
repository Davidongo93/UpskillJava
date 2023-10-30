package modules.module1.classes_and_objects;

public class PickUp extends Car{
    private int seats;
    // overcharged method
    public PickUp(String brand){
        super(brand);
    }
    public PickUp(String brand, String model, Integer yearOfManufactured, int seats) {
        super(brand, model, yearOfManufactured);
        this.seats = seats;

    }
    @Override
    public void throttle(){
        System.out.println("a climber has borned");
    }

    public PickUp() {
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}

