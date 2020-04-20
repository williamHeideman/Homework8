package homework5;

public class Supplies extends Account {

    private int numberOfItems;
    private double pricePerItem;

    public Supplies(int id, int numberOfItems, double pricePerItem) {
        super(id);
        this.numberOfItems = numberOfItems;
        this.pricePerItem = pricePerItem;
    	}

    public Supplies(int id) {
        super(id);
        numberOfItems = 0;
        pricePerItem = 0;
    	}

    public double getPricePerItem() {
        return pricePerItem;
    	}

    public int getNumberOfItems() {
        return numberOfItems;
    	}

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    	}

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    	}

    public double calculateSales() {
        return getNumberOfItems() * getPricePerItem();
    	}

    public String toString() {
        return super.toString() + "\nItem Price: $" + getPricePerItem() + "\n" +
                "Items sold: " + getNumberOfItems() + "\nTotal Sales: $" + calculateSales()+"\n";
    	}
}