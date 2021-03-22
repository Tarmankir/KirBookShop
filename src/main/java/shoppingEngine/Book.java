package shoppingEngine;

public class Book {

    private String name;
    private Integer price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(Integer price) {
        this.price = price;
        try {
            this.price = 0;
        } catch (AbstractMethodError e) {
            System.out.println("Цена не может быть 0");
        }
    }

    public Integer getPrice() {
        return price;
    }
}