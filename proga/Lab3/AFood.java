

public abstract class AFood {
    protected String name;

    AFood(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void cook(Material mat) {
        if(!mat.used)
            System.out.printf("%s Уже приготовлена");
            mat.used = true;
    }
}
