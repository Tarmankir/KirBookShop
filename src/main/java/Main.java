import shoppingEngine.*;

import java.util.Arrays;

public class Main extends BasisOfCheck {

        //todo added unit tests
        //todo create own equals method for objects

        public static void main(String[] args) throws PriceExeption {

                Book programmingbook = new Book();
                programmingbook.setName(BookStorage.bookInStorege());
                try {
                        programmingbook.setPrice(0);
                } catch (PriceExeption exp) {
                        exp.printStackTrace();
                }

                Seller ivan = new Seller();
                ivan.setName("Иван ");
                ivan.setWorkingDay("Вторник");

                BasisOfCheck.showBasisOfCheck();

                ShoppingPipeline.showSell(programmingbook, ivan);

                Delivery.DeliveryAdress devadr1 = new Delivery.DeliveryAdress();
                devadr1.setAdress("Улица Пушкина, дом Колотушкина");

                Delivery.DeliveryMethod devment1 = new Delivery.DeliveryMethod();
                devment1.setMethod(" Почта России");

                ShoppingPipeline.showDeliv(devadr1, devment1);
        }
}