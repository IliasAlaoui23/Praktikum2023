package de.ilias;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AufgabeSortieren {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(36);
        numbers.add(23);
        numbers.add(85);
        numbers.add(54);
        numbers.add(69);
        numbers.add(95);
        numbers.add(10);
        numbers.add(21);
        numbers.add(94);
        numbers.add(67);

        Collections.sort(numbers);

        for (Integer number : numbers) ;
        System.out.println(numbers);
    }
}
