package src.collection;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Objects;

public class StudyGroup implements Comparable<StudyGroup> {
    private static long idCounter = 1;
    private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Long studentsCount; //Значение поля должно быть больше 0, Поле не может быть null
    private FormOfEducation formOfEducation; //Поле может быть null
    private Semester semesterEnum; //Поле не может быть null
    private Person groupAdmin; //Поле может быть null

    public StudyGroup(String name, Coordinates coordinates, Long studentsCount, FormOfEducation formOfEducation, Semester semesterEnum, Person groupAdmin) {
        this.id = idCounter++;
        this.name = Objects.requireNonNull(name, "Name cannot be null or empty");
        if (name.isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
        this.coordinates = Objects.requireNonNull(coordinates, "Coordinates cannot be null");
        this.creationDate = LocalDateTime.now();
        this.studentsCount = Objects.requireNonNull(studentsCount, "Students count cannot be null");
        if (studentsCount <= 0) {
            throw new IllegalArgumentException("Students count must be greater than 0");
        }
        this.formOfEducation = formOfEducation;
        this.semesterEnum = Objects.requireNonNull(semesterEnum, "Semester cannot be null");
        this.groupAdmin = groupAdmin;
    }

    public long getId() {
        return id;
    }

    @Override
    public int compareTo(StudyGroup other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return String.format("StudyGroup{id=%d, name='%s', coordinates=%s, creationDate=%s, studentsCount=%d, formOfEducation=%s, semesterEnum=%s, groupAdmin=%s}",
                id, name, coordinates, creationDate, studentsCount, formOfEducation, semesterEnum, groupAdmin);
    }
}
