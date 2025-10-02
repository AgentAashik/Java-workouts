package OopsLearning;

class Item {
    private String itemName;
    private int itemPrice;
    private int itemStock;

    public Item(String itemName, int itemPrice, int itemStock) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemStock = itemStock;
    }

    protected String getItemName() {
        return itemName;
    }
    protected int getItemPrice() {
        return itemPrice;
    }
    protected int getItemStock() {
        return itemStock;
    }
    public void displayItem() {
        System.out.println("ITEM NAME :" + getItemName());
        System.out.println("ITEM PRICE :" + getItemPrice());
        System.out.println("ITEM STOCK :" + getItemStock());
    }
}

class RelianceMart extends Item {
    public RelianceMart(String itemName, int itemPrice, int itemStock) {
        super(itemName, itemPrice, itemStock);
    }
    public void display() {
        System.out.println("-------------- RELIANCE MART ---------------");
        displayItem();
    }
}

class BigBazaar extends Item {
    public BigBazaar(String itemName, int itemPrice, int itemStock) {
        super(itemName, itemPrice, itemStock);
    }
    public void display() {
        System.out.println("-------------- BIG BAZAAR ---------------");
        displayItem();
    }
}

class StarMarket extends Item {
    public StarMarket(String itemName, int itemPrice, int itemStock) {
        super(itemName, itemPrice, itemStock);
    }
    public void display() {
        System.out.println("-------------- STAR MARKET ---------------");
        displayItem();
    }
}

public class CustomMultiLevelInheritance {
    public static void main(String[] args) {
        Item item = new Item("SUGAR", 60, 25);
        item.displayItem();
        System.out.println();

        RelianceMart rm = new RelianceMart("RICE", 55, 40);
        rm.display();
        System.out.println();

        BigBazaar bb = new BigBazaar("OIL", 120, 15);
        bb.display();
        System.out.println();

        StarMarket sm = new StarMarket("WHEAT", 80, 20);
        sm.display();
    }
}
