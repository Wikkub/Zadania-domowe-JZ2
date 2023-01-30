package org.example.task4;

public class Lecturer extends Person {
    private String specialization;
    private int salary;

    public Lecturer (String specialization, int salary) {
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization () {
        return specialization;
    }

    public double getSalary () {
        return salary;
    }

    public void setSpecialization (String specialization) {
        this.specialization = specialization;
    }

    public void setSalary (int salary) {
        this.salary = salary;
    }

    @Override
    public String showDetails() {
        return "Specjalizacja: " + specialization + " Wynagrodzenie: " + salary;
    }
}
