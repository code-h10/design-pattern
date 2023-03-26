package strategy;

public class NaverPay implements Payment{

    private String id;
    private String password;

    public NaverPay(String id, String password) {
        this.id = id;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("QR");
    }
}
