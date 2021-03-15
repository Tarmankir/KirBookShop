package unit;

import org.testng.annotations.Test;
import shoppingEngine.Buyer;

import static org.testng.Assert.assertEquals;

public class BuyerTest {

    @Test
    void carNumberTest() {
        Buyer buyer = new Buyer();

        int id = 051503;

        assertEquals(buyer.getId(), id);
    }
}
