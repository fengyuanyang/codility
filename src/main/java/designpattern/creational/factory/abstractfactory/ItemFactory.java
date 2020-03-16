package designpattern.creational.factory.abstractfactory;

import designpattern.creational.factory.ClothItem;
import designpattern.creational.factory.Item;
import designpattern.creational.factory.ToyItem;

public class ItemFactory {
    public static Item getItem(ItemAbstractFactory factory){
        return factory.createItem();
    }

//    public static void main(String[] args) {
//        Item clothItem = ItemFactory.getItem(new ClothFactory("100", "clothes"));
//        Item toyItem = ItemFactory.getItem(new ToyFactory("100", "toy"));
//        System.out.println(clothItem);
//        System.out.println(toyItem);
//    }
}
