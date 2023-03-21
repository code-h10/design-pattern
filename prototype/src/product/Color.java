package product;

public class Color {
    private String colorName;
    public Color(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public String toString() {
        return "Color{" +  "colorName='" + colorName + '\'' + '}';
    }
}
