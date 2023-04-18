package dasturlash.uz;

import java.util.Set;

public class Order {
    private Integer number;
    private Set<String> items;

    public Order(Integer number, Set<String> items) {
        this.number = number;
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" + "number=" + number + ", items=" + items + '}';
    }
}
