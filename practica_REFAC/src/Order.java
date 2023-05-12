import java.util.List;

public class Order {
    // REFACTOR: convertides les variables a "final",
    // ja que una vegada s'assignen, no necessitem assignar-les un altre cop.
    private final List<OrderLineItem> lineItems;
    private final double taxRate;

    public Order(List<OrderLineItem> lineItems, double taxRate) {
        this.lineItems = lineItems;
        this.taxRate = taxRate;
    }

    public double calculateTotalPrice() {
        double subtotal = 0.0;
        for (OrderLineItem item : lineItems) {
            subtotal += item.getPrice();
        }
//        REFACT: Inline Temp - En comptes d'assignar una variable temporal (tax) retornem directament el calcul.
//        double tax = subtotal * taxRate;
//        return subtotal + tax;
        return subtotal + subtotal * taxRate;
    }
}