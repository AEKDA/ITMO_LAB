import java.util.Objects;

public class Coffee extends Food {
    Coffee() {
        super("Кофе");
    }
    @Override
    public void cook(Material mat) {
        if(mat == Material.WOOD) {
            System.out.printf("Сварил %s\n", name);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        else if(obj == null || getClass() != obj.getClass()) {
            return false;
        }

        return this.name.equals(((Coffee) obj).name);
    }
    @Override
    public String toString() {
        return "Cofee{\n" +  "name: " + this.name + "\n}";
    }
}
