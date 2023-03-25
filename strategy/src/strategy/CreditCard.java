package strategy;

public class CreditCard implements Payment{

    private String cardName;
    private String cardNumber;
    private int cvv;
    private String type;


    @Override
    public void pay(int amount) {

    }
}
