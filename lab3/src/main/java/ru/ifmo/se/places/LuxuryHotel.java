package ru.ifmo.se.places;

import ru.ifmo.se.PACKAGE;
import ru.ifmo.se.people.Human;
import ru.ifmo.se.things.Thing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LuxuryHotel extends AbstractPlace {
    private Map<Human, List<Thing>> guestItems = new HashMap<>();

    public LuxuryHotel(String name, PACKAGE servicePackage) {
        super(name, servicePackage);
    }

    @Override
    public void serveFood() {
        System.out.println("Serving food");
    }

    @Override
    public void serveFood(int portions) {
        System.out.println("Serving " + portions + " portions at " + getName());
    }

    @Override
    public String getMenu() {
        return "Luxury Hotel Menu";
    }

    @Override
    public void checkIn() {
        System.out.println("you're on a checkIn");
    }

    @Override
    public void checkOut() {
        System.out.println("Bye Bye!!!");
    }

    @Override
    public void checkIn(Human guest) {
        guestItems.put(guest, new ArrayList<>());
        System.out.println(guest.getName() + " checked into " + getName());
    }

    @Override
    public void checkOut(Human guest) {
        guestItems.remove(guest);
        System.out.println(guest.getName() + " checked out of " + getName());
    }

    @Override
    public List<Thing> collectItems(Human guest) {
        return guestItems.getOrDefault(guest, new ArrayList<>());
    }
}