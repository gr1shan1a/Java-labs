package collection;

import java.util.Objects;

public class Location {
    private Double x; //Поле не может быть null
    private Float y; //Поле не может быть null
    private String name; //Длина строки не должна быть больше 760, Поле не может быть null

    public Location(Double x, Float y, String name) {
        this.x = Objects.requireNonNull(x, "X can't be null");
        this.y = Objects.requireNonNull(y, "Y can't be null");
        this.name = Objects.requireNonNull(name, "name can't be null");
        if (name.isEmpty() || (name.length() > 760)) throw new IllegalArgumentException("Name cannot be empty and length must be smaller than 760");
    }
    @Override
    public String toString() {
        return String.format("Location{x=%s, y=%s, name='%s'}", x, y, name);
    }
}
