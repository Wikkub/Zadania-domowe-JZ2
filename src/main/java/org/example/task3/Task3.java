package org.example.task3;
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


public class Task3 {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        lotto.drawNumbers();
        lotto.userNumbers();

        lotto.checkNumberOfMatches(lotto.getLatestDraw(), lotto.getUserNumberDraw());

    }
}
