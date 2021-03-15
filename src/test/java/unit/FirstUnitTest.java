package unit;

import org.testng.Assert;
import org.testng.annotations.Test;
import shoppingEngine.Book;
import shoppingEngine.Seller;

import static org.testng.Assert.assertEquals;
import static shoppingEngine.ShoppingPipeline.showSell;

public class FirstUnitTest {

    @Test
    void shoppingPipelineTest() {
        Book book = new Book();
        book.setName("Name");
        book.setPrice("123");

        Seller seller = new Seller();
        seller.setName("Name");
        seller.setWorkingDay("123");

        assertEquals(showSell(book, seller), "Книгу Name 123 продал Name 123");
    }
}
