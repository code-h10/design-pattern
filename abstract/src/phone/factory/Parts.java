package phone.factory;

public abstract class Parts {
    private String manufacturing;
    private String country;

    public Parts(String manufacturing, String country) {
        this.manufacturing = manufacturing;
        this.country = country;
    }
    public abstract void assemble();
}
