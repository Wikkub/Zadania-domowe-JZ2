package org.example.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void showDetailsShouldShowAllInformation() {
        // given
        Student student = new Student("Fizyka", 2, 200);

        // when
        String result = student.showDetails();
        String expectedResult = "Typ studiów: Fizyka Rok studiów: 2 Koszt studiów: 200";
        // then
        Assertions.assertEquals(expectedResult, result);
    }
}