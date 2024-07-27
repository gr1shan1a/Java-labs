package ru.ifmo.se.people;

public class Skuperfilt extends Human {

    public Skuperfilt(String name, boolean man, int age) {
        super(name, man, age);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "I don't know what is happening here\nc Mr. " + getName();
    }
}
