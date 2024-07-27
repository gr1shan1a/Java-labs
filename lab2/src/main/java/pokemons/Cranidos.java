package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Cranidos extends Pokemon { //Basic
    public Cranidos(String name, int level) {
        super(name, level);
        setStats(67, 125, 40, 30, 30, 58);
        setType(Type.ROCK);
        addMove(new AerialAce());
        addMove(new Facade());
        addMove(new Swagger());
    }

}