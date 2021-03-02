public class Main {
        public static void main(String[] args) {
        Book1 book1 = new Book1();
        Book2 book2 = new Book2();
        Book2.Str str = new Book2.Str();
        System.out.println(book1.instock);
        book1.ShopOwned();
        System.out.println(book2.price);
        System.out.println(str.str);
    }
}