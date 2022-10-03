package Moves;
import ru.ifmo.se.pokemon.*;


public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        Status pEffect = p.getCondition();
        if (pEffect == Status.BURN   ||
            pEffect == Status.POISON ||
            pEffect == Status.PARALYZE)
          p.setMod(Stat.HP, (int)(damage * 2.0));
        else
          p.setMod(Stat.HP, (int)damage);
    }

    @Override
    protected String describe() {
        return "использует Facade";
    }
}
