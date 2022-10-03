package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Monferno extends Chimchar {

    public Monferno(String name, int level) {
        super(name,level);
        this.addType(Type.FIGHTING);
        this.setStats(64, 78, 52, 78, 52, 81);
        this.addMove(new SlackOff());
    }
    
}
