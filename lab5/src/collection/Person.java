package src.collection;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Objects;

public class Person {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private java.time.LocalDate birthday; //Поле может быть null
    private Double height; //Поле не может быть null, Значение поля должно быть больше 0
    private String passportID; //Строка не может быть пустой, Длина строки не должна быть больше 42, Поле может быть null
    private Location location; //Поле не может быть null
    private java.time.LocalDateTime today = LocalDateTime.now();

    public Person(String name, LocalDate birthday, Double height, String passportID, Location location) {
        this.name = Objects.requireNonNull(name, "Name must be not null or empty");
        if (name.isEmpty()) throw new IllegalArgumentException("Name cannot be empty");

        if (birthday.compareTo(ChronoLocalDate.from(today)) > 0) throw new IllegalStateException("The day of birth can't be earlier than today");
        this.birthday = birthday;

        this.height = Objects.requireNonNull(height, "Height can't be null");
        if (height <= 0) throw new IllegalArgumentException("Must be greater than 0");

        if (passportID != null && passportID.length() > 42) throw new IllegalArgumentException("Passport ID length must be 42 characters or less");
        this.passportID = passportID;

        this.location = Objects.requireNonNull(location, "Location can't be null");
    }

    @Override
    public String toString() {
        return String.format("Person{name='%s', birthday=%s, height=%s, passportID='%s', location=%s}", name, birthday, height, passportID, location);
    }
}
