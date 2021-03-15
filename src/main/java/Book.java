public class Book {

    private String name;
    private String price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() throws NullPointerException {
        try {
            return price;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Everything is fine now!");
        }
    }

}