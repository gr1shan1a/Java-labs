package collection;

import java.io.IOException;
import java.util.Objects;

public class Coordinates {
    private Double x;
    private double y; //Значение поля должно быть больше -698

    public Coordinates(Double x, double y) {
        this.x = Objects.requireNonNull(x, "X must not be null");
        if (y <= -698) {
            throw new IllegalArgumentException("Y must be greater than -698");
        }
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("Coordinates{x=%s, y=%s}", x, y);
    }
}
