package designpattern.creational.factory;

public class ToyItem implements Item{
    private String price;
    private String name;

    public ToyItem(String price, String name) {
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
