//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        MenuItem pizza = new MenuItem("Pizza", 450.99);
        MenuItem burger = new MenuItem("Burger", 12.5);

        restaurant.addMenuItem(pizza);
        restaurant.addMenuItem(burger);

        Order order1 = new Order(1, " Sasha ");
        order1.getItems().add(pizza);
        order1.getItems().add(burger);
        restaurant.placeOrder(order1);

        System.out.println("Order 1 total: $ " + order1.calculateTotal());

        try {
            restaurant.completeOrder(1);
            System.out.println("Заказ 1 зовершен ");
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            restaurant.completeOrder(1);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            restaurant.completeOrder(2);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}