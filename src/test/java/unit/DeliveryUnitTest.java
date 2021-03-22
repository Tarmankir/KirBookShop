package unit;

import org.testng.annotations.Test;
import shoppingEngine.Delivery;

import static org.testng.Assert.assertEquals;
import static shoppingEngine.ShoppingPipeline.showDeliv;

public class DeliveryUnitTest {

    @Test
    void deliveryTest() {

        Delivery.DeliveryAdress devadres = new Delivery.DeliveryAdress();
        devadres.setAdress("Невский пр, дом 88");

        Delivery.DeliveryMethod devmenthod = new Delivery.DeliveryMethod();
        devmenthod.setMethod(" Курьерская служба");

        assertEquals(showDeliv(devadres, devmenthod), "Невский пр, дом 88 Курьерская служба");
    }
}
