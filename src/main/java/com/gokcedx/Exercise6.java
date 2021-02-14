package com.gokcedx;

/**
 * java-loops-output-exercises
 *
 * @author Gökçe Doğanay
 * @version 14.02.2021
 */
public class Exercise6 {

    public static void main(String[] args) {

        String name = "GokceD";
        name.toUpperCase();

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i + 1));
        }
    }

    /**
     * A) OKCED
     * B) GokceD
     * C) okceD
     * D) Runtime Error
     */
}
