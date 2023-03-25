package strategy;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Item> cart;

    public Cart() {
        cart = new ArrayList<>();
    }

    public void add(Item item) {
        cart.add(item);
    }

    public void remove(Item item) {
        cart.remove(item);
    }

    public int totalAmount() {
        int result = 0;
        for (Item i : cart) {
            result += i.getPrice();
        }
        return result;
    }

}
