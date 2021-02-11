package com.gokcedx.entity;

/**
 * java-loops-output-exercises
 *
 * @author Gökçe Doğanay
 * @version 12.02.2021
 */
public class Customer {
    private Long id;
    private String name;
    private String phoneNumber;
    private String eMail;
    private Long age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "-" + age;
    }
}
