package com.gokcedx;

import java.util.LinkedList;
import java.util.List;

/**
 * java-loops-output-exercises
 *
 * @author Gökçe Doğanay
 * @version 14.02.2021
 */
public class Exercise8 {

    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(20);
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(10);

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));

        }

    }
    /**
     * A) 20 5 2 10
     * B) 2 5 10 20
     * C) 20 10 5 2
     * D) 10 2 5 20
     */
}
