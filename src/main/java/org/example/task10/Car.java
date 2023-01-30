package org.example.task10;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Car {
    private String brand;
    private String type;

    public Car (String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public String toString () {
        return brand + type;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Audi", "Kombi");
        Car car2 = new Car("BMW", "Sedan");
        Car car3 = new Car ("Lambo", "SUV");

        Queue<Car> queue = new LinkedList<>();
        queue.add(car1);
        queue.add(car2);
        queue.add(car3);

        // Iterowanie po wszystkich elementach
        // I sposób
        /*
        while (!queue.isEmpty()) {
            Car element = queue.poll();
            System.out.println(element);
        }
         */

        // II sposób
        Iterator<Car> it = queue.iterator();
        while (it.hasNext()) {
            Car element = it.next();
            System.out.println(element);
        }

        // III sposób (z wyświetlaniem)
        //queue.stream().forEach(System.out::println);



        // Metoda peak() - wyświetla 1 element z kolejki
        // Metoda poll () - wyświetla 1 element z kolejki i go usuwa
        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

    }


}
