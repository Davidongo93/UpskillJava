    package modules.module1.classes_and_objects;

    public class SportCar extends Car {
    private boolean isConvertible;

    public SportCar ( String brand, String model, Integer yearOfManufactured,  boolean isConvertible) {
    super(brand, model, yearOfManufactured);
    this.isConvertible = isConvertible;
    }
    @Override
        public void throttle(){
            System.out.println("high response throttle");
        }

        public SportCar() {

        }



        public void setConvertible(boolean convertible) {
            isConvertible = convertible;
        }

    }
