package entity;

import java.time.LocalDate;

public class Student {

    private int id;
    private String name;
    private String family;
    private LocalDate birthday;
    private double grade;

    public Student(int id, String name, String family, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.birthday = birthday;
        this.grade = 0.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
