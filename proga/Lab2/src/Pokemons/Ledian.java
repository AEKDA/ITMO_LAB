package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Ledian extends Pokemon {

    public Ledian(String name, int level) {
        super(name,level);
        this.setType(Type.BUG, Type.FLYING);
        this.setStats(55, 35, 50, 55, 110, 85);
        this.setMove(new Agility(), new SwordDance(), new SilverWind(), new FocusBlast());
    }
    
}
