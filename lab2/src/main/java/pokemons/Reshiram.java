package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Reshiram extends Pokemon {
    public Reshiram(String name, int level) {
        super(name, level);
        setStats(100, 120, 100, 150, 120, 90);
        setType(Type.DRAGON, Type.FIRE);
        addMove(new Tackle());
        addMove(new DracoMeteor());
        addMove(new Rest());
        addMove(new Swagger());
    }
}
