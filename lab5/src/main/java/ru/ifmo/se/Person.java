package ru.ifmo.se;

public class Person {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private java.time.LocalDate birthday; //Поле может быть null
    private Double height; //Поле не может быть null, Значение поля должно быть больше 0
    private String passportID; //Строка не может быть пустой, Длина строки не должна быть больше 42, Поле может быть null
    private Location location; //Поле не может быть null
}
