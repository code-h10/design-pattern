package html.listfactory;

import html.factory.Item;
import html.factory.Tray;

import java.util.Iterator;

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<li>\n");
        builder.append(caption + "\n");
        builder.append("<ul>\n");

        Iterator it = tray.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            builder.append(item.makeHtml());
        }

        builder.append("</ul>\n");
        builder.append("</li>\n");
        return builder.toString();
    }
}
