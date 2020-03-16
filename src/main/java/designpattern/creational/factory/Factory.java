package designpattern.creational.factory;

public class Factory {
    public static Item getItem(String type, String price, String name){
        if("cloth".equalsIgnoreCase(type)) return new ClothItem(price, name);
        else if("toy".equalsIgnoreCase(type)) return new ToyItem(price, name);

        return null;
    }

    public static void main(String[] args) {
        Item clothItem = Factory.getItem("cloth", "100", "clothes");
        Item toyItem = Factory.getItem("toy", "100", "toy");
        System.out.println(clothItem);
        System.out.println(toyItem);
    }

}
