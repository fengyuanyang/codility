package designpattern.creational.factory.abstractfactory;

import designpattern.creational.factory.ClothItem;
import designpattern.creational.factory.Item;

public class ClothFactory implements ItemAbstractFactory {
    private String price;
    private String name;

    public ClothFactory(String price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public Item createItem() {
        return new ClothItem(price, name);
    }
}
