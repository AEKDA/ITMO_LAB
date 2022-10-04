package pokemons;
import ru.ifmo.se.pokemon.*;
import moves.*;

public class Ledyba extends Pokemon {
    public Ledyba(String name) {
        super(name,29);
        this.setType(Type.BUG, Type.FLYING);
        this.setStats(40, 20, 30, 40, 80, 55);
        this.setMove(new Agility(), new SwordDance(), new SilverWind());
    }
}
