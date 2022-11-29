


public abstract class AFurniture {
    protected String name;
    protected Material type;

    public void destroy() {
        System.out.println("Этот предмет нельзя сломать");
    }

    public String getName() {
        return name;
    }

    public Material getMaterial() {
        return type;
    }
}