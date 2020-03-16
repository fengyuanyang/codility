package designpattern.creational.factory.abstractfactory;

import designpattern.creational.factory.Item;
import designpattern.creational.factory.ToyItem;

public class ToyFactory implements ItemAbstractFactory {
    private String price;
    private String name;

    public ToyFactory(String price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public Item createItem() {
        return new ToyItem(price, name);
    }
}
