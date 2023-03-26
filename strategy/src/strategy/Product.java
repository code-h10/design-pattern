package strategy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Product {

    private String name;
    private String number;
    private String barCode;
    private String expiredDate;
    private int price;
    private ProductType type;

    public Product(String name, String number, String barCode, String expiredDate, int price, ProductType type) {
        this.name = name;
        this.number = number;
        this.barCode = barCode;
        this.expiredDate = expiredDate;
        this.price = price;
        this.type = type;
    }

    public String getExpiredDate() {
        return expiredDate;
    }
    public String getNumber() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getBarCode() {
        return barCode;
    }

}
