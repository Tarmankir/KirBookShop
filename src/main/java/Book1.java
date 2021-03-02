public class Book1 extends BookShop {
    @Override
    public void ShopOwned() {
        System.out.println("Эта книга в магазине и опечатана");
    }

    public Book1() {
        instock = false;
    }
}