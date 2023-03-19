package factory;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Factory factory = new TelevisionFactory();
        Product samsung = factory.create("samsung", "T12FS");
        Product lg = factory.create("lg", "LF521");
        Product sony = factory.create("sony", "S942FV");

        samsung.use();
        lg.use();
        sony.use();

    }
}
