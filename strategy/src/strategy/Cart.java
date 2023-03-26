package strategy;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> cart;

    public Cart() {
        cart = new ArrayList<>();
    }

    public void add(Product product) {
        cart.add(product);
    }

    public void remove(Product product) {
        cart.remove(product);
    }

    public int totalAmount() {
        int result = 0;
        for (Product i : cart) {
            result += i.getPrice();
        }
        return result;
    }

    public void pay(Payment payment) {
        int totalAmount = totalAmount();
        payment.pay(totalAmount);
    }

}
