package Pokemons;
import Moves.*;

public class Infernape  extends Monferno {

    public Infernape(String name, int level) {
        super(name,level);
        this.setStats(76, 104, 71, 104, 71, 108);
        this.addMove(new RockTomb());
    }
    
}
