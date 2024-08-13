import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List <Order> orders;
    private List<MenuItem> menu;

    public Restaurant() {
        this.orders = new ArrayList<>();
        this.menu = new ArrayList<>();
    }
    public List<Order>getOrders() {
        return orders;
    }
    public void setOrders(List<Order>orders) {
        this.orders = orders;
    }

    public List<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(List<MenuItem> menu) {
        this.menu = menu;
    }
    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }
    public void placeOrder(Order order) {
        orders.add(order);
    }
    public Order getOrderById(int orderId) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                return order;
            }
        }
        throw new
                IllegalArgumentException("Ваш заказ не найдено");
    }
    public void completeOrder(int orderId) {
        Order order = getOrderById(orderId);
        if (order.isCompleted()) {
            throw new
                    IllegalArgumentException("Заказ уже выполнен ");
        }
        order.completeOrder();
    }
}
