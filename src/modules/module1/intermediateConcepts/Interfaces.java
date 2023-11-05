package modules.module1.intermediateConcepts;

public class Interfaces {


    public static class producto {
       private String name;
        private Double price;
        private String code;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public producto(String name) {
            this.name = name;
        }

        public producto(String name, Double price, String code) {
            this.name = name;
            this.price = price;
            this.code = code;
        }
       public interface Comparable<Producto> {
         void compareTo();

        }
        public static abstract class Producto implements Comparable<Producto> {

@Override
         public void compareTo(Producto){


            }
        }

    }


}
//public interface comparePrice = {
//        compare<>
//        }