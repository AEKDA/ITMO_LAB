package Moves;
import ru.ifmo.se.pokemon.*;

public class SwordDance extends StatusMove {
    public SwordDance() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, +2);
    }

    @Override
    protected String describe() {
        return "использует Sword Dance";
    }
}
