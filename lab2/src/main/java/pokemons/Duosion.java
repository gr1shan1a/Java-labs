package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Duosion extends Solosis { //Stage 1
    public Duosion(String name, int level){
        super(name, level);
        setStats(65, 40, 50, 125, 60, 30);
        setType(Type.PSYCHIC);
        addMove(new DoubleTeam());
        addMove(new Swagger());
        addMove(new Toxic());
    }


}
