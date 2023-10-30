package modules.module1.classes_and_objects;

//creando una clase.
public class Car {
    // las clases tiene metodos y propiedades, vamos a agregarlos.
    //las propiedades
    private String brand;
    private String model;
    private int yearOfManufactured;

    //los metodos.

    // getters, setters (encapsulamiento)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufactured() {
        return yearOfManufactured;
    }

    public void setYearOfManufactured(int yearOfManufactured) {
        this.yearOfManufactured = yearOfManufactured;
    }
// metodo de la clase completo.
    public Car(String brand, String model, int yearOfManufactured) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufactured = yearOfManufactured;
    }
// metodo de la clase vacio
    public Car() {

    }
// ejemplo de metodo para simular el acelerador.
    public void trhottle(){
        System.out.println("raaaaaan");
    }
// simulacion de freno
    String brake(){
        return "Stop!!!";
    }
}