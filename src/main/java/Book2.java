public class Book2 extends BookShop {
    @Override
    public void ShopOwned() {
        System.out.println("Эта книга в магазине и опечатана");
    }

    public Book2() {
        instock = true;
    }

    public static class Str {
        public int str;

        public Str() {
            str = 199;
        }
    }
}