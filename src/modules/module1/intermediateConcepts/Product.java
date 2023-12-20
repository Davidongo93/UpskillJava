package modules.module1.intermediateConcepts;

    public class Product implements Comparable<Product> {
       private String name;
        private Double price;
        private int code;

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

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public Product(String name) {
            this.name = name;
        }

        public Product(String name, Double price, int code) {
            this.name = name;
            this.price = price;
            this.code = code;
        }


        @Override
        public int compareTo(Product otherProduct) {
            // decir si es mayor, menor o igual e indicar la diferencia entre el producto y el que se quiere comparar
            return Double.compare(this.getPrice(), otherProduct.getPrice());
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", code=" + code +
                    '}';
        }
    }

