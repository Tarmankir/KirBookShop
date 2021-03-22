package shoppingEngine;

public class Delivery {

    public static class DeliveryAdress {

        private String adress;

        public void setAdress(String adress) {
            this.adress = adress;
        }

        public String getAdress() {
            return adress;
        }

    }

    public static class DeliveryMethod {

        private String method;

        public void setMethod(String method) {
            this.method = method;
        }

        public String getMethod() {
            return method;
        }

    }
}