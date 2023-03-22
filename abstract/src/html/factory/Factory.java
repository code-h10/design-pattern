package html.factory;

public abstract class Factory {
    public static Factory getFactory(String className) {
        Factory factory = null;

        try {
            factory = (Factory)Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            System.out.println("Class Not Found." + className);
        }
        return factory;
    }
    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
