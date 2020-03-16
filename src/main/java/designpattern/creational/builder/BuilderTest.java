package designpattern.creational.builder;

public class BuilderTest {
    public static void main(String[] args){
        Item item = new Item.ItemBuilder("123", "clothes").setOnSale(false).setSpecialEdition(true).build();
        System.out.println(item.getName());
        System.out.println(item.getPrice());
        System.out.println(item.isOnSale());
        System.out.println(item.isSpecialEdition());
    }
}
