package ru.ifmo.se.people;

public class Crabs extends Human{


    public Crabs(String name, boolean man, int age) {
        super(name, man, age);
    }

    @Override
    public String toString() {
        return "My name is " + getName() + "My age: " + getAge();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
