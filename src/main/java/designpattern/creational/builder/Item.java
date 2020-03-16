package designpattern.creational.builder;

public class Item {
    private String price;
    private String name;
    private boolean isOnSale;
    private boolean specialEdition;

    public String getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public boolean isOnSale() {
        return isOnSale;
    }

    public boolean isSpecialEdition() {
        return specialEdition;
    }

    private Item(ItemBuilder builder) {
        this.price = builder.price;
        this.name = builder.name;
        this.isOnSale = builder.isOnSale;
        this.specialEdition = builder.specialEdition;
    }

    public static class ItemBuilder {
        private String price;
        private String name;
        private boolean isOnSale;
        private boolean specialEdition;

        public ItemBuilder(String price, String name) {
            this.price = price;
            this.name = name;
        }

        public ItemBuilder setOnSale(boolean onSale) {
            isOnSale = onSale;
            return this;
        }

        public ItemBuilder setSpecialEdition(boolean specialEdition) {
            this.specialEdition = specialEdition;
            return this;
        }

        public Item build() {
            return new Item(this);
        }
    }
}
