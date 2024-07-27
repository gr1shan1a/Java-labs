package moves;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends StatusMove {
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 2);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 2);
    }

    @Override
    protected String describe() {
        return "is using AerialAce";
    }
}
