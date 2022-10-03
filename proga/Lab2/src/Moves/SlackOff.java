package Moves;
import ru.ifmo.se.pokemon.*;

public class SlackOff extends StatusMove {

    public SlackOff() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect effect = new Effect().stat(Stat.HP, (int)(p.getStat(Stat.HP) * -0.5));
        p.addEffect(effect);
    }
    @Override
    protected String describe() {
        return "использует Slack Off";
    }

}
