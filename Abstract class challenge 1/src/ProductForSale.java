public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    //constructor
    public ProductForSale(String type, double price, String description) {
        this.description = description;
        this.price = price;
        this.type = type;
    }

    public void printPricedItem(int qty) {
        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n", qty, price,type,description);
    }

    public double getSalesPrice(int qty) {
        return price * qty;
    }

    public abstract  void showDetails();
}
