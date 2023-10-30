    package modules.module1.classes_and_objects;

    public class SportCar extends Car {
    private boolean isConvertible;

    public SportCar (boolean isConvertible) {
    super(brand, model, yearOfManufactured);
    this.isConvertible = isConvertible;
    }

        public SportCar() {

        }



        public void setConvertible(boolean convertible) {
            isConvertible = convertible;
        }

    }
