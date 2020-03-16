package designpattern.creational.factory;

public class ClothItem implements Item{
    private String price;
    private String name;

    public ClothItem(String price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
