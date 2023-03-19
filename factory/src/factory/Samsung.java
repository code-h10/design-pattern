package factory;

public class Samsung extends Product{
    private String name;
    private String model;
    public Samsung(String name, String model) {
        System.out.println("삼성 TV 생성");
        this.name = name;
        this.model = model;
    }

    @Override
    public void use() {
        System.out.println("삼성 TV 시청");
    }

    public String getModel() {
        return model;
    }
    public String getName() {
        return name;
    }
}
