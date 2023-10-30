package modules.module1.classes_and_objects;
public class Main {
    public static void main(String[] args){
        // my cars
        SportCar sportCar1 = new SportCar();

        //SportCar sportCar2 = new SportCar(true);

        Car car1 = new Car();
        Car car2 = new Car("shelby","cobra",1955);

        // smart outputs

        //extended class sportscar
        System.out.println("new super sport car:" + sportCar1.getBrand());
        //empty constructor.
        System.out.println("brand car 1: " + car1.getBrand() );
        System.out.println("model car 1: " + car1.getModel() );
        System.out.println("year car 1: " + car1.getYearOfManufactured() );
        car1.trhottle();
        // arguments
        System.out.println("brand car 2: " + car2.getBrand() );
        System.out.println("model car 2: " + car2.getModel() );
        System.out.println("year car 2: " + car2.getYearOfManufactured() );
        System.out.println("test brakes car 1: " + car2.brake());
        car2.trhottle();



    }



}