package ru.ifmo.se.places;

import ru.ifmo.se.people.Human;
import ru.ifmo.se.things.*;

import java.util.List;

public interface Hotel {
    void checkIn(Human human);
    void checkOut(Human human);
    List<Thing> collectItems(Human guest);
}
