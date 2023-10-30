package modules.module1.classes_and_objects;
public class Main {
    public static void main(String[] args){
        // my cars
        SportCar sportCar1 = new SportCar();

        SportCar sportCar2 = new SportCar("audi","a8", 2001, true);

        //Car car1 = new Car();
        //Car car2 = new Car("shelby","cobra",1955);
PickUp pickUp1 = new PickUp("ford", "f150",2020,5);
        // smart outputs

        //extended class sportscar
        System.out.println("new super sport car:" + sportCar1.getBrand());
      // car abstract and sportscar instanciated
        System.out.println("super sport car builded:" + sportCar2.getModel());
sportCar2.throttle();

// the pickup
        System.out.println("the new no instantiated car is a pickup brand:" + pickUp1.getBrand());
        System.out.println("the new no instantiated car model:" + pickUp1.getBrand());
        System.out.println("the new no instantiated car year:" + pickUp1.getYearOfManufactured());
        pickUp1.throttle();


    }



}