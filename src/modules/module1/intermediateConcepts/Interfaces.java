package modules.module1.intermediateConcepts;

public class Interfaces {


    public class product extends Comparable<Producto> {
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

            @Override
            public int compareTo(Product otherProduct){
                // decir si es mayor, menor o igual e indicar la diferencia entre el producto y el que se quiere comparar
                Double diff = this.getPrice() + otherProduct.getPrice();
                return Double.compare(this.getPrice(), otroProducto.precio);
        }

    }


}