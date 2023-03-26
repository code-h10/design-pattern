package strategy;

public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart();

        Product product1 = new Product("사이다", "FESA1", "00001010", "2023-12-31", 10000, ProductType.beverages);
        Product product2 = new Product("콜라", "CP421", "0010110", "2023-01-13", 11000, ProductType.beverages);

        cart.add(product1);
        cart.add(product2);

        cart.pay(new NaverPay("test", "test"));
        cart.pay(new CreditCard("Kakao", "421412341234123", 998, CardType.Check));

    }
}
