package org.example.task4;

public class Student extends Person {
    private String studiesType;
    private int studiesYear;
    private int studiesCost;

    public Student (String studiesType, int studiesYear, int studiesCost) {
        this.studiesType = studiesType;
        this.studiesYear = studiesYear;
        this.studiesCost = studiesCost;
    }

    public String getStudiesType () {
        return studiesType;
    }

    public int getStudiesYear () {
        return studiesYear;
    }

    public double getStudiesCost () {
        return studiesCost;
    }

    public void setStudiesType (String studiesType) {
        this.studiesType = studiesType;
    }

    public void setStudiesYear (int studiesYear) {
        this.studiesYear = studiesYear;
    }

    public void setStudiesCost (int studiesCost) {
        this.studiesCost = studiesCost;
    }

    @Override
    public String showDetails() {
        return "Typ studiów: " + studiesType + " Rok studiów: " + studiesYear
                + " Koszt studiów: " + studiesCost;

    }

}
