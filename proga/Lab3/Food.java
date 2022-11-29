

public abstract class Food {
    protected String name;

    Food(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract void cook(Material mat);
}
