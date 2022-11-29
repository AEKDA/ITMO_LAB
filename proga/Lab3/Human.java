import java.util.Objects;

public class Human implements Person {
    private String name;
    private Ability ability = null;
    Human(String name) {
        this.name = name;
    }
    Ability getAbility() {
        if (ability != null)
            return ability;
        else
            System.out.printf("%s ничего не умеет\n", name);
            return null;
    }
    void setAbility(Ability ability) {
        this.ability = ability;
    }
    void useAbility(String target, int countHuman) {
        System.out.printf("%s: ", name);
        ability.use(target);
        if(countHuman == 0) {
            System.out.println("Это никто не увидел");
        }
        else
            System.out.printf("Это увидело человек: %d\n", countHuman);
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat(Food food) {
        System.out.printf("%s Съел %s\n", this.name, food.getName());
    }   
    @Override
    public Material destroy(Furniture furniture) {
        System.out.printf("%s Поломал %s и получил %s\n", this.name, furniture.getName(), furniture.getMaterial().getName());
        
        return furniture.getMaterial();
        
    }
    @Override
    public Food findFood(Food food) {
        System.out.printf("%s нашел %s\n",name, food.getName());
        return food;
    } 

    @Override
    public String toString() {
        return "Human{\n" +  "name: " + getName() + "\nability:" + getAbility() + "\n}";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ability);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        else if(obj == null || getClass() != obj.getClass()) {
            return false;
        }

        return this.name.equals(((Human) obj).name) && this.ability == ((Human) obj).ability;
    }




}
