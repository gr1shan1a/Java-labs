package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class FurySwipes extends PhysicalMove {
    public FurySwipes() {
        super(Type.STEEL, 50, 100);
    }

    @Override
    protected String describe() {
        return "is using Fury Swipes";
    }
}
