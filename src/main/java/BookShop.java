public abstract class BookShop implements Ideology {
    public int quantity;
    public int price;
    public boolean instock;

    public BookShop() {
        quantity = 10;
        price = 100;
        instock = true;
    }
}