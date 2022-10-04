package pokemons;
import moves.*;

public class Infernape  extends Monferno {

    public Infernape(String name) {
        super(name);
        this.setStats(76, 104, 71, 104, 71, 108);
        this.addMove(new RockTomb());
    }
    
}
