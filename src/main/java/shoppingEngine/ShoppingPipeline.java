package shoppingEngine;

public class ShoppingPipeline extends BasisOfCheck {

    public static String showSell(Book book, Seller seller) {
        System.out.println("Книгу " + book.getName() + " " + book.getPrice() + "продал " + seller.getName() + " " + seller.getWorkingDay());

        BasisOfCheck.showBasisOfCheck();

        return "Книгу " + book.getName() + " " + book.getPrice() + " продал " + seller.getName() + " " + seller.getWorkingDay();
    }

    public static String showDeliv(Delivery.DeliveryAdress deliveryadress, Delivery.DeliveryMethod deliverymethod) {
        System.out.println(deliveryadress.getAdress() + deliverymethod.getMethod());

        return deliveryadress.getAdress() + deliverymethod.getMethod();
    }
}