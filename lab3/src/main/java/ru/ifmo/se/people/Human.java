package ru.ifmo.se.people;

import ru.ifmo.se.places.*;

import java.util.Objects;

public class Human {
    private String name;
    private boolean isMan;
    private int age;

    public Human(String name) {
        super();
    }

    public Human(String name, boolean isMan, int age) {
        this.name = name;
        this.isMan = isMan;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public boolean isMan() {
        return isMan;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMan(boolean isMan) {
        this.isMan = isMan;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Human human = (Human) obj;
        return age == human.age &&
                isMan == human.isMan &&
                Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isMan, age);
    }

    @Override
    public String toString() {
        return "Hi! My name is "+ getName();
    }

    public void checkIn(LuxuryHotel hotel) {
    }

    public void checkOut(Human human) {
    }
}