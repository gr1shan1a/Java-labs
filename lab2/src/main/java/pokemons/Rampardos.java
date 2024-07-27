package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Rampardos extends Cranidos { // Stage 1
    public Rampardos(String name, int level) {
        super(name, level);
        setStats(97, 165, 60, 65, 50, 58);
        setType(Type.ROCK);
        addMove(new AerialAce());
        addMove(new Facade());
        addMove(new Swagger());
        addMove(new FurySwipes());
    }
}
