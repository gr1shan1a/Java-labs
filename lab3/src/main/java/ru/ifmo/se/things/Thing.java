package ru.ifmo.se.things;

public class Thing {
    private String name;

    public Thing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + name + '\'' +
                '}';
    }
}