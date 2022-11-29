import java.util.Objects;

public class WoodChair extends Furniture {
    
    WoodChair(String name) {
        this.name = name;
        this.type = Material.WOOD;
    }
    @Override
    public Material destroy() {
        return this.type;
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.type);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        else if(obj == null || getClass() != obj.getClass()) {
            return false;
        }

        return this.name.equals(((WoodChair) obj).name) && this.type.equals(((WoodChair) obj).type);
    }
    @Override
    public String toString() {
        return "Scene{\n" +  "name: " + this.name + "\ntype:" + this.type + "\n}";
    }

}