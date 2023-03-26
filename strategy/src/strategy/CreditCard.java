package strategy;

public class CreditCard implements Payment{

    private String cardName;
    private String cardNumber;
    private int cvv;
    private CardType type;

    public CreditCard(String cardName, String cardNumber, int cvv, CardType type) {
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.type = type;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Magnetic");
    }
}
