package com.gokcedx;

import com.gokcedx.entity.Customer;

import java.util.ArrayList;

/**
 * java-loops-output-exercises
 *
 * @author Gökçe Doğanay
 * @version 12.02.2021
 */
public class Exercise5 {

    public static void main(String[] args) {

        ArrayList<Customer> arrayCustomer = new ArrayList<>();

        // entity -> Customer
        Customer c1 = new Customer();
        c1.setName("John");
        c1.setAge(25L);
        arrayCustomer.add(c1);

        Customer c2 = new Customer();
        c2.setName("Kate");
        c2.setAge(28L);
        arrayCustomer.add(c2);

        for (Customer customer : arrayCustomer) {
            customer.setAge(20L);
        }

        System.out.println(arrayCustomer.toString());

    }

    /**
     * A) [John-25, Kate-28]
     * B) [John-20, Kate-20]
     * C) [20, 20]
     * D) [25, 28]
     */
}
