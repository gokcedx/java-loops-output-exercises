package com.gokcedx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * java-loops-output-exercises
 *
 * @author Gökçe Doğanay
 * @version 14.02.2021
 */
public class Exercise7 {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(20);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(10);
        Collections.sort(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    /**
     * A) 20 5 2 10
     * B) 2 5 10 20
     * C) 20 10 5 2
     * D) 10 2 5 20
     */

}
