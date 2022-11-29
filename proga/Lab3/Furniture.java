


public abstract class Furniture {
    protected String name;
    protected Material type;

    public abstract Material destroy();

    public String getName() {
        return name;
    }

    public Material getMaterial() {
        return type;
    }
}