package singleton;

import java.security.Signature;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("singleton1 and singleton2 are different.");
        } else {
            System.out.println("singleton1 and singleton2 are same");
        }
        System.out.println("End");
    }
}
