package orders;

public class QuickOrder {
    public static Order makeOrder() {
        Order order = new Order();
        order.order();
        return order;
    }
}
