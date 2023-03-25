package strategy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {

    private String productName;
    private String productNumber;
    private LocalDateTime expiredDate;
    private int price;
    private int type;

    public Item(String productName, String productNumber, LocalDateTime expiredDate, int price, int type) {
        this.productName = productName;
        this.productNumber = productNumber;
        this.expiredDate = expiredDate;
        this.price = price;
        this.type = type;
    }

    public String getExpiredDate() {
        return expiredDate.format(DateTimeFormatter.BASIC_ISO_DATE);
    }

    public String getProductNumber() {
        return productNumber;
    }
    public int getPrice() {
        return price;
    }

}
