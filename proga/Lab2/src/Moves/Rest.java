package moves;
import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect effect = new Effect().condition(Status.SLEEP).turns(2).stat(Stat.HP, -1*(int)p.getStat(Stat.HP));
        p.addEffect(effect);
      }
    
    @Override
    protected String describe(){
        return "использует Rest";
    }
}
