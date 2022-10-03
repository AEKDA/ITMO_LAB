package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Volbeat extends Pokemon {

    public Volbeat(String name, int level) {
        super(name,level);
        this.setType(Type.BUG);
        this.setStats(65, 73, 75, 47, 85, 85);
        this.setMove(new ShadowBall(), new Rest(), new Facade(), new Flash());
    }
}