package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;
public class Solosis extends Pokemon {
    public Solosis(String name, int level) { //Basic
        super(name, level);
        setStats(45, 30, 40, 105, 50, 20);
        setType(Type.PSYCHIC);
        addMove(new DoubleTeam());
        addMove(new Swagger());
    }


}
