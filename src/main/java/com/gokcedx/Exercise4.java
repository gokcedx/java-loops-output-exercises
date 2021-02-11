package com.gokcedx;

import java.util.ArrayList;

/**
 * java-loops-output-exercises
 *
 * @author Gökçe Doğanay
 * @version 12.02.2021
 */
public class Exercise4 {

    public static void main(String[] args) {

        ArrayList<String> arrayLetter = new ArrayList<>();

        arrayLetter.add("a");
        arrayLetter.add("b");
        arrayLetter.add("c");

        for (String letter : arrayLetter) {
            letter.toUpperCase();
            System.out.println(letter);
        }
    }

    /**
     * A) A B C
     * B) A
     * C) a
     * D) a b c
     */
}
