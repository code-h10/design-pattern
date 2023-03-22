package html.anonymouse;

import html.factory.Factory;
import html.factory.Link;
import html.factory.Page;
import html.factory.Tray;

public class Main {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory("html.listfactory.ListFactory");
        Link joon = factory.createLink("중앙일보", "https://www.joongang.co.kr/");
        Link hani = factory.createLink("한겨레", "https://www.hani.co.kr/");

        Link naver = factory.createLink("Naver", "https://www.naver.com");
        Link google = factory.createLink("Google", "https://www.google.com");
        Link apple = factory.createLink("Apple", "https://www.apple.com");

        Tray trayNews = factory.createTray("신문");
        trayNews.add(joon);
        trayNews.add(hani);


        Tray trayCompany = factory.createTray("기업");
        trayCompany.add(naver);
        trayCompany.add(google);
        trayCompany.add(apple);

        Page page = factory.createPage("PatterStudy", "패턴공부");
        page.add(trayCompany);
        page.add(trayNews);
        page.output();


    }
}
