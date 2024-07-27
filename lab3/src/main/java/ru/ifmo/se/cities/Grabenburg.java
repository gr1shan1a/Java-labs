package ru.ifmo.se.cities;

public class Grabenburg extends Town {

    public Grabenburg() {
        super("Grabenberg");
    }

    @Override
    public String toString() {
        return "Town name is " + getName();
    }
}
