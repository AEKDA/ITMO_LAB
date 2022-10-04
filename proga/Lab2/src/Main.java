import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class Main {
    
    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.addAlly(new Volbeat("First_1", 1));
        battle.addFoe(new Infernape("third_2", 1));
        battle.addAlly(new Chimchar("Second_1", 1));
        battle.addAlly(new Ledian("third_1", 1));
        battle.addFoe(new Ledyba("First_2", 1));
        battle.addFoe(new Monferno("Second_2", 1));
        battle.go();
    }

}
