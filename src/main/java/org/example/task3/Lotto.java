package org.example.task3;
import java.util.*;

/**
 * Napisz klasę realizującą system lotto.
 * Klasa powinna zawierać pola takie jak:
 * - ostatnie losowanie (tablica liczb)
 * - liczba wygranych
 * - metodę do wykonania losowania (generowanie losowych 6 liczb z przedziału 1-49)
 * - metoda powinna przyjmować na wejściu zestaw 6 liczb i sprawdzać liczbę trafień, jeśli ktoś trafił 6 zwiększamy licznik wygranych
 * Zadbaj o odpowiedni dostęp do informacji o ostatnim losowaniu.
 * NAPISZ TESTY JEDNOSTKOWE DLA ROZWIĄZANIA
 */

public class Lotto {
    private Set<Integer> latestDraw;
    private int wins = 0;
    private final static int MAX_DRAW_NUMBERS = 6;
    private Set<Integer> userNumberDraw;


    public void drawNumbers() {
        Set<Integer> randomNumbers = new HashSet<>();
        Random generator = new Random();

        while (randomNumbers.size() < MAX_DRAW_NUMBERS) {
            int randomIntWithBound = generator.nextInt(49);
            randomNumbers.add(randomIntWithBound);
        }
        System.out.println(randomNumbers);
        setLatestDraw(randomNumbers);
    }

    public void setLatestDraw(Set<Integer> list) {
        this.latestDraw = list;
    }

    public Set<Integer> getLatestDraw() {
        return latestDraw;
    }

    public void setUserNumberDraw(Set<Integer> list) {
        this.userNumberDraw = list;
    }

    public Set<Integer> getUserNumberDraw() {
        return userNumberDraw;
    }

    public void userNumbers() {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> userNumbersList = new HashSet<>();
        System.out.println("Witaj w lotto. Podaj pierwszą liczbę od 1 do 49");

        while (userNumbersList.size() < MAX_DRAW_NUMBERS) {
            int userNumber = scanner.nextInt();
            if (userNumber <= 49 && userNumber >= 1) {
                if (userNumbersList.contains(userNumber)) {
                    System.out.println("Ta liczba została dodana wcześniej");
                }
                userNumbersList.add(userNumber);
            } else {
                System.out.println("Podaj liczbę z przedziału od 1 do 49");
            }
            if (!(userNumbersList.size() == 6)) {
                System.out.println("Podaj kolejną liczbę");
            }
        }

        setUserNumberDraw(userNumbersList);
    }

    public void checkNumberOfMatches (Set<Integer> randomNumbersList, Set<Integer> userNumbersList) {
        int randomNumber;
        int userNumber;
        int matches = 0;

        for (int i = 0; i < randomNumbersList.size(); i++) {
            randomNumber = randomNumbersList.stream().toList().get(i);
            for (int j = 0; j < userNumbersList.size(); j++) {
                userNumber = userNumbersList.stream().toList().get(j);
                if (randomNumber == userNumber) {
                    matches++;
                }

            }
        }
        System.out.println("Liczba trafień to: " + matches);
        if (matches == MAX_DRAW_NUMBERS) {
            this.wins++;
        }
    }
}
