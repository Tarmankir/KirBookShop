public class Main extends BasisOfCheck {

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