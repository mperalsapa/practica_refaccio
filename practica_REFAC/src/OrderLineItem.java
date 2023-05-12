public class OrderLineItem {
    // REFACTOR: convertides les variables a "final",
    // ja que una vegada s'assignen, no necessitem assignar-les un altre cop.
    private final String productName;
    private final int quantity;
    private final double price;

//    REFACTOR: Generats els getters per productName i quantity
    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public OrderLineItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    public double getPrice() {
        return price * quantity;
    }
}