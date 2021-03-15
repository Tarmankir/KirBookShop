import shoppingEngine.BasisOfCheck;
import shoppingEngine.Book;
import shoppingEngine.Seller;
import shoppingEngine.ShoppingPipeline;

public class Main extends BasisOfCheck {

        //todo add at least inner class
        //todo use collections
        //todo write at least one exception
        //todo added unit tests
        //todo create own equals method for objects
        //todo practise in tdd

        public static void main(String[] args) {
                Book programmingbook = new Book();
                programmingbook.setName("Лучший учебник по Джава ");
                programmingbook.setPrice("100 руб ");

                Seller ivan = new Seller();
                ivan.setName("Иван ");
                ivan.setWorkingDay("Вторник");

                BasisOfCheck.showBasisOfCheck();

                ShoppingPipeline.showSell(programmingbook, ivan);
        }
}