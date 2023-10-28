package modules.module1.classes_and_objects;
public class Main {
    public static void main(String[] args){
        Car car1 = new Car();
        Car car2 = new Car("shelby","cobra",1955);
        System.out.println("brand car 2: " + car2.getBrand() );
        System.out.println("model car 2: " + car2.getModel() );
        System.out.println("year car 2: " + car2.getYearOfManufactured() );
        System.out.println("test brakes car 1: " + car2.brake());
        car2.trhottle();
    }
}