package factory;

public class Sony extends Product{
    private String name;
    private String model;
    public Sony(String name, String model) {
        System.out.println("소니 TV 생성");
        this.name = name;
        this.model = model;
    }

    @Override
    public void use() {
        System.out.println("소니 TV 시청");
    }
    public String getModel() {
        return model;
    }
    public String getName() {
        return name;
    }
}
