public enum Material {
    METAL, WOOD, COMBINE, WATER;

    String getName() {
        String[] array = {"Металл","Дерево","Combine", "Вода"};
        return array[this.ordinal()];
    }
    boolean used;
} 