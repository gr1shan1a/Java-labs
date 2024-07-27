package ru.ifmo.se.places;

import ru.ifmo.se.PACKAGE;
import ru.ifmo.se.people.Human;
import ru.ifmo.se.things.*;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPlace implements Restaurant, Hotel {
    private String name;
    private PACKAGE servicePackage;
    private List<Thing> things;

    public AbstractPlace(String name, PACKAGE servicePackage) {
        this.name = name;
        this.servicePackage = servicePackage;
        this.things = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public PACKAGE getServicePackage() {
        return servicePackage;
    }

    public void setServicePackage(PACKAGE servicePackage) {
        this.servicePackage = servicePackage;
    }

    public List<Thing> getThings() {
        return things;
    }

    public void addThing(Thing thing) {
        things.add(thing);
    }

    @Override
    public String toString() {
        return "AbstractPlace{" +
                "name='" + name + '\'' +
                ", servicePackage=" + servicePackage +
                ", things=" + things +
                '}';
    }

    public abstract void serveFood();

    // Implement Restaurant methods
    @Override
    public abstract void serveFood(int k);

    @Override
    public abstract String getMenu();

    public abstract void checkIn();

    public abstract void checkOut();

    @Override
    public abstract void checkIn(Human human);

    @Override
    public abstract void checkOut(Human human);
}