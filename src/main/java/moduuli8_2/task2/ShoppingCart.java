package moduuli8_2.task2;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {


    private Map<String, Double> items = new HashMap<>();

    public void addItem(String item, double price) {
        // Code to add item to the shopping cart
        items.put(item, price);

    }

        public void removeItem(String name) {
            // Code to remove item from the shopping cart
            items.remove(name);
        }

        public int getItemCount() {
            // Code to return the number of items in the shopping cart
            return items.size();
        }

        public double getTotalPrice() {
        return items.values().stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        }


}
