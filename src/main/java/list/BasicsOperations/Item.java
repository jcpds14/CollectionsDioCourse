package main.java.list.BasicsOperations;

public class Item {
    //attributes
    private String name;
    private double price;
    private double quantity;

    public Item(String name, double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Item(String name) {
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return   "{\n" +
                "\"name\":\"" + name + "\",\n" +
                "\"price\":" + price + ",\n" +
                "\"quantity\":" + quantity + "\n" +
                "}";
    }
}