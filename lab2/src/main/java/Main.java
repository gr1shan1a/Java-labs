import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Cranidos p1 = new Cranidos("челты", 5);
        Duosion p2 = new Duosion("Цопа", 5);
        Rampardos p3 = new Rampardos("куку", 5);
        Reshiram p4 = new Reshiram("Клименков", 5);
        Reuniclus p5 = new Reuniclus("К_нига", 5);
        Solosis p6 = new Solosis("Иннокентий", 5);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}