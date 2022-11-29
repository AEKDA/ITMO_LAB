public class BabyMy extends Human {
    BabyMy() {
        super("Малышка Мю");
        super.setAbility(new Ability() {
            @Override
            public String getName() {
                return "Прорыть туннель";
            }
            @Override
            public void use(String target) {
                System.out.printf("%s: %s\n", getName(), target);
            }

        });
    }

    @Override
    public String toString() {
        return "BabyMy{\n" + "name: " + this.getName() + "\nability:" + this.getAbility() + "\n}";
    }

}
