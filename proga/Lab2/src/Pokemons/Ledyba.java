package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Ledyba extends Pokemon {
    public Ledyba(String name, int level) {
        super(name,level);
        this.setType(Type.BUG, Type.FLYING);
        this.setStats(40, 20, 30, 40, 80, 55);
        this.setMove(new Agility(), new SwordDance(), new SilverWind());
    }
}