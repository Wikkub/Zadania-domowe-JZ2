package org.example.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LecturerTest {

    @Test
    void showDetailsShouldShowInformationAboutLecturer() {
        //given
        Lecturer lecturer = new Lecturer("Matematyka", 1200);

        //when
        String result = lecturer.showDetails();
        String expected = "Specjalizacja: Matematyka Wynagrodzenie: 1200";
        //then
        Assertions.assertEquals(expected, result);
    }
}