package factory;

public class Lg extends Product{
    private String name;
    private String model;

    public Lg(String name, String model) {
        System.out.println("LG TV 생성");
        this.name = name;
        this.model = model;
    }
    @Override
    public void use() {
        System.out.println("LG TV 시청");
    }

    public String getModel() {
        return model;
    }
    public String getName() {
        return name;
    }
}
