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

    public void setPrice(Integer price) throws PriceExeption {
        this.price = price;
        if (this.price == 0) throw new PriceExeption("Цена не должна быть 0");
    }

    public Integer getPrice() {
        return price;
    }
}