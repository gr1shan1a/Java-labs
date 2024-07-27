package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;
public class Reuniclus extends Duosion {
    public Reuniclus(String name, int level) { //Stage 2
        super(name, level);
        setStats(110, 65, 75, 125, 85, 30);
        setType(Type.PSYCHIC);
        addMove(new DoubleTeam());
        addMove(new Swagger());
        addMove(new Toxic());
        addMove(new Bulldoze());
    }

}
