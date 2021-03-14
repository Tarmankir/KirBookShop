public class ShoppingPipeline {

    public static void showSell(Book book, Seller seller) {
        System.out.println("Книгу " + book.getName() + book.getPrice() + "продал " + seller.getName() + seller.getWorkingDay());
    }

}