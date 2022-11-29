

public class Main {

    public static void main(String[] argv) {
        Scene breakfastScene = new Scene(Scene.Mood.INTERESTING, Scene.LunchTime.BREAKFAST, 3);

        Human father = new Human("Папа");
        Human troll  = new Human("Муми-тролль");
        Human babyMy = new BabyMy();

        breakfastScene.persons.addPerson(father);
        breakfastScene.persons.addPerson(troll);
        breakfastScene.persons.addPerson(babyMy);

        

        Furniture woodChair = new WoodChair("Деревянный стул, который никому не нравится.");

        Material mat = father.destroy(woodChair);

        new Coffee().cook(mat);
        
        new Food("Сахар") {
            public void cook(Material mat) {
                if(mat == Material.WATER)
                    System.out.printf("%s Расстворился\n", name);
            }
        }.cook(Material.WATER);

        Food food = troll.findFood(new Food("Банка Джема") {
            @Override
            public void cook(Material mat) {
                System.out.printf("%s уже приготовлена", this.name);
            }
        });
        
        father.eat(food);
        babyMy.useAbility("Каравай хлеба", 0);
    }

}
