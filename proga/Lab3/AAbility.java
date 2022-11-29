public abstract class AAbility implements IAbility {
    private String name;
    AAbility(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void use(String target) {
        System.out.printf("%s: %s", name, target);
    }
}
